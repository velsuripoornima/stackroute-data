package com.stackroute.datamunger.query.parser;

/*There are total 4 DataMungerTest file:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 4 methods
 * a)getBaseQuery()  b)getFileName()  c)getOrderByClause()  d)getGroupByFields()
 * 
 * Once you implement the above 4 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 2 methods
 * a)getFields() b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getRestrictions()  b)getLogicalOperators()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */


import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.IntStream;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();

	/*
	 * This method will parse the queryString and will return the object of
	 * QueryParameter class
	 */
	public QueryParameter parseQuery(String queryString) {
		String filename=getFileName(queryString);
		queryParameter.setFileName(filename);

		String baseQuery=getBaseQuery(queryString);
		queryParameter.setBaseQuery(baseQuery);

		List<String> orderByFields=getOrderByFields(queryString);
		queryParameter.setOrderByFields(orderByFields);

		List<String> groupByFields=getGroupByFields(queryString);
		queryParameter.setGroupByFields(groupByFields);

		List<String> fields=getFields(queryString);
		queryParameter.setFields(fields);

		List<Restriction> restrictions=getRestrictions(queryString);
		queryParameter.setRestrictions(restrictions);

		List<String> logicalOperators=getLogicalOperators(queryString);
		queryParameter.setLogicalOperators(logicalOperators);

		List<AggregateFunction> aggregateFunctions=getAggregateFunction(queryString);
		queryParameter.setAggregateFunctions(aggregateFunctions);

		return queryParameter;
	}

	/*
	 * Extract the name of the file from the query. File name can be found after the
	 * "from" clause.
	 */
	public String getFileName(String queryString) {
		String filename;

		if (queryString.contains("where ")) {
			filename = queryString.substring(queryString.indexOf(" from ") + 6, queryString.indexOf(" where ") );

		} else {
			filename = queryString.substring(queryString.indexOf(" from ") + 6);
		}
		return filename;

	}
		/*
		 *
		 * Extract the baseQuery from the query.This method is used to extract the
		 * baseQuery from the query string. BaseQuery contains from the beginning of the
		 * query till the where clause
		 */
	public String getBaseQuery(String queryString){

		if (queryString.contains("where ")) {
			return queryString.substring(0, queryString.indexOf(" where ") );

		}
		else if(queryString.contains("order by"))
		{
			return queryString.substring(0,queryString.indexOf("order by"));

		}return queryString;
	}



//		String baseQuery[]=queryString.split("where ")[1].split("(order by)| (group by)")[0].split(" ");
//		if()
////		for (int i=0; i<baseQuery.length;i++)
////		{
////			baseQuery[i] = baseQuery[i].trim();
////		}
//		return  baseQuery;
//
//	}

		/*
		 * extract the order by fields from the query string. Please note that we will
		 * need to extract the field(s) after "order by" clause in the query, if at all
		 * the order by clause exists. For eg: select city,winner,team1,team2 from
		 * data/ipl.csv order by city from the query mentioned above, we need to extract
		 * "city". Please note that we can have more than one order by fields.
		 */
		public List<String> getOrderByFields(String queryString) {
			String orderBy[];
			if (queryString.contains("order by")) {
				String orderByFields = queryString.substring(queryString.indexOf(" order by ") + 10);
				orderBy = orderByFields.split("(group by) | (having )")[0].trim().split(",");

			}else {
				orderBy=null;
			}

			return convertArrayToList(orderBy);
		}

			public static <T> List<T> convertArrayToList(T array[])
			{
				if(array==null){
					return null;
				}

				// Create an empty List
				List<T> list = new ArrayList<T>();

				// Iterate through the array
				for (T t : array) {
					// Add each element into the list
					list.add(t);
				}

				// Return the converted List
			return list;
			}


		/*
		 * Extract the group by fields from the query string. Please note that we will
		 * need to extract the field(s) after "group by" clause in the query, if at all
		 * the group by clause exists. For eg: select city,max(win_by_runs) from
		 * data/ipl.csv group by city from the query mentioned above, we need to extract
		 * "city". Please note that we can have more than one group by fields.
		 */
		public List<String> getGroupByFields(String queryString) {
			String groupBy[];
			if (queryString.contains("group by")) {
				String groupByFields = queryString.substring(queryString.indexOf(" group by ") + 10);
				groupBy = groupByFields.split("(order by) | (having )")[0].trim().split(",");
			}
			else {
				return null;
			}

			return convertArrayToList(groupBy);
		}

		/*
		 * Extract the selected fields from the query string. Please note that we will
		 * need to extract the field(s) after "select" clause followed by a space from
		 * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
		 * query mentioned above, we need to extract "city" and "win_by_runs". Please
		 * note that we might have a field containing name "from_date" or "from_hrs".
		 * Hence, consider this while parsing.
		 */
		public List<String> getFields(String queryString){
			String subStr=queryString.substring(queryString.indexOf("select ")+7);

			String[] selectIndex=subStr.split(" from ")[0].split(",");
			return convertArrayToList(selectIndex);
		}

		/*
		 * Extract the conditions from the query string(if exists). for each condition,
		 * we need to capture the following: 1. Name of field 2. condition 3. value
		 *
		 * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
		 * where season >= 2008 or toss_decision != bat
		 *
		 * here, for the first condition, "season>=2008" we need to capture: 1. Name of
		 * field: season 2. condition: >= 3. value: 2008
		 *
		 * the query might contain multiple conditions separated by OR/AND operators.
		 * Please consider this while parsing the conditions.
		 *
		 */


		public List<Restriction> getRestrictions(String queryString){
		    List<Restriction> restrictionList=new ArrayList<>();
		    if(queryString.contains("where")) {
                String subStr = queryString.substring(queryString.indexOf("where ") + 6);

                String[] selectIndex = subStr.split("(group by) | (order by) ")[0].trim().split("(and) | (or) ");

                for (String str : selectIndex) {
                    String[] array1 = str.split(" |'");
//                for(String arr:array1) {
//                    System.out.println(arr);
                    Restriction restriction = new Restriction(array1[0], array1[2], array1[1]);
                    restrictionList.add(restriction);
                }
            }else {
		        return null;
            }
            return restrictionList;
		}





	/*
		 * Extract the logical operators(AND/OR) from the query, if at all it is
		 * present. For eg: select city,winner,team1,team2,player_of_match from
		 * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
		 * bangalore
		 *
		 * The query mentioned above in the example should return a List of Strings
		 * containing [or,and]
		 */
	public List<String> getLogicalOperators(String queryString){
	    List<String> operators=new ArrayList<>();
	    if(queryString.contains("where ")) {
            String array[] = queryString.split(" ");

            for (String str : array) {
                if (str.contentEquals("and")) {
                    operators.add("and");

                } else if (str.contentEquals("or")) {
                    operators.add("or");

                }
            }
        }else {
	        return null;
        }
       return operators;
    }

		/*
		 * Extract the aggregate functions from the query. The presence of the aggregate
		 * functions can determined if we have either "min" or "max" or "sum" or "count"
		 * or "avg" followed by opening braces"(" after "select" clause in the query
		 * string. in case it is present, then we will have to extract the same. For
		 * each aggregate functions, we need to know the following: 1. type of aggregate
		 * function(min/max/count/sum/avg) 2. field on which the aggregate function is
		 * being applied.
		 *
		 * Please note that more than one aggregate function can be present in a query.
		 *
		 *
		 */

		public List<AggregateFunction> getAggregateFunction(String queryString) {
            List<AggregateFunction> aggregateFunctionList = new ArrayList<>();

            String aggregateFunctions[] = queryString.split("select ")[1].split(" from ")[0].split(",");

            for (String function : aggregateFunctions) {
                if (function.contains("(")) {
                    String[] functionsParts = function.replace(")", "").replace("(", " ").split(" ");
                    AggregateFunction aggregateFunction = new AggregateFunction(functionsParts[1], functionsParts[0]);
                    aggregateFunctionList.add(aggregateFunction);
                }
            }
            return aggregateFunctionList;
        }
}
package com.stackroute.datamunger.query.parser;

import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
	String fileName,baseQuery;
	List<Restriction> restrictions;
	List<String> logicalOperators,fields,groupByFields,orderByFields;
	List<AggregateFunction> aggregateFunctions;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}

	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}

	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}

	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}

	public String getFileName() {
		return fileName;
	}

	public String getBaseQuery() {
	return baseQuery;
	}

	public List<Restriction> getRestrictions() {

		return restrictions;
	}

	public List<String> getLogicalOperators() {

		return logicalOperators;
	}

	public List<String> getFields() {
		return fields;
	}

	public List<AggregateFunction> getAggregateFunctions() {

		return aggregateFunctions;
	}

	public List<String> getGroupByFields() {

		return groupByFields;
	}

	public List<String> getOrderByFields() {

		return orderByFields;
	}
}
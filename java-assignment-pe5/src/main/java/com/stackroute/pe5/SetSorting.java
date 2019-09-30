package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {

    public List<String> sorting(Set<String> set)
    { try {

        Set<String> tree_Set = new TreeSet<>(set); //by using treeset i am sorting set


        List<String> list = new ArrayList<String>(tree_Set);  //converting set into list


        return list;  //return list
    }

    catch (NullPointerException e)
    {
        return null;
    }
    }
}

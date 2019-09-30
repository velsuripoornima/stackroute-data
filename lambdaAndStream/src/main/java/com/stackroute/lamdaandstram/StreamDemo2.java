package com.stackroute.lamdaandstram;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

    public List<String> findNames(List<String> list){

        list.removeIf(l -> !l.startsWith("A"));
        return list;
    }

    public List<String> changeType(List<String> list){

         return  list.stream().map(String::toUpperCase).collect(Collectors.toList());

    }

    public List<String> changeTypeAndFindString(List<String> list){

        return list.stream().map(String::toUpperCase).filter(l-> l.endsWith("s")).collect(Collectors.toList());

    }

    public int count(List<String> list){

         list.stream().filter(l->l.endsWith("h")).collect(Collectors.toList());

         return list.size();


    }

    public List<String> firstName(List<String> list){

       Optional<String> s= list.stream().filter(l->l.startsWith("S")).findFirst();
        List<String> l = s.stream().collect(Collectors.toList());
        return l;

//        list.removeIf(l -> !l.startsWith("S"));
//       return list.stream().filter(l->l.startsWith("S")).collect(Collectors.toList());
//        return list;

    }

    public List<Integer> evenNumber(List<Integer> list1) {

        list1 = list1.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        return list1;
    }

}

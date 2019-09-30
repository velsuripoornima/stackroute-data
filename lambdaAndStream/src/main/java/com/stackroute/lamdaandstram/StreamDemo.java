package com.stackroute.lamdaandstram;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public StreamDemo()
    {

    }

    public List<String> findPlaces(List<String> list, String filterString)
    {
        Stream<String> filteredStream = list.stream().filter(l -> l.startsWith(filterString));
        Stream<String> filter = filteredStream.map(x -> x.split(",")[1]);
        return filter.collect(Collectors.toList());
    }
}

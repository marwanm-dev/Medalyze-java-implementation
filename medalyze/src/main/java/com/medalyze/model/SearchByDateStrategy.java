package com.medalyze.model;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByDateStrategy implements SearchStrategy {

    public List<String> search(List<String> data, String key) {
        return data.stream()
                .filter(item -> item.contains("Date:" + key))
                .collect(Collectors.toList());
    }
}

package com.medalyze.model;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByNameStrategy implements SearchStrategy {

    public List<String> search(List<String> data, String key) {
        return data.stream()
                .filter(item -> item.toLowerCase().contains(key.toLowerCase()))
                .collect(Collectors.toList());
    }
}

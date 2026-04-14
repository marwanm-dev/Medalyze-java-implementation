package com.medalyze.model;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByDoctorStrategy implements SearchStrategy {

    public List<String> search(List<String> data, String key) {
        return data.stream()
                .filter(item -> item.contains("Doctor:" + key))
                .collect(Collectors.toList());
    }
}

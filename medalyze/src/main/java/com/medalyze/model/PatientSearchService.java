package com.medalyze.model;

import java.util.List;

public class PatientSearchService {

    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> search(List<String> data, String key) {
        if (strategy == null) {
            System.out.println("No search strategy selected!");
            return null;
        }
        return strategy.search(data, key);
    }
}

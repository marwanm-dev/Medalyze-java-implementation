package com.medalyze.model;

import java.util.List;

public interface SearchStrategy {
    List<String> search(List<String> data, String key);
}

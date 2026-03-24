package com.medalyze.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SpecializationFactory {

    private static final Map<String, Specialization> specializations = new HashMap<>();

    public static Specialization getSpecialization(String name) {

        Specialization spec = specializations.get(name);

        if (spec == null) {
            spec = new Specialization(name);
            specializations.put(name, spec);
        }

        return spec;
    }
}
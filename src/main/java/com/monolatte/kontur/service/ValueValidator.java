package com.monolatte.kontur.service;

public class ValueValidator {
    public static String checkStringValue(String value, int limit, String msg) throws Exception {
        if (value.length() < limit) {
            return value;
        } else {
            throw new Exception(msg);
        }
    }
}

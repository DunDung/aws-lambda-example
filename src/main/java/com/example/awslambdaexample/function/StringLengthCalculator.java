package com.example.awslambdaexample.function;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StringLengthCalculator implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }

}

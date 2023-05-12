package org.example;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class cls = StingService.class;

        Annotation[] annotations = cls.getAnnotations();
        for (Annotation i  : annotations) {
            System.out.println( i );
        }
        System.out.println(annotations.length);
    }
}
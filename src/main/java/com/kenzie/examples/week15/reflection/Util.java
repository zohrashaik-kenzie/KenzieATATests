package com.kenzie.examples.week15.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }

    public static List<String> getMethodNames(Method[] methods) {
        List<String> methodNames = new ArrayList<>();
        for (Method method : methods)
            methodNames.add(method.getName());
        return methodNames;
    }
}

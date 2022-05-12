package com.kenzie.examples.week15.reflection.test;

import com.kenzie.examples.week15.reflection.Reflection;
import com.kenzie.examples.week15.reflection.Util;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReflectionTest {

    @Test
    public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
        Object reflectionObj = new Reflection();
        Field[] fields = reflectionObj.getClass().getDeclaredFields();

        List<String> actualFieldNames = Util.getFieldNames(fields);

        assertTrue(Arrays.asList("name", "number","list","pay")
                .containsAll(actualFieldNames));
    }

    @Test
    public void givenObject_whenGetsClassName_thenCorrect() {
        Object reflectionObj = new Reflection("Class Demo",1,null);
        Class<?> clazz = reflectionObj.getClass();

        assertEquals("Reflection", clazz.getSimpleName());
        assertEquals("com.kenzie.examples.week15.reflection.Reflection", clazz.getName());
        assertEquals("com.kenzie.examples.week15.reflection.Reflection", clazz.getCanonicalName());
    }

    @Test
    public void givenClass_whenRecognisesModifiers_thenCorrect() throws ClassNotFoundException {
        Class<?> reflectionObj = Class.forName("com.kenzie.examples.week15.reflection.Reflection");
         int rMods = reflectionObj.getModifiers();

        assertTrue(Modifier.isPublic(rMods));
     //   assertTrue(Modifier.isAbstract(xmods));

    }

    @Test
    public void givenClass_whenGetsPackageInfo_thenCorrect() {
        Object reflectionObj = new Reflection();
        Class<?> goatClass = reflectionObj.getClass();
        Package pkg = goatClass.getPackage();

        assertEquals("com.kenzie.examples.week15.reflection", pkg.getName());
    }

    @Test
    public void givenClass_whenGetsConstructor_thenCorrect() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> refClass = Class.forName("com.kenzie.examples.week15.reflection.Reflection");

        Constructor<?>[] constructors = refClass.getConstructors();

        assertEquals(3, constructors.length);
        assertEquals("com.kenzie.examples.week15.reflection.Reflection", constructors[0].getName());
        assertEquals("com.kenzie.examples.week15.reflection.Reflection", constructors[1].getName());
        assertEquals("com.kenzie.examples.week15.reflection.Reflection", constructors[2].getName());
    }
    @Test
    public void givenClass_whenInstantiatesObjectsAtRuntime_thenCorrect() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> refClass = Class.forName("com.kenzie.examples.week15.reflection.Reflection");

        Constructor<?> cons1 = refClass.getConstructor();
        Constructor<?> cons2 = refClass.getConstructor(String.class,Integer.TYPE, List.class);
        Constructor<?> cons3 = refClass.getConstructor(String.class,Integer.TYPE);

        Reflection ref1 = (Reflection) cons1.newInstance();
        Reflection ref2 = (Reflection) cons2.newInstance("Demo",2,null);
        Reflection ref3 = (Reflection) cons3.newInstance("Demo2",3);

        assertEquals("Default", ref1.getName());
        assertEquals("Demo", ref2.getName());
        assertEquals(3, ref3.getNumber());
    }


    @Test
    public void givenClass_whenGetsMethods_thenCorrect() throws ClassNotFoundException {
        Class<?> animalClass = Class.forName("com.kenzie.examples.week15.reflection.Reflection");
        Method[] methods = animalClass.getDeclaredMethods();
        List<String> actualMethods = Util.getMethodNames(methods);

        assertEquals(4, actualMethods.size());
        assertTrue(actualMethods.containsAll(Arrays.asList("isGreaterThan10",
                "getName", "getList","getNumber")));
    }
}

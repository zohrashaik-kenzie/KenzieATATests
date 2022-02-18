package com.kenzie.examples.mutable;

public class MutabilityTest {

    private static void testStringParam(String strParam){
        strParam = strParam.concat("jkl");
        System.out.println(strParam);
    }

    private static void testStringBuilder(
            StringBuilder strbParam){
        strbParam.append("jkl");
        System.out.println(strbParam);
    }
    public static void main(String[] args) {
     /**  String test = "abc";
       String tempStr= test.concat("def");
       tempStr = tempStr.concat("ghi");
     //  System.out.println(tempStr);

     testStringParam(tempStr);
     System.out.println(tempStr);**/

       StringBuilder builder = new StringBuilder("abc");
       builder.append("def");
       StringBuilder tempBuilder =  new StringBuilder(builder);
       tempBuilder.append("ghi");
       testStringBuilder(tempBuilder);
        System.out.println(tempBuilder.toString());

        /** String temp = "abc";
         temp = temp.concat("def");
         StringBuilder temp_too = new StringBuilder("abc");
         temp_too.append("def");
         String str = temp;
         str = str + "c";
         StringBuilder str_too = temp_too;
         str_too.append("c");*/



    }
}

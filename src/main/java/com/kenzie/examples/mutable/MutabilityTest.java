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
////       String test = "abc";
////       test = test.concat("def");
////       test = test.concat("ghi");
////      System.out.println(test);
//
////     testStringParam(tempStr);
////     System.out.println(tempStr);**/
////
//       StringBuilder builder = new StringBuilder("abc");
//       builder.append("def");
//      // StringBuilder tempBuilder =  new StringBuilder(builder);
//        builder.append("ghi");
//       //testStringBuilder(tempBuilder);
//        System.out.println(builder.toString());
//
//         String temp = "abc";
//         temp = temp.concat("def");
//
//         StringBuilder temp_too = new StringBuilder("abc");
//         temp_too.append("def");
//         String str = temp;
//         str = str + "c";
//         StringBuilder str_too = temp_too;
//         str_too.append("c");
//
//        StringBuilder messageBuilder = new StringBuilder(); // empty
//        System.out.println(messageBuilder
//                .append("From: FloridaMan@email.com\n")
//                .append("\nTo: Karen\n@email.com").toString().toLowerCase());


        String joinedString = String.join("!", new String[]{ "Convert", "Array", "Into", "String" });
        System.out.println(joinedString);
// Using ! as a delimiter
// Outputs Convert!Array!Into!String
        String spaceJoinedString = String.join(" ", new String[]{ "Convert", "Array", "Into", "String" });
        System.out.println(spaceJoinedString);
//// Using space as a delimiter
// Outputs Convert Array Into String
    }
}

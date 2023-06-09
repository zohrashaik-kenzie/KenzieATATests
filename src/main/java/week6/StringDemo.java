package week6;

public class StringDemo {
    public static void main(String[] args) {
        String info = "";
        info += "My name is Charlotte.";
        info += " ";
        info += "I love doughnuts.";
        System.out.println(info);

        StringBuilder charlotteStringBuilder = new StringBuilder();
//        charlotteStringBuilder.append("My name is Charlotte");
//        charlotteStringBuilder.append(" ");
//        charlotteStringBuilder.append("I love doughnuts");
        charlotteStringBuilder.append("Thus, Charlotte loves doughnuts!");
        System.out.println(charlotteStringBuilder);
        //THUS, CHARLOTTE LOVES DOUGHNUTS!
//        String cString = charlotteStringBuilder.toString();
//        String cStringUpperCase = cString.toUpperCase();
//        int index = cStringUpperCase.indexOf("LOVES");

//        int index = charlotteStringBuilder.toString().toUpperCase().indexOf("LOVES");
//        index = charlotteStringBuilder.
//
//        System.out.println(index);
    }
}

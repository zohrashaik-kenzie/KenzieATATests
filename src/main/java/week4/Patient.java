package week4;

import java.util.Arrays;

public class Patient {
    String name;
    int age;
    String code;

    //address, insurance, gender, occupation

    public static void main(String[] args){
        Patient patient1 = new Patient();
        patient1.name = "John Smith";
        patient1.age = 33;
        patient1.code = "abcdef,xyz123,f11x63,73432x";

        Patient patient2 = new Patient();
        patient2.name = "Jane Smith";
        patient2.age = 45;
        patient2.code = "322NDX";

        /**Code Equals Emergency Go to  Ground Floor 0
         Starts with a D – Go to Floor 1
         Has SURG in the code – Go to Floor 2
         Ends K1 go to Floor 3
         lenght of the code < 10 go to floor 4
         The middle of the string contains the letter X – Go to Floor 5
         if the code contains 123 from position 4 to 6, then got to floor 6
         ABCD123XYZ
         If there are semicolons in the code find the 4th one and if it is CARDIO – Go to Floor 5
**/
         if (patient1.code.equalsIgnoreCase("Emergency")){
             System.out.println("Go to Ground floor");
         }
         if (patient1.code.startsWith("D")){
             System.out.println("Go to First floor");
         }
         if(patient1.code.contains("SURG")){
             System.out.println("Go to Second floor");
         }
         if(patient1.code.endsWith("K1")){
             System.out.println("Go to Third floor");
         }
         if(patient1.code.length() < 10){
             System.out.println("Go to fourth floor");
         }
         //abcdefghij
         int middle = patient1.code.length() / 2 - 1;
         if(patient1.code.charAt(middle) == 'X'){
             System.out.println("Go to fifth floor");
         }
         //ABCD123DEF
         if(patient1.code.length() > 6 &&
                 patient1.code.substring(4,7).equals("123")){
             System.out.println(patient1.code.substring(4,7));
             System.out.println("Go to sixth floor");
         }

         int floor = 3;
         patient1.code.concat(Integer.toString(floor));
            System.out.println(patient1.code.concat(Integer.toString(floor)));

            String string = new String("This a a new string");
            string = string + "abcd";
            System.out.println(string);

           // abcdef,xyz123,f11x63,73432x
        //abcdef xyz123 f11x63 73432x

        String[] codes = patient1.code.split(",");
        for(int idx=0;idx<codes.length;idx++){
            System.out.println(codes[idx]);

        }
        for(String code:codes){
            System.out.println(code);
        }

        System.out.println(Arrays.toString(codes));
    }
}

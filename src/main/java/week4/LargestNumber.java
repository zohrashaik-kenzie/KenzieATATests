package week4;

public class LargestNumber {


    public static int findLargestNumber(int[] numberArray){

        int largestNumber = numberArray[0];
        for(int i=1;i<numberArray.length;i++){
            if(numberArray[i] > largestNumber){
                largestNumber = numberArray[i];
            }
        }
        return largestNumber;
    }
    public static void main(String[] args){
        //int findLargestNumber(int[] numberArray)
        int[] intArray = {24,23,11,89,23,10,0, 54};

        int largestNumber = findLargestNumber(intArray);

        System.out.println("Largest number = " + largestNumber);
    }
}

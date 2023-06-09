package week4;

public class Calculator {


    public static int add(int param1, int param2){
        int result = param1 + param2;
        return result;
    }

    public static float divide(float quotient1, float quotient2){
        if(quotient2 == 0){
            throw new IllegalArgumentException("The quotient cannot be zero");
        }
        float result = quotient1/quotient2;
        return result;
    }

    public static void main(String[] args){

        int x=6, y=0;
        char operator = '/';
        int result = 0;
        float divResult = 0;

        if(operator == '+'){
            result = add(x,y);
        } else if (operator == '/'){
            divResult = divide(x,y);
        }

        System.out.println("Result = " + divResult);
    }
}

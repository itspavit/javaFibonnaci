import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(fibSequence(10));
    }

    static int fibonacci(int number){

        int firstNum = 0;
        int secondNum = 1;

        if(number==0){
            return firstNum;
        }else if(number==1){
            return secondNum;
        }else {
            return (fibonacci(number-1)+fibonacci(number-2));
        }
    }

    static String fibSequence(int number){
        String sequence = "";
        for(int i=0; i<=number; i++){
            sequence += " " + (fibonacci(i));
        }
        return sequence;
    }
}
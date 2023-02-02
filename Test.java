import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Test{
    
    //exercise 1: 
    //function to convert dezimal to binary
    public static String binary(int val){
        String erg = "";
        while(val > 0){
            if(val % 2==0){
                erg += "0";
            }else{
                erg += "1";
            }
            val /= 2;
        }
        return erg;
    }

    //exercise 2:
    //function takes three numbers and compute average
    public static int average(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        return average;
    }

    //exercise 3:
    //swap function to swap two numbers
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    //exercise 4:
    //reverse string function
    public static String reverse_string(String myString){
        String reverse = "";
        for(int i = myString.length()-1; i > -1; i--){
            reverse += myString.charAt(i);

        }
        return reverse;
    }

    //exercise 5:
    //print local time 
    public static void time(){
        System.out.println(java.time.LocalTime.now());
    }

    public static void main(String[] args) {
        System.out.println(binary(7));
        System.out.println(average(1, 2, 3));
        System.out.println(reverse_string("Hello World"));
        time();
    }
}
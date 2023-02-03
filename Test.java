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

    //exercise 6
    //function to convert seconds to hours, minutes and seconds
    public static String secondsToHours(int seconds){
        String erg = "";
        double minutes = seconds / 60;
        double hours = minutes / 60;
        int final_hours = (int)Math.floor(hours);
        seconds = seconds - (final_hours * 60 * 60);
        minutes = seconds / 60;
        int final_minutes = (int)Math.floor(minutes);
        seconds = seconds - final_minutes * 60;
        int final_seconds = (int)Math.floor(seconds);
        erg = Integer.toString(final_hours) + ":" + Integer.toString(final_minutes) + ":" + Integer.toString(final_seconds);
        return erg;
    }
    //exercise 6 BubbleSort function
    //swap array elements function
    public static void swapArrayElements(int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //bubble sort function
    public static void bubbleSort(int arr[]){
        int i, j;
        for(i = 0; i < arr.length-1;i++){
            for(j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swapArrayElements(arr,j,j+1);
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(binary(7));
        System.out.println(average(1, 2, 3));
        System.out.println(reverse_string("Hello World"));
        time();
        System.out.println(secondsToHours(86399));
        int arr[] = { 30, 40, 20, 10, 50, 90, 80};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr);
    }
}
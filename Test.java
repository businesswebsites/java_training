import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.net.ServerSocket; 
import java.net.Socket;
import java.util.Date;
import java.util.Arrays;

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
    //exercise 7
    //searching algorithms
    //linear search
    public static String linearSearch(int arr[], int element){
        int n = arr.length;
        String erg = "";
        int val = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == element){
                val = i;
            }
        }
        if(val > -1){
            erg = "The element was found in the array at index: " + Integer.toString(val); 
        }else{
            erg = "The element was not found in the array!";
        }
        return erg;
    }

    //exercise 7
    //convert inch to meter
    public static double inchToMeter(double inch){
        double meter = inch * 0.0254;
        return meter;
    }

    //exercise 8
    //binary search
    public static int binarySearch(int[] arr, int value){
        Arrays.sort(arr);
        int len = arr.length;
        int first = 0;
        int last = len-1;

        while(first <= last){
            int m = (first + last) / 2;
            if(value == arr[m]){
                return m;
            }else if(value > arr[m]){
                first = m +1;
            }else{
                last = m -1;
            }
        }
        return -1; 
    }
    //exercise 9 
    //exponential search
    public static int exponentialSearch(int[] arr, int value){
        if(arr[0] == value){
            return 0;
        }
        int i = 1;
        while(i < arr.length && arr[i] <= value){
            i *= 2;
            return binarySearch(arr, value);
        }
        return -1;
    }
    //exercise 10
    //check if double value is integer
    public static boolean checkDoubleIsInt(double number){
        String doubleString = Double.toString(number);
        String[] arr = doubleString.split("\\.");
        int checker = Integer.parseInt(arr[1]);
        if(checker == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        //binary converter
        System.out.println(binary(7));
        //average calculator
        System.out.println(average(1, 2, 3));
        //reverse string converter
        System.out.println(reverse_string("Hello World"));
        //output time function
        time();
        //seconds to hours/minutes/seconds converter
        System.out.println(secondsToHours(86399));
        //array to test function
        int arr[] = { 30, 40, 20, 10, 50, 90, 80};
        //bubbleSort function to sort array
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //linear search with the sorted array
        System.out.println(linearSearch(arr, 30));


        //code is commented to execute other functions
        //HTTP Server Socket
        // ServerSocket server = new ServerSocket(8080);
        // System.out.println("Wait for Connection to Port 8080....");    
        // while(true){
        //     try(Socket socket = server.accept()){
        //         Date today = new Date();
        //         String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
        //         socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
        //     }
        // }
        System.out.println(inchToMeter(2.89));
        int [] new_arr = {29, 2, 19, 39, 20, 40, 99, 7};
        //array new_arr will be sorted and after that, it will showed the index of the value in the sorted array
        System.out.println(binarySearch(new_arr, 7));
        System.out.println(exponentialSearch(new_arr, 20));
        System.out.println(checkDoubleIsInt(2.00000000));
    }
}
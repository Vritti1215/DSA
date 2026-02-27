//PASS BY REFERENCE

// import java.util.*;
// public class array1{
//     public static void update(int marks[], int nonChangable) {
//         nonChangable = 10;
//         for(int i =0; i<marks.length;i++){ // array ke har index tak jaa rhe
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String[] args){
//         int marks[] ={97,99,99};
//         int nonChangable = 5; // donot change pass by value primitive data type while array pass by reference non primitive data type
//         update(marks, nonChangable);
//         System.out.println(nonChangable);
//         for(int i =0; i<marks.length;i++){
//             System.out.println(marks[i]+" ");
//         }
//         System.out.println();//next line
//     }
// }


//LINEAR SEARCH


// import java.util.*;
// public class array1 {
//     public static int linearSearch(int numbers[], int key){
//         for(int i = 0; i<numbers.length; i++){
//             if (numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1; //key doesnt exist
//     }
//     public static void main(String[] args){
//         int numbers[]= {2,4,6,8,10,12,14,16};
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if (index == -1){
//             System.out.println("key not found");
//         }else {
//             System.out.println("key is at index " + index);
//         }
//     }
// }


//LARGEST NUMBER
// import java.util.*;
// public class array1 {
//        public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE; //-INFINITY
//         int smallest = Integer.MAX_VALUE; //+infinity

//         for(int i=0 ; i<numbers.length; i++){
//             if (largest<numbers[i]){
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest value is: "+smallest);
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {7,2,4,9,10,11,1};
//         System.out.println("largest value is: " +getLargest(numbers));
//     }
// }


//BINARY SEARCH
// import java.util.*;
// public class array1 {
//     public static int binarySearch(int number[], int key){
//         int start =0, end= number.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
            
//             //comparisions
//             if(number[mid]==key){
//                 return mid;
//             }
//             if (number[mid]<key){
//                 start = mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }


//     public static void main(String args[]){
//         int numbers[] = {7,2,4,9,10,11,1};
//         int key = 10;
//         System.out.println("index for key is: " + binarySearch(numbers, key));
//     }
// }




//REVERSE IN AN ARRAY
// import java.util.*;
// public class array1 {

//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length-1;
//         while(first<last){
//             int temp = numbers[last];
//             numbers[last]= numbers[first];
//             numbers[first]= temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {7,2,4,9,10,11,1};
//         reverse(numbers);
//         for (int i=0; i<numbers.length; i++){
//             System.out.println(numbers[i]+" ");
//         }
//     }
// }


//PAIRS IN AN ARRAY
// import java.util.*;
// public class array1 {
//     public static void printPairs(int numbers[]){
//         int tp= 0;
//         for (int i = 0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for (int j = i+1; j<numbers.length; j++){
//                 System.out.print("(" + curr +"," +numbers[j]+") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = "+tp);
//     }
//     public static void main(String args[]){
//        int numbers[] = {7,2,4,9,10,11,1};
//        printPairs(numbers);
//     }
// }


//PRINT SUBARRAYS
// import java.util.*;
// public class array1 {
//      public static void printSubarrays(int numbers[]){
//          int ts= 0;
//          for (int i = 0; i<numbers.length; i++){
//              int start = i;
//              for (int j =  1; j<numbers.length; j++){
//                 int end = j;
//                 for (int k = start; k<=end; k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();
//               }
//               System.out.println();
//          }
//          System.out.println("total subarrays = "+ ts);
//      }
//      public static void main(String args[]){
//         int numbers[] = {7,2,4,9,10,11,1};
//         printSubarrays(numbers);
//      }
// }


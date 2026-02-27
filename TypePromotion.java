/*import java.util.*;
public class TypePromotion {
    public static void main(String[] args) {
        short a= 5;
        byte b= 25;
        char c ='c';
        //byte bt = a+b+c; not possible but possible after type conversion
        byte bt = (byte)(a+b+c);
        System.out.println(bt);
        /*char a= 'a';
        char b ='b';
        char c = a-b; // cant convert int to char
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b);//no type promotion prints b only
        System.out.println(b-a);
    }    
}
*/
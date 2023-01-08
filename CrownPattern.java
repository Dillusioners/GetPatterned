/*
* 1234 4321
* 123   321
* 12     21
* 1       1
* */
import java.util.*;
class CrownPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        println("Enter the maximum number:- ");
        int num = sc.nextInt();
        println(num);
        int space = num + 1;
        String string = "";
        for (int k = 0; k < num; k++) {
            for(int i = 1; i<=num; i++){
                if(i < space) {
                    string = string + i + "";
                }
                else {
                    string = string + " ";
                }

            }
            for(int i = num-1; i>=1; i--){
                if(i < space) {
                    string = string + i + "";
                }
                else {
                    string = string + " ";
                }
            }
        println(string);
        space--;
        string = "";
        }
    }
    public static void print(String text){
        System.out.print(text);
    }
    public static void print(int text){
        System.out.print(text);
    }
    public static void println(String text){
        System.out.println(text);
    }
    public static void println(int text){
        System.out.println(text);
    }
}

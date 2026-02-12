 import java.util.Scanner;
 public class ternaryoperator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        // if(x%4==0)// if else se solve kiyah 
        //     System.out.println("even");
        // else{
        //     System.out.println("odd");
        // }


        //condition likhte h ? sachh : jhoot
         System.out.println((x%2==0) ? "even"  : "odd");
    }
}
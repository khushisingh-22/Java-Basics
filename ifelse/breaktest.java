
//  import java.util.Scanner;

// public class breaktest {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//             for (int i =2;i <=n-1; i++){
//                 if (n% i == 0){
//                     System.out.println("composite function");
//                     break;//taki repeption na ho 

//                 }

//                 }
//             }
//         }
  // second method 
//   import java.util.Scanner;

// public class breaktest {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//          boolean flag = true;//true means prime 

//             for (int i =2;i <=n-1; i++){
//                 if (n% i == 0){

//                    flag = flase ;//1 means composite 
//                     break;//taki repeption na ho 

//                 }
//                 if(n==1)System.out.println(" nor prime or composite function");
//        if(flag==false)System.out.println("composite function");
//       if(flag==true) System.out.println("prime function");
//                 }
//             }
// }



// public class breaktest {
//   public static void main(String[] args) {
//     for (int i = 1 ; i<=10; i++){
//         System.out.println(i);
//         // while method ......
// int i = 1 
//          while (i<=10;) {
//             System.out.println(i);
//         i++
//     }

//   }
// }



// infinite loop 

//  for ( i =1; i<=10; i--)
//  {
//      Syatem.out.println("i");

//  }
 

 // while loop -use case -generallly use when the condition are more than 



// ques - count the number of digit in number 
//   import java.util.Scanner;

// public class breaktest {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//           if (n==0)  n=7;
//          int count = 0;
//          while(n !=0){
//             n /=10;
//             count++;
//          }

//           System.out.println(count);
//         }
//     }


    // ques - print sum of digit of a anumber 
    import java.util.Scanner;

public class breaktest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n<0) n=-n;
          int sum = 0;
          while(n!=0){
            sum+ = (n%10);// n modulus 10 ka mtlab h kisi bhi chiz ko agr hum 10 se divide karte h toh vo humeiunit digit hi detih 
            n /= 10;
          }
           System.out.println(sum);
        }
    }

    //ques - reverse of a number
        import java.util.Scanner;

public class breaktest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
       
          int r= 0;
          while(n!=0){
            r* =10;
            r+=n%10;
            n /=10;
          }
           System.out.println(r);
        }
    }

    //ques - print sum of number and its reverse 
    import java.util.Scanner;

public class breaktest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int original = n;   // original number store kar liya
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        int sum = original + reverse;

        System.out.println("Reverse = " + reverse);
        System.out.println("Sum = " + sum);
    }
}

//ques - factorial number 
import java.util.Scanner;

public class breaktest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int fact = 1;   // starting value

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}


//ques - 'a' raise to the power 'b'


 
import java.util.Scanner;

public class breaktest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter exponent (b): ");
        double b = sc.nextDouble();

        double result = Math.pow(a, b); // a^b calculate karta hai

        System.out.println(a + " raised to the power " + b + " is: " + result);
    }
}


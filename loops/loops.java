// public class loops {
//     public static void main(String[] args) {
//          for (int i =1; i<=100; i++) {

//         System.out.println("khushi loves akshu");
           
//          }
//     }
        
//     }


    // public class loops {
    // public static void main(String[] args) {
    //      for (int i=-7; i<12; i++) {

    //     System.out.println("khushi loves akshu");
           
    //      }
    // }
        
    // }





//  public class loops {
//     public static void main(String[] args) {
//          for (int i=1; i<=10; i++) {//agr hum i ko bahr inotoilaize krenge toh or sout ko{} iske bahr ek or bar likhenge toh hum dekh sakte h ki lop tut kha rha h 

//         System.out.println(i);//agr ek hi line me print karna  ho toh ln hta do toh ek hi line me print ho jayega 
           
//          }
//     }
        
//     }

// ques - print  khusi 'n' times .tale 'n' input from user 

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
        

//          Scanner sc = new Scanner(System.in);
//           System.out.println("enter name");

//           int n = sc.nextInt();

    
//          for (int i=1; i<=n; i++) {//agr hum i ko bahr inotoilaize krenge toh or sout ko{} iske bahr ek or bar likhenge toh hum dekh sakte h ki lop tut kha rha h 

//         System.out.println(i);//agr ek hi line me print karna  ho toh ln hta do toh ek hi line me print ho jayega 
           
//          }
//     }
        
//     }

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a name:");
//          String name = sc.nextLine();
//          // agr text lena ho toh nextline use karte h 
//          System.out.println("Enter how many times to print":);


//           int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             System.out.println(name);
//         }
//     }
// }



// | Input type       | Scanner method |
// | ---------------- | -------------- |
// | Number           | `nextInt()`    |
// | Single word text | `next()`       |
// | Full line text   | `nextLine()`   |


//ques - print all even numbers from 1 to 100 

//  public class loops{
//     public static void main( String[] args){

//         for( int i=1; i <=100; i++){
//        if(i%2==0) System.out.print(i + " ");//odd ke 3 se divide kr do 
//         }
//     }
//  }


 //ques- print table of 17

//   public class loops{
//     public static void main( String[] args){

//         for( int i=17; i <=170; i=i+17){
//           if(i%17==0) System.out.print(i + " ");//ye if method se jayda behtar h kyuki bas 10 bar hi chlega
//         }
//     }
//  }

//ques - print numbers from 'n' to 1 .
 
//  public class loops{
//     public static void main( String[] args){

//         for( int i=6; i >=1; i--){
//            System.out.print(i + " ");
//         }
//     }
//  }



//ques- display the AP-2,5,8,11 upto 'n' terms 
// import java.util.Scanner;


// public class loops{
//     public static void main( String[] args){
//       Scanner sc = new Scanner (System.in);
      
//       int n = sc.nextInt();


//         for( int i=2; i <=3*n-1; i=i+3){
//            System.out.print(i + " ");
//         }

//     }
//  }

 // ek or method iska if we dont know the formula 
       
// import java.util.Scanner;
// public class loops{
//     public static void main( String[] args){
//       Scanner sc = new Scanner (System.in);
      
//       int n = sc.nextInt();

// int a = 2 ,d = 3;
//         for( int i=1; i <=n; i++){
//            System.out.print(a + " ");
//            a +=d;
//         }

//     }
//  }
//ques- print number whuch is divisibl by three idd number from 1 to 100 

//     public class loops {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 != 0 && i % 3 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

//ques - display this gp 1,2,4,8..upto'n' terms 


//  import java.util.Scanner;
// public class loops{
//     public static void main( String[] args){
//       Scanner sc = new Scanner (System.in);
      
//       int n = sc.nextInt();

//           int a = 1 ,r = 2;
//         for( int i=1; i <=n; i++){
//            System.out.print(a + " ");
//            a*=r;
//         }

//     }
//  }

 //ques - take 'n' as input from user and print the following sequence 

//  1
//  n
//  2
//  n-1
//  3
//  n-2
//  ...

//  import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

       
//         int end = n;
//             for (int start = 1; start <= end; start++) {

//             System.out.println(start);

//             if (start < end) {
//                 System.out.println(end);
//                 end--;
//    

//             }
//         }

//     }

//     }


//ques - print all alphabet with thier corresponding ASCII values ..





 // first  method to print the ASCII value 

public class loops {
    public static void main(String[] args) {


        for(int i =65; i<= '90'; i++) {
            System.out.println((ch)i + " : " + i);
        }

    }
}


    //second method 

 public class AlphabetASCII {
    public static void main(String[] args) {

        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " : " + (int)ch);
        }

    }
}


     //ques2 . take +ve integer input and print :
         //khusi if number is divisible by 5 
         //akash if number is divisible by 3 
         //akshu if number is divisible by 5&3 both
         //singh if number is not divisible by 5 or 3 

// import java.util.Scanner;

// public class  elseifladder  {
//               public static void main(String[] args) {
//                      Scanner sc = new Scanner(System.in);
//                      System.out.println("enter the number");
//                      int x = sc.nextInt(); //input lene ke liye 

//                     if(x%5==0 && x%3==0)
//                         System.out.println("akshu");
//                     else if(x%5==0){
//                         System.out.println("khushi");
//                     }

//                     else if(x%3==0){
//                         System.out.println("akash");
//                     }
//                     else{
//                         System.out.println("singh");
//                     }

                    
              
//           }

// }
//ques - take length and breadth of rectangle as 
// input and write a program to find whether the area og reactangle is 
// gretaer than its perimeter .

// import java.util.Scanner;

// public class elseifladder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // input
//         System.out.print("Enter length: ");
//         int length = sc.nextInt();

//         System.out.print("Enter breadth: ");
//         int breadth = sc.nextInt();

//         // calculations
//         int area = length * breadth;
//         int perimeter = 2 * (length + breadth);

//         // condition check
//         if (area > perimeter) {
//             System.out.println("Area is greater than Perimeter");
//         } else {
//             System.out.println("Area is NOT greater than Perimeter");
//         }
//     }
// }

//ques given a point (x,y) write a program to find out if it lies in the 1st 
// quadrant ,2nd quadrant 
// ,3rd quadrant ,4th quadrant on the
//  x-axis,y-axis on at the orogin

// 1st Quadrant → x > 0 , y > 0

// 2nd Quadrant → x < 0 , y > 0

// 3rd Quadrant → x < 0 , y < 0

// 4th Quadrant → x > 0 , y < 0

// x-axis → y = 0 (but x ≠ 0)

// y-axis → x = 0 (but y ≠ 0)

// Origin → x = 0 AND y = 0
// import java.util.Scanner;

// public class elseifladder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter x coordinate: ");
//         int x = sc.nextInt();

//         System.out.print("Enter y coordinate: ");
//         int y = sc.nextInt();

//         if (x == 0 && y == 0) {
//             System.out.println("Point lies at the Origin");
//         } 
//         else if (x == 0) {
//             System.out.println("Point lies on Y-axis");
//         } 
//         else if (y == 0) {
//             System.out.println("Point lies on X-axis");
//         } 
//         else if (x > 0 && y > 0) {
//             System.out.println("Point lies in 1st Quadrant");
//         } 
//         else if (x < 0 && y > 0) {
//             System.out.println("Point lies in 2nd Quadrant");
//         } 
//         else if (x < 0 && y < 0) {
//             System.out.println("Point lies in 3rd Quadrant");
//         } 
//         else {
//             System.out.println("Point lies in 4th Quadrant");
//         }
//     }
// }

//ques-take 3 +ve int input and print the greates of them

import java.util.Scanner;

public class elseifladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                 System.out.print("Enter x NUMBER: ");

        int x = sc.nextInt();

         System.out.print("Enter y NUMBER: ");
        int y = sc.nextInt();


         System.out.print("Enter z  NUMBER: ");
          int z = sc.nextInt();
      

        if(x>y&&x>z)
            System.out.println("x is greater");
        else if(y>x && y>z )
        System.out.println("Y IS GREATER");
          else 
        System.out.println("z IS GREATER");
    

        }
    }

    
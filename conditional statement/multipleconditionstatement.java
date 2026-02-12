// import java.util.Scanner;

// public class multipleconditionstatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
        
//         System.out.println("enter your number");
//         int x =sc.nextInt();
//         if(x>999  && x<10000)
//             System.out.println("number is four digit number");
//         else{
//             System.out.println("not four digit");
//         }

//     }
//}
//ques take integer input and tell if its magnitude is smaller than 69or not
// import java.util.Scanner;


// public class multipleconditionstatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int x = sc.nextInt();
    
//             if (Math.abs(x)>69 ){
//             System.out.println("Magnitude is smaller than 69");
//         } else {   
//             System.out.println("Magnitude is NOT smaller than 69");
//         }
//     }
// }   

//ques . take +ve integer input and tell if it is divisible by 5 or3 
// import java.util.Scanner;

// public class multipleconditionstatement {
//     public static void main(String[] args) {
//         System.out.println("enter the number");
//         Scanner sc = new Scanner (System.in);
//         int x = sc.nextInt();
//          if(x%5==0 || x%3==0)
//             System.out.println("number is divisible by 5 or 3 ");
//         else{
//              System.out.println("number is not divsible by 3 0r 5 ");
             
//         }
//     }
// }

//ques -.take 3 positive integers tell if they can be the sides of a triangles or not 


import java.util.Scanner;

public class multipleconditionstatement {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z = sc.nextInt();
        if(x+y>z && y+z>x && z+x>y)//property of triangle 
            System.out.println("triangle is valid ");
        else{
            System.out.println("triangle is not valid ");
        }
    }
}


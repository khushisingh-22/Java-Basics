import java.util.Scanner;

public class absolutevalue{

         public static void main(String[] args){

        System.out.println("enetr the number ");
        

         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
       
         if (n>=0){
                
                System.out.println(n );
                
         } else {
                System.out.println(-n);
                 
         }

        }
}
       ques ....

  import java.util.Scanner;

public class absolutevalue{

         public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         double n = sc.nextDouble();
         int x = (int)n;
         if(n-x > 0) System.out.println("not an integer");//to check  fractional part 
         else System.out.println("it is an integer");
       
         }
         }


         //ques.  if cost price and selling price o an item is input through
         // the keyboard ,write a program to determine whather the seller has masde profit or inncurred 
         // loss or no profit no loss.also determine how much profit he made or loss he inccured

import java.util.Scanner;

public class absolutevalue{
              public static void main(String[] args) {
                     Scanner sc = new Scanner (System.in);
                     System.out.println("enter cp: ");
                     int cp = sc.nextInt();

                   
                     System.out.println("enter sp: ");
                     int sp= sc.nextInt();
                     sc.close();

                     if(sp>cp)
                            System.out.println("profit is "  +(sp-cp));
                     if(cp>sp)
                             System.out.println("loss is"   +(cp-sp));
                            if(sp==cp)
                                   System.out.println("no profitor loss ");
                     
//agr hum yha pe hum age cp or sp same dalle toh loss ayega or agr cdono bhi >= lgaye  toh profit ayega jabki profit 
//ho hi nhi rha na .. toh isiliye hum multi if condition lga sakte h 
     
             }
        }



        
          
    


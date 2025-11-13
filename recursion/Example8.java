 //recursion -direct recursion 

// class Example8{
//  static int num=10;
//     public static void main(String[] args) {
//         System.out.println("main");
//         printNumbers();//calling method
//     }
//     public static void printNumbers()//called method
//     {
//         System.out.println(num-- +" ");
        
//         if(num<1) return;//base case
    
//         printNumbers();
//     }
// }




// ex2: print alphabhetls a-z
// class Example8{
  
//     public static void main(String[] args) {
//         printAlphabets('A');
//     }
//     public static void  printAlphabets(char ch) {
        
//         System.out.print(ch++ +" ");
//         if(ch>'Z') return;
//         printAlphabets(ch);  
//     }
// }
//



//Example3:print 5,4,3,2,1

// class Example8{
//     public static void main(String[] args) {
//         System.out.println("main starts()");
//         printNumbers(0);
//         System.out.println("main ends()");

//     }
//     public static void   printNumbers(int num) {
    
//     if(num>=5) return;
//     printNumbers(++num);
//     System.out.println(num++ +" ");
     
//     }
// }


//Example4: print characters from z to a
//  class Example8 {

//     public static void main(String[] args) {
//         System.out.println("main Starts()");
//         printAlphabets('A');
//         System.out.println("main Ends()");
//     }
//     public static void printAlphabets(char ch){
//     if(ch>='Z') return;
//     printAlphabets(++ch);
//     System.out.print(ch+" ");

// }
//  }

//Example5: find factorial...

// import java.util.Scanner;
// class Example8{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num=sc.nextInt();
        
//         printFactorial(num,1);

//     }
//         public static void printFactorial(int num,int i){
//             if(i>num) return;
//             if(num%i==0)
//             System.out.println(i);

//             printFactorial(num,++i);
            
            
//         }
// }


//Example6:Even numbers
// import java.util.Scanner;
// class Example8{
 


//     public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//     System.out.print("Enter Start:");
//     int start=sc.nextInt();
//     System.out.print("Enter End:");
//     int end=sc.nextInt();
//     findEvenOdd(start,end);

//     }
//     public static void findEvenOdd(int start,int end){
       
//          if(start>end)return;
//           if(start%2==0)
//         System.out.println(start);
      
//         findEvenOdd(++start,end);
//     }
//  }




//Example 7:Reverse number

// class Example8 {
  
//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println(num);
//       int rev=  reverseNumber(num, 0);
//                System.out.println(rev);
    
//     }

//     public static int reverseNumber(int num, int rev) {
//         if (num == 0)  // base case
//             return rev;
        
//         int rem = num % 10;
//         rev = rev * 10 + rem;
//      return reverseNumber(num / 10, rev); // return the recursive result
     
//     }
// }

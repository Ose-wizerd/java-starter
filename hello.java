import java.util.Scanner;

public class hello {
  public static void main(String[] args){
//        System.out.println("hello woeld");
//        int x=34;
//        int y=3;
//        System.out.println(x*y);
//   String x="ok";
//   String y="no";
//   String temp=x;
//   x=y;
//   y=temp;

//   System.out.println(x);
//   System.out.println(y);
  
  Scanner take = new Scanner(System.in);

  System.out.println("what is  your name: ");
  String name=take.nextLine();
  System.out.println("hello " + name+ "how old are you: ");
  int age=take.nextInt();
  System.out.print("where is your home: ");
  take.nextLine();
  String home= take.nextLine();
// Scanner scanner = new Scanner(System.in);
// Scanner take = new Scanner(System.in);
// System.out.print("Enter your name: ");
// String name=take.nextLine();
// System.out.println("hello "+ name);


   }
} 
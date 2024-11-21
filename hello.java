import java.util.Scanner;
import javax.swing.JOptionPane;
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
  
  // Scanner take = new Scanner(System.in);

  // System.out.println("what is  your name: ");
  // String name=take.nextLine();
  // System.out.println("hello " + name+ "how old are you: ");
  // int age=take.nextInt();
  // System.out.print("where is your home: ");
  // take.nextLine();
  // String home= take.nextLine();
// Scanner scanner = new Scanner(System.in);
// Scanner take = new Scanner(System.in);
// System.out.print("Enter your name: ");
// String name=take.nextLine();
// System.out.println("hello "+ name);

// String name=JOptionPane.showInputDialog("enter your name");
// System.out.println("hello "+name);
// int age = Integer.parseInt(JOptionPane.showInputDialog("how old you"));
// JOptionPane.showMessageDialog(null, name + "you are "+ age + "years age!");

Scanner take= new Scanner(System.in);

System.out.println("enter your age: ");
int age= take.nextInt();
take.nextLine();

System.out.println("enter your name");
String name=take.nextLine();

JOptionPane.showMessageDialog(null, "hello "+ name);
JOptionPane.showMessageDialog(null, "hello "+ name + "you are " + age + "years old");


   }
} 
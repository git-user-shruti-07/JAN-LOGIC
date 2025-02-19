import java.util.Scanner;
public class Demo10 {
    public static void main(String[] args) {
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username=sc.next();
        System.out.print("Enter a password: ");
        String password=sc.next();

        if("admin".equals(username)) {
            if("1234".equals(password)) {
                System.out.print("Login successful!");
            } else {
                System.out.print("Incorrect password!");
            }
        }else{
            System.out.print("Invalid username");
        }/**/



        Scanner sc=new Scanner(System.in)
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        String ans=(a%2==0)? "even":"odd";
        System.out.println("Number is"+ans);
    }
}

import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        switch (num) {
            case 1 ->System.out.println("One");
            case 2 ->System.out.println("Two");
            case 3 ->{
                System.out.println("Three");
                System.out.println("3:Three");
        }
            default ->System.out.println("Invalid Input");
    }
}
}
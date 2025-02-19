import java.util.Scanner;

public class Demo11{
    public static void main(String[] args) {
        

        /*int a=13;
        int b=20;
        while(a<b){
            {
                System.out.println("Hello World");
            }
            a++;
        }

        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        while(i<=10){
            System.out.println(n+"x"+i+":"+n*i);
            i++;
        }/* */

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int sum=0;
        int i=1;

        while(i<n){
            sum+=i;
            i++;
        }
        System.out.println("sum: "+sum);
    }
}
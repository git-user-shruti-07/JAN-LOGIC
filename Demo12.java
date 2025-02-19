import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        
        /*int num=5;
        int i=0;
        while(i<50){
            i+=num;
            if(i==25){
                break;
            }
            System.out.println(i);
        }*/

        Scanner sc=new Scanner(System.in);
        System.out.print("To unlock Enter Password: ");
        int pass=sc.nextInt();
        int count=1;


        while(pass!=1234){
            count++;
            if(count==5){
                System.out.println("Your Device is locked for 1 Day");
            }
            System.out.println("\nWrong Passkey: "+pass);
            System.out.println("Please Try Again: ");
            pass=sc.nextInt();
        }
        if(count<5){
            System.out.println("Device unlocked"); 
        }
        
    }
}

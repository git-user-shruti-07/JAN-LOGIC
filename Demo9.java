import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a SSC Marks: ");
        double ssc=sc.nextDouble();

        if(ssc>35){
            System.out.println("Enter a HSC Marks: ");
            double HSC=sc.nextDouble();
            if(HSC>35){
                System.out.println("Eligible for Placement!");
            } else {
                System.out.println("Not Eligible or placement!");
            } else{
                System.out.println("Not Eligible or placement!");
            }
        }
    }

}
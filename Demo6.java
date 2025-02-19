import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Yearly Income: ");

        double annualIncome=sc.nextDouble();

        if(annualIncome < 500000) {
            System.out.println("No Tax");
        } else if (annualIncome >= 500000 && annualIncome < 1000000){
            double tax=(annualIncome) * 0.02;
            System.out.println("Tax Amount: "+tax);
        } else if (annualIncome >=1000000 && annualIncome < 2000000){
            double tax=(annualIncome)*0.05;
            System.out.println("Tax Amount: "+tax);
        } else{
            double tax=(annualIncome)*0.07;
            System.out.println("Tax Amount: "+tax);
        }
    }
    
}

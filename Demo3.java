public class Demo3 {
    public static void main(String[] args) {
        

        System.out.println("~4: "+(~4));
        System.out.println("~32: "+(~32));
        System.out.println("~(-92): "+(-92));
        System.out.println("~(-92): "+(-92));
        System.out.println("~(9 << 3): "+( 9 << 3));
        System.out.println("~(14 << 5): "+(14 << 5));
        System.out.println("~(6 << 3): "+(6 << 3));
        System.out.println("~(27 >> 2): "+(27 >> 2));


        int a = 3;
        int b = 4;

        System.out.println("a :"+a);
        System.out.println("b :"+b);

        //int temp=a;
        //a=b;
        //b=temp;

       // a=a+b;
       // b=a-b;
       // a=a-b;

       
        //a=a*b;
        //b=a/b;
        //a=a/b;


        a=a^b;  //a=0111 => 7
        b=a^b;  //b=0011 => 2
        a=a^b;  //a=0100 => 4

        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    
}

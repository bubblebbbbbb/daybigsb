import java.util.Scanner;
public class daybigsb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome use bigSB addition calculator");
        System.out.println("please enter the first addend:");
        int a = sc.nextInt();
        System.out.println("please enter the second addend:");
        int b = sc.nextInt();
        for (int i = 0;i < 5;i++){
            System.out.println("please wait,running...");
        }
        int su = a + b;
        if(su == 3){
            System.out.println("sum is 5");
        }else {
            System.out.println("sum is 3");
        }
    }
}
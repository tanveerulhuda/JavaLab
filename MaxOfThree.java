import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else if (c>a && c>b) {
            System.out.println(c);
            
        } */

            System.out.println("===================");
            System.out.println("Input number A ");
            int a = sc.nextInt();
            System.out.println("input number B ");
            int b = sc.nextInt();
            System.out.println("input number C ");
            int c = sc.nextInt();

           if(a>b){
            System.out.println(" a is greater than b" + a);
            if(a>c){
                System.out.println("a is gretest "+ a);
            }
           }
           else if(b>a){
            System.out.println("b is greter "+ b);
            if ((b>c)) {
                System.out.println("b is graetes"+ b);
                
            }
           }
           System.out.println("c is greates "+ c);

    }
    
}

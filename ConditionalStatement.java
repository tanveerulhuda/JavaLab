import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        /* if(a<0){
            System.out.println("Negative");
        }
        else if(a>0){
            System.out.println("Positive");
        }
        System.out.println("Zero"); */

       /* System.out.println("------------------");

        System.out.println("Enter A");
        double a = sc.nextDouble();
        
        System.out.println("Enter B");
        double b =sc.nextDouble();

        System.out.println("Enter C");
        double c =sc.nextDouble();

        double discriminant  = b*b-4*a*c;

        if(discriminant>0){  // for two roots
            
            double root1= (-b + Math.sqrt(discriminant)/(2*a));
            double root2= (-b-Math.sqrt(discriminant)/(2*a));
            System.out.println("The roots are "+ root1 + "And " + root2);

        }
        else if (discriminant==0) {

            double root3 = -b/(2*a);
            System.out.println("The roots are "+ root3);

            
        }
        else{
            System.out.println("The equatin has no real roots");
        }
        sc.close();*/

        /* System.out.println("Enter the value of A ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of B ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of C ");
        double c = sc.nextDouble();
        
        double d= b*b-4*a*c;

        if(d>0){

            double root1 = -b+ Math.sqrt(d)/2*a;
            double root2 = -b- Math.sqrt(d)/2*a;
            System.out.println(root1+" And "+ root2);
            

        }
        else if(d==0){
            double root = -b/2*a;
            System.out.println(root);
        }
        else{
            System.out.println("invalid root");
        }*/
        System.out.println("Enter the Number ");
        double num = sc.nextDouble();
        
        if(num>0){
            if (num<1) {
                System.out.println("Small Positive number ");
                
            }
        else if(num>1000000){
            System.out.println("Large Positive number");
        } 
        
        else{
            System.out.println("positive");
    
        }

        

        }
        else if(num<0){
            if (Math.abs(num)<1) {
                System.out.println("Small negative number");
                
            }

        else if()    

        }  
}
}


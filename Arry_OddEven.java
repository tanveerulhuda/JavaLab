import java.util.Scanner;

public class Arry_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of an array");
        int n = sc.nextInt();
       

        System.out.println("Please enter elements of an array");
        int[] ar = new int[n];
       
        int sum = 0;
       
       for(int i= 0;i<ar.length;i++){
        ar[i] = sc.nextInt();
        
       }

       for(int i = 0; i<ar.length; i++){
            if(ar[i]%2==0){
                sum=sum+ar[i];
            }

       }
       System.out.println(sum);

    }
    
}

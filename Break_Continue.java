public class Break_Continue {

    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.print(i+",");
            if (i==50) {
                continue;
                
            }

            if (i==50) {
                break;
                
            }
            System.out.print("end");
        }
    }
}
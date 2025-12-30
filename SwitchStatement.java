public class SwitchStatement {
    public static void main(String[] args) {
        String day = "sunday";

        switch (day) {
            case "Monday":
                System.out.println("it is monday");
                
                break;

            case "Sunday":
                System.out.println("it is Sunday");
                break;   
        
            default:
                System.out.println("Go to Office");
                break;
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));        // calls add(int, int)
        System.out.println(calc.add(5, 10, 15));    // calls add(int, int, int)
        System.out.println(calc.add(2.5, 3.7));     // calls add(double, double)
    }
}
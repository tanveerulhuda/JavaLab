package OOpsWithDurgesh;

public interface Shape {
    
   public static final int i = 34;

   public abstract void CalculateArea();
}

abstract class Circle implements Shape {
    public void CalculateArea(int r){
        System.out.println("Area of Circle is " + (Math.PI*r*r));

         
}
public static void main(String[] args) {
    Shape s1 = new Circle();
        s1.CalculateArea();
    }
}



    
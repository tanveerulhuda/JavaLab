package OOpsWithDurgesh;

public class Dog extends Animal{

    public Dog(){
        super(2);

    }

    int x =4;

    public void speak(){
        System.out.println(super.x);
        System.out.println(this.x);
                
    }
    
}

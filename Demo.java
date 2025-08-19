package OOpsWithDurgesh;

public class Demo {
    public static void main(String[] args) {
        //Student st1;
        //st1 = new Student();
        
        Student st1 = new Student();   //-------Object 1-----
//----Printing Atrributes of Class Student
        System.out.println(st1.studentName="Ram");
        System.out.println(st1.studentid=001);
        System.out.println(st1.studentCity="Mumbai");

//Printing method of Class Student
        st1.study();
        st1.showFullDetails();

        //-----------------Taking Object two-----------------------------
        Student st2 = new Student(12,"Amit","Dehradon");
        System.out.println("-------------------");
        // st2.studentName = "Aman";
        // st2.studentCity = "Kolkata";
        // st2.studentid = 002;

        st2.showFullDetails();

        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);
        System.out.println(d1.x);
        System.out.println(d1.x);
        
        Animal a1 = new Animal(0);
        a1.sleeping();
    
}
}

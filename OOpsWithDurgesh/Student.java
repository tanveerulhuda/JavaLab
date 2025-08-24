package OOpsWithDurgesh;

class Student {

    //Data:data members: instance variable(Attribute )
    int studentid;
    String studentName;
    String studentCity;
    
//---constructor-----
    public Student(){
        System.out.println("Creating object, non-P");
        
    }

//---constructor 2, we can create multiple constructor in a same class called constructor overloading
public Student(int i, String n, String c){
    studentid = i;
    studentName =n;
    studentCity = c;
    System.out.println("paramitrized constructor");
}   
    

    //Behaviour: member method/methods(Function)

    public void study(){
        System.out.println("Student name is "+studentName);
    }
    public void study(float f){

    }

    public void showFullDetails(){
        System.out.println("Student name "+studentName);
        System.out.println("Student id "+studentid);
        System.out.println("Student City "+studentCity);
    }






    /*public static void main(String[] args) {  //-----MAin method------
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
        Student st2 = new Student();
        System.out.println("-------------------");
        st2.studentName = "Aman";
        st2.studentCity = "Kolkata";
        st2.studentid = 002;

        st2.showFullDetails();
    }*/

    
    



}

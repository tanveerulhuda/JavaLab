class Test{
    public static void main(String[] args) {
        System.out.println("Hello word");

        // defining variable
        int a;
        a = 56;
        System.out.println(a);
        //-- or

        int a1 = 57;
        System.out.println(a1);
        a1 = 58;
        System.out.println(a1);

        //Type casting

        int a2= 50;
        double d = a1;
        System.out.println(a2);
        System.out.println(d);  // impilicit  no data loss

        double myDouble = 55.9;
        int myInt = (int)myDouble;   // expilicit data loss
        System.out.println(myDouble);
        System.out.println(myInt);

        double d1 = 78.2f;
        float myfloat = (float)d1;
        System.out.println(myfloat);
        System.out.println(d1);
//operator
        int a5 = 30;
        a5+=50;
        a5= a5+90;

        System.out.println(a5);

        int a6 = 70;
        //++a6;                      // Increament operator
        --a6;                        // Decreament optor
        System.out.println(a6);

        // Assignment opertor
    int a7 = 10;
    a7 +=2;
    System.out.println(a7);

    




    


    }
}
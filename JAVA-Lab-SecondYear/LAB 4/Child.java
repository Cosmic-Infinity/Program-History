class Child extends Parent{
    int a = 10;
    Child(){super();}

    void print(){System.out.println("Child");}

    void display(){
        System.out.println(super.a);
        super.print();
    }
}

class Parent{
    int a = 100;
    Parent(){System.out.println("Parent Constructor");}

    void print(){System.out.println("Parent");}
}


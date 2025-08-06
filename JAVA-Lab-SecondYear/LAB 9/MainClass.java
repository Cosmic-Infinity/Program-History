class ParentClass {
    // Static initializer block in ParentClass
    static {
        System.out.println("Static block in ParentClass executed");
    }

    // Instance initializer block in ParentClass
    {
        System.out.println("Instance initializer block in ParentClass executed");
    }

    // Constructor in ParentClass
    public ParentClass() {
        System.out.println("Constructor of ParentClass executed");
    }
}

class ChildClass extends ParentClass {
    // Static initializer block in ChildClass
    static {
        System.out.println("Static block in ChildClass executed");
    }

    // Instance initializer block in ChildClass
    {
        System.out.println("Instance initializer block in ChildClass executed");
    }

    // Constructor in ChildClass
    public ChildClass() {
        System.out.println("Constructor of ChildClass executed");
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main method in MainClass executed");
        ChildClass obj = new ChildClass(); // Creating an instance of ChildClass
    }
}

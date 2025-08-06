/*
7. An educational institution maintains a database of its employees. The database is
divided into a number of classes whose hierarchical relationships are shown below.
Write all the classes and define the methods to create the database and retrieve
individual information as and when needed.

Staff (code, name) Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.

Write a driver program to test the classes.
 */

class Academic_Inst {
    public static void main(String[] args) {
        Staff staff = new Staff("S001", "John Doe");
        Teacher teacher = new Teacher("T002", "Rakseh", "Math", "Calculus");
        Officer officer = new Officer("O003", "Mohan", "A");
        RegularTypist regTypist = new RegularTypist("RT004", "Shyama", 80, 30000);
        CasualTypist casTypist = new CasualTypist("CT005", "Tarish", 70, 500);

        staff.showData();
        System.out.println();
        teacher.showData();
        System.out.println();
        officer.showData();
        System.out.println();
        regTypist.showData();
        System.out.println();
        casTypist.showData();
    }
}

class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void showData() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public void showData() {
        super.showData();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public void showData() {
        super.showData();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public void showData() {
        super.showData();
        System.out.println("Speed: " + speed);
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist(String code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public void showData() {
        super.showData();
        System.out.println("Remuneration: " + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist(String code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public void showData() {
        super.showData();
        System.out.println("Daily Wages: " + dailyWages);
    }
}


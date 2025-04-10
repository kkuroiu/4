class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + id);
    }
}

class Student extends Person {
    private String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class SchoolTest {
    public static void main(String[] args) {
        // Declare variables
        String name = "Yan Linzo";
        int id = 1568;
        String gradeLevel = "First";
        String subject = "Programming";
        String department = "SACE";

        Student student = new Student(name, id, gradeLevel);
        student.displayInfo();

        Teacher teacher = new Teacher("Carla Garcia", 0023, "Programming");
        teacher.displayInfo();

        Staff staff = new Staff("Nathan Chavez", 0056, "SACE");
        staff.displayInfo();
    }
}

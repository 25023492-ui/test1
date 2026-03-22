class StudentTest {

    private String id;
    private String name;
    private String email;
    private double gpa;

    public StudentTest() {
        id = "";
        name = "";
        email = "";
        gpa = 0.0;
    }

    public StudentTest(String id, String name) {
        this.id = id;
        this.name = name;
        this.email = "";
        this.gpa = 0.0;
    }

    public StudentTest(StudentTest s) {
        this.id = s.id;
        this.name = s.name;
        this.email = s.email;
        this.gpa = s.gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA khong hop le");
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGpa() {
        return gpa;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentTest s1 = new StudentTest();
        s1.setId("SV01");
        s1.setName("An");
        s1.setEmail("an@gmail.com");
        s1.setGpa(3.2);

        StudentTest s2 = new StudentTest("SV02", "Binh");
        s2.setEmail("binh@gmail.com");
        s2.setGpa(-1);

        StudentTest s3 = new StudentTest(s1);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
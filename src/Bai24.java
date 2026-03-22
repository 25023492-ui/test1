class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Employee {

    String name;
    MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(
                other.birthday.day,
                other.birthday.month,
                other.birthday.year
        );
    }
}

class Bai24 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("An", new MyDate(1, 1, 2000));

        Employee emp2 = new Employee(emp1);

        emp1.birthday.day = 2;
        emp1.birthday.month = 2;
        emp1.birthday.year = 2022;

        System.out.println(
                emp2.birthday.day + "/" +
                        emp2.birthday.month + "/" +
                        emp2.birthday.year
        );
    }
}
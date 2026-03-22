class Person {

    private String name;
    private Person me;

    public Person(String name) {
        this.name = name;
    }

    public void setMe(Person other) {
        me = other;
    }

    public Person getMe() {
        return me;
    }

    public String getName() {
        return name;
    }
}

class Bai28 {

    public static void main(String[] args) {

        Person p = new Person("An");

        p.setMe(p);

        System.out.println(p.getMe().getName());

        p = null;
    }
}
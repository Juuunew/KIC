class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
public class Person1_1111_9 {
    public static void main(String[] args) {
        Person p1 = new Person("123456-124567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

      //  p1.nation = "usa";
      //  p1.ssn = "654321-7654321";
        p1.name = "을지문덕";
    }
}
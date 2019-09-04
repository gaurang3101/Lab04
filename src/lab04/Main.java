package lab04;
import lab04.Person;
import lab04.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gaurang",19,'M');
        System.out.println(person.toString());
        Student student =
                new Student(person.getName(), person.getAge(),person.getGender(), 43067278974L,6.5D);
        System.out.println(student);
        /*
        Hello, My name
         */
    }
}


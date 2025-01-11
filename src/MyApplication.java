import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon ", "trasher", 27045.78));
        people.add(new Employee("George", "Harrison ", "qwerty texter",50000.00));
        people.add(new Student("Ringo", "Starr ", 2.0));
        people.add(new Student("Paul", "McCartney ", 3.5));

        Collections.sort(people);

        printData(people);
    }
    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable + "earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}
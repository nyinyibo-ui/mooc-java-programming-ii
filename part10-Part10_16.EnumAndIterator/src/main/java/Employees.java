/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();

            System.out.println(nextPerson);
        }

    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation()==education) {
                System.out.println(nextPerson);

            }

        }
    }

    public void fire(Education education) {
        this.employees.removeIf(p -> p.getEducation() == education);
    }
}

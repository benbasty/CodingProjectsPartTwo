package com.projects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person2> persons;
    public Employees() {
        this.persons = new ArrayList<>();
    }
    public void add(Person2 personToAdd) {
        this.persons.add(personToAdd);
    }
    public void add(List<Person2> peopleToAdd) {
        Iterator<Person2> iterator = peopleToAdd.iterator();
        iterator.forEachRemaining(persons ->this.persons.add(persons));
    }

    public void print() {
        Iterator<Person2> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(EnumAndIterator.Education education) {
        Iterator<Person2> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person2 nextPers = iterator.next();
            if (nextPers.getEducation().equals(education)) {
                System.out.println(nextPers);
            }
        }

    }

    public void fire(EnumAndIterator.Education education) {
        Iterator<Person2> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person2 nextPers = iterator.next();
            if (nextPers.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}

package com.palyground.predicate;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.palyground.predicate.PredicateExample.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by andriusbaltrunas on 7/26/2018.
 */
public class TestPredicateExample {

    private static List<Person> persons;

    @BeforeClass
    public static void before() {
        persons = new ArrayList<>();
        persons.add(new Person(10, "M", "Andrius", "Andrius", "abdrius@test.com", "Kaunas"));
        persons.add(new Person(30, "M", "Tomas", "Daskutis", "tomasD@test.com", "Kaunas"));
        persons.add(new Person(30, "M", "Edmians", "Vrubliauskas", "edminas@test.com", "Vilnius"));
        persons.add(new Person(35, "M", "Andrius", "Janulis", "andriusj@test.com", "Klaipeda"));
        persons.add(new Person(25, "W", "Greta", "B", "gretab@test.com", "Klaipeda"));
        persons.add(new Person(30, "W", "Agne", "B", "agneB@test.com", "Sauliai"));
        persons.add(new Person(1, "W", "Dominyka", "B", null, "Vilnius"));
        persons.add(new Person(55, "M", "Antanas", "B", "antanasB@test.com", "Kaunas"));
    }

    @Test
    public void testIsMale() {
        List<Person> response = filterPerson(persons, isMale());
        assertTrue(response.size() == 5);
    }

    @Test
    public void testIsAdultWomment() {
        List<Person> response = filterPerson(persons, isAdultWomen());
        assertTrue(response.size() == 2);
    }

    @Test
    public void testisOlderThen() {
        List<Person> response = filterPerson(persons, isOlderThen(30));
        assertTrue(response.size() == 2);
    }

    @Test
    public void testIsNameAndSurnameWhichFirstLetter() {
        List<Person> response = filterPerson(persons, idNameAndSurnameWhichFirstLetter("A"));
        assertTrue(response.size() == 1);
    }

    @Test
    public void testIsFromCity() {
        List<Person> response = filterPerson(persons, isFromCity("Kaunas"));
        assertTrue(response.size() == 3);
    }

    @Test
    public void testisWomenWithoutEmail() {
        List<Person> response = filterPerson(persons, isWomenWithoutEmail());
        assertTrue(response.size() == 1);
    }
}
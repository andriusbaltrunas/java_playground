package com.palyground.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by andriusbaltrunas on 7/26/2018.
 */
public class PredicateExample {

    public static Predicate<Person> isMale(){
        return p -> p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Person> isAdultWomen(){
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("W");
    }

    public static Predicate<Person> isOlderThen(int age){
        return p -> p.getAge() > age;
    }

    public static Predicate<Person> idNameAndSurnameWhichFirstLetter(String letter){
        return p -> p.getName().startsWith(letter) && p.getSurname().startsWith(letter);
    }

    public static Predicate<Person> isFromCity(String city){
        return p -> p.getCity().equalsIgnoreCase(city);
    }

    public static Predicate<Person> isWomenWithoutEmail(){
        return p -> p.getEmail() == null && p.getGender().equalsIgnoreCase("w");
    }

    public static List<Person> filterPerson(List<Person> persons, Predicate<Person> predicate){
        return persons.stream().filter(predicate).collect(Collectors.toList());
    }
}

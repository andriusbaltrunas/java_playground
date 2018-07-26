package com.palyground.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by andriusbaltrunas on 7/26/2018.
 */
@Data
@AllArgsConstructor
public class Person {
    private int age;
    private String gender;
    private String name;
    private String surname;
    private String email;
    private String city;
}

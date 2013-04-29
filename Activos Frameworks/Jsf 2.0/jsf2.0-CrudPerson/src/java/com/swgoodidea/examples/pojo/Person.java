/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swgoodidea.examples.pojo;

/**
 *
 * @author USUARIO
 */
public class Person {
    
    private Long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + ", address=" + address + '}';
    }
}
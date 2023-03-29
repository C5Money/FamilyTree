package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
//    Instance Variables
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private Person partner;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;


//    Constructor
    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }


//    Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String getMiddelName() {
        return middleName;
    }

    public void setMiddleName(String middelName) {
        this.name = middelName.substring(0, 1).toUpperCase() + middelName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.name = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


//    Instance Methods
void addParents(Person father, Person mother, Person child ){
    child.setFather(father);
    child.setMother(mother);
    mother.addChild(child, mother);
    father.addChild(child, father);

}
    void addChild(Person child, Person parent){
        List<Person> children = new ArrayList<>();
        if(parent.getChildren() != null){
            for(Person person : parent.getChildren()){
                children.add(person);
            }
        }
        children.add(child);
        parent.setChildren(children);
    }

    void addPet(Person owner, Pet pet){
        List<Pet> pets = new ArrayList<>();
        if(owner.getPets() != null){
            for(Pet petje : owner.getPets()){
                pets.add(petje);
            }
        }
        pets.add(pet);
        owner.setPets(pets);
    }

    void addSibling(Person person, Person sibling){
        List<Person> siblings = new ArrayList<>();
        if( person.getSiblings() != null) {
            for (Person sib : person.getSiblings()) {
                siblings.add(sib);
            }
        }
        siblings.add(sibling);
        person.setSiblings(siblings);
    }

    public List<Person> getGrandchildren(){
        List<Person> children = new ArrayList<>();
        if(getChildren() != null){
            for (Person parent : getChildren()){
                if(parent.getChildren() != null){
                    for ( Person grandChild : parent.getChildren()){
                        children.add(grandChild);
                    }
                }
            }
        }
        return children;
    }

    void getFamilyTree(){
        System.out.println("My name is " + (getName()+ " " + getMiddelName() + " " + getLastName()) + " and I have " );
        if(getPartner() != null ){
            System.out.println("My partner is " + getPartner().getName());
        } else {
            System.out.println("I don't have a partner. Still looking for somebody...");
        }
    }

}

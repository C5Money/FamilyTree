package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @Test
    @DisplayName("setName() should correct name's lowercase letters so that getName() will give a name with the right uppercase letterformat")
    void addParents() {
        // Arrange
        Person person = new Person("Paulina", "Walters", 19, "Female");
        person.setName("seRaPHina");
        // Act:
        String correctName = person.getName();
        // Assert:
        assertEquals("Seraphina", correctName);
    }

    @Test
    @DisplayName("Parents should be added to a child")
    void addChild() {
        // Arrange:
        Person child = new Person("Naruto", "Uzumaki", 10,"Male" );
        Person dad = new Person("Minato", "Namikaze", 28,"Male" );
        Person mom = new Person("Kushina", "Uzumaki", 29, "Female");
        child.addParents( dad, mom, child );
        // Act:
        String nameMother = child.getMother().getName();
        String nameFather = child.getFather().getName();
        // Assert:
        assertEquals("Kushina", nameMother);
        assertEquals("Minato", nameFather);
    }

    @Test
    @DisplayName("pet should be added to person and make them petOwner")
    void addPet() {
        // Arrange:
        Person person = new Person("Peter", "Parker", 23, "Male");
        Pet pet = new Pet("Spider", 5, "Insect");
        person.addPet(person, pet);
        // Act:
        String naamPet = person.getPets().get(0).getName();
        // Assert:
        assertEquals("Spider", naamPet);
    }

    @Test
    @DisplayName("Sibling should be added to person")
    void addSibling() {
        // Arrange:
        Person person1 = new Person("Kara", "Supergirl", "Al", "Female", 26);
        Person person2 = new Person("Clark", "Superman", "Kent", "Male", 25);
        person1.addSibling(person1, person2);
        // Act:
        int numOfSiblings = person1.getSiblings().get(0).getAge();
        // Assert:
        assertEquals(25, numOfSiblings);
    }

    @Test
    @DisplayName("Grandchild should be added to person")
    void getGrandchildren(){
        // Arrange:
        Person person0 = new Person("Optimus", "Prime", 180, "Male");
        Person person1 = new Person("Mother", "Prime", 121, "Female");
        Person person2 = new Person("Bumble", "Bee", 75, "Male");
        Person person3 = new Person("Mommy", "Bee", 65, "Female");
        Person person4 = new Person("Tiny", "Bee", 12, "Female");
        person4.addParents(person2, person3, person4);
        person2.addParents(person0, person1, person2);
        person4.addParents(person2, person3, person4);
        // Act:
        String grandChild = person0.getGrandchildren().get(0).getName();
        // Assert:
        assertEquals("Tiny", grandChild );
    }
}
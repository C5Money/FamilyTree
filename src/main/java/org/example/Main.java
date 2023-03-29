package org.example;

public class Main {
    public static void main(String[] args) {

// Family Simpson
        Person father = new Person("Homer", "J.", "Simpson", "Male", 47);
        Person mother = new Person("Maggy", "Jacqueline", "Simpson", "Female", 36);

        Person child1 = new Person("Lisa", "Simpson", 11, "Female");
        Person child2 = new Person("Bartholomew", "Jojo", "Simpson", "Male", 9);
        Person child3 = new Person("Maggie", "Simpson", 6, "Female");

        Person granny = new Person("Mona", "Simpson", 62, "Female");
        Person granpy = new Person("Grandpa", "Abraham II", "Simpson", "Male", 64);

        Person anti1 = new Person("Patty", "Bouvier", 48, "Female");
        Person anti2 = new Person("Selma", "Bouvier", 49, "Female");

// Family Simpson Pets
        Pet pet1 = new Pet("Santa's Little Helper", 9, "Dog");
        Pet pet2 = new Pet("Snowball", 12, "Cat");


// Ralaties
        father.setPartner(mother);

        System.out.println("1. " + father.getPartner().getName() );
        System.out.println();

        child1.addParents( father, mother, child1 );
        child2.addParents( father, mother, child2 );
        child3.addParents( father, mother, child3 );
        System.out.println("2. " + child1.getMother().getName() );
        System.out.println("3. " +  child1.getFather().getName() );
        System.out.println();

        father.addParents( granpy, granny, father );
        System.out.println("4: ");
        System.out.println( granpy.getGrandchildren().get(0).getName() );
        System.out.println();

        father.addPet(father, pet1);
        child2.addPet(child2, pet2);
        System.out.println("5: " + father.getPets().get(0).getName() );

        child1.addSibling(child1, child2);
        child1.addSibling(child1,child3);
        System.out.println("6: " + child1.getSiblings().get(0).getName() );
        System.out.println();

        father.getFamilyTree();
        mother.getFamilyTree();

    }
}
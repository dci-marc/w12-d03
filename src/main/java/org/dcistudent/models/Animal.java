package org.dcistudent.models;

import lombok.Getter;

@Getter
public class Animal {
    private final String name;
    private final Integer age;
    private final String species;

    public Animal(String name, Integer age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
            "name='" + this.name + '\'' +
            ", age=" + this.age +
            ", species='" + this.species + '\'' +
            '}';
    }
}

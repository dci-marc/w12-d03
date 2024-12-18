package org.dcistudent.collections;

import org.dcistudent.models.Animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalCollection {
    private final Map<String, Animal> animals = new HashMap<>();

    public Boolean add(Animal... animals) {
        for (Animal animal : animals) {
            this.animals.put(animal.getName(), animal);
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnimalCollection{" +
                "animals=" + this.animals +
                '}';
    }
}

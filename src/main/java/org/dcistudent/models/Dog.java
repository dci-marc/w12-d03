package org.dcistudent.models;

public final class Dog extends AnimalSealed {
    private final String breed;

    public Dog(String name, Integer age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
            "breed='" + this.breed + '\'' +
            '}';
    }
}

package org.dcistudent.models;

public final class Cat extends AnimalSealed {
    private final String breed;

    public Cat(String name, Integer age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString() + " Cat{" +
            "breed='" + this.breed + '\'' +
            '}';
    }
}

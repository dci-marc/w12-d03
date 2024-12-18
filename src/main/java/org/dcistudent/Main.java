package org.dcistudent;

import org.dcistudent.collections.AnimalCollection;
import org.dcistudent.interfaces.models.Car;
import org.dcistudent.models.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.out.println("================================================================================");
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.print();
        OuterClass.InnerStaticClass isc = new OuterClass.InnerStaticClass();
        isc.print();

        System.out.println("================================================================================");
        Student student = new Student.Builder()
            .name("John Doe")
            .age(25)
            .course("Computer Science")
            .address("123 Main St")
            .build()
        ;
        System.out.println(student);

        System.out.println("================================================================================");
        Car car = new Car() {
            private Boolean started = false;

            @Override
            public void start() {
                this.started = true;
                System.out.println("Car started");
            }
        };
        car.start();

        System.out.println("================================================================================");
        Animal dog = new Animal("Dog", 5, "Canine") {
            private final String breed = "Golden Retriever";

            public String getBreed() {
                return breed;
            }

            @Override
            public String toString() {
                return super.toString() + " Dog{" +
                    "breed='" + this.breed + '\'' +
                    '}';
            }
        };
        System.out.println(dog);

        System.out.println("================================================================================");
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.add(dog);
        System.out.println(animalCollection);

        System.out.println("================================================================================");
        Dog dogSealed = new Dog("Dog", 5, "Canine", "Golden Retriever");
        Cat catSealed = new Cat("Cat", 3, "Feline", "Siamese");
        System.out.println(dogSealed);
        System.out.println(catSealed);
        System.out.println("================================================================================");
    }
}
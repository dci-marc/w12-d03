package org.dcistudent.models;

import lombok.Getter;
import lombok.NonNull;

@NonNull
public record Student(String name, Integer age, String course, String address) {
    public Student {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (course.isBlank()) {
            throw new IllegalArgumentException("Course cannot be blank");
        }

        if (address.isBlank()) {
            throw new IllegalArgumentException("Address cannot be blank");
        }
    }

    @Getter
    public static class Builder {
        @NonNull
        private String name = "";
        @NonNull
        private Integer age = 0;
        @NonNull
        private String course = "";
        @NonNull
        private String address = "";

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder course(String course) {
            this.course = course;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(name, age, course, address);
        }
    }
}
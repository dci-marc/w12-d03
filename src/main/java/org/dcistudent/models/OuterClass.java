package org.dcistudent.models;

public class OuterClass {
    private Integer outerNum = 10;
    Integer outerNumDefault = 20;

    public class InnerClass {
        private Integer innerNum = 30;
        Integer innerNumDefault = 40;

        public void print() {
            System.out.println("Outer num: " + outerNum);
            System.out.println("Outer num default: " + outerNumDefault);
            System.out.println("Inner num: " + innerNum);
            System.out.println("Inner num default: " + innerNumDefault);
        }
    }

    public static class InnerStaticClass {
        private Integer innerStaticNum = 50;
        Integer innerStaticNumDefault = 60;

        public void print() {
            System.out.println("Inner static num: " + innerStaticNum);
            System.out.println("Inner static num default: " + innerStaticNumDefault);
        }
    }
}

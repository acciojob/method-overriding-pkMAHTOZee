package com.driver;

public class Main {
    // Task 1: Create class A
    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2: Create class B which extends class A
    static class B extends A {
        // Task 4: Override method meth of class A in class B
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        String resultTask3 = objB.meth();
        System.out.println(resultTask3);

        // Task 5: Call the overridden method from obj of class B
        String resultTask5 = objB.meth();
        System.out.println(resultTask5);
    }
}
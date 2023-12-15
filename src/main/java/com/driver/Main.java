package com.driver;

public class Main {
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

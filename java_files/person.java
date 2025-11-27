interface Greet {
    void sayHello(); // Abstract method
}

class Person implements Greet {
    public void sayHello() { // Implementing the interface method
        System.out.println("Hello from Person!");
    }
    
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello(); // Output: Hello from Person!
    }
}
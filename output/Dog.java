class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal { // Inheritance
    @Override
    void sound() { // Method Overriding
        System.out.println("Dog barks");
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Output: Dog barks
    }
}
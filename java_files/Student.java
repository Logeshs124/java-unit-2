class Student {
    String name;
    
    void introduce() {
        System.out.println("Hello, my name is " + name);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.introduce(); // Output: Hello, my name is Alice
    }
}
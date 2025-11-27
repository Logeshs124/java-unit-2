class Book {
    String title;
    
    Book(String t) { 
        title = t;
    }
    
    void show() {
        System.out.println("Book: " + title);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        b1.show(); 
    }
}
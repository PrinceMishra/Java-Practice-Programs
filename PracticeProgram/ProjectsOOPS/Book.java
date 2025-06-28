package ProjectsOOPS;

class Book {

    static int totalBooks;

    String title;
    String author;
    String isbn;

    static{
      totalBooks=0;
    }
    
    Book(String title, String author, String isbn){

        this.title=title;
        this.author= author;
        this.isbn=isbn;
    }

    public void borrowBook(String title){

        System.out.println(title + " book has been borrowed.");
        
    }

    public void returnBook(String title){

         System.out.println(" Thankyou for returning the " + title + " book.");
    }

    public static int getTotalBooks() {
        return totalBooks;
    }


    public static void main(String[] args) {

        Book bk =new Book();
        
    }
    
}

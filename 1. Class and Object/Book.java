public class Book {
    //   Book → title, price, author (object of Author)
    private String title;
    private double price;
    private String author;

    // constructor 
    Book(String title, double price, String author){
        this.title = title;
        this.price = price;
        this.author = author;

    }
    // display method()
    public void displaytitle(){
        System.out.println("Author Name is " + author);
    }

    public void displayprice(){
         System.out.println("price  is " + price);
    }
    
    public void author(){
    System.out.println("Title  is " + title);
    }
}

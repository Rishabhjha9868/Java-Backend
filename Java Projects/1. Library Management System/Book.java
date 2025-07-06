public class Book {
    // attribute title, author, ISBN, and isAvailable
    private String title;
    private String author;
    private boolean isAvailable;

    // constructor
    public void Book(){
            System.out.println("This is Book");
    }

    // getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

        // methods
        public void borrow() {
        if (isAvailable == true) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
     public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    
}

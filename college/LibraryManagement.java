import java.util.Scanner;
public class LibraryManagement {
    int bookId;
    String booktitle;
    String author;
    Boolean Availability;
    public LibraryManagement(int bookId, String booktitle, String author, Boolean Availability) {
        this.bookId = bookId;
        this.booktitle = booktitle;
        this.author = author;
        this.Availability = Availability;
    }
    public void issueBook(){
        if(Availability){
            System.out.println("Book is available for issue.");
            Availability=false;
        }
        else{
            System.out.println("Book is not available for issue.");
        }
    }
    public void returnBook(){
        if(!Availability){
            System.out.println("Book is returned successfully.");
            Availability=true;
        }
        else{
            System.out.println("Book is already available in library.");
        }
    }
    public void display(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + booktitle);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + Availability);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int bookId=sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Book Title: ");
        String booktitle=sc.nextLine();
        System.out.print("Enter Author: ");
        String author=sc.nextLine();
        System.out.print("Is the book available? (true/false): ");
        Boolean Availability=sc.nextBoolean();
        LibraryManagement l1=new LibraryManagement(bookId, booktitle, author, Availability);
        l1.display();
        l1.issueBook();
        l1.returnBook();
    }
}

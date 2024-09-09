package Library_System;

public class Book extends LibraryItem implements Borrowable{
    String author;
    boolean borrowed;
    String borrower;
    public Book(String a, String b,int c)
    {
       this.author=b;
       this.title=a;
       this.year=c;
       this.borrowed=false;
    }
    public void borrowItem(String a)
    {
        this.borrower=a;
        this.borrowed=true;
    }
    public void returnItem()
    {
        this.borrower="";
        this.borrowed=false;
    }
    public boolean isBorrowed()
    {
        return (boolean)this.borrowed;
    }
    public void displayInfo()
    {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.year);
    }
}

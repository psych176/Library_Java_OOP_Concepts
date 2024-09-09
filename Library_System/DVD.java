package Library_System;

public class DVD extends LibraryItem implements Borrowable{
    double duration;
    String borrower;
    boolean borrowed;
    DVD(String a,int b,double c)
    {
        this.title=a;
        this.year=b;
        this.duration=c;
        this.borrowed=false;
    }
    public void borrowItem(String a)
    {
        this.borrower=a;
        this.borrowed=true;
    }
    public void returnItem()
    {
        this.borrowed=false;
        this.borrower="";
    }
    public boolean isBorrowed()
    {
        return (boolean)this.borrowed;
    }
    @Override
    void displayInfo() {
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.duration);
    }
}

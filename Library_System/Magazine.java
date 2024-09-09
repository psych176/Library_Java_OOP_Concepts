package Library_System;

public class Magazine extends LibraryItem {
    String issueNumber;
    public Magazine(String a,String b,int c)
    {
     this.title=a;
     this.issueNumber=b;
     this.year=c;
    }
    public void displayInfo()
    {
    System.out.println(this.title);
    System.out.println(this.issueNumber);
    System.out.println(this.year);
    }
}

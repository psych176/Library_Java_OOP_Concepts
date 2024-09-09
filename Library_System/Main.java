package Library_System;

public class Main {
    public static void main(String[] args) {
        Library l1=new Library();
        LibraryItem ll1=l1.lib.addBook("2 of us", "Vidit", 2004);
        LibraryItem ll2=l1.lib.addBook("we used to be friends", "Dhruvi", 2003);
        l1.lib.borrow(ll1, "upanshu", "27-8-09");
        l1.lib.returnI(ll1, "30-8-09");
        l1.lib.borrow(ll2,"vaibhav","31-08-09");
        l1.lib.returnI(ll2,"4-10-09");
        l1.lib.displayHistory(ll2);
    }
}

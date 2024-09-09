package Library_System;

public interface Borrowable {
    void borrowItem(String a);
    void returnItem();
    boolean isBorrowed();
}

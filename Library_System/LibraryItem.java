package Library_System;

public abstract class LibraryItem {
    String title;
    int year;
    abstract void displayInfo();
    public class borrowingHistory
    {
        int i;
        String borrow[][]=new String[100][3];
        void addHistory(String a,String b)
        {
            borrow[i][0]=a;
            borrow[i][1]=b;
        }
        void returnitem(String c)
        {
            borrow[i][2]=c;
            i++;
        }
        void display()
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(borrow[j][0]);
                System.out.println(borrow[j][1]);
                System.out.println(borrow[j][2]);
            }
        }
    }
    borrowingHistory a=new borrowingHistory();
}

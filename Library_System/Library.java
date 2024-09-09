package Library_System;

public class Library {
    LibraryItem item[]=new LibraryItem[100];
    int j=0;
    public void addItem(LibraryItem a)
    {
       item[j]=a;
       this.j++;
    }
    public void removeItem(LibraryItem a)
    {
        for(int i=0;i<100;i++)
        {
            if(this.item[i]==a)
            {
                this.item[i]=null;
               for(int k=i;k<99;k++)
               {
                 if(this.item[k+1]!=null)
                 this.item[k]=this.item[k+1];
               }
               break;
            }
        }
        this.j--;
    }
    public void searchItem(String a)
    {
        for(int i=0;i<this.j;i++)
        {
            if(this.item[i].title==a)
            {
            System.out.println("found");
            break;
            }
        }
    }
    public void displayInfo()
    {
        for(int i=0;i<this.j;i++)
        System.out.println(this.item[i].title);
    }
    public class librarian
    {
        LibraryItem addBook(String a, String b, int c)
        {
           Book b1=new Book(a,b,c);
           addItem(b1);
           return b1;
        }
        void removeIte(LibraryItem a)
        {
          removeItem(a);
        }
        void borrow(LibraryItem a1,String a,String b)
        {
            a1.a.addHistory(a, b);
        }
        void  returnI(LibraryItem a1,String c)
        {
            a1.a.returnitem(c);
        }
        void displayHistory(LibraryItem a1)
        {
            a1.a.display();
        }
        LibraryItem addMagazine(String a,String b,int c)
        {
           Magazine m1=new Magazine(a, b,c);
           addItem(m1);
           return m1;
        }
        LibraryItem addDVD(String a,int b,double c)
        {
           DVD d1=new DVD(a,b,c);
           addItem(d1);
           return d1;
        }
    }
    librarian lib=new librarian();
}

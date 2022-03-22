package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof(3421, "gorkem", "cirtma","prof");
        Student student1 = new Student(4687, "gizem", "aydın",19);

        Book book1=new Book("C Programing");
        Book book2=new Book("İntroduction to Java");
        Book book3=new Book("Operating Systems");
        Library library1 = new Library();
        library1.AddBook(book1);
        library1.AddBook(book2);
        library1.AddBook(book3);
        System.out.println("*******************************");
        System.out.println("Library books");
        for(int i =0;i<library1.getBooks().size();i++){
           System.out.println( library1.getBooks().get(i).getName());

        }
        System.out.println("**********************************");
        System.out.println("Library books after set them student and prof");
        library1.landBook(book3,student1);
        library1.landBook(book2,prof1);

        for(int i =0;i<library1.getBooks().size();i++){
            System.out.println( library1.getBooks().get(i).getName());

        }
        System.out.println("*********************************");
        System.out.println("profs book");


        for(int i =0;i<prof1.getBooks().size();i++){
            System.out.println( prof1.getBooks().get(i).getName());}
        System.out.println("************************************");
        System.out.println("Students book");

        for(int i =0;i<student1.getBooks().size();i++){
            System.out.println( student1.getBooks().get(i).getName());}
        System.out.println("**************************");
        System.out.println("students book after give back to library");
        student1.returnBook(book3,library1);
        for(int i =0;i<student1.getBooks().size();i++){
            System.out.println( library1.getBooks().get(i).getName());}



    }

}

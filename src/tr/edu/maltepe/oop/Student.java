package tr.edu.maltepe.oop;

public class Student extends Person {
    int yas;

    public Student(int id, String name, String surname,int yas) {
        super(id, name, surname);
        this.yas=yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

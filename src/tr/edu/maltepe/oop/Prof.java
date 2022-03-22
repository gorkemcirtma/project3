package tr.edu.maltepe.oop;

import java.util.Vector;

public class Prof extends Person {
    private String unvan;
    public Prof(int id, String name, String surname,String unvan) {
        super(id, name, surname);
        this.unvan=unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public String profNeYapıyor(){
        return getName()+" derste";
    }

}

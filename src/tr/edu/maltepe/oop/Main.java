package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof(3421, "gorkem", "cirtma","prof");
        Prof prof2 = new Prof(4531, "gorkem", "cirtma","prof");
        Prof prof3 = new Prof(2345, "gorkem", "cirtma","prof");
        Student student1 = new Student(4687, "gizem", "aydın",19);
        Student student2 = new Student(2346, "gizem", "aydın",19);
        Student student3 = new Student(4573, "gizem", "aydın",19);
        System.out.println(prof1.getId());
        prof1.setId(2342);
        System.out.println("yeni id:"+prof1.getId());

        System.out.println(prof1.getId());
        System.out.println(prof2.getId());
        System.out.println(prof3.getId());
        System.out.println(student1.getId());
        System.out.println(student2.getId());
        System.out.println(student3.getId());
        System.out.println(prof1.getName());
        System.out.println(prof2.getName());
        System.out.println(prof3.getName());
        System.out.println(student1.getSurname());
        System.out.println(student2.getSurname());
        System.out.println(student3.getSurname());
        System.out.println(prof1.getUnvan());
        System.out.println(prof2.getUnvan());
        System.out.println(prof3.getUnvan());
        System.out.println(student1.getYas());
        System.out.println(student2.getYas());
        System.out.println(student3.getYas());
    }
}

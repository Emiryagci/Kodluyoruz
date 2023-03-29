public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101", "MATH");
        Course physic = new Course("Physic", "PHYSC", "PHYSC101");
        Course chemistry = new Course("Chemistry", "CHMSTRY","CHMSTRY101");

        Teacher teacher1 = new Teacher("John", "123","MATH");
        Teacher teacher2 = new Teacher("Donna","124","PHYSC");
        Teacher teacher3 = new Teacher("Emily","125","CHMSTRY");

        math.addTeacher(teacher1);
        math.addTeacher(teacher2);
        math.addTeacher(teacher3);

        Student student1 = new Student("Jack", 4,"150", math, physic, chemistry);
        student1.addBulkExamNote(50,20,40);
        student1.isPass();

        Student student2 = new Student("Anna",4, "152", math, physic, chemistry);
        student2.addBulkExamNote(100,50,40);
        student2.isPass();

        Student student3 = new Student("Jasmine",4, "155", math, physic, chemistry);
        student3.addBulkExamNote(50,20,45);
        student3.isPass();
    }
}
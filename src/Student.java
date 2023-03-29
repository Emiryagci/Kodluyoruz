public class Student {
    String name;
    String stuNo;
    int classes;
    Course physic;
    Course math;
    Course chemistry;
    double average;
    boolean isPass;

     Student(String name, int classes, String stuNo, Course math, Course physic, Course chemistry){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int math, int physic, int chemistry){
        if(math >= 0 || math <= 100){
            this.math.note = math;
        }
        if(physic >= 0 || physic <= 0){
            this.physic.note = physic;
        }
        if(chemistry >= 0 || chemistry <= 100){
            this.chemistry.note = chemistry;
        }
    }
    public void isPass(){
        if(this.math.note == 0 || this.physic.note == 0 || this.chemistry.note == 0){
            System.out.println("The grades are not fully entered..");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if(this.isPass){
                System.out.println("Passed the class.");
            }
        }
    }
    public void calcAvarage(){
        this.average = (this.math.note + this.physic.note + this.chemistry.note) / 3;
    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=============================");
        System.out.println("Student: " + this.name);
        System.out.println("Mathematics note : " + this.math.note);
        System.out.println("Physic note : " + this.physic.note);
        System.out.println("Chemistry note : " + this.chemistry.note);
    }
}

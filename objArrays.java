
class Student {
    int rollno;
    String name;
    int marks;
}




public class objArrays {
   public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aditya";
        s1.marks = 88;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Gagan";
        s2.marks = 94;
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Ankush";
        s3.marks = 91;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student i: students){
            System.out.println(i.rollno +  i.name + i.marks);
        }
   } 
    
}

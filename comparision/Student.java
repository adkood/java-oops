package oops.comparision;

public class Student {
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rno+" "+marks;
    }

    // @Override
    // public int compareTo(Student o) {
    //     return (int)(o.marks) - (int)(this.marks);
    // }
}

package oops.comparision;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // Student s1 = new Student(21,70.4f);
        // Student s2 = new Student(12,85.3f);

        Student[] list = new Student[5];

        for(int i = 0; i < 5; i++)
        {
            Student s = new Student(i, i*5);
            list[i] = s; 
        }

        System.out.println(Arrays.toString(list));

        // lambda functions are stored in interface type reference variable
        Comparator<Student> comp = (a,b) -> (int)(b.marks)-(int)(a.marks);
        Arrays.sort(list,comp);
        
        System.out.println(Arrays.toString(list));

        // if(s1.compareTo(s2) < 0)
        // {
        //     System.out.println("s1 have less marks than s2");
        // }
    }
}

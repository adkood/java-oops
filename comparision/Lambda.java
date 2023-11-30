package oops.comparision;

import java.util.ArrayList;

public class Lambda {
    
    public static void main(String[] args) {
        
        // Integer[] arr = new Integer[10];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            arr.add(i+1);
        }
        
        //-------Two ways to use it
        // ------- 1 -----
        // Consumer<Integer> in = (ele) -> System.out.println(ele*2); 
        //  arr.forEach(in);

        // ------- 2 ---------
        // arr.forEach((ele) -> System.out.println(ele*2));

        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;

        System.out.println(sum.operator(2, 3));
        System.out.println(sub.operator(2, 3));
    }
}

interface Operation {
    int operator(int c,int d);
}

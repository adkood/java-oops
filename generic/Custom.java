package oops.generic;

import java.util.Arrays;

public class Custom {

    private int[] arr;
    static int defaultSize = 3;
    private int size = 0;

    Custom() {
        arr = new int[defaultSize];
    }

    void add(int val)
    {
        if(size == arr.length)
        {
            int[] temp = new int[size*2];
            for(int i = 0; i < size; i++)
            {
                temp[i] = arr[i];
            }
            temp[size] = val;
            size++;
            arr = temp;
        }
        else
        {
            arr[size] = val;
            size++;
        }
    }

    void remove()
    {
        size--;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Custom list = new Custom();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);

        System.out.println(list);
    }
}
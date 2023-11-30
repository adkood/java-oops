package oops.generic;
import java.util.Arrays;

// ? extends Number -> wildcard
public class Customgeneric<T extends Number> {

    private Object[] arr;
    static int defaultSize = 3;
    private int size = 0;

    Customgeneric() {
        //-----cannot create the instance of generic type
        // arr = new T[defaultSize];
        arr = new Object[defaultSize];
    }

    void add(T val)
    {
        if(size == arr.length)
        {
            Object[] temp = new Object[size*2];
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
        // Customgeneric<String> list = new Customgeneric<>();
        // list.add("1");
        // list.add("2");
        // list.add("5");
        // list.add("7");

         Customgeneric<Integer> list = new Customgeneric<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
    }
}

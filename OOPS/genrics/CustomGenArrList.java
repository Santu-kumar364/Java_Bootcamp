package Java_Bootcamp.OOPS.genrics;

import java.util.Arrays;

public class CustomGenArrList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenArrList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;  
    }   
    
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
                          
    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    } 

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }


    public void set(int index, T value) {
        data[index] = value;
    }

    public String toString() {
        return Arrays.toString(data);
    }
    
    public static void main(String[] args) {
        CustomGenArrList  list = new CustomGenArrList();

        //list.add(5);
        //list.add(9);
        //list.add(1);

        for(int i = 0; i < 12; i++) {
            list.add("santu" + i);
        }

        System.out.println(list);

    }
    
}





package Java_Bootcamp.OOPS.access.privateAccess;

public class Example {

    private int num;
    protected String name;
    int[] arr;

    public Example(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    

    
    
}

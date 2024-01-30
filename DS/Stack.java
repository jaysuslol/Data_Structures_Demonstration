package DS;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> list;
    
    public Stack() {
        list = new ArrayList<Integer>();
    }

    public void add(int num) {
        list.add(num);
    }

    public void remove() {
        list.remove(list.size() - 1);
    }

    public ArrayList<Integer> getStack() {
        return list;
    }
}

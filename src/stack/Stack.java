package stack;

public class Stack <T>{

    private T[] values;
    private int counter;

    public Stack (T[] values) {
        this.values = values;
        counter = 0;
    }

    public void push(T value) {
        values[counter] = value;
        counter++;
    }

    public T pull(){ /* pop */
        counter--;
        return values[counter];
    }
}

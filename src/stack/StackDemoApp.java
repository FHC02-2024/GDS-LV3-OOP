package stack;

import konto.Konto;

public class StackDemoApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(new String[10]);

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println("stack.pull() = " + stack.pull());
        System.out.println("stack.pull() = " + stack.pull());
        System.out.println("stack.pull() = " + stack.pull());

        Stack<Konto> kontoStack = new Stack<>(new Konto[1000]);
        kontoStack.push(new Konto("Susi Sorglos"));
        kontoStack.push(new Konto("Max Mustermann"));
        Konto k = kontoStack.pull();
        k.print();

        Integer i = 5;
        int x = i;
        int y = Integer.parseInt("5");


    }
}

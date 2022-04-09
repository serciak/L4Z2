package com.company;

public class Main {

    public static void main(String[] args) throws FullStackException, EmptyStackException {
	    InfiniteStack<Integer> infiniteStack = new InfiniteStack<>();

        infiniteStack.push(1);
        infiniteStack.push(2);
        infiniteStack.push(3);
        infiniteStack.push(11313);

        System.out.println(infiniteStack.size());
        System.out.println(infiniteStack.pop());
        System.out.println(infiniteStack.size());
        System.out.println(infiniteStack.pop());
        System.out.println(infiniteStack.size());
        System.out.println(infiniteStack.pop());
        System.out.println(infiniteStack.size());
        System.out.println(infiniteStack.pop());
        System.out.println(infiniteStack.size());
    }
}

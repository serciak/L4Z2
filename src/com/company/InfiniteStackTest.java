package com.company;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteStackTest {

    InfiniteStack<Integer> infiniteStack;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        infiniteStack = new InfiniteStack<>();
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(infiniteStack.isEmpty());
        infiniteStack.push(11);
        assertFalse(infiniteStack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void pop() throws EmptyStackException {
        infiniteStack.push(11);
        assertEquals(11, infiniteStack.pop());
        infiniteStack.push(12);
        infiniteStack.push(13);
        assertEquals(13, infiniteStack.pop());
        infiniteStack.pop();
        assertThrows(EmptyStackException.class, () -> {
           infiniteStack.pop();
        });
    }

    @org.junit.jupiter.api.Test
    void push() throws EmptyStackException {
        infiniteStack.push(11);
        assertEquals(11, infiniteStack.pop());
        infiniteStack.push(12);
        infiniteStack.push(13);
        assertEquals(13, infiniteStack.pop());
    }

    @org.junit.jupiter.api.Test
    void top() throws EmptyStackException {
        assertThrows(EmptyStackException.class, () -> {
            infiniteStack.top();
        });
        infiniteStack.push(11);
        assertEquals(11, infiniteStack.top());
        infiniteStack.push(12);
        assertEquals(12, infiniteStack.top());
        infiniteStack.pop();
        assertEquals(11, infiniteStack.top());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0, infiniteStack.size());
        infiniteStack.push(11);
        infiniteStack.push(11);
        assertEquals(2, infiniteStack.size());
    }
}
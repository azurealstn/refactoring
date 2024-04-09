package chapter_11;

import java.util.Stack;

public class MyStack {

    Stack<Integer> S = new Stack<>(); // 필드 생성

    public void push(Integer item) {
        S.push(item);
    }
}

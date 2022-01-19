package com.projects;

public class TypeParamaters<T> {
    private T element;
    public void setValue(T element) {
        this.element = element;
    }
    public T getValue() {
        return element;
    }
    // T is generic type parameter
    public static void main(String[] args) {
        TypeParamaters<String> sentence = new TypeParamaters<>();
        sentence.setValue("yea");
        System.out.println(sentence.getValue());

        TypeParamaters<Integer> number = new TypeParamaters<>();
        number.setValue(3);
        System.out.println(number.getValue());
    }
}



package be7.oop2;

import be7.model.IntArray;

public class EX26 {
    public static void main(String[] args) {
        // IntArray.java(X), IntArray.class(O)<--> ?
        // TV.java(X), TV.class(O) 100<---> 사람, 120

        IntArray arr=new IntArray(4); // 기본크기 10 size
        arr.add(10);
        arr.add(20);
        arr.add(30);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}

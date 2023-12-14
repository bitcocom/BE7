package be7.oop3;

import be7.model.A;
import be7.model.B;
import be7.model.ObjectArray;

public class EX37 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a); // ?
        // 배열 처럼 동작하는 클래스 -> IntArray
        ObjectArray arr=new ObjectArray();
        arr.add(new A()); // display()
        arr.add(new B()); // display()
        for(int i=0;i<arr.size();i++){
            Object obj=arr.get(i);
            if(obj instanceof A){
                ((A)obj).display();
            }else{
                ((B)obj).display();
            }
        }

    }
}

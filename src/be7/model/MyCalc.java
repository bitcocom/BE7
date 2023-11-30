package be7.model;
// Utility Object => API
public class MyCalc {
    private MyCalc(){

    }
    // 두개의 정수를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의(add)
    public static int add(int a, int b){
        return a+b;
    }
    // 두개의 정수를 매개변수로 받아서 뺄샘을 구하여 리턴하는 메서드를 정의(sub)
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}

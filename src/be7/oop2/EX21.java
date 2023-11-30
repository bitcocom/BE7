package be7.oop2;

import be7.model.MyCalc;

public class EX21 {
    public static void main(String[] args) {
        // class : 모델을 만드는 도구
        // Model 이란 : 특정한 역할을 가지고 있는 객체(class)
        // Model의 종류
        // 1.DTO(Data Transfer Object) - 이질적인 데이터를 담아서 이동하는 역할
        // 2.DAO(Data Access Object) - DTO객체를 가지고 데이터베이스에 CRUD를 하는 역할
        // CRUD -> Create(저장), Read(검색), Update(수정), D(Delete)
        // 3.Utility(helper, 퍼사드) - 도움을 주는 객체(우리가 직접 만들수도 있고, 다른 사람이 만들어 놓은 것을 사용할수도 있고)
        // 두수의 사칙연산(+,-,*,/)을 하는 프로그램
        int a=10;
        int b=20;
        // 객체생성
       /* MyCalc calc=new MyCalc();
        System.out.println(calc.add(a,b));
        System.out.println(calc.sub(a,b));
        System.out.println(calc.mul(a,b));
        System.out.println(calc.div(a,b));*/
        // static 멤버들은 해당 클래스를 사용하는 시점에서
        // 자동으로 메모리에 로딩이 된다.(new- X)
        System.out.println(MyCalc.add(a,b));
        System.out.println(MyCalc.sub(a,b));
        System.out.println(MyCalc.mul(a,b));
        System.out.println(MyCalc.div(a,b));

        /*MyCalc calc=new MyCalc();
        System.out.println(calc.add(a,b));
        System.out.println(calc.sub(a,b));
        System.out.println(calc.mul(a,b));
        System.out.println(calc.div(a,b));*/
        //Math math=new Math(); // private Math(){   }
        System.out.println(Math.max(10,20)); //20
        System.out.println(Math.min(10,20)); //10
        //System sys=new System(); // private System(){   }
    }
}

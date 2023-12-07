package be7.oop2;

import be7.model.IntArray;
import be7.model.RemoCon;

public class EX28 {
    public static void main(String[] args) {
        // RemoCon rm=new RemoCon();
        // 1. 혼자서는 동작을 못한다.
        // 2. 부모의 역할은 할수있다.
        // IntArray.class(O)
        // 부모(RemoCon)가 자녀(IntArray)를 가리키고 있다.
        RemoCon re=new IntArray(); // upcasting(자동형변환)
        re.add(10);
        re.add(20);
        re.add(30);
        for(int i=0;i<re.size();i++){
            System.out.println(re.get(i));
        }
    }
}

package be7.oop2;

public class EX30 {
    public static void main(String[] args) {
        // 문자열의 대소 비교(크기)
        String str1=new String("BEE"); // Heap
        String str2=new String("BEE"); // Heap
        // str1 < str2
        int cmp=str1.compareTo(str2); // 정렬
        //      BEE
        //    - BEE
        //      -1(음수) : str1 < str2
        //        (양수) : str1 > str2
        //        (0)   : str1 == str2
        if(cmp==0){
            System.out.println("str1 == str2");
        }else if(cmp>0){
            System.out.println("str1 > str2");
        }else{
            System.out.println("str1 < str2"); //str1 < str2
        }
        if(str1.equals(str2)){ // str1==str2 : X
            System.out.println("str1 == str2"); //?
        }else{
            System.out.println("str1 != str2"); // str1 != str2
        }
        String s1="BEE"; // Literal POOL(재활용 가능 공간)
        String s2="BEE"; // Literal POOL

        if(s1.equals(s2)){ // s1==s2
            System.out.println("s1==s2"); // s1==s2
        }else{
            System.out.println("s1!=s2");
        }
    }
}

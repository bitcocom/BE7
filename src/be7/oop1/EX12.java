package be7.oop1;

public class EX12 {
    public static void main(String[] args) {
        // 배열을 이용한 논리적인 사고력
        int[] a={4,3,1,2,5};
        // 5. 최대값, 최소값? => 초기값 설정
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] > max) max=a[i];
            if(a[i] < min) min=a[i];
        }//
        System.out.println(max); // 5
        System.out.println(min); // 1
    }
}

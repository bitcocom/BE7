package be7.oop1;

public class EX14 {
    public static void main(String[] args) {
        // 7. 검색(search) : SQL
        //           0 1  2  3  4  5  6  7  8  9 -->index
        int[] data={10,20,30,40,50,60,70,80,90,100};
        // 70의 index=6
        // - 순차검색(7번) -> 이진검색(binary search) : 4번
        int sdata=77;
        int pos=-1; // 초기값? (-1 : 실패)
        for(int i=0;i<data.length;i++){
            if(data[i]==sdata){
                pos=i;
                break; // 반복문 탈출
            }//
        }//
        // 출력
        if(pos!=-1){
            System.out.println("검색성공");
            System.out.println("pos:"+pos); //6
        }else{
            System.out.println("검색실패");
        }//

    }
}

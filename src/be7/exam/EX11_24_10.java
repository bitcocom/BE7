package be7.exam;
public class EX11_24_10 {
    public static void main(String[] args) {
        //char[] a={'1','3','4','1','2','5','1','3','4','1'}; 위 배열에서 각 문자의 빈도수를 구하여
        // 아래처럼 출력하는 프로그램을 작성하시오.
        /*
        1의 cnt : 4개:****
        2의 cnt : 1개:*
        3의 cnt : 2개:**
        4의 cnt : 2개:**
        5의 cnt : 1개:*
        */
        char[] a = {'1','3','4','1','2','5','1','3','4','1'};
        int[] cnt = new int[5]; // range : 1~5
        for (int i = 0; i < a.length; i++) {
            cnt[(a[i] -'0') - 1]++; // '0' 대신 48을 빼도 됨
        }
        for (int i = 0; i < cnt.length; i++) {
            System.out.print((i + 1) + "의 cnt : " + cnt[i] + "개:");
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print("*");
            }//
            System.out.println();
        }//
    }
}

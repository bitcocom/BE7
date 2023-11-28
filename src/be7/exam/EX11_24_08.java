package be7.exam;
public class EX11_24_08 {
    public static void main(String[] args) {
        //char[] c={'c','a','m','p','u','s'}; 위 데이터를 오름차순 정렬하는 프로그램을 작성하시오.
        char[] c = {'c', 'a', 'm', 'p', 'u', 's'};
        EX11_24_08.selectionSort(c);
        for (char ch : c) {
            System.out.print(ch + "\t");
        }
    }
    public static void selectionSort(char[] c){
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char tmp = c[i];
                    c[i] = c[j];
                    c[j] = tmp;
                }//
            }//
        }//
    }
}

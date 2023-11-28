package be7.exam;

public class EX11_24_09 {
    public static void main(String[] args) {
        //정렬된 데이터를 가지고 이진검색(binary search)을 이용하여 'p' 문자를 검색하고 그 위치를 출력하시오.
        char[] c = {'c', 'a', 'm', 'p', 'u', 's'};
        EX11_24_09.selectionSort(c);
        for (char ch : c) {
            System.out.print(ch + "\t");
        }
        System.out.println();
        int pos=binarySearch(c, 'p');
        if (pos != -1) {
            System.out.println("검색 성공");
            System.out.println(c[pos] + "의 index는 " + pos);
        } else {
            System.out.println("검색 실패");
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
    public static int binarySearch(char[] c, char sdata){
        int pos = -1;
        int low = 0;
        int high = c.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (c[middle] == sdata) { // 값을 찾으면
                pos = middle; // 위치를 저장하고
                break; // 반복문 탈출
            } else if (c[middle] < sdata) { // R
                low = middle + 1;
            } else { // L
                high = middle - 1;
            }//
        }//
        return pos;
    }
}

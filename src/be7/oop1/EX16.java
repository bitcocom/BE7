package be7.oop1;

public class EX16 {
    public static void main(String[] args) {
        // 8. 정렬(sort) -> 오름차순, 내림차순 -> 석차,순위(rank)
        // 선택정렬, 버블, 쉘, 퀵, 머지, 힙~~~
        int[] a={4,3,1,2,5};
        System.out.println("=정렬전=");
        for(int data : a){
            System.out.print(data+"\t");
        }
        // 오름차순 정렬 ? 1 2 3 4 5
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){ // 오름차순
                    int tmp;
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }//
            }//
        }//
        System.out.println();
        System.out.println("=정렬후=");
        for(int data : a){
            System.out.print(data+"\t");
        }
    }
}

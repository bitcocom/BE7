package be7.oop2;

import be7.model.BookDTO;

public class EX20 {
    public static void main(String[] args) {
        // [책] 3권을 저장할 [변수를 선언]하시오.
        int[] a=new int[3]; // 기본배열
        a[0]=10;
        a[1]=20;
        a[2]=30;
        for(int data : a){
            System.out.println(data);
        }
        BookDTO[] b=new BookDTO[3]; // 객체배열
        b[0]=new BookDTO("자바",20000,"김길동",500);
        b[1]=new BookDTO("오라클",30000,"조길동",700);
        b[2]=new BookDTO("인공지능",45000,"나길동",800);
        for(BookDTO book : b){
            System.out.println(book); //book.toString()
        }
        // 책의 가격을 기준으로 내림차순 [정렬]하여 출력하시오.
        for(int i=0;i<b.length-1;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i].getPrice() < b[j].getPrice()){
                    BookDTO tmp;
                    tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }//
            }//
        }//
        for(BookDTO book : b){
            System.out.println(book); //book.toString()
        }
    }
}

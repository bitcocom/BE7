package be7.oop3;

import be7.model.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX39 {
    public static void main(String[] args) {
        // 키보드로 부터 책 데이터를 입력받아서 Arraylist
        List<BookDTO> list=new ArrayList();
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.print("책제목:");
            String title = scan.nextLine();
            if(title.equals("exit")) break; // loop 탈출
            System.out.print("가격:");
            int price = scan.nextInt();
            scan.nextLine();
            System.out.print("저자:");
            String name = scan.nextLine();

            System.out.print("페이지수:");
            int page = scan.nextInt();
            scan.nextLine();
            // 묶고(DTO)->담고(ArrayList)
            BookDTO dto = new BookDTO(title, price, name, page);
            list.add(dto);
        }// while_end
        scan.close();
        // 책 제목을 기준으로 오름 차순 정렬하여 출력
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getTitle().compareTo(list.get(j).getTitle())>0){
                   BookDTO tmp;
                   tmp=list.get(i);
                   list.set(i, list.get(j));
                   list.set(j, tmp);
                }//if
            }//j
        }//i
        for(BookDTO book : list){
            System.out.println(book);
        }
    }
}

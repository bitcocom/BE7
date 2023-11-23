package be7.oop1;

public class EX15 {
    public static void main(String[] args) {
        int[] data={10,20,30,40,50,60,70,80,90,100};
        int sdata=880;
        int low=0;
        int high=data.length-1; // 9
        int middle;
        int pos=-1;
        while(low<=high){
             middle=(low+high)/2;
             if(data[middle] == sdata){  // 성공
                 pos=middle;
                 break;
             }else if(data[middle] < sdata){ //RIGHT
                 low=middle+1;
             }else{ // LEFT
                 high=middle-1;
             }//
        }//
        if(pos!=-1){
            System.out.println("검색성공");
            System.out.println("pos:"+pos); //6
        }else{
            System.out.println("검색실패");
        }
    }
}

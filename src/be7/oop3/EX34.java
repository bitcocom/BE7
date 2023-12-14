package be7.oop3;

import be7.model.Animal;
import be7.model.Cat;
import be7.model.Dog;

public class EX34 {
    public static void main(String[] args) {
        // Dog, Cat,,,,,,,, 배열에 저장하여 이동?
        //Dog[]
        //Cat[]
        //myArray(new Dog(), new Cat());
        // 2. 다형성 배열
        Animal[] ani= {new Dog(), new Cat()};
        myArray(ani);
    }
    public static void myArray(Animal[] ani){
        for(int i=0;i<ani.length;i++){
            ani[i].eat();
            ani[i].move();
            if(ani[i] instanceof Cat) {
                ((Cat) ani[i]).night(); // X
            }
        }
    }
}

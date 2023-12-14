package be7.model;

public class Dog extends Animal{ //new Animal()
    public Dog(){
       super(); // new Animal()
    }
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    } // DTO(X)
    //먹다
    // 재정의(Override)'

    // ?
}

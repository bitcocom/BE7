package be7.model;

public class IntArray implements RemoCon {
    private int[] arr;
    private int cnt; // 원소의 개수

    public IntArray() { // new IntArray();
        // arr = new int[10];
        this(10); // 자기 자신 안에 있는 또 다른 생성자를 호출
    }
    public IntArray(int initial) { // new IntArray(3);
        arr = new int[initial];
    }

    // 배열에 데이터를 저장하는 동작 add() - setter
    public void add(int data) { // arr.add(10);
        arr[cnt++] = data;
    }
    // 배열에서 원하는 index 위치의 데이터를 넘겨 주는 동작 get(index) - getter
    public int get(int index) { // index >= 0
        return arr[index]; // arr[1]
    }
    // 배열에 저장된 원소의 개수를 넘겨 주는 동작 size()
    public int size() {
        return this.cnt;
    }
    // 추가적인 동작...
}

package be7.model;
// 규약/규칙-기능정의
public interface SuperRemoCon {
    public static final int MAX_CH=100; // SuperRemoCon.MAX_CH
    public int MIN_CH=1;
    public void chUp(); //  if(current>SuperRemoCon.MAX_CH){    }
    public void chDown();
    public void volUp();
    public void volDown();
    public void internet(); // TV(인터넷이됩니다.),Radio(기능이 없습니다.)
}

package be7.model;
// 책(Object) -> 제목, 가격, 지은이, 페이지수 : 속성, 멤버, 상태(O)
public class BookDTO { // DTO -> 어떻게 설계하는 것이 잘 설계하는 것인가?
    // 1. 모든 멤버를 정보은닉시킨다.(private)
    private String title;
    private int price;
    private String name;
    private int page;
    // 2. 생략된메서드(디폴트 생성자메서드)를 명시적으로 만든다.
    public BookDTO() {

    }
    // 생성자메서드의 오버로딩(중복정의=overloading)
    public BookDTO(String title, int price, String name, int page) {
        this.title = title;
        this.price = price;
        this.name = name;
        this.page = page;
    }
    // 3. setter, getter를 자동으로 만드는 방법
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) { // DI(의존성 주입)
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    // 4. 객체가 가지고 있는 모든 값을 리턴해주는 동작?(toString(), allPrint())
    @Override // 상속->재정의
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}

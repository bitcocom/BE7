package be7.oop3;

import be7.model.SuperRemoCon;
import be7.model.TV;

public class EX40 {
    public static void main(String[] args) {
        // 정보은닉(DTO),상속(extends),다형성(재정의, up/downcasting, 동적바인딩) / 추상, 인터페이스
        SuperRemoCon re=new TV(); //  new Radio()
        re.chUp();
        re.chDown();
        re.volUp();
        re.volDown();
        re.internet();
        // 주말과제 : <프로젝트 1>
        // Java 제공해주는 API -> DataBase API 활용 : MySQL(O),Oracle,MS-SQL<-->WEB AWS(EC2, RDS)
        // Java 제공해주는 API -> Network API 활용(크롤링, OpenAPI)
        // Java 제공해주는 API -> IO API 활용(파일 처리)
        // Java 제공해주는 API -> Thread API 활용(병렬처리, 동시처리 - 채팅)
        // Java 제공해주는 API -> Util(List, Map, Set) API
        // 다른회사 제공해주는 API -> JSON, XML(Gson, org.json, Jsoup, POI, iText~~~~~~)
        // DataBase : 1차 Toy Project
    }
}

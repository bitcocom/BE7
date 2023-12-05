package be7.exam;

import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of movies:");
        int numMovies = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        MovieDTO[] movies = new MovieDTO[numMovies];

        for (int i = 0; i < numMovies; i++) {
            System.out.println("Enter movie title or -1 to exit:");
            String title = scanner.nextLine();
            if ("-1".equals(title)) {
                break;
            }

            System.out.println("Enter main character:");
            String mainCharacter = scanner.nextLine();

            System.out.println("Enter running time (in minutes):");
            int runningTime = scanner.nextInt();

            System.out.println("Enter rating:");
            float rating = scanner.nextFloat();
            scanner.nextLine(); // Consume the newline

            System.out.println("Enter genre:");
            String genre = scanner.nextLine();

            movies[i] = new MovieDTO(title, mainCharacter, runningTime, rating, genre);
        }

        // Display all movies
        for (MovieDTO movie : movies) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
        MovieOperations operations = new MovieOperations(movies);

    }
}
/*
 실습과제 : 장르별 영화검색 프로그램
 1. 아래의 처리 조건을 만족하는 장르별 영화검색 프로그램을 설계하고 구현하시오.
 2. 사용된 클래스는 아래 3개 클래스로 구성되어있다.
 - MovieDTO, MovieProcessor(메인 클래스), MovieProcessor(기능 구현 클래스)
 3.입력화면과 처리 조건을 보고 조별로 구현하여 제출하시오.
 4.입출력 화면은 과제를 수행 할 수있는 범위에서 자유롭게 구성할 것
 5.추가 데이터를 입력하고 장르를 사용하여 프로그램을 테스트하고 모든 기능이
   예상대로 작동하는지 확인해야 합니다.

 [과제세부 조건 설명]

  1. 장르별 영화검색 프로그램 초기화면 구성

  ========== 장르별 영화검색 프로그램(조 이름) =============
  1.영화입력(I)    2.영화출력(P)   3.영화검색(S)   4.종료(E)
  =====================================================
  메뉴입력 :

  2.영화입력(I) 상세설명
    - 스캐너(Scanner)를 사용하여 영화 데이터를 입력받는다.
    - 먼저 영화 데이터 수를 입력 받고 MovieDTO 배열을 사용하여 각 영화의 세부 정보를 저장해야 합니다.
    - 영화 세부 정보는 제목(title), 주인공(major), 상영 시간(runningTime), 평점(rating), 장르(genre)로 구성되어 있다.
    - 장르는 1(드라마), 2(액션), 3(호러)로 구성되어있다.
      입력예시)
      영화 1: '기생충', 주연: '김기택', 러닝타임: 132, 평점: 8.6, 장르: 1
      영화 2: '올드보이', 주인공: '오대수', 러닝타임: 120, 평점: 8.4, 장르: 2
      영화 3: '괴물', 주인공: '박강두', 러닝타임: 119, 평점: 7.1, 장르: 3
    - 입력 중간에 데이터를 입력받고 싶지 않을때 제목에 '-1'을 입력하면 더 이상 입력을 받지 않도록 한다.

  3.영화출력(P) 상세설명
    - 평점을 기준으로 내림차순 정렬하여 출력해야 한다.

  4.영화검색(S) 상세설명
    - 검색할 장르를 입력 받는다.(1,2,3 중에 한개)
    - 입력한 장르에 대한 영화를 검색하여 출력한다.

  5.종료(E) 상세설명
    - 메뉴에 E을 입력하면 전체 프로그램이 종료된다.

  6.오류처리 상세설명
    - 메뉴입력시 I,S,P,E 중에 하나가 입력되지 않으면 오류 메시지를 출력하고 다시 메뉴를 입력받는다.
    - 영화검색시 장르가 1,2,3 중에 하나가 입력이 되지 않으면 오류 메세지를 출력하고 다시 장르를 입력받는다.
 */

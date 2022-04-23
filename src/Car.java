public class Car {

    // 메인 메소드
    public static void main(String[] args) {
        // sout 엔터시 프린트엘엔이 바로나옴.

        // int i=0, i는 0 초기식.   i < 10, 조건, 즉 트루인 조건이 맞았을 시 다음 구문 실행. i++는 1을 +해줌. i<10과 i++이 반복 실행.
        for (int i=0; i < 100; i++) {
            System.out.println(i);
//            if (i == 2 || i == 4 || i == 6 || i == 8) // || : OR 연산자 , && = AND 연산자
//                System.out.println("홍드로이드 잘생겼어요..!"); //영역 지정후 컨트롤 슬래시 누르면 단체 주석.
        }
        System.out.println("for 문 끝났다!");
    }
}

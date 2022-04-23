public class Human {
    public static void main(String[] args) {
        // 프로그램의 실행 시작 지점
        System.out.println("Hello World!"); // "" 은 문자열(String)을 의미함
        System.out.println("홍드로이드 만세!");
        // 변수 (변할 수 있는 값 또는 수)
        // 자료형 String (문자열) , int (정수 숫자), boolean ( 참 or 거짓 )
        // break 포인트 설정도 중요 디버그 모드시 F8은 한줄씩 F9는 다음 브레이크 포인트까지 실행

        String a = "a 변수";
        System.out.println(a);
        a = "a 변수 2222";
        System.out.println(a);

        int aInt = 10;
        System.out.println(aInt);

        // 불리언 변수는 반드시 true(진실) false(거짓) 만 출력이 됩니다!
        boolean isApple = true;
        System.out.println(isApple);


        aInt = 14;
        // if = 만약.. ~라면... 조건문, ==은 ~이 맞으면, !=은 ~가 아니면
        if (aInt == 10) { // 한 줄만 실행할 것이라면 중괄호 필요없음.
            System.out.println("10이 맞습니다!");
            System.out.println("10이 맞습니다!");
        } else if (aInt == 11) { // 또 다른 조건이 필요할 시 else if 사용
            System.out.println("11이 맞습니다!");
        } else {
            // else를 붙이게 되면 (if문 or else if) 조건에 아무것도 해당되지 않을 때 실행
            System.out.println("10도 아니고, 11도 아닙니다!");
        }

        // if문을 좀 더 보기 쉽게 표현하기 위해 나온 switch 문
        switch (aInt) {
            case 10: // break를 쓰지 않을 시 바로 다음 케이스로 넘어감.
            case 11:
                System.out.println("10 또는 11이 맞습니다!");
                break;

            case 12:
                System.out.println("12가 맞습니다!");
                break;

            default: //default는 if의 else와 동일
                System.out.println("아무것도 해당 안됨!");
                break;
        }

        System.out.println("switch문 끝!!");


    }
}

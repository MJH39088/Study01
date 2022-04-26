public class MethodExample {

    public String asdsa = "";

    // 접근제한자, 반환타입, 메소드 이름 (매개변수) { }
    public void setPlay() {
        // void는 반환타입이 없기 때문에 단순하게 실행하고 메소드 역할이 끝남!
        System.out.println("PLAY PROGRAM");
    }

    public String getPrint() {
        // 반환타입이 String 이기 때문에 중괄호 내부에서 구현되는 로직의 최종은 String 타입으로 되돌려줘야 한다.
        String hong = "hongdroid";
        hong = "hongchul";
        hong = "hongchul" + "hongdroid";
        return hong;
        // 이걸 씀으로서 중복적이거나 반복적인 문구를 사용하는게 줄어들고, 코드의 가독성 자체도 좋아짐
    }

    public void setPrintTest() {
        System.out.println("Hello from main");
    }

    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample(); // 접근 제한자와 같이 클래스 인스턴스를 생성해줘야 함.
        methodExample.setPlay(); // 메소드를 실행 (호출)
        String abc = methodExample.getPrint(); // 메소드만 호출하면 실행 결과가 뜨지 않음. 호출하고 String 결과 값을 리턴 받아서 abc 변수에 바로 할당.
        System.out.println(abc);

        System.out.println("Hongdroid");
        methodExample.setPrintTest();
    }
}

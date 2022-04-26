public class Robot { // 클래스는 설계도 같은 것. 인텔리제이에선 활용이 되지 않으면 회색으로 보인다.


    // 자바에서는 객체 지향 프로그래밍 (OOP - Object Oriented Programming)
    // 객체 (상태, 행동)

    // 상태 (필드)
    public String robotName;
    public String robotType;

    // 행동 (메소드)
    public void setWalking() {
        // dasfasdfsa
    }

    public void setStop() {
        // dsafsdafsa
    }

    public static void main(String[] args) {
        Robot robot = new Robot(); // 로봇이라는 클래스를 생성 (인스턴스 화) 하였고, 이때부터 클래스를 활용하기 시작한 것.
        robot.robotName = "hongdroid";

        Robot robot1 = new Robot(); // 각각의 클래스 인스턴스를 사용하면 따로 사용 가능.
        robot1.robotName = "클래스101";
    }
}

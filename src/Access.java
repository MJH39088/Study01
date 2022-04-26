import Pack1.Bread;
import Pack1.Bread2;

public class Access extends Bread {

    // public - 같은 프로젝트 안에만 있다면 어디서든 접근이 가능.
    // protected - 같은 패키지 안에서만 접근 가능하지만 예외적으로 상속관계에서는 다른 패키지에서도 가능하다.
    // default - 같은 패키지 내에서만 접근 가능.
    // private - 현재 클래스에서만 접근이 가능하고 그 외엔 x.

    private String s = ""; // 필드


    public static void main(String[] args) {
        Bread bread = new Bread(); // 클래스 인스턴스 생성
        String aaa = bread.a;

        Access access = new Access();
        String accessStr = access.a;
        String accessStrProtect = access.strProtect;

//        Bread2 bread2 = new Bread2();
//        bread2.b;


    }


}

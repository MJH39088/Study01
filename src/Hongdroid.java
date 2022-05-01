public class Hongdroid extends Robot { // extends는 상속. extends 뒤에 상속 받고 싶은 클래스 명을 입력.

    String abc = "";
    int iABC = 10;


    // 생성자
    public Hongdroid(String _test) {
        System.out.println(_test);
    }

    // 생성자 2
    public Hongdroid(String _test, int _testInt) {
        System.out.println(_test + _testInt);
    }

    // 생성자 3
    public Hongdroid() {
//        String asdfsd = "asfsda";
    }

    // getter & setter 게터세터 (Alt + Insert)
    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public int getiABC() {
        return iABC;
    }

    public void setiABC(int iABC) {
        this.iABC = iABC;
    }

    public static void main(String[] args) {

        String test = "test";

        Hongdroid hongdroid = new Hongdroid(test);
        hongdroid.robotName = "dasfdsa";

        Hongdroid hongdroid2 = new Hongdroid(test, 19);
        hongdroid2.setAbc("abcdefg"); // setter 사용 (데이터를 삽입)
        hongdroid2.setiABC(30); // setter 사용 (데이터를 삽입)

        System.out.println(hongdroid2.getAbc() + " " + hongdroid2.getiABC()); // getter로 현재 데이터를 가지고 옴
    }
}

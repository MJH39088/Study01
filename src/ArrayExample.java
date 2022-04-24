import java.util.ArrayList;

public class ArrayExample {



    public static void main(String[] args) {
        //================================== 정적 배열 ================================
        String[] stringArrays = new String[5]; // 배열의 크기를 5로 지정함 { "배열1", "배열2", "배열3", "배열4", "배열5", }

        stringArrays[0] = "배열1"; // 접근할 때에는 0번째부터 index 로 접근...!
        stringArrays[1] = "배열2"; // 이러한 형태는 정적배열의 형태. 특징은 배열의 사이즈를 미리 지정하지 않으면 데이터를 넣을 수 없음.
        stringArrays[2] = "배열3"; // 단점은 배열을 유동적으로 못 씀
        stringArrays[3] = "배열4"; // 메모리의 길이, 개발자가 파악할 수 있을 때에는 정적배열이 유리. 효율이 좋음
        stringArrays[4] = "배열5";

        int[] intArrays = new int[10];
        intArrays[0] = 10;
        intArrays[1] = 20;
        intArrays[2] = 30;
        intArrays[3] = 40;
        intArrays[4] = 50;
        intArrays[5] = 60;
        intArrays[6] = 70;
        intArrays[7] = 80;
        intArrays[8] = 90;
        intArrays[9] = 100;

        // length 만큼 for 반복문을 돌아서 출력
//        for (int i = 0; i < intArrays.length; i++) { // fori 엔터 누르면 편하게 생성됨
//            System.out.println(intArrays[i]);
//        }
//
//
//        for (int i = 0; i < stringArrays.length; i++) {
//            System.out.println(stringArrays[i]);
//        }


        //System.out.println(intArrays[0] + "\n" + intArrays[1] + "\n" + intArrays[2]);


        //================================== 동적 배열 ================================
        ArrayList<String> arrayList = new ArrayList<>(); // 동적배열에서는 add, remove, set 같은 유동적인 상황이 많을때 유리
        arrayList.add("안녕하세요.");
        arrayList.add("홍드로이드 입니다."); // {"안녕하세요.", "홍드로이드 입니다."}

        System.out.println(arrayList.get(1)); // 출력하려면 변수명.get(index)를 쓸것.

        for (int i = 0; i < arrayList.size(); i++) { // array는 length, arraylist는 size
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(1); // remove는 삭제
        arrayList.set(0, "수정되었습니다."); // set은 그 인덱스를 수정. (인덱스, 수정될 값)

        System.out.println(arrayList.get(0));

        ArrayList<Integer> arrayIntList = new ArrayList<>(); // Int가 아닌 Integer
        ArrayList<Boolean> arrayBooleanList = new ArrayList<>(); // boolean이 아닌 Boolean ArrayList만 다름.
    }
}

package povt;

import java.util.Arrays;

public class TestArrayList {
    public static <T> void main(String[] args) {
        ArreyList<Integer> arreyList = new ArreyList<Integer>();

        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(3);
        System.out.println(arreyList.size());
        System.out.println(arreyList.toString());

        arreyList.removed(6);
        System.out.println(arreyList.size);
        System.out.println(arreyList.toString());

        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(6);
        arreyList.add(3);
        System.out.println(arreyList.size);
        System.out.println(arreyList.toString());

    }
}

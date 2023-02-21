package reviewDay7;

import java.util.ArrayList;

public class Study_list {
    public static void main(String[] args) {

        // java.util.ArrayList
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);
        scoreList.add(40);
        scoreList.add(50);

        System.out.println(scoreList.get(0));       // index에 해당하는 value 반환

        scoreList.add(2, 200);      // index에 해당하는 value 수정
        System.out.println(scoreList);

        scoreList.remove(5);                // index 열 삭제
        System.out.println(scoreList);

    }
}

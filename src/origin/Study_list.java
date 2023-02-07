package origin;

import java.util.ArrayList;

public class Study_list {
    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);
        scoreList.add(40);
        scoreList.add(50);

        System.out.println(scoreList.get(0));

        scoreList.add(2, 200);
        System.out.println(scoreList);

        scoreList.remove(5);
        System.out.println(scoreList);
    }
}

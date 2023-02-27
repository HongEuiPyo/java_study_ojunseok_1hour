package reviewDay11;

import reviewDay11.models.*;
import reviewDay11.models.Character;

import java.util.ArrayList;

public class Study_class2 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);

        Character character = new Hero("슈퍼맨");

        // 다형성
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();

        if (magician3 instanceof Magician) {    // instanceof를 활용하여 구현체인지를 확인할 수 있다.
            ArrayList<Character> characterArrayList = new ArrayList<>();    // 다형성을 활용하여 상위 클래스로 받을 수 있다.
            characterArrayList.add(magician);
            characterArrayList.add(magician2);
//            characterArrayList.add(magician3);
            characterArrayList.add(hero);
        }

    }
}

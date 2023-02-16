package reviewDay5.models;

//  추상클래스의 추상 메서드는 내용이 없다.
//  구현은 상속받는 클래스에서 override하여 구현한다.

public abstract class Character extends Person {

    public abstract void attack(Hero hero);

}

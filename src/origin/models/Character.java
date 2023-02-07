package origin.models;

// 추상 클래스의 추상 메서드는 내용이 없다.
// 구현은 상속받는 클래스에서 override할 수 있다.
public abstract class Character extends Person {
    public abstract void attack(Hero hero); //attack이라는 메소드를 강제하기 위해서 사용
}


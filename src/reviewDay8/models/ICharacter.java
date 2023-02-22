package reviewDay8.models;

//추상 클래스와 똑같은 역할을 하는게 interface다.
//자바는 단일상속을 지원한다.
//interface는 여러 개의 특징을 한번에 구현하는 다중 상속의 효과를 낼 수 있다.
//interface를 사용하면 확장을 더 자유롭게 할 수 있다.
public interface ICharacter {

    void attack(Person person);

}

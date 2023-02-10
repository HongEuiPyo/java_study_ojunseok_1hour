package reviewDay4.models;

//  Hero는
//  Person을 상속받음으로써
//  모든 Person의 기능을 갖게 되고
//  추가적으로 flying 기능을 갖게 된다.
public class Hero extends Character {

    public Hero(String name) { setName(name); }

    private boolean isFlying;

    public boolean isFlying() { return isFlying; }

    public void setFlying(boolean flying) { isFlying = flying; }

    @Override
    public void attack(Hero hero) { System.out.println(this.getName() + "은(는) " + hero.getName() + "과 싸움을 했다."); }
}

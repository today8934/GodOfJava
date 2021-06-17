package Chapter10.inheritance;

public class Dog extends Animal{
    String color;
    String size;
    String nation;

    @Override
    public void move(){
        System.out.println("개는 꼬리를 흔들며 뜁니다~~");
    }
    @Override
    public void eat(){
        System.out.println("개는 아무거나 잘먹어유");
    }
    @Override
    public void swim(){
        System.out.println("어푸어푸");
    }
    public void bark(){
        System.out.println("왈왈");
    }
}

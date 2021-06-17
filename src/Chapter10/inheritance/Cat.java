package Chapter10.inheritance;

public class Cat extends Animal{
    String lengthOfHair;

    @Override
    public void move(){
        System.out.println("사뿐사뿐");
    }
    @Override
    public void eat(){
        System.out.println("야금야금");
    }
    @Override
    public void climbTree(){
        System.out.println("고양이는 나무도 잘탑니다");
    }
    public void groom(){
        System.out.println("고양이세수");
    }

}

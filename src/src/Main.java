import Shape.*;

public class Main {
    public static void main(String[] args) {
        BaseRectangle baseRectangle = new BaseRectangle(2, 3);
        Squre squre = new Squre(4);
        BaseEllipse baseEllipse = new BaseEllipse(3, 5);
        Circle circle = new Circle(4);

        System.out.println(baseRectangle);
        System.out.println(squre);
        System.out.println(baseEllipse);
        System.out.println(circle);


    }
}

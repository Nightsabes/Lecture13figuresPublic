package funnynumberthirteen;

import funnynumberthirteen.models.Circle;
import funnynumberthirteen.models.Figure;
import funnynumberthirteen.models.Rectangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Figure figure = new Figure();
        Rectangle rectangle1 = new Rectangle("Green æsj", 10, 4);

        Circle circle1 = new Circle("Yellow :D",4.5);

        System.out.println("----------RECTANGLE----------");
        System.out.println("Circumference: "+ rectangle1.circumference());
        System.out.println("Area: "+rectangle1.area()+"\n");

        System.out.println("------------CIRCLE------------");
        System.out.println("Circumference: "+ circle1.circumference());
        System.out.println("Area: "+circle1.area()+"\n");

        System.out.println("----------Figure List----------");
        ArrayList<Figure>figureArrayList = new ArrayList<>();
        figureArrayList.add(rectangle1);
        figureArrayList.add(circle1);

        for (Figure figureX : figureArrayList){
            System.out.println(figureX);
        }
    }
}

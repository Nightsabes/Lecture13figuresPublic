package funnynumberthirteen;

import funnynumberthirteen.interfaces.Drawable;
import funnynumberthirteen.models.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InterfaceUsage {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("green",6.4,3.1);


        Circle circle = new Circle("Yellow", 2.7);


        Persona persona = new Persona();

        LebronJames lebronJames = new LebronJames();

        System.out.println(rectangle.getDrawing());

        System.out.println(circle.getDrawing());

        System.out.println(persona.getDrawing()+"\n");

        System.out.println(lebronJames.getDrawing());

        Drawable drawable = new Circle("Purple", 5);
        System.out.println(drawable.getDrawing());

        ArrayList<Drawable> drawables = new ArrayList<>();
        drawables.add(rectangle);
        drawables.add(circle);
        drawables.add(persona);
        drawables.add(lebronJames);

        for (Drawable drawableX : drawables){
            drawableX.getDrawing();

        }
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);

        System.out.println("\n"+"----------Kek or cringe----------");
        for (Figure figureX : figures){
            if (figureX instanceof Rectangle){
                System.out.println("Rectangle: "+ figureX.area());
            }
            else {
                System.out.println("Circle: "+figureX.area());
            }
        }
        Collections.sort(figures);
        System.out.println("\n"+"------Kek or cringe Sorted------");
        for (Figure figureX : figures){
            if (figureX instanceof Rectangle){
                System.out.println("Rectangle: "+ figureX.area());
            }
            else {
                System.out.println("Circle: "+figureX.area());
            }
        }

    }
}

package funnynumberthirteen.models;

import funnynumberthirteen.interfaces.Drawable;

public abstract class Figure implements Drawable, Comparable<Figure> {


    private String color;

    public Figure(String color){
        this.color = color;
    }

    @Override
    public int compareTo(Figure o) {/*Manual labor lmao
        if (this.area() < o.area()){
            return -1;
        }
        else if (this.area() > o.area()){
            return 1;
        }
        else {
            return 0;
        }*/
        return Double.compare(this.area(),o.area());
    }

    public abstract double circumference();


    public abstract double area();

    @Override
    public String toString(){
        return "This figure has a cirCUMference of "+ circumference()+
                " and an area of "+ area();
        //når vi kaller på circumference så ser den etter nærmeste implementasjon i barnklassene så blir implenteasjonen bli override
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

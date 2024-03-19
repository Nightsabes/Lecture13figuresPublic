package funnynumberthirteen.models;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double circumference() {
        //2*r*pi
        return 2*radius*Math.PI;
    }

    @Override
    public String getDrawing() {
        return "        . -- ~~~ -- .\n"+
                "    .-~               ~-.\n"+
                "   /                     \\ \n"+
                "  /                       \\ \n"+
                " |                         |\n"+
                " |                         |\n"+
                " |                         |\n"+
                "  \\                       /\n"+
                "   \\                     /\n"+
                "    `-.               .-'\n"+
                "        ~- . ___ . -~";
    }

    @Override
    public double area() {
        //pi*radius^2
        return Math.PI*Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

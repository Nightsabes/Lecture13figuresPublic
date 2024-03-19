package funnynumberthirteen.models;

import funnynumberthirteen.interfaces.Drawable;

public class Persona implements Drawable {

    @Override
    public String getDrawing() {
        return " _____\n" +
                "'    \\\\\n" +
                "    O//\n" +
                "    \\_\\\n" +
                "    | |\n" +
                "   /  |\n" +
                "  /   |";
    }


}

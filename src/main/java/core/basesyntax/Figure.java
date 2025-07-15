package core.basesyntax;

public abstract class Figure implements Area {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure{" + "color='" + color + '\'' + '}';
    }
}

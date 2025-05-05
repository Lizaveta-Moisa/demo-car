public class Color {
    public String name;
    public int density;

    public Color(String name, int density) {
        this.name = name;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}

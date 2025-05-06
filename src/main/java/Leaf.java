public class Leaf {
    public String colour;
    public int length;

    public Leaf(String colour, int length) {
        this.colour = colour;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "colour='" + colour + '\'' +
                ", length=" + length +
                '}';
    }
}

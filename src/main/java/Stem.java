public class Stem {
    public String colour;
    public int length;

    public Stem(String colour, int length) {
        this.colour = colour;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Stem{" +
                "colour='" + colour + '\'' +
                ", length=" + length +
                '}';
    }
}

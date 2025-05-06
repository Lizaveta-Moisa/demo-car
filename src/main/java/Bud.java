public class Bud {
    public String form;
    public String colour;

    public Bud(String form, String colour) {
        this.form = form;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "form='" + form + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

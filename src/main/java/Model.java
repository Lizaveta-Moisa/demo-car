public class Model {
    public String name;
    public int year;

    public Model(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

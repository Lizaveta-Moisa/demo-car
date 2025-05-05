public class Car {
    public Speed speed;
    public Model model;
    public Color color;


    public Car(Speed speed, Model model, Color color){
        this.speed = speed;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model=" + model +
                ", color=" + color +
                '}';
    }
}

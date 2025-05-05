public class Main {
    public static void main(String[] args) {
        Speed speed1 = new Speed(89,200);
        Speed speed2 = new Speed(54,190);

        Model model1 = new Model("BMV", 2017);
        Model model2 = new Model("WV", 2020);

        Color color1 = new Color("Black", 60);
        Color color2 = new Color("White", 80);

        Car car1 = new Car(speed1, model1, color1);
        Car car2 = new Car(speed2, model2, color2);
        System.out.println(car1);
        System.out.println(car2);
    }
}

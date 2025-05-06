public class Main2 {
    public static void main(String[] args) {
        Stem stem1 = new Stem("white", 10);
        Stem stem2 = new Stem("black", 20);

        Leaf leaf1 = new Leaf("red", 15);
        Leaf leaf2 = new Leaf("green", 25);

        Bud bud1 = new Bud("form1", "yellow");
        Bud bud2 = new Bud("form2", "black");

        Flower flower1 = new Flower(stem1, leaf1, bud1);
        Flower flower2 = new Flower(stem2, leaf2, bud2);

        System.out.println("Цветок первый - " + flower1);
        System.out.println("Цветок второй - " + flower2);
    }
}

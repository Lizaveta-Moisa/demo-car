public class Flower {
    public Stem stem;
    public Leaf leaf;
    public Bud bud;

    public Flower(Stem stem, Leaf leaf, Bud bud) {
        this.stem = stem;
        this.leaf = leaf;
        this.bud = bud;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "stem=" + stem +
                ", leaf=" + leaf +
                ", bud=" + bud +
                '}';
    }
}

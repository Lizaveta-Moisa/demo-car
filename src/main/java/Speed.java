public class Speed {
    public int velocity;
    public int maxVelocity;

    public Speed(int velocity, int maxVelocity) {
        this.velocity = velocity;
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "velocity=" + velocity +
                ", maxVelocity=" + maxVelocity +
                '}';
    }
}

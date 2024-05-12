public enum Profession {
    DIRECTOR(2f),
    WORKER(1f),
    HR(1.5f);

    private final float ratio;

    private Profession(float ratio) {
        this.ratio = ratio;
    }

    public float getRatio() {
        return ratio;
    }
}

public  class Puffledui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honor;

    public Puffledui(String name, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(name, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }int calculateSpecificScore() {
        return this.diligence + this.loyalty + this.honor;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }


    @Override
    public String toString() {
        return "Puffledui{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                '}';
    }
}

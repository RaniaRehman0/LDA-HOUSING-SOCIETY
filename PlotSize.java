enum PlotSize {
    MARLA_3(3), MARLA_7(7), MARLA_10(10);

    private static final double SQFT_PER_MARLA = 272.25;
    private final int marla;

    PlotSize(int marla) {
        this.marla = marla;
    }

    public int getMarla() {
        return marla;
    }

    public double getSquareFeet() {
        return marla * SQFT_PER_MARLA;
    }
}

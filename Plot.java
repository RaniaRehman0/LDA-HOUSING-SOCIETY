abstract class Plot {
    private String plotId;
    private PlotSize size;
 
    Plot(String plotId, PlotSize size) {
        this.plotId = plotId;
        this.size = size;
    }
 
    public double calculateArea() {
        return size.getSquareFeet();
    }
 
    public abstract double calculatePrice();
 
    public void display() {
        System.out.println("Plot " + plotId + ": " + size.getMarla() + " marla, price " + calculatePrice());
    }
}
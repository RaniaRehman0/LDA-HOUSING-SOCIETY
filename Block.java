class Block {
    private String blockName;
    private List<Plot> plots = new ArrayList<>();
 
    Block(String blockName) {
        this.blockName = blockName;
    }
 
    public void addPlot(Plot p) {
        plots.add(p);
    }
 
    public double calculateTotalArea() {
        double total = 0;
        for (Plot p : plots) total += p.calculateArea();
        return total;
    }
 
    public double calculateTotalPrice() {
        double total = 0;
        for (Plot p : plots) total += p.calculatePrice();
        return total;
    }
 
    public void display() {
        System.out.println("Block " + blockName);
        for (Plot p : plots) p.display();
    }
}
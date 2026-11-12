class ResidentialPlot extends Plot {
    private House house;
    private Owner owner;
 
    ResidentialPlot(String plotId, PlotSize size, House house, Owner owner) {
        super(plotId, size);
        this.house = house;
        this.owner = owner;
    }
 
    public double calculatePrice() {
        return calculateArea() * 1000;
    }
 
    public void display() {
        super.display();
        house.display();
        owner.display();
    }
}
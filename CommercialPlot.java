class CommercialPlot extends Plot {
    private List<Shop> shops = new ArrayList<>();
    private List<Office> offices = new ArrayList<>();
 
    CommercialPlot(String plotId, PlotSize size) {
        super(plotId, size);
    }
 
    public void addShop(Shop s) {
        shops.add(s);
    }
 
    public void addOffice(Office o) {
        offices.add(o);
    }
 
    public double calculatePrice() {
        return calculateArea() * 2000;
    }
 
    public void display() {
        super.display();
        for (Shop s : shops) s.display();
        for (Office o : offices) o.display();
    }
}
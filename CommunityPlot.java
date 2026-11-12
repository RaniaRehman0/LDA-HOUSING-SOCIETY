class CommunityPlot extends Plot {
    private List<Apartment> apartments = new ArrayList<>();
 
    CommunityPlot(String plotId, PlotSize size) {
        super(plotId, size);
    }
 
    public void addApartment(Apartment a) {
        apartments.add(a);
    }
 
    public double calculatePrice() {
        return calculateArea() * 1500;
    }
 
    public void display() {
        super.display();
        for (Apartment a : apartments) a.display();
    }
}
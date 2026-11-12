class Society {
    private String name;
    private List<Block> blocks = new ArrayList<>();
 
    Society(String name) {
        this.name = name;
    }
 
    public void addBlock(Block b) {
        blocks.add(b);
    }
 
    public double calculateTotalArea() {
        double total = 0;
        for (Block b : blocks) total += b.calculateTotalArea();
        return total;
    }
 
    public double calculateTotalPrice() {
        double total = 0;
        for (Block b : blocks) total += b.calculateTotalPrice();
        return total;
    }
 
    public void display() {
        System.out.println("Society " + name);
        for (Block b : blocks) b.display();
    }
}
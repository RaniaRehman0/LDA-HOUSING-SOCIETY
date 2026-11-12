class Owner {
    private String name;
    private String cnic;
    private String phone;
 
    Owner(String name, String cnic, String phone) {
        this.name = name;
        this.cnic = cnic;
        this.phone = phone;
    }
 
    public void display() {
        System.out.println("Owner: " + name + ", " + cnic + ", " + phone);
    }
}
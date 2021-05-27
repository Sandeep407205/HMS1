public class customer {
    private String name;
    private double discount;
    private String status;

    public customer() {
    }

    public customer(String name, double discount, String status) {
        this.name = name;
        this.discount = discount;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                ", status='" + status + '\'' +
                '}';
    }

    public String getInfo(){
       return "name: "+getName()+ ", discount: "+getDiscount()+ ", status: "+getStatus();
    }
}

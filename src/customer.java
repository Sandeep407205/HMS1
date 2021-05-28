public class customer {
    private String name;
    private String status;
    private double discount;

    public customer() {
    }

    public customer(String name, String status) {
        this.name = name;
        this.status = status;
//        this.discount = discount;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", discount=" + discount +
                '}';
    }
}
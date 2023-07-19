public class Circle {
    private String Pi;

    public Circle(String pi) {
        Pi = pi;
    }

    public String getPi() {
        return Pi;
    }

    public void setPi(String pi) {
        Pi = pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                '}';
    }
}

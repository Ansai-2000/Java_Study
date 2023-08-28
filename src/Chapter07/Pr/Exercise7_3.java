package Chapter07.Pr;

public class Exercise7_3 {
    Tv t = new Tv();
}

class Product{
    int price;
    int bonusPoint;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product{
    Tv(){super(); }

    @Override
    public String toString() {
        return "Tv";
    }
}
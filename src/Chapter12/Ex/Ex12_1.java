package Chapter12.Ex;

import java.util.ArrayList;

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);
    }

    public static void printAll(ArrayList<Product> List){
        for (Product product : List) {
            System.out.println(product);
        }
    }
}
class Product{}
class Tv extends Product{}
class Audio extends Product{}
package daniel.reciperproject.data;

import java.util.ArrayList;

public class Recipe extends BaseEntity{

    private String products;
    private String time;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

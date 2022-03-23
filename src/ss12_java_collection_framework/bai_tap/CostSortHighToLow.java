package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class CostSortHighToLow implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o2.getCost(), o1.getCost());
    }
}

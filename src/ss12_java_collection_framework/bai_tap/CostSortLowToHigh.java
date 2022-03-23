package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class CostSortLowToHigh implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}

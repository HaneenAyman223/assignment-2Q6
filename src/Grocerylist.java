import java.util.ArrayList;



public class Grocerylist {
    ArrayList<GroceryitemOrder> l1 = new ArrayList<>();
public Grocerylist(){}
public void add(GroceryitemOrder item){
    if (l1.size()<10){
        l1.add(item);
    }}
    public Double getTotalCost() {
        double total;
        int i;
        total = 0.0;
        for (i = 0; i < l1.size(); i++) {
            total += l1.get(i).getCost();
        }
        return total;
    }





}


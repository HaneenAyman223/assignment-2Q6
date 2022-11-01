public class Main {
    public static void main(String[] args) {
        Grocerylist g1 = new Grocerylist();
        GroceryitemOrder i1 = new GroceryitemOrder("rice",20.0);
        i1.setQuantity(2);
        g1.add(i1);
        GroceryitemOrder i2 = new GroceryitemOrder("meat",30.0);
        i2.setQuantity(3);
        g1.add(i2);
        System.out.println( i1.getCost() + "\n" + i2.getCost() +"\n"+ g1.getTotalCost());
    }
}
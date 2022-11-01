public class GroceryitemOrder {
    public String name;
    public Double pricePerunit;

    public int quantity;
    public GroceryitemOrder(){}


    public GroceryitemOrder(String name, double pricePerunit){
        this.name=name;
        this.pricePerunit=pricePerunit;
        quantity = 1;
    }
    public void setQuantity(int x)
    {
        quantity=x;
    }
    public double getCost()
    {
        return quantity*pricePerunit;
    }


}

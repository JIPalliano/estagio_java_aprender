package Market.Items;

public class Chair extends Item{
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return getName()+" - "+getDescription()+" - "+getDisponable()+" / "+getPrice()+" -> "+getQuantity();
    }
}

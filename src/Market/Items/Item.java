package Market.Items;

public abstract class Item {
    private String name, description;
    private Double price;
    private Boolean isDisponable;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getDisponable() {
        return isDisponable;
    }

    public void setDisponable(String disponable) {
        if(disponable.equals("sim")){
            this.isDisponable = true;
        }else{
            this.isDisponable = false;
        }
        //isDisponable = disponable;
    }

}

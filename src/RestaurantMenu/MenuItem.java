package RestaurantMenu;

public class MenuItem {
    // Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors
    public MenuItem(String name, String description, Double price){
        this.name=name;
        this.description;
        this.price=price;
        this.category= "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Methods
    //Getter and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String aName){this.name = aName; }

    public String getDescription(){return this.description;}
    public void setDescriptione(String aDescription){this.description = aDescription;}

    public Double getPrice(){return this.price;}
    public void setPrice(Double aPrice){this.price = aPrice;}

    public String getCategory(){return  this.category;}
    public void setCategory(String aCategory){this.category = aCategory;}

    public Boolean getIsNew(){return this.isNew;}
    public void setIsNew(Boolean aIsNew){this.isNew = aIsNew;}

}

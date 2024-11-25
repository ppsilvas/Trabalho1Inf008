package system.products;

private enum Category{
    Eletronic, Clothes, Food;
}

public class Products{
    private int id;
    private String name;
    private String description;
    private float price;
    private int totalInStock;
    private Category category;
    private int numberOfProducts = 0;

    public Products(){

    }
    public Products(String name, String description, float price, Category category){
        id = numberOfProducts++;
        this.name = name;
        this.description = description;
        this.price = price;
        totalInStock++;
        this.category = category;
    }
}
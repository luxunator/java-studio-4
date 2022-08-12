package restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {

    private String name;
    private int id;
    private double price;
    private String description;
    private String category;
    private Date createdAt;

    public MenuItem(String name, int id,
                    double price, String description,
                    String category){
        this.name = name;
        this.id = id;
        this.price = price;
        this.description = description;
        this.category = category;
        this.createdAt = new Date();
    }

    public boolean isNew(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        Date monthAgo = cal.getTime();
        if (this.createdAt.compareTo(monthAgo) < 0){
            return false;
        }

        return true;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}

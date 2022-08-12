package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private int id;
    private String alias;
    private Date updatedAt;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Menu(int id, String alias, ArrayList<MenuItem> menu){
     this.id = id;
     this.alias = alias;
     this.menu = menu;
     this.updatedAt = new Date();
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public ArrayList<MenuItem> getMenu() {
        return this.menu;
    }

    public void add(MenuItem item){
        menu.add(item);

        this.updatedAt = new Date();
    }

    public void remove(MenuItem item) {
        menu.remove(menu.indexOf(item));

        this.updatedAt = new Date();
    }


}

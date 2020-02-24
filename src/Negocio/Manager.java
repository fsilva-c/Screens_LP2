
package Negocio;

public class Manager extends Person{
    private Menu menu;

    public Manager(String name, String pswd, Menu menu) {
        super(name, pswd);
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean InsertItem(Menu_Item item){
       return(menu.AddItem(item));
    }

    public boolean DeleteItem(Menu_Item item){
        return(menu.DelItem(item));
    }

    public boolean SearchItem(Menu_Item item){
        return(menu.SearchItem(item));
    }

    public boolean ModifyItem(Menu_Item item){
        return(menu.ModifyItem(item));
    }

}

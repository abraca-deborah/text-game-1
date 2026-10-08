import java.util.ArrayList;

public class Player{

    private String name;
    private ArrayList<String> inventory;
    private int inventorySize;

    public Player(){
        inventory = new ArrayList<String>();
    }

    //PLAYER ATTRIBUTES: 

    public void setName(String name){
        this.name = name;
    }

    public void setInventorySize(int size){
        inventorySize = size;
    }



    
    //INVENTORY ACTIONS:

    public boolean has(String item){
        return inventory.indexOf(item) > -1;
    }

    public void take(String item){
        inventory.add(item);
    }

    public boolean drop(String item){
        int index = inventory.indexOf(item);
        if (index > -1){
            inventory.remove(index);
            return true;
        }
        return false;
    }


    //PRINT PLAYER ATTRIBUTES (toString):
    public String toString(){
        return ("Name: " + name);
    }
}
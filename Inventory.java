import java.util.ArrayList;

public class Inventory
{
    
    ArrayList<Items> inventory = new ArrayList<Items>();
    public Inventory() {
    }
    
    public Inventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }
    
    public void pickUp(Items i) {
        inventory.add(i);
    }
    
    public void inventoryToString(ArrayList<Items> inventory) {
        for(int i = 0; i < inventory.size(); i++) {
                System.out.println(inventory(i).toString());
        }
    }
}

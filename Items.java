
public class Items {
    String name = null;
    int dura = 0;
    int weight = 0;

    public Items(String name, int dura, int weight) {
        this.name = name;
        this.dura = dura;
        this.weight = weight;
    }

    //public Items getItem() {
    //    return Items;
    // }
    public String getName() {
        return name;
    }
    public int getDura() {
        return dura;
    }
    public int getWeight() {
        return weight;
    }
    public String toString(Items i) {
        int temp = i.getDura();
        int temp2 = i.getWeight();
        String tempName = i.getName() + ", " + temp.toString() + ", " + temp2.toString();
        return tempName;
    }
}

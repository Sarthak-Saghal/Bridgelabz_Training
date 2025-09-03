import java.util.ArrayList;

public class CartItem {

    String Itemname;
    double price;
    int Quantity;

     CartItem(String Itemname, double price,int Quantity){
        this.Itemname=Itemname;
        this.price=price;
        this.Quantity=Quantity;
    }
    double getCost(){
        return price*Quantity;
    }

    void display(){

        System.out.println("ItemNane : " + Itemname );
        System.out.println("Price : " + Itemname );
        System.out.println("Quantity : " + Itemname );
        System.out.println("------------------------------------");
        System.err.println();
    }

    private static  ArrayList<CartItem>list=new ArrayList<>();

    public static void addItem(String name,double price, int Qty){
        list.add(new CartItem(name,price,Qty));
    }

    public static void removeItem(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).Itemname.equals(name)) {
                list.remove(i);
                System.out.println(name + " removed from cart.");
                System.err.println("");
                return;
            }
        }
        System.out.println(name + " not found in cart.");
        System.err.println("");
    }

    
    public static void displayCart() {
        if (list.isEmpty()) {
            System.out.println("\nCart is empty.\n");
            return;
        }
        double total = 0;
        System.out.println("--------------CART DETAILS -----------");
        for (CartItem item : list) {
            item.display();
            total += item.getCost();
        }
        System.out.println("TOTAL COST: " + total);
        System.out.println("--------------------------------------");
    }

     public static void main(String[] args) {
        addItem("Apple", 30, 2);
        addItem("Banana", 10, 5);
        addItem("Milk", 50, 1);
        System.out.println(list);

        displayCart();
        removeItem("Banana");
        displayCart();
    }

}

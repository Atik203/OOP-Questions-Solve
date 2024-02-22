/*

Consider the abstract class “Item” that has a constructor that takes arguments: (name: String, unit_price: double) to set item name & unit price. Now complete the following three tasks (No need to rewrite the codes in the question. Just write the answer parts only):

a. Write a class named “WeightedItem” extending the “Item” class.
   i. Add one additional field named “weight” that holds the weight of this item
   ii. Add a constructor that takes three arguments: (name: String, weight: double, unit_price: double)
   iii. Now override the method “calculatePrice” that should return total price for this item object as:
weight * unit_price

b. Write another class named “CountableItem” extending the “Item” class.
   i. Add one additional field named “quantity” that holds the quantity as count of this item
   ii. Add a constructor that takes three arguments: (name: String, quantity: int, unit_price: double)
   iii. Now override the method “calculatePrice” that should return total price for this item object as:
quantity * unit_price

c. Now complete the “calculateTotalPrice” method that takes an array of Items and returns the calculated total price for all the items in that array using for each loop.

*/

abstract class Item {
    String name;
    double unit_price;

    Item(String name, double unit_price) { this.name= name;
        this.unit_price = unit_price;

    }

    void printItemDetails() {
        System.out.println("ItemName" +name+" Unit-price: " + unit_price);



    }

    abstract double calculatePrice();
}

class WeightedItem extends Item {
    double weight;

    WeightedItem(String name, double weight, double unit_price) {
        super(name, unit_price);
        this.weight = weight;
    }

    @Override
    double calculatePrice() {
        return weight * unit_price;
    }
}

class CountableItem extends Item {
    int quantity;

    CountableItem(String name, int quantity, double unit_price) {
        super(name, unit_price);
        this.quantity = quantity;
    }

    @Override
    double calculatePrice() {
        return quantity * unit_price;
    }
}
class Mid {

    public static double calculateTotalPrice(Item[] items) {
        double total = 0.0;
        // codes to calculate total price from items array using for each loop
        for (Item item : items) {
            total += item.calculatePrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Item[] items = new Item[3];

        items[0] = new WeightedItem("Rice", 10.0, 70.0);
        // weight: 10.0 kg & unit price: 70 per kg

        items[1] = new CountableItem("Ezg", 12, 11.0);
        // quantity: 12 pieces & unit price: 11 per piece

        items[2] = new WeightedItem("Chicken", 0.7, 250.0);
        // weight: 0.7 kg & unit price: 250 per kg

        System.out.println("Total Price: " + calculateTotalPrice(items));
        // Total Price: 1007.0
    }
}
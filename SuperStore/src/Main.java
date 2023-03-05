import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addItem(new Item("Skis", "Equipment", 200));
        store.addItem(new Item("Boots", "Tech", 100));
        store.addItem(new Item("Poles", "Misc", 50));
        store.addItem(new Item("Helmet", "Tech", 80));
        store.addItem(new Item("Goggles", "Tech", 40));
        store.addItem(new Item("Jacket", "Equipment", 150));
        store.addItem(new Item("Pants", "Equipment", 120));
        store.addItem(new Item("Gloves", "Misc", 30));
        store.addItem(new Item("Socks", "Misc", 10));
        store.addItem(new Item("Hand warmers", "Misc", 5));

        Player player = new Player("Alice", 500);
        store.updateSalePrices();
        store.displayInventory();
        player.buyItem(store, store.getInventory().get(0));
        player.displayInventory();
        store.updateSalePrices();
        store.displayInventory();
    }
}

class Player {
    private String name;
    private int money;
    private ArrayList<Item> inventory;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.inventory = new ArrayList<>();
    }

    public void buyItem(Store store, Item item) {
        if (item.getPrice() <= this.money) {
            this.money -= item.getPrice();
            this.inventory.add(item);
            store.sellItem(item);
            System.out.println(this.name + " bought " + item.getName() + " for " + item.getPrice() + " money.");
        } else {
            System.out.println(this.name + " doesn't have enough money to buy " + item.getName() + ".");
        }
    }

    public void displayInventory() {
        if (this.inventory.size() == 0) {
            System.out.println(this.name + " has no items.");
        } else {
            System.out.println(this.name + "'s inventory:");
            for (Item item : this.inventory) {
                System.out.println("  " + item.getName() + " (" + item.getCategory() + ")");
            }
        }
    }
}

class Store {
    private ArrayList<Item> inventory;
    private ArrayList<String[]> transactions;

    public Store() {
        this.inventory = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void updateSalePrices() {
    }

    public ArrayList<Item> getInventory() {
        return null;
    }

    public void addItem(Item item) {
        this.inventory.add(item);
    }

    public void sellItem(Item item) {
        this.inventory.remove(item);
        this.transactions.add(new String[] {item.getName(), Integer.toString(item.getPrice())});
    }

    public void displayInventory() {
        if (this.inventory.size() == 0) {
            System.out.println("The store has no items.");
        } else {
            System.out.println("The store's inventory:");
            for (Item item : this.inventory) {
                System.out.println("  " + item.getName() + " (" + item.getCategory() + "): " + item.getPrice() + " money");
            }
        }
    }


/*
 *  Tau Lukas Castillo
 */
package ex05_tau_castilloslc;

/**
 *
 * @author sethl
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.itemList = new ArrayList<Item>();
    Store.storeList.add(this);
  }

  public String getName(){
    return name;
  }
  
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    
    if(index >= this.itemList.size()){
        System.out.printf("%s: There are only %d items in the store\n", this.name, this.itemList.size());
        return;
    }
    
    Item soldItem = this.itemList.get(index);
    this.earnings += soldItem.getCost();
    System.out.printf("%s: Sold 1 %s of type %s costing: %.2f\n", this.name, soldItem.getName(), soldItem.getType(), soldItem.getCost());
  }
  
  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    
    Item soldItem = null;
    for(Item e : this.itemList){
        if(e.getName().equals(name)) soldItem = e;
    }
    if(soldItem == null){
        System.out.printf("%s: Item with name %s not found!\n", this.name, name);
        return;
    }
    
    this.earnings += soldItem.getCost();
    System.out.printf("%s: Sold 1 %s of type %s costing: %.2f\n", this.name, soldItem.getName(), soldItem.getType(), soldItem.getCost());
  }
  
  
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    int index = this.itemList.indexOf(i);
    
    if (index < 0) {
        System.out.printf("%s: Item %s not found!\n", this.name, i.getName());
        return;
    }
    
    Item soldItem = this.itemList.get(index);
    this.earnings += soldItem.getCost();
    System.out.printf("%s: Sold 1 %s of type %s costing: %.2f\n", this.name, soldItem.getName(), soldItem.getType(), soldItem.getCost());
  }
  
  
  public void addItem(Item i){
    // add Item i to store's itemList
    this.itemList.add(i);
  }
  
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("Filtered items with type \"%s\":\n", type);
    this.itemList.forEach((item) -> {
        if(item.getType().equals(type)) System.out.printf("%s %.2f$ %s\n", item.getName(), item.getCost(), item.getType());
    });
    System.out.println("");
  }
  
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Filtered items with cost lower or equal to %.2f$:\n", maxCost);
    this.itemList.forEach((item) -> {
        if(item.getCost() <= maxCost) System.out.printf("%s %.2f$ %s\n", item.getName(), item.getCost(), item.getType());
    });
    System.out.println("");
  }
  
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Filtered items with cost higher or equal to %.2f$:\n", minCost);
    this.itemList.forEach((item) -> {
        if(item.getCost() >= minCost) System.out.printf("%s %.2f$ %s\n", item.getName(), item.getCost(), item.getType());
    });
    System.out.println("");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println("\nList of all the stores:");
    Store.storeList.forEach((store) -> {
        System.out.println(store.getName());
        System.out.println("Earnings: " + store.getEarnings());
    });
  }
}
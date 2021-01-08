package com.instantiation;

public class ClothingItem {
    public String type;
    public static void main(String[] args) {
	// write your code here
        ClothingItem item = new ClothingItem();
        item.type = "Hat";
        item.displayItem();
    }

    private void displayItem(){
        System.out.println("This is a " + this.type);
    }
}

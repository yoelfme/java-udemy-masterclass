package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> list = new ArrayList<String>();

    public void addGroceryItem(String item) {
        list.add(item);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void print() {
        int size = list.size();
        System.out.println("You have " + size + " items in your grocery list");

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);

        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);

        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        list.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    private void removeGroceryItem(int position) {
        list.remove(position);
    }

    private int findItem(String searchItem) {
        return list.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        return list.contains(searchItem);
    }
}

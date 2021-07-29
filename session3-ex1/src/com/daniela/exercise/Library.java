package com.daniela.exercise;

public class Library {
    private Item[] items = new Item[2];
    private Notification[] notifications;

    public Library(Notification[] notifications) {
        this.notifications = notifications;
    }

    public void addItem(Item item) throws TooManyItemsException {
        boolean itemAdded = false;
        for(int i = 0; i < items.length; i++) {
            if(items[i] == null) {
                items[i] = item;
                for(Notification n : notifications) {
                    n.sendNotification(item);
                }
                itemAdded = true;
                break;
            }
        }
        if(!itemAdded) {
            //the items list is already full. you cannot add another item
            throw new TooManyItemsException(); //is a checked exception
        }
    }

    public void viewItems() {
        for(int i = 0; i < items.length; i++) {
            if(items[i] != null) {
                System.out.println(items[i]);
            } else {
                break;
            }
        }
    }
}

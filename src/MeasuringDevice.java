import java.util.ArrayList;

public class MeasuringDevice {
    private String deviceName;
    private ArrayList<PurchasableItem> items;

    public MeasuringDevice(String deviceName, ArrayList<PurchasableItem> items) {
        this.deviceName = deviceName;
        this.items = items;
    }

    public MeasuringDevice() {
        this.deviceName = "Unnamed Device";
        this.items = new ArrayList<>();
    }

    public void setDeviceName(String name) {
        this.deviceName = name;
    }
    public String getDeviceName() {
        return deviceName;
    }

    public void setItems(ArrayList<PurchasableItem> items) {
        this.items = items;
    }
    public ArrayList<PurchasableItem> getItems() {
        return items;
    }

    // 1. Додати елемент у кінець списку
    public void addItem(PurchasableItem item) {
        items.add(item);
        System.out.println("Item added to the list: " + item);
    }

    // 3. Додати елемент у позицію індексу
    public void addItemByIndex(int index, PurchasableItem item) {
        if (index >= 0 && index <= items.size()) {
            items.add(index, item);
            System.out.println("Item added at index " + index + ": " + item);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // 8. Видалити елемент, розташований у вказаній позиції
    public void removeItemAtIndex(int index) {
        if (index >= 0 && index <= items.size()) {
            items.remove(index);
            System.out.println("Item removed from index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // 10. Отримати кількість входжень елемента у список
    public int countItemOccurrences(PurchasableItem item) {
        int count = 0;
        for (PurchasableItem currentItem : items) {
            if (currentItem.equals(item)) {
                count++;
            }
        }
        return count;
    }

    //12. Створити масив з елементів списку
    public PurchasableItem[] toArray() {
        PurchasableItem[] array = new PurchasableItem[items.size()];
        return items.toArray(array);
    }

    // 14. Відсортувати список за збільшенням деякого атрибута (за кількістю)
    public void sortItemsByQuantity() {
        items.sort((item1, item2) -> Integer.compare(item1.getQuantity(), item2.getQuantity()));
        System.out.println("Items sorted by quantity.");
    }

    // 14.2 Відсортувати список за збільшенням деякого атрибута (за кількістю)
    public void sortItemsByQuantityFirstMore() {
        items.sort((item1, item2) -> Integer.compare(item2.getQuantity(), item1.getQuantity()));
        System.out.println("Items sorted by quantity first more.");
    }

    public void displayDeviceInfo() {
        System.out.println("Item device: " + deviceName);
        System.out.println("Items list: ");
        for (PurchasableItem item : items) {
        System.out.println(item);
        }
    }

}

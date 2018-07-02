package com.mkaz.homeworks.lesson5.filesystem;

import java.util.ArrayList;
import java.util.List;

class Directory extends NamedFSItem {
    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FSItem fsItem) {
        if (fsItem instanceof Directory) {
            if (((Directory) fsItem).getItems().contains(this)){
                throw new IllegalArgumentException();
            }
        }
        items.add(fsItem);
    }

    public List<FSItem> getItems() {
        return items;
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FSItem temp : items) {
            sum += temp.getSize();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Directory​{" +
                "items=" + items +
                "} " + super.toString();
    }
}

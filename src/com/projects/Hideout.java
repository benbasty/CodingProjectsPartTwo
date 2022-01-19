package com.projects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param <T>
 */

public abstract class Hideout<T> implements List<T> {
    private List<T> hideoutList;

    public Hideout() {
        this.hideoutList = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!hideoutList.isEmpty()) {
            hideoutList.clear();
        }
        this.hideoutList.add(toHide);
    }
    public T takeFromHideout() {
        if (this.hideoutList.isEmpty()) {
            return null;
        } else {
            T value = this.hideoutList.get(0);
            this.hideoutList.clear();
            return value;
        }
    }
    public boolean isInHideOut() {
        if (this.hideoutList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
    }

}

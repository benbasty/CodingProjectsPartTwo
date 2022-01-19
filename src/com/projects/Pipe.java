package com.projects;

import java.util.ArrayList;
import java.util.List;

public abstract class Pipe<T> implements List<T> {
    private List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }

    public T takeFromPipe() {
        if (this.pipes.isEmpty()) {
            return null;
        } else {
            T value = this.pipes.get(pipes.size()-1);
            this.pipes.remove(value);
            return value;
        }
    }

    public boolean isInPipe() {
        if (this.pipes.isEmpty()) {
            return false;
        } else {
            return false;
        }
    }


}

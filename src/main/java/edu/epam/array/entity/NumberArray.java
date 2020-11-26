package edu.epam.array.entity;

import java.util.Arrays;

public class NumberArray {
    private int[] arr;

    public NumberArray() {
    }

    public NumberArray(int size) {
        this.arr = new int[size];
    }

    public NumberArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int element) {
        arr[index] = element;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberArray array = (NumberArray) o;

        return Arrays.equals(arr, array.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberArray{");
        sb.append("arr=").append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }
}

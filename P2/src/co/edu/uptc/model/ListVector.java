package co.edu.uptc.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListVector implements List {

    Object []vector = {};

    public ListVector(){

    }

    @Override
    public int size() {
        return vector.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object object) {
        Object [] tmp = new Object[vector.length+1];
        for (int i = 0; i < vector.length; i++) {
            tmp[i] = vector[i];
        }
        tmp[vector.length]=object;
        vector =tmp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return vector[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object aux = vector[index];
        vector[index] = element;
        return aux;
    }

    @Override
    public void add(int index, Object element) {
        Object [] tmp = new Object[vector.length+1];
        for (int i = 0; i < index; i++) {
            tmp[i] = vector[i];
        }
        for (int i = index+1; i < vector.length +1; i++) {
            tmp[i] = vector[i];
        }
        tmp[index]=element;
        vector =tmp;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

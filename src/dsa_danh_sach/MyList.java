package dsa_danh_sach;

import java.util.Arrays;

public class MyList<E> implements Cloneable {
	private int size = 0;
	static final int DEFAULT_CAPACITY = 10;
	E[] elements;

	public MyList() {
		this(DEFAULT_CAPACITY);
	}

	public MyList(int capacity) {
		elements = (E[]) new Object[capacity];
	}

	public void add(int index, E element) {
		if (size == elements.length) {
			ensureCapacity(size);
		}
		System.arraycopy(elements, index, elements, index + 1, size - index);
		elements[index] = element;
		size += 1;
	}

	public int size() {
		return size;
	}

	private void ensureCapacity(int minCapa) {
		int newSize = elements.length + minCapa;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E remove(int index) {
		E removeValue = null;
		for (int i = 0; i < size; i++) {
			if (i == index) {
				removeValue = elements[i];
				elements[i] = elements[i + 1];
			}
			if (i > index) {
				elements[i] = elements[i + 1];
			}

		}
		size -= 1;
		return removeValue;
	}

	public MyList<E> clone() {
		MyList<E> newlist = new MyList<>(elements.length);
		newlist.elements = Arrays.copyOf(elements, size);
		return newlist;
	}

	public boolean contains(E o) {
		return indexOf(o) >=0;
	}
	public int indexOf(E o) {
		for (int i = 0; i < size; i++)
			if (o.equals(elements[i])) {
				return i;

			}
		return -1;
	}
	public boolean add(E e) {
		 if (size == elements.length) {
			 ensureCapacity(size);
	        }
	        elements[size++] = e;
	        return true;
	}
	public E get(int index) {
		return elements[index];
	}
	public void clear() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
		size =0;
	}

	@Override
	public String toString() {
		 if (elements == null)
	            return "null";

	        int iMax = size-1;
	        if (iMax == -1)
	            return "[]";

	        StringBuilder b = new StringBuilder();
	        b.append('[');
	        for (int i = 0; ; i++) {
	            b.append(String.valueOf(elements[i]));
	            if (i == iMax)
	                return b.append(']').toString();
	            b.append(", ");
	        }
	}
	
}

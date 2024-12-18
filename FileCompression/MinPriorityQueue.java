package FileCompression;

import java.util.*;

//MinPriorityQueue is a type of queue,where elements inside is ordered ascendingly
//In this case,the PriorityQueue is ordered by the frequency of the ByteNode,or the frequency of each character
//,where its also used to represent the Min-Heap inorder to create Huffman Tree
public class MinPriorityQueue<T extends Comparable<T>> {
    private int size = 0;
    private List<T> list;

    MinPriorityQueue() {
        list = new ArrayList<>();
    }

    public int len() { return size; }
    public boolean isEmpty() { return size == 0; }
    public T poll() { return poll(0); }

    public void add(T elem) {
        //If a ByteNode is added to the PriorityQueue,it will do a siftUp process
        //Sift Up is process that occurs in a heap,where when we insert a node inside a queue,it will compare its node with its parent,
        //Whether the child needs to be prioritized more than the parent,based on the frequency of the ByteNode
        //If the child needs to be prioritized more,than it will swap places,just like in the Heap
        list.add(elem);
        siftUp(size);
        size++;
    }

    private T poll(int i) {
        //Poll is a process in a queue,where it removes and retrieves the first element
        //This is an important process,because deletion in a Heap data structure,it always starts from the root,or the first node
        //and then replaced by the last element inside the queue
        //Poll is needed inorder to create the HuffmanTree,where the HuffmanTree is a Min-Heap
        if(size == 1) {
            size--;
            T data = list.get(0);
            list.clear();
            return data;
        }
        size--;
        T data_to_return = list.get(i);
        swap(i, size);
        list.remove(list.get(size));
        siftDown(i);
        return data_to_return;
    }

    private void siftDown(int k) {
        //Sift Down is a process in a heap,where when we delete an element,after the deleted ByteNode and the last ByteNode inside
        //the MinPriorityQueue is swapped,it will compare to its children,if it satisfies
        //the requirement,it will swap places with either its left child or its right child.
        while(true) {
            int left = (k*2) + 1;
            int right = (k*2) + 2;
            int smallest = left;
            if(right < size) {
                if (isLess(right, left)) smallest = right;
            }
            if(smallest < size) {
                if (isLess(k, smallest)) break;
                swap(k, smallest);
                k = smallest;
            } else break;
        }
    }

    private void siftUp(int k) {
        //Sift Up is a process in a heap,where when we insert an element,it will compare certain traits with its parents. When it satisfy
        //the requirement,it will swap places.
        //In this case,if the child has less frequency than the parent,then it will swap spaces,because this is Min-Heap
        int parent_idx = (k-1) / 2;
        while(k > 0 && isLess(k, parent_idx)) {
            swap(k, parent_idx);
            k = parent_idx;
            parent_idx = (k-1) / 2;
        }
    }

    private boolean isLess(int i, int j) {
        //Process of comparing the frequency of the parent and the child
        //Returns true if childs frequency less than parents frequency
        //Returns false vice versa
        T elem0 = list.get(i);
        T elem1 = list.get(j);

        return elem0.compareTo(elem1) <= 0;
    }

    private void swap(int i, int j) {
        //Process of swapping ByteNode
        T elem_i = list.get(i);
        T elem_j = list.get(j);

        list.set(i, elem_j);
        list.set(j, elem_i);
    }

    public String toString() {
        return list.toString();
    }
}
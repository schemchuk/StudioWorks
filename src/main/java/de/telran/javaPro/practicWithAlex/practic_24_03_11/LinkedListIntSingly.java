package de.telran.javaPro.practicWithAlex.practic_24_03_11;

public class LinkedListIntSingly {
    private Node head;
    private int size;

    public void add(int element) {  // добавление в конец
        Node newNode = new Node();
        newNode.setData(element);
        if(head == null) {
            head = newNode;
        }
        else {
            Node node = head;
            do {
                node = node.getNext();
            }
            while (node.getNext()!=null);
            node.setNext(newNode);
        }
        size++;
    }

    public void show() {
        Node node = head;
        StringBuilder outStr = new StringBuilder("[");
        do {
            outStr.append(node.getData()+",");
            node = node.getNext();
        }
        while (node.getNext()!=null);
        outStr.append(node.getData()+"]");
    }
}

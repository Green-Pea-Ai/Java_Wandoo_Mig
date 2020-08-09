package Personal_Training;

public class PT_DoublyLinkedList {

    private PT_Node head;
    private PT_Node tail;
    private int size = 0;

    private class PT_Node {

        private Object data;

        private PT_Node next;
        private PT_Node prev;

        public PT_Node(Object input) {
            this.data = input;
            this.next = null;
            this.prev = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {

        PT_Node newNode = new PT_Node(input);

        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {

        PT_Node newNode = new PT_Node(input);

        if (size == 0) {
            addFirst(input);
        } else {

            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

            size++;
        }
    }

    PT_Node node(int index) {
        if (index < size / 2) {

            PT_Node x = head;
            for ( int i = 0; i < index; i++)
                x = x.next;

            return x;
        } else {

            PT_Node x = tail;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    public void wdAdd(int k, Object input) {

        if (k == 0) {
            addFirst(input);
        } else {
            PT_Node temp1 = node(k - 1);

            PT_Node temp2 = temp1.next;

            PT_Node newNode = new PT_Node(input);

            temp1.next = newNode;

            newNode.next = temp2;

            if (temp2 != null)
                temp2.prev = newNode;

            newNode.prev = temp1;
            size++;

            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public String toString() {

        if (head == null) {
            return "[]";
        }

        PT_Node temp = head;
        String str = "[";


        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }

        str += temp.data;

        return str + "]";
    }

    public Object wdRemoveFirst() {

        PT_Node temp = head;
        head = temp.next;

        Object returnData = temp.data;
        temp = null;

        if (head != null)
            head.prev = null;
        size--;

        return returnData;
    }

    public Object wdRemove(int k) {
        if (k == 0)
            return wdRemoveFirst();

        PT_Node temp = node(k - 1);

        PT_Node todoDeleted = temp.next;

        temp.next = temp.next.next;
        if (temp.next != null) {

            temp.next.prev = temp;
        }

        Object returnData = todoDeleted.data;

        if (todoDeleted == tail) {
            tail = temp;
        }

        todoDeleted = null;
        size--;
        return returnData;
    }

    public Object wdRemoveLast() {
        return wdRemove(size - 1);
    }

    public int wdSize() {
        return size;
    }

    public Object wdGet(int k) {
        PT_Node temp = node(k);

        return temp.data;
    }

    public int wdIndexOf(Object data) {

        PT_Node temp = head;

        int index = 0;

        while (temp.data != data) {
            temp = temp.next;
            index++;

            if (temp == null)
                return -1;
        }

        return index;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    public class ListIterator {
        private PT_Node lastReturned;
        private PT_Node next;
        private int nextIndex;

        ListIterator() {
            next = head;
            nextIndex = 0;
        }

        public Object wdNext() {
            lastReturned = next;
            next = next.next;
            nextIndex++;

            return lastReturned.data;
        }

        public boolean wdHasNext() {
            return nextIndex < wdSize();
        }

        public boolean wdHasPrevious() {
            return nextIndex > 0;
        }

        public Object previous() {
            if (next == null) {
                lastReturned = next = tail;
            } else {
                lastReturned = next = next.prev;
            }
            nextIndex--;

            return lastReturned.data;
        }

        public void wdAdd(Object input) {
            PT_Node newNode = new PT_Node(input);
            if (lastReturned == null) {
                head = newNode;
                newNode.next = next;
            } else {
                lastReturned.next = newNode;
                newNode.prev = lastReturned;
                if (next != null) {
                    newNode.next = next;
                    next.prev = newNode;
                } else {
                    tail = newNode;
                }
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }

        public void wdRemove() {
            if (nextIndex == 0) {
                throw new IllegalStateException();
            }
            PT_Node n = lastReturned.next;
            PT_Node p = lastReturned.prev;

            if (p == null) {
                head = n;
                head.prev = null;
                lastReturned = null;
            } else {
                p.next = next;
                lastReturned.prev = null;
            }

            if (n == null) {
                tail = p;
                tail.next = null;
            } else {
                n.prev = p;
            }

            if (next == null) {
                lastReturned = tail;
            } else {
                lastReturned = next.prev;
            }

            size--;
            nextIndex--;
        }
    }
}















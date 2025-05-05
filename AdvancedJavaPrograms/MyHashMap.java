class MyHashMap {
    class Entry {
        int key, value;
        Entry next;
        Entry(int k, int v) { key = k; value = v; }
    }

    final int SIZE = 1000;
    Entry[] table = new Entry[SIZE];

    public void put(int key, int value) {
        int idx = key % SIZE;
        Entry head = table[idx];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry e = new Entry(key, value);
        e.next = table[idx];
        table[idx] = e;
    }

    public int get(int key) {
        int idx = key % SIZE;
        Entry head = table[idx];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return -1;
    }
}
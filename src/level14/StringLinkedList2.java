package level14;

//Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
//Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int), который вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
//Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

public class StringLinkedList2 {
    private final Node first = new Node();
    private final Node last = new Node();

    public StringLinkedList2() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node currentElement = first.next;
        int currentIndex = 0;

        while (currentElement != null && currentElement != last) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }

}
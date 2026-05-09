package level14;

//Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять в него элементы. У тебя есть класс StringLinkedList, в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
//Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
//
//  Подсказки:
//
//Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента до последнего, так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
//Метод add должен создавать новый объект класса Node, в который он поместит переданное значение. Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную, а новосозданная станет последней.
//Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
//Метод printAll создан для debug и в проверке не участвует.

public class StringLinkedList {
    private final Node first = new Node();
    private final Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
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

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
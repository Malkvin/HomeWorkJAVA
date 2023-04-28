// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
package HW4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
public class task4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> MyLinkedList = getRandomNumber(10, 5);
        int sum = getSumElemList(MyLinkedList);
        System.out.print("Cозданный LinkedList: ");
        System.out.println(MyLinkedList);
        System.out.printf("Cумма : %d\n", sum);
    }

    static LinkedList<Integer> getRandomNumber(int size, int upperBond) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random ri = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(ri.nextInt(upperBond));
        }
        return linkedList;
    }

    static int getSumElemList(LinkedList<Integer> linkedList) {
        Iterator<Integer> iteratorList = linkedList.iterator();
        int total = 0;
        while(iteratorList.hasNext()) {
            int item = iteratorList.next();
            total+=item;
        }
        return total;
    }
}


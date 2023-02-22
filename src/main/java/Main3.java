import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.ListIterator;

public class Main3 {
    // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
    public static List<String> newColorList() {
        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("red");
        colorList.add("white");
        return colorList;
    }

    // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;
    }

    // 3. Вставить элемент в список в первой позиции.
    public static List<String> addList(List<String> list) {
        list.add(0, "yellow");
        return list;
    }

    // 4. Извлечь элемент (по указанному индексу) из заданного списка.
    public static String getList(List<String> list) {
        return list.get(3);
    }

    // 5. Обновить определенный элемент списка по заданному индексу.
    public static List<String> replacElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), secondElement);
        return list;
    }

    // 6. Удалить третий элемент из списка.
    public static List<String> removeList(List<String> list) {
        list.remove(2);
        return list;
    }

    // 7. Поиска элемента в списке по строке.
    public static boolean searchElementList(List<String> list, String element) {
        if (list.contains(element))
            return true;
        else
            return false;
    }


    // 10. Сортировка списка.
    public static List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;
    }

}
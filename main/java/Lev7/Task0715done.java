package Lev7;

import java.util.ArrayList;

/*
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
 */
public class Task0715done {
  public static void main(String[] args) {
    ArrayList<String> List = new ArrayList<String>();
    List.add(0,"мама");
    List.add(1,"мыла");
    List.add(2,"раму");
    for (int i = 0; i < List.size(); i++) {
      if (List.get(i) != "именно"){
        List.add(i+1, "именно");}
    }
    for (int i =0; i< List.size(); i++){
    System.out.println(List.get(i));
    }
  }
}

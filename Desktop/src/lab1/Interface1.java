package lab1;
import java.util.Scanner;
/** 
 * Класс интерфейс для запуска и демонстрации работы ContArray.
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class Interface1 {

	public static void main(String[] args) {
		/**
		 * @value a - создание нового объекта типа ContArray
		 */ 
		ContArray a = new ContArray();
		String f = "a";
		do
		{
			System.out.println("Добавить элемент - 1\nПолучить элемент - 2\nУдалить элемент - 3\nВывести все элементы - 4");
			Scanner cons = new Scanner(System.in);
			int t = cons.nextInt();
			switch (t)
			{
			/**
			 * Кейс добавления элемента
			 */ 
			case 1:
			{
				System.out.print("Введите элемент, который хотите добавить: ");
				int x = cons.nextInt();
				a.add(x);
				break;
			}
			/**
			 * Кейс получения элемента
			 */ 
			case 2:
			{
				System.out.print("Введите индекс элемента, который хотите получить: ");
				int i = cons.nextInt();
				System.out.println(a.get(i));
				break;
			}
			/**
			 * Кейс удаления элемента {@link ContArray#del}
			 */ 
			case 3:
			{
				System.out.print("Введите индекс элемента, который хотите удалить: ");
				int i = cons.nextInt();
				a.del(i);
				break;
			}
			/**
			 * Кейс вывода всех элементов
			 */ 
			case 4:
			{
				System.out.println(a.to_string());
				break;
			}
			}
			System.out.println("Продолжить - a, выйти - q.");
			Scanner cons2 = new Scanner(System.in);
			f = cons2.nextLine();
		} 
		while (f.equals("a"));
	}
}

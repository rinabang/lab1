package lab1;
/** 
 * Класс контейнер, позволяющий хранить произвольное количество объектов.
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ContArray {
	/** Поле текущего вектора значений */
	int[] elem;
	/** Поле общего кол-ва элементов */
	private int n;
	/** Поле текущего кол-ва элементов */
	int current;
	 /** 
     * Конструктор - создание нового объекта
     */
	ContArray() {
		elem = new int[1];
		n = 1;
    }
	/**
     * Метод добавления элемента {@link ContArray#elem}
     * @param x - элементы
     */
	public void add(int x) {
		if (current == n) {
            int[] temp = new int[2*n]; 
            for (int i = 0; i < n; i++) {
                temp[i] = elem[i];
            }
            n *= 2;
            elem = temp;
        }
        elem[current] = x;
        current++;
    }
	/**
     * Метод получения элемента {@link ContArray#elem}
     * @return возвращает элемент по заданному индексу
     * @param index - индекс
     */
	public int get(int index) {
		return elem[index];
	}
	/**
     * Метод удаления элемента {@link ContArray#elem}
     * @param index - индекс
     */
	public void del(int index) {
		for (int i = index; i < current - 1; i++) {
            elem[i] = elem[i + 1];
        }
		current--;
	}
	/**
     * Функция вывода контейнера
     * @return возвращает в виде строки содержимое контейнера
     */
    String to_string(){
        String str = "";
        for (int i = 0; i < current; i++)
            str += elem[i] + " ";
        return str;
    }
}

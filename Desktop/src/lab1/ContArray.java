package lab1;
/** 
 * ����� ���������, ����������� ������� ������������ ���������� ��������.
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class ContArray {
	/** ���� �������� ������� �������� */
	int[] elem;
	/** ���� ������ ���-�� ��������� */
	private int n;
	/** ���� �������� ���-�� ��������� */
	int current;
	 /** 
     * ����������� - �������� ������ �������
     */
	ContArray() {
		elem = new int[1];
		n = 1;
    }
	/**
     * ����� ���������� �������� {@link ContArray#elem}
     * @param x - ��������
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
     * ����� ��������� �������� {@link ContArray#elem}
     * @return ���������� ������� �� ��������� �������
     * @param index - ������
     */
	public int get(int index) {
		return elem[index];
	}
	/**
     * ����� �������� �������� {@link ContArray#elem}
     * @param index - ������
     */
	public void del(int index) {
		for (int i = index; i < current - 1; i++) {
            elem[i] = elem[i + 1];
        }
		current--;
	}
	/**
     * ������� ������ ����������
     * @return ���������� � ���� ������ ���������� ����������
     */
    String to_string(){
        String str = "";
        for (int i = 0; i < current; i++)
            str += elem[i] + " ";
        return str;
    }
}

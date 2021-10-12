package lab1;
import java.util.Scanner;
/** 
 * ����� ��� ������� � ������������ ������ ContArray.
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class ContArrayDemonstration {

	public static void main(String[] args) {
		/**
		 * @value a - �������� ������ ������� ���� ContArray
		 */ 
		ContArray a = new ContArray();
		String f = "a";
		do
		{
			/**
			 * ���������� ��������
			 */ 
			System.out.println("�������� ������� - 1\n�������� ������� - 2\n������� ������� - 3\n������� ��� �������� - 4");
			Scanner cons = new Scanner(System.in);
			int t = cons.nextInt();
			switch (t)
			{
			/**
			 * ���� ���������� �������� {@link ContArray#add}
			 */ 
			case 1:
			{
				System.out.print("������� �������, ������� ������ ��������: ");
				int x = cons.nextInt();
				a.add(x);
				break;
			}
			/**
			 * ���� ��������� �������� {@link ContArray#get}
			 */ 
			case 2:
			{
				System.out.print("������� ������ ��������, ������� ������ ��������: ");
				int i = cons.nextInt();
				System.out.println(a.get(i));
				break;
			}
			/**
			 * ���� �������� �������� {@link ContArray#del}
			 */ 
			case 3:
			{
				System.out.print("������� ������ ��������, ������� ������ �������: ");
				int i = cons.nextInt();
				a.del(i);
				break;
			}
			/**
			 * ���� ������ ���� ��������� {@link ContArray#to_string}
			 */ 
			case 4:
			{
				System.out.println(a.toString());
				break;
			}
			}
			/**
			 * ���������� ��������
			 */
			System.out.println("���������� - a, ����� - q.");
			Scanner cons2 = new Scanner(System.in);
			f = cons2.nextLine();
		} 
		while (f.equals("a"));
	}
}
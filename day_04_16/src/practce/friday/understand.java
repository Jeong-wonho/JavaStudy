package practce.friday;

import java.util.HashSet;
import java.util.TreeSet;

public class understand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hash set �� tree set �ΰ����� �ִ�.
		/* set�� Ư¡�� �ߺ��� ���� �ʴ� ���̴�. �׸��� �ε����� �������� �ʴ´�.
		 * hash set�� tree set�� ���̴� ������ �����̴�. �� �� Ȯ���غ���*/
		
		HashSet<Integer> hash_set = new HashSet<Integer>();
		TreeSet<Integer> tree_set = new TreeSet<Integer>();
		
		
		for (int j = 0; j < 10; j++) {
			int i_value = (int)(Math.random()*10);
//			System.out.println(i_value);
			hash_set.add(i_value);
		}
//		System.out.println("-------------------");
		for (int j = 0; j < 10; j++) {
			int i_value = (int)(Math.random()*10);
//			System.out.println(i_value);
			tree_set.add(i_value);
		}
//		System.out.println(hash_set.size());
//		System.out.println(tree_set.size());
		/* �ߺ��� ���� �ʱ� ������ ���� �������� set �迭�� ����� �ʴ� ���� Ȯ�� �� �� �ִ� */
//		System.out.println("=======");
		for (Integer item : hash_set) {
//			System.out.println(item);
		}
//		System.out.println("======");
		for (Integer integer : tree_set) {
//			System.out.println(integer);
		}
		
		TreeSet<not> tree_class_set = new TreeSet<not>((x, y) -> {
			return x.count - y.count;
		});
		
		not no1 = new not();
		no1.count = 300;
		not no2 = new not();
		no2.count = 50;
		not no3 = new not();
		no3.count = 15;
		
		tree_class_set.add(no1);
		tree_class_set.add(no2);
		tree_class_set.add(no3);
		
		for (not not : tree_class_set) {
			System.out.println(not.count);
		}
		System.out.println(tree_class_set);
		
		
	}

}

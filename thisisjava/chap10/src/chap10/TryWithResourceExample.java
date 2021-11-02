package chap10;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}

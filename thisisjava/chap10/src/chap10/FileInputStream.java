package chap10;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file + "�� �ݽ��ϴ�.");
	} //AutoCloseable�� �ݵ�� �����ؾ�, resources�� �۵��� ! �߿�!
}

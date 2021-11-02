package chap10;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file + "을 닫습니다.");
	} //AutoCloseable을 반드시 구현해야, resources가 작동함 ! 중요!
}

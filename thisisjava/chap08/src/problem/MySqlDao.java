package problem;

public class MySqlDao implements DataAccessObject {
	String db = "MySql DB";
	@Override
	public void select() {
		System.out.println(db + "에서 검색");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(db + "에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(db + "에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(db + "에서 삭제");
	}

}

package problem;

public class OracleDao implements DataAccessObject {
	String db = "Oracle DB";
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(db + "���� �˻�");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(db + "���� ����");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(db + "���� ����");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(db + "���� ����");
	}
	
}

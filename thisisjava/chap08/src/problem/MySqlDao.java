package problem;

public class MySqlDao implements DataAccessObject {
	String db = "MySql DB";
	@Override
	public void select() {
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

package doo.know;

public class Student {
	/* 1.�ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ�
	 * 2.�л� ������ �Ѹ� �߰� �� ������ ī��Ʈ��
	 * => while()�� ����� ��� �߰��� ������ �����, ��ҹ��� ������� y�̸� ��� ��ü �߰�,
	 * Ű����� �� �Է� �޾� �����
	 * 3. Ű����� 3���� �л� ������ ��¹޾�, �� ��ü�� ������
	 * 4. ���� �Էµ� �л����� ����� ���Ͽ� �����
	 * 5.���� ��ϵ� �л����� ��� ������ �����
	 * �ʵ�� �г�, ��, �̸�, ��������, ��������, ��������
	 */
	int grade;
	int group;
	String name;
	int kor_score;
	int eng_score;
	int math_score;
	
	public Student(int grade, int group, String name, int kor_score, int eng_score, int math_score) {
		super();
		this.grade = grade;
		this.group = group;
		this.name = name;
		this.kor_score = kor_score;
		this.eng_score = eng_score;
		this.math_score = math_score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor_score() {
		return kor_score;
	}

	public void setKor_score(int kor_score) {
		this.kor_score = kor_score;
	}

	public int getEng_score() {
		return eng_score;
	}

	public void setEng_score(int eng_score) {
		this.eng_score = eng_score;
	}

	public int getMath_score() {
		return math_score;
	}

	public void setMath_score(int math_score) {
		this.math_score = math_score;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", group=" + group + ", name=" + name + ", kor_score=" + kor_score
				+ ", eng_score=" + eng_score + ", math_score=" + math_score + "]";
	}

	
	
	
	
}

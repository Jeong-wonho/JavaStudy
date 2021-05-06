package doo.know;

public class Student {
	/* 1.최대 10명의 학생 정보를 기록할 수 있게 배열을 할당
	 * 2.학생 정보가 한명씩 추가 될 때마다 카운트함
	 * => while()문 사용함 계속 추가할 것인지 물어보고, 대소문자 관계없이 y이면 계속 객체 추가,
	 * 키보드로 값 입력 받아 기록함
	 * 3. 키보드로 3명의 학생 정보를 출력받아, 각 객체에 저장함
	 * 4. 현재 입력된 학생들의 평균을 구하여 출력함
	 * 5.현재 기록된 학생들의 모든 정보를 출력함
	 * 필드는 학년, 반, 이름, 국어점수, 영어점수, 수학점수
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

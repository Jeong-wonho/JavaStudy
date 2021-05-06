package day_04_21;



public class A extends As {
	
	As as = null;
	String[] name = {"한경직", "신사임당", "김삼문"};
	int[] age = {25, 36, 52};
	String[] addr = {"서울", "부산", "대전"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"남자", "여자", "남자"};
	
	public A() {
		
	}
	public A(int i) {
//		as = new As();
//		as.setName(name[i]);
//		as.setAge(age[i]);
//		as.setAddr(addr[i]);
//		as.setCp(cp[i]);
//		as.setSex(sex[i]);
//		System.out.println(as.getName());
		setName(name[i]);
		setAge(age[i]);
		setAddr(addr[i]);
		setCp(cp[i]);
		setSex(sex[i]);
		getList();
	}
}



package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정",  10);
		
		//cellPhone으로부터 상속받은 필드
		System.out.println("모델:"  + dmbCellPhone.model);
		System.out.println("색상:"  + dmbCellPhone.color);
		
		//dmbcellphone의 필드
		System.out.println("채널:" + dmbCellPhone.channel);
		
		//CellPhone 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//dmbcellphone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}

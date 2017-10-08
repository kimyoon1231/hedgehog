package javaPractice;

// 정석 6-2
public class S6_2_SutdaCard {
	int num;
	boolean isKwang;

	public S6_2_SutdaCard() {
		this(1, true); // default constructor
	}

	public S6_2_SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info() {
		return num + (isKwang ? "K" : "");
		// return num + if(isKwang == true ) {"K"} : 불가 !
	}
}


//
//public class SutdaCardEx {
//
//	public static void main(String[] args) {
//
//		SutdaCardEx c1 = new SutdaCardEx(3, false);
//		SutdaCardEx c2 = new SutdaCardEx();
//		
//		System.out.println(c1.info());
//		System.out.println(c2.info());
//		
//	}
//}
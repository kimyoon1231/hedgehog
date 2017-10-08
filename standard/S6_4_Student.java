package javaPractice;
//standard 6-4
public class S6_4_Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5) / 10f;
	}
}

// 236 / 3 => 78 
// 236 / 3f => 78.666664 
// 236 / 3f * 10  => 786.66664 
// 236 / 3f * 10 + 0.5 => 787.16664 
// (int)(236 / 3f * 10 + 0.5) => (int)787.16664 => 787
// (int)(236 / 3f * 10 + 0.5) / 10 => 78 
// (int)(236 / 3f * 10 + 0.5) / 10f => 78.7


//public class StudentEx {
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "hong";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("name : " + s.name);
//		System.out.println("sum : " + s.getTotal());
//		System.out.println("avg : " + s.getAverage());
//	}
//}

package project0416;

class Student {
	// 1. 인스턴스변수 선언
	private String studentNum;

	// 2. 생성자(필드, 기본)
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	// 3. getter / setter
	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode(); // String 재정의된 hashCode() 호출
	} // -> 문자열이 같으면 같은 hashCode값을 가지도록 재정의가 되어있음

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student std) {
			return std.getStudentNum().equals(this.studentNum);
		}
		return false;
	}

}

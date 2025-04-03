package project0403;

public class Account2 {
	private String ano;
	private String name;
	private int bal;
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public Account2(String ano, String name, int bal) {
		super();
		this.ano = ano;
		this.name = name;
		this.bal = bal;
	}
	public Account2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

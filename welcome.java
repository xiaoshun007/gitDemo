public class welcome {
	private String str;
	
	public welcome() {
		
	}
	
	public setStr(String str) {
		this.str = str;
	}
	
	public getStr() {
		return this.str;
	}
	
	public static void main(Sring[] args) {
		system.out.println("hello world!");
		
		Welcome w = new Welcome();
		w.getStr();
		
		w.setStr("123");
		
		Welcome w1 = new Welcome();
		w1.setStr("456");
	}
}
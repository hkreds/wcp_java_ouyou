package chapter5;

public class Chapter5 {
	
	public static void main(String[] args) {
		A a = new A(){
			//{}の中にメソッドを追加します。
			//クラスAのhelloメソッドをオーバーライドします。
			@Override
			public String hello() {
				//"Hello B!"を返します。
				return "Hello B!";
			}
		};
		System.out.println(a.hello());
		B b = new B() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}

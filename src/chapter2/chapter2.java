package chapter2;

public class chapter2 {
	public static void main(String[] args) {
		Dessert apple = Dessert.APPLE;
		Dessert iceCream = Dessert.ICE_CREAM;
		Dessert cake = Dessert.CAKE;

		System.out.println(apple);
		System.out.println(iceCream);
		System.out.println(cake);
		
		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.getPrice());
		System.out.println(Dessert.CAKE.getPrice());
		
		Dessert.APPLE.advertise(); // 「まっかなりんごが100円！」と出力
		Dessert.ICE_CREAM.advertise(); // 「夏にぴったりアイスクリームが200円！」と出力
		Dessert.CAKE.advertise(); // 「皆大好き甘いケーキが300円！」と出力
	}
}

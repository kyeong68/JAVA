package extends_;

public class AnimalGenerator {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
		Birds ani2 = new Birds();
		Mammalia ani3 = new Mammalia();
		Fish ani4 = new Fish();
		
		
		// 상속장점 1 : 중복되는 코드를 줄일수 있다.
		ani1.show();
		ani2.show();
		ani3.show();
		
		ani4.breath();
		ani4.move();
		ani4.show();
		
		
		// 상속장점 2 : 사람의 논리를 그대로 코드로 옮길수 있다.
		Animal ani5 = new Birds(); 
		Animal ani6 = new Mammalia(); // 포유류는 하나의 동물이다.
		Animal ani7 = new Fish(); // 물고기는 하나의 동물이다.
		
		Animal[] aniArr = new Animal[10];
        aniArr[0] = ani1; 
        aniArr[1] = ani2; 
	//	ani5.fly(); // upcasting 되서 fly없다고 판단함.
	//	(Birds)ani5.fly(); // upcasting 되서 fly없다고 판단함.
		
	//	Animal ani5 = (Animal)ani2;
		Birds ani8 = (Birds)ani5;
		ani8.fly();
		
		
		Sparrow sdsd = new Sparrow();
		Penguin pen = new Penguin();
		Cat cat = new Cat();
		
		
		Animal[] animalFarm = new Animal[7];
		
		Animal bat = new Birds(); 
		Animal ayou = new Cat(); 
		Animal spr = new Sparrow(); 
		Animal whale = new Whale();

		animalFarm[0] = bat;
		animalFarm[1] = ayou;
		animalFarm[2] = bat;
		animalFarm[3] = spr;
		animalFarm[4] = whale;
		animalFarm[5] = ani6;
		animalFarm[6] = ani7;
		
		
		for(Animal x : animalFarm) {
			x.shouting();
		}
//		
//		sdsd.shouting();
//		pen.shouting();
//		cat.shouting();
//		pen.shouting();
//		
		
		
		
		
	}

}

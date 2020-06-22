package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		ani[0] = new Dog("블루","골드리트리버",78);
		ani[1] = new Cat("레드", "뭉치", "서울", "빨강");
		ani[2] = new Dog("가을","마티즈", 4);
		ani[3] = new Dog("여름", "시츄", 5);
		ani[4] = new Cat("봄", "도둑", "부산", "주황");
		
		
		for(Animal anis : ani) {
			anis.speak();
		}
		
	}

}

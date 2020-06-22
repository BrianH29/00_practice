package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		ani[0] = new Dog("���","��帮Ʈ����",78);
		ani[1] = new Cat("����", "��ġ", "����", "����");
		ani[2] = new Dog("����","��Ƽ��", 4);
		ani[3] = new Dog("����", "����", 5);
		ani[4] = new Cat("��", "����", "�λ�", "��Ȳ");
		
		
		for(Animal anis : ani) {
			anis.speak();
		}
		
	}

}

package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {
	public static void main(String[] args) {
		
		SmartPhone[] ph = new SmartPhone[2];
		
		ph[0] = new GalaxyNote9();
		ph[1] = new V40();
		
		for(SmartPhone sph : ph) {
			sph.printMaker();
			sph.makeaCall();
			sph.takeaCall();
			sph.touch();
			sph.charge();
			sph.picture();
			
			System.out.println();
		}
		
	
	}

}

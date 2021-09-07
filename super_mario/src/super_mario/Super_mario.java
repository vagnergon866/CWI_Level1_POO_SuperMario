package super_mario;

public class Super_mario {

	public static void main(String[] args) {
		
		Mario mario = new Mario("Mario", 40, 1.60);
		
		Luigi luigi = new Luigi("Luigi", 38, 1.80 );
		
		Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);
		
		mario.caracteristicas();
		mario.crescer();
		mario.caracteristicas();
		
		System.out.println("--------");
		
		luigi.caracteristicas();
		luigi.crescer();
		luigi.caracteristicas();
		
		System.out.println("--------");
		
		yoshi.caracteristicas();
		yoshi.crescer();
		yoshi.caracteristicas();
		
		System.out.println("--------");
		
		mario.saltar();
		luigi.saltar();
		yoshi.saltar();
		
		System.out.println("--------");
		
		mario.saltar(3);
		luigi.saltar(2);
		yoshi.saltar(10);
		
	}

}

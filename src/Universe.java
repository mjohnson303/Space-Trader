import java.awt.Point;
import java.io.Serializable;

/**
 * Class will represent the universe
 * @author LoveIsLikeSand
 * @version 1.0
 *
 */ 
public class Universe implements Serializable{	
	private String[] names = {"Omicron Percei 8","Traal", "Somolia", "LaBeanville", "Omega", "Utopia", "SanatAUniverse", "Epsilon 4", "College Park", "Midtown", "New Somolia", "Tokyo 2.0", "Lawrencia", "Gotham", "People's United Space Federation", "Skrillex", "Neo-Rome", "Dreamland", "Best Place Ever", "Disney", "Oberon"};
	
	/**
	 * - 0 ANARCHY
	 * - 1 COMMUNISM
	 * - 2 DEMOCRACY (CAPATALISM)
	 * - 3 MONARCHY
	 * - 4 THEOCRACY 
	 */
	private int[] govts = {0,2,0,4,3,1,2,2,3,1,2,3,2,4,1,0,4,3,0,2,3};
	
	/**
	 * - 0 NOSPECIALRESOURCES (the most common)
	 * - 1 Land is made of sugar
	 * - 2 Land is diabetic
	 * - 3 Warlike
	 * - 4 Hippies
	 * - 5 Land is made of heroin
	 * - 6 Too many junkies
	 * - 7 Too many doctors
	 * - 8 Too many malpractice suits
	 * - 9 Planet is Pluto
	 * - 10 Planet is made of plastic
	 * - 11 Indie game studios
	 * - 12 EA studios owns planet
	 * - 13 Too much water
	 * - 14 Desert
	 */
	//private int[] resources = {(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),(int)(Math.random() * 14),0,7,0,8,0,9,11,0,14,13,0};
	
	/**
	 * - 0 Pre-Agriculture

		- 1 Agriculture

		- 2 Medieval

		- 3 Renaissance

		- 4 Early Industrial

		- 5 Industrial

		- 6 Post-Industrial

		- 7 Hi-Tech

	 */
	
	//private int[] tech = {0,1,6,0,4,7,7,3,1,6,7,2,5,6,7,6,2,7,0,3,3};
	
	
	private Point[] points = {new Point(10,10),new Point(50,325),new Point(100,400),new Point(300,230),new Point(150,300),new Point(265,260),new Point(187,340),new Point(295,325),new Point(350,280),new Point(30,350), new Point(50, 440), new Point(230, 540), new Point(530, 240),new Point(160, 560),new Point(460, 270),new Point(230, 480),new Point(535, 490), new Point(325, 325),new Point(225, 157),new Point(439, 240),new Point(180, 327)};
	private int noOfSystems = 20;
	private SolarSystem[] uni = new SolarSystem[noOfSystems];
	
	
 
	
	/**
	 * Constructor for Universe
	 */
	public Universe(){
		uni[0] = new SolarSystem(names[0],govts[0],(int)(Math.random()*14),7,new Point(265,142));
		for(int i=1;i<noOfSystems;i++){
			uni[i]= new SolarSystem(names[i],govts[i],(int)(Math.random()*14),(int)(Math.random() * 7),assignPoints(govts[i]));
		}
	}
	
	/**
	 * Returns an array of the SolarSystems in this Universe
	 * @return uni
	 */
	public SolarSystem[] getSystems(){
		return uni;
	}
	
	public Point assignPoints(int gov){
		Point p = null;	
		int radius = (6-gov)*40;
		//500, 325
		while(!isValid(p)){
			p = generateNewPoint(radius);
		}
		return p;
	}
	
	public Point generateNewPoint(int radius){
		Point p;
		double randNum = Math.random()*(2*Math.PI);
		int x = (int)(radius*Math.sin(randNum)+uni[0].getPoint().x);
		int y = (int)(radius*Math.cos(randNum)+uni[0].getPoint().y);
		
		return p = new Point(x,y);
	}
	
	public boolean isValid(Point p){
		if(p != null && (p.x >= 0 && p.x <= 590 && p.y >= 0 && p.y <= 300)){
			for(int i = 0;uni[i] != null && i < uni.length-1; i++){
				if((Math.abs(uni[i].getPoint().x - p.x) < 60 && Math.abs(uni[i].getPoint().y - p.y) < 60)){
					return false;	
				}
			}
			return true;
		}else
			return false;
	}
	
}

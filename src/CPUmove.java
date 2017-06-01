import java.util.Random;

public class CPUmove {
	int x;
	public int[] cpuList = new int[4];
	
	int x1;
	int x2;
	int y1;
	int y2;
	
	public CPUmove(int x){
		this.x = x;
	}
	
	public int[] computerRandom(){
		boolean validmove = false;
		Random rand = new Random();
		while(!validmove){
		
		
		x1 = rand.nextInt(x) + 1;
		x2 = rand.nextInt(x) + 1;
		y1 = rand.nextInt(x) + 1;
		y2 = rand.nextInt(x) + 1;
		
		if (x1 != x2 && y1 != y2){
		validmove = true;
		}		
		
		cpuList[0] = x1;
		cpuList[1] = x2;
		cpuList[2] = y1;
		cpuList[3] = y2;
		
		} return cpuList;
	}
} 
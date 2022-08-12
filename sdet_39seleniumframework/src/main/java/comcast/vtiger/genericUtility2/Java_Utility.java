package comcast.vtiger.genericUtility2;

import java.util.Random;

public class Java_Utility {
	
	/**
	 * This method is used for 
	 * 
	 * @author Muneera
	 */
	
	public int getRandomNum()
	{
		Random ran=new Random();
		int RanNum= ran.nextInt(1000);
		return RanNum;

}
}
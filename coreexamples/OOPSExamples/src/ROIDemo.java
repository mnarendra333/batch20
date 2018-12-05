
public class ROIDemo {
	
	
	static String[] bankNames = {"hdfc","axis","city"};
	
	public int getROI(String bankName){
			
		int roi = 0;
		if("hdfc".equals(bankName))
			roi =  12;
		else if("axis".equals(bankName))
			roi =  10;
		
		return roi;
		
	}
	
	private static boolean  verifyBankExistance(String bankName) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (String bank : bankNames) {
			if(bank.equals(bankName)){
				flag = true;
				break;
			}
		}
		
		return flag;
	}

	public int getROI(String bankName, String stateName){
		
		
		int roi = 0;
		if("hdfc".equals(bankName) && "AP".equals(stateName))
			roi =  8;
		else if("axis".equals(bankName) && "TN".equals(stateName))
			roi =  9;
		
		return roi;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ROIDemo obj = new ROIDemo();
		
		boolean isPresent = verifyBankExistance("axissss");
		if(isPresent)
		{
			int roi = obj.getROI("axis","TN");
			System.out.println("roi is "+roi);
		}else
		{
			System.out.println("invalid bank");
		}
		
	}

}

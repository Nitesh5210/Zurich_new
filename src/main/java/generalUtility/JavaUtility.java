package generalUtility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility
{
	//access specifier modifier name returntype method_name(parameters if any)
	
	/**
	 * @param number1 
	 * @author DIVYASIDDAPPA
	 * this process provides the randomnumber within the range of integer datatype
	 * 
	 * 
	 */
	
	public int randomnumber(int number1)
	{
		return new Random().nextInt(number1);
		
	}
	
	//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * @author DIVYASIDDAPPA
	 * this process provides the randomnumber within the range of long datatype
	 * @param number2 
	 * 
	 * 
	 */
	public long longrandomnumber(long number2)
	{
		return new Random().nextLong(number2);
	}
	
	//access specifier modifier name returntype method_name(parameters if any)
		/**
		 * @author DIVYASIDDAPPA
		 * this process provides the randomnumber within the range of double datatype
		 * @param number3 
		 * 
		 * 
		 */
		public double doublerandomnumber(double number3)
		{
			return new Random().nextDouble(number3);
		}
		
		//access specifier modifier name returntype method_name(parameters if any)
				/**
				 * @author DIVYASIDDAPPA
				 * this process provides the randomnumber within the range of double datatype
				 * @param number5
				 * 
				 * 
				 */
				public String shortrandomnumber(String number5)
				{
					return new Random().toString();
				}
				
				/**
				 * @param strategy 
				 * @param data 
				 * @return 
				 * @return 
				 * 
				 * 
				 * 
				 */
				public Object converttoanydatatype(EnumUtility1 strategy, String data)
				{
				Object obj = null;
					if(strategy.toString().equalsIgnoreCase("long"))
					{
					obj = Long.parseLong(data);
					}else if(strategy.toString().equalsIgnoreCase("int"))
					{
						obj= Integer.parseInt(data);
					}else if(strategy.toString().equalsIgnoreCase("double"))
					{
						obj= Double.parseDouble(data);
					}
					return obj;
				}
//				public void arraylistcomparison(String arrtobecompared, String newfetchedarray)
//				{
//				ArrayList<String> arname1= new ArrayList<String>();
//				for (int i = 0; i <= arrtobecompared.length();)
//				{
//					if (!Arrays.asList(newfetchedarray).contains(arrtobecompared [i]))
//					{
//						ar112.add(ar10[i]);
//						System.out.println("the table is compared and same as the excel details");
//						break;
//					} else {
//						System.out.println("the table is compared but the details are not same as the excel details");
//						break;
//					}
//				}
//				
//				}
		
				public String currenttime()
				{
					Date date1 = new Date();
					SimpleDateFormat sf = new SimpleDateFormat("dd_MM_YYYY_hh_mm_sss");
					String actDate = sf.format(date1);
					return actDate;
				}
		
		
	
	
	
	
}

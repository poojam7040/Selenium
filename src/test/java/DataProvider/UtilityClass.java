package DataProvider;

import org.testng.annotations.DataProvider;

public class UtilityClass {

	
	
	  public static Object[] [] sender()
	  {
		  Object[][] obj= new Object[2][2] ;
		  
		  obj[0][0] = "morepooja7040@gmail.com" ;
		  obj[0][1] = "Pooja7040" ;
		  obj[1][0] = "morepooja123@gmail.com" ;
		  obj[1][1] = "pooja13" ;

		  return obj ;
	  }
	  
	  
	  public static Object[] [] shopperStackLogin()
	  {
		  Object[][] obj= new Object[2][2] ;
		  
		  obj[0][0] = "morepooja7040@gmail.com" ;
		  obj[0][1] = "Pooja7040" ;
		  obj[1][0] = "morepooja123@gmail.com" ;
		  obj[1][1] = "pooja13" ;

		  return obj ;
	  }
	  
	  
	  
}

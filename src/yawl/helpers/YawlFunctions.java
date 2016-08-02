package yawl.helpers;

import yawl.Place;
import yawl.TypeOfC;
import yawl.TypeOfCondition;

public class YawlFunctions {

	public static boolean isStartPlace (Place place){
	
		
		TypeOfCondition conditionType =	place.getType();
		
		if (conditionType == null) {
			return false;
		}
		
		else if (conditionType.getText()== TypeOfC.START){
			return true;
		}
		
		
		return false;
			
	}
	
	
}

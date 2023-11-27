package buisinessCalculation;

import org.springframework.stereotype.Component;

@Component
public class MYSQLDataService implements DataService{
	public int[] retriveData() {
		return new int[] {1,2,3,4,5,6};
		
	}
}

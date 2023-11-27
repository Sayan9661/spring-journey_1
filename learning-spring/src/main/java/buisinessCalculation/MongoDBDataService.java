package buisinessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{
	public int[] retriveData() {
		return new int[] {11,22,33,44,55,66};
		
	}
}

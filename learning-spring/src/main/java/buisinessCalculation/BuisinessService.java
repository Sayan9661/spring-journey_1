package buisinessCalculation;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BuisinessService{
	
	private DataService ds;
	
	public BuisinessService(DataService ds) {
		super();
		this.ds = ds;
	}

	public int findMax() {
		
		return Arrays.stream(ds.retriveData()).max().orElse(0);
	}
}

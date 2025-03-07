package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Finance.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());

	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateDataWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(200000.0);;
		});
	}
	
	@Test
	public void setIncomeShouldUpdateDataWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setIncome(3000.0);
		
		Assertions.assertEquals(3000.0, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1000.0);
		});
	}
	
	
	@Test
	public void setMonthsShouldUpdateDataWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(90);
		
		Assertions.assertEquals(90, f.getMonths());
	}
	
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(40);
		});
	}
	
	@Test
	public void entryShouldcalculateEntryCorretly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaShouldcalculateQuotaCorretly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

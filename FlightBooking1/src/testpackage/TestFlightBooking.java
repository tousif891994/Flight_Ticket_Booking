package testpackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import pagepackage.BookTicket;
@Listeners(CustomListner.class)
public class TestFlightBooking extends BaseTest {
	
	@Test
	public void testFlightBooking() throws InterruptedException
	{
		BookTicket bt=new BookTicket(driver); 
		bt.book_Flight_Ticket();
	}
	

}

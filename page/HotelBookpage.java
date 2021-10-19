package org.page;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HotelBookpage extends BaseClass{
	public HotelBookpage() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(name="username")
		private WebElement username;
		@FindBy(name="password")
		private WebElement password;
		@FindBy(name="login")
	    private WebElement clicklogin;
	    @FindBy(name="location")
	    private WebElement location;
	    @FindBy(name="hotels")
	    private WebElement hotelname;
	    @FindBy(name="room_type")
	    private WebElement roomtype;
	    @FindBy(name="room_nos")
	    private WebElement numberofrooms;
	    @FindBy(name="datepick_in")
	    private WebElement checkin;
	    @FindBy(name="datepick_out")
	    private WebElement checkout;
	    @FindBy(name="adult_room")
	    private WebElement adultnumber;
	    @FindBy(name="child_room")
	    private WebElement childnumber;
	    @FindBy(name="Submit")
	    private WebElement submit;
	    @FindBy(name="radiobutton_0")
	    private WebElement clickbutton;
	    @FindBy(name="continue")
	    private WebElement clickcontinue;
	    @FindBy(name="first_name")
	     private WebElement firstname;
	    @FindBy(name="last_name")
	    private WebElement lastname;
	    @FindBy(name="address")
	    private WebElement address;
	    @FindBy(name="cc_num")
	    private WebElement ccnumber;
	    @FindBy(name="cc_type")
	    private WebElement cctype;
	    @FindBy(name="cc_exp_month")
	    private WebElement ccexpmonth;
	    @FindBy(name="cc_exp_year")
	 private WebElement ccexpyear;
	    @FindBy(name="cc_cvv")
	private WebElement cvv;
	    @FindBy(name="book_now")
	    private WebElement boook;
	    @FindBy(name="order_no")
	    private WebElement ordernumber;
	    @FindBy(name="my_itinerary")
	    private WebElement myitinery;
	    @FindBy(name="ids[]")
	    private WebElement checkbox;
	    @FindBy(name="cancelall")
	    private WebElement cancelselected;
	    @FindBy(name="order_id_text")
	    private WebElement typeorderid;
	    @FindBy(name="search_hotel_id")
	    private WebElement searchid;
	    public WebElement getsearchid() {
	    	return searchid;
	    }
	    public WebElement getorderid() {
			return typeorderid;
	    }
	    public WebElement getcancelselected() {
	    	return cancelselected;
	    }
	    public WebElement getcheckbox() {
	    	return checkbox;
	    }
	    
	    public WebElement getmyitinery() {
	    	return myitinery;
	    }
	    public WebElement getusername() {
	    	return username; 
	    }
	    public WebElement getpassword() {
	    	return password;
	    }
	    public WebElement getclicklogin() {
	    	return clicklogin;
	    }
	    public WebElement getlocation() {
	    	return location;
	    }
	    public WebElement gethotelname() {
	    	return hotelname;
	    }
	    public WebElement getroomtype() {
	    	return roomtype;
	    }
	    public WebElement getnumberofrooms() {
	    	return numberofrooms;
	    }
	    public WebElement getcheckin() {
	    	return checkin;
	    }
	    public WebElement getcheckout() {
	    	return checkout;
	    }
	    public WebElement getadultnumber() {
	    	return adultnumber;
	    }
	    public WebElement getchildnumber() {
	    	return childnumber;
	    }
	    public WebElement getsubmit() {
	    	return submit;
	    }
	    public WebElement getclickbutton() {
	    	return clickbutton;
	    }
	    public WebElement getclickcontinue() {
	    	return clickcontinue;
	    }
	    public WebElement getfirstname() {
	    	return firstname;
	    }
	    public WebElement getlastname() {
	    	return lastname;
	    }
	    public WebElement getaddress() {
	    	return address;
	    }
	    public WebElement getccnumber() {
	    return ccnumber;
	    }
	    public WebElement getcctype() {
	    	return cctype;
	    }
	    public WebElement getccexpmonth() {
	    	return ccexpmonth;
	    }
	    public WebElement getccexpyear() {
	    	return ccexpyear;
	    }
	    public WebElement getcvv() {
	    	return cvv;
	    }
	    public WebElement getboook() {
	    	return boook;
	    }
	    public WebElement getordernumber() {
	    	return ordernumber;
	    }
	    
	    
	    
	    
	    
	}




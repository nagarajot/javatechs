package in.codersclub.javatechs.dom;

import java.sql.Date;

public class ZodiacSign
{
	private String zodiacSign;
	private java.sql.Date startDate;
	private java.sql.Date endDate;

	public ZodiacSign(String zodiacSign, Date startDate, Date endDate) {
		super();
		this.zodiacSign = zodiacSign;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	public java.sql.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}

	public java.sql.Date getEndDate() {
		return endDate;
	}

	public void setEndDate(java.sql.Date endDate) {
		this.endDate = endDate;
	}

}




package in.codersclub.javatechs.servlets;

public class CookieData
{
	private String cookieName;
	private String cookieValue;

	public CookieData(String cookieName, String cookieValue) {
		super();
		this.cookieName = cookieName;
		this.cookieValue = cookieValue;
	}

	public String getCookieName() {
		return cookieName;
	}
	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}
	public String getCookieValue() {
		return cookieValue;
	}
	public void setCookieValue(String cookieValue) {
		this.cookieValue = cookieValue;
	}
}




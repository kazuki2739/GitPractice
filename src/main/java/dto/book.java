package dto; 

public class book {
	private int id;
	private String name;
	private String tyosha;
	private String shuppan;
	private String isbn;
	private String loginID;
	private String salt;
	private String pw;
	private String hashedPW;
	public book(int id, String name, String tyosha, String shuppan, String isbn, String loginID, String salt, String pw,
			String hashedPW) {
		super();
		this.id = id;
		this.name = name;
		this.tyosha = tyosha;
		this.shuppan = shuppan;
		this.isbn = isbn;
		this.loginID = loginID;
		this.salt = salt;
		this.pw = pw;
		this.hashedPW = hashedPW;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTyosha() {
		return tyosha;
	}
	public void setTyosha(String tyosha) {
		this.tyosha = tyosha;
	}
	public String getShuppan() {
		return shuppan;
	}
	public void setShuppan(String shuppan) {
		this.shuppan = shuppan;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getHashedPW() {
		return hashedPW;
	}
	public void setHashedPW(String hashedPW) {
		this.hashedPW = hashedPW;
	}
	
}
package edu.just.model;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private String tel;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", tel=" + tel + ", email=" + email + "]";
	}

	public User(Integer id, String userName, String password, String tel,
			String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.tel = tel;
		this.email = email;
	}

	public User() {
		super();
	}
	
    
}
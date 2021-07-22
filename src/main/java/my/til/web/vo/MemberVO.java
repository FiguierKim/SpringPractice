package my.til.web.vo;

import my.til.web.util.MyException;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String msg;

	public String getId() {
		return id;
	}

	public void setId(String id) throws MyException {
		if (id != null) {
			this.id = id;
		} else {
			throw new MyException("id가 입력되지 않았습니다");
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) throws MyException {
		if (pw != null) {
			this.pw = pw;
		} else {
			throw new MyException("pw가 입력되지 않았습니다");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws MyException {
		if (name != null) {
			this.name = name;
		} else {
			throw new MyException("name가 입력되지 않았습니다");
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

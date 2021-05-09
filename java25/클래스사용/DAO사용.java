package 클래스사용;

import 클래스만들기.MemberDAO;

public class DAO사용 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		dao.create("apple","apple","apple");
		dao.delete("apple");

	}

}

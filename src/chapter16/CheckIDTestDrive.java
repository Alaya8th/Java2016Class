package chapter16;

import java.util.*;

public class CheckIDTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckID obj1 = new CheckID();
		System.out.print("請輸入身份證號碼：");
		Scanner scn = new Scanner(System.in);
		String id = scn.next();
		char ch =id.charAt(0);
		ch = Character.toUpperCase(ch);
		id = String.valueOf(ch)+id.substring(1);
		boolean isValid = false;
		int idMod = 0;
		idMod = Integer.parseInt(id)/10;
		if(idMod == Integer.parseInt(String.valueOf(id.charAt(9)))){
			System.out.println("此身份證號碼是正確的!");			
		}
		else{
			System.out.println("此身份證號碼是正確的!");
		}
	}
}

class CheckID {
	private String id;

	public void setID(String value) {
		id = value;
	}

	public void check() {

	}
}
package chapter16;

import java.util.*;

public class CheckIDTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckID obj1 = new CheckID();
		System.out.print("�п�J�����Ҹ��X�G");
		Scanner scn = new Scanner(System.in);
		String id = scn.next();
		char ch =id.charAt(0);
		ch = Character.toUpperCase(ch);
		id = String.valueOf(ch)+id.substring(1);
		boolean isValid = false;
		int idMod = 0;
		idMod = Integer.parseInt(id)/10;
		if(idMod == Integer.parseInt(String.valueOf(id.charAt(9)))){
			System.out.println("�������Ҹ��X�O���T��!");			
		}
		else{
			System.out.println("�������Ҹ��X�O���T��!");
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
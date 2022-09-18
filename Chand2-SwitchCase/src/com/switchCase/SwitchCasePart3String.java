package com.switchCase;

public class SwitchCasePart3String {

	public static void main(String[] args) {
		// float x= 1.0f; is not working
		String name = "Team";
		// now if Upper and lower case is use in switch case we can do one thing
		switch (name.toLowerCase()) {
		case "author":
	//	case "chand":
			System.out.println("Chand Sheikh");
			break;
		case "editor":
	//	case 'B':
			System.out.println("Salim and Manohar");
			break;
		case "team":
	//	case 'C':
			System.out.println("Easy Study");
			break;
		default:
			System.out.println("Invalid Inputs ");
		}
	}
}

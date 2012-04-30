package edu.ncu.oolab;

import java.util.Scanner;

public class Agile {

	public static void showFinishMsg() {
		;
	}

	public static void showWelcomeMsg() {
		;
	}

	public static void showCommandPrompt() {
		;
	}

	public static void showGrade() {
		;
	}

	public static void showRank() {
		;
	}

	public static Boolean isID(String token) {
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ask user input, ID or Q <- [1]
		// if Q, then
		//     showFinishMsg and quit
		// else if ID, then
		//     showWelcomeMsg
		//     showCommandPrompt: G for grade, R for rank, W for Weight, Q for quit <- [2]
		//     if user input Q
		//         showFinishMsg and quit
		//     else if G
		//         showGrade( ID )
		//         go to [2]
		//     else if R
		//         showRank( ID )
		//         go to [2]
		//     else if W
		//         show old weight
		//         wait for user input new weight
		//         go to [2]
		//     else
		//         show "command `user input` is wrong!"
		//     end if
		// else
		//     show "ID `user input` is wrong!"
		//     go to [1]
		// end if
		Scanner cin = new Scanner(System.in);
		System.out.println("Type ID or Q (quit program)?");
		String line = cin.nextLine();
		if (line.equals("Q")) {
			showFinishMsg();
			System.exit(0);
		} else if (isID(line)) {
			showWelcomeMsg();
			while (true) {
				showCommandPrompt();
				line = cin.nextLine();
				if (line.equals("Q")) {
					showFinishMsg();
					System.exit(0);
				} else if (line.equals("G")) {
					showGrade();
				} else if (line.equals("R")) {
					showRank();
				} else if (line.equals("W")) {
					;
				} else {
					;
				}
			}
		}
	}

}

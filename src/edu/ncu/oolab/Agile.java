package edu.ncu.oolab;

public class Agile {

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
		CommandLineInterface cli = new CommandLineInterface();
		cli.execute();
	}

}

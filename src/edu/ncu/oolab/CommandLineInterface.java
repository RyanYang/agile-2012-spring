package edu.ncu.oolab;

import java.util.Scanner;

public class CommandLineInterface {
	
	Scanner cin_;
	
	public CommandLineInterface() {
		this.cin_ = new Scanner(System.in);
	}
	
	public void execute() {
		try {
			this.promptID();
		} catch (NoSuchIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.promptCommand();
		} catch (NoSuchCommandException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.showFinishMsg();
	}
	
	private Boolean checkID( String id ) {
		return null;
	}
	
	private void promptCommand() throws NoSuchCommandException {
		while (true) {
			// TODO
			System.out.println("Type ID or Q (quit program)?");
			String line = this.cin_.nextLine();
			if (line.equals("Q")) {
				this.showFinishMsg();
				break;
			} else if (line.equals("G")) {
				this.showGrade();
			} else if (line.equals("R")) {
				this.showRank();
			} else if (line.equals("W")) {
				this.updateWeights();
			} else {
				throw new NoSuchCommandException();
			}
		}
	}
	
	private void promptID() throws NoSuchIDException {
		System.out.println("Type ID or Q (quit program)?");
		String line = this.cin_.nextLine();
		if (line.equals("Q")) {
			this.showFinishMsg();
			System.exit(0);
		} else if (!this.checkID(line)) {
			throw new NoSuchIDException();
		} else {
			this.showWelcomeMsg();
		}
	}
	
	private void updateWeights() {
		this.showOldWeights();
		this.getNewWeights();
		this.setWeights();
	}

	private void showWelcomeMsg() {
		;
	}

	private void showFinishMsg() {
		;
	}

	private void showGrade() {
		;
	}

	private void showRank() {
		;
	}
	
	private void showOldWeights() {
		;
	}
	
	private void getNewWeights() {
		;
	}
	
	private void setWeights() {
		;
	}

}

package edu.ncu.oolab;

import java.util.Scanner;

public class CommandLineInterface {
	
	Scanner cin_;
	GradeSystem gs_;
	
	public CommandLineInterface() {
		/**
		 *  This is a CommandLineInterface constructor.
		 */
		this.cin_ = new Scanner(System.in);
		this.gs_ = new GradeSystem();
	}
	
	public void execute() {
		try {
			this.promptID();
			this.promptCommand();
		} catch (NoSuchIDException e) {
			System.err.println("ID does not exists.");
		} catch (NoSuchCommandException e) {
			System.err.println("No such command.");
		}
		this.showFinishMsg();
	}
	
	private Boolean checkID(String id) {
		return this.gs_.selectByID(id);
	}
	
	private void promptCommand() throws NoSuchCommandException {
		while (true) {
			System.out.println("輸入指令:");
			System.out.println("	1) G 顯示成績(Grade)");
			System.out.println("	2) R 班上排名(Rank)");
			System.out.println("	3) W 設定配分(Weight)");
			System.out.println("	4) Q 結束使用(Quit)");
			String line = this.cin_.nextLine();
			if (line.equals("Q")) {
				break;
			} else if (line.equals("G")) {
				this.gs_.showGrade();
			} else if (line.equals("R")) {
				this.gs_.showRank();
			} else if (line.equals("W")) {
				this.updateWeights();
			} else if (line.equals("")) {
				// do nothing
			} else {
				throw new NoSuchCommandException();
			}
		}
	}
	
	private void promptID() throws NoSuchIDException {
		System.out.println("輸入 ID 或 Q (結束使用)?");
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
		Double[] weights = this.getNewWeights();
		this.gs_.setWeights(weights);
	}

	private void showWelcomeMsg() {
		System.out.printf("Welcome! %s.\n", this.gs_.getUserName());
	}

	private void showFinishMsg() {
		System.out.println("Bye!");
	}
	
	private void showOldWeights() {
		Double[] weights = this.gs_.getWeights();
		System.out.println("舊配分:");
		System.out.printf("Lab1\t%.0f ", weights[0] * 100.0);
		System.out.println();
		System.out.printf("Lab2\t%.0f", weights[1] * 100.0);
		System.out.println();
		System.out.printf("Lab3\t%.0f", weights[2] * 100.0);
		System.out.println();
		System.out.printf("Mid Term Exam\t%.0f", weights[3] * 100.0);
		System.out.println();
		System.out.printf("Final Exam\t%.0f", weights[4] * 100.0);
		System.out.println();
	}
	
	private Double[] getNewWeights() {
		System.out.println("輸入新配分:");
		Double[] weights = new Double[5];
		System.out.printf("Lab1:");
		weights[0] = this.cin_.nextDouble() / 100.0;
		System.out.printf("Lab2:");
		weights[1] = this.cin_.nextDouble() / 100.0;
		System.out.printf("Lab3:");
		weights[2] = this.cin_.nextDouble() / 100.0;
		System.out.printf("Mid Term Exam:");
		weights[3] = this.cin_.nextDouble() / 100.0;
		System.out.printf("Final Exam:");
		weights[4] = this.cin_.nextDouble() / 100.0;
		return weights;
	}

}

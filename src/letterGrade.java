import java.util.Scanner;

public class letterGrade {
	public static char letterGrade(int score) {
		char grade;
		if (score <0 || score > 100)
			grade = 'X';
		else if (score>=90 && score <=100)
			grade = 'A';
		else if (score>=80 && score <90)
			grade = 'B';
		else if (score>=70 && score <80)
			grade = 'C';
		else if (score>=60 && score <70)
			grade = 'D';
		else
			grade ='F';
		return grade;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
			int score;
			String exit;
			System.out.print("�п�J���Z:");
			score=scn.nextInt();
			System.out.println(score+" transfers the score to a letter grade is "+letterGrade(score));
			System.out.print("�аݬO�_�n�����{��?(Y/N):");
			exit=scn.next();
			if(exit.equals("Y"))
				break;
		}
	}
}

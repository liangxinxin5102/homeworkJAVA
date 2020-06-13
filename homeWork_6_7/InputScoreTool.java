package homeWork_6_7;

import java.util.Scanner;

public class InputScoreTool {
	DeleteScoreTool delScoreTool;
	InputScoreTool(DeleteScoreTool deleteScoreTool){
		this.delScoreTool= deleteScoreTool;
	}
	public void inputScore() {
		System.out.println("��������ί����\n");
		Scanner read = new Scanner(System.in);
		int count = read.nextInt();
		System.out.println("�����������\n");
		double a[]  = new double[count];
		for(int i=0;i<count;i++) {
			a[i] =read.nextDouble(); 
		}
		 delScoreTool.deleteScore(a);
	}
}

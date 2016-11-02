package SelfLearning;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Circle {

	static Tempo match = new Tempo();
	public static int res;

	public static void main(String[] args) throws IOException {
		for (int learningSteps = 0; learningSteps < 20; learningSteps++) {
			Random r = new Random();
            int life = 5;
			while(life > 0 && life < 10) {
				int ccard = r.nextInt(4) + 1;
				int pcard = r.nextInt(4) + 1;
				System.out.println("Ccard= " + ccard + "  Pcard= " + pcard);
				Step st = new Step();
				int choise;
				choise = st.choise(ccard, pcard);
				System.out.println("Choise: " + choise);
				if (choise == 1) {
					life += (pcard - ccard);
					System.out.println("Ходимо, життя стає: " + life);
				} else
					System.out.println("Щит");

				match.tempoadd(ccard, pcard, choise);
				System.out.println("Додаємо в темп данні: " + ccard + " " + pcard + " " + choise);

			}
			if (life <= 0) {
				res = -1;
				System.out.println("Result bad");
			} else {
				res = 1;
				System.out.println("Res good");
			}
			match.temporec(match.tempogive(), res);
		}
	}
}

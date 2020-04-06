package backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Backtracking_2580 {
	static int n = 9;
	static int[][] sudoku = new int[n + 1][n + 1];
	static ArrayList<Point> Points = new ArrayList<>();

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strings;
		for (int i = 1; i <= n; i++) {
			strings = br.readLine().split(" ");
			for (int j = 1; j <= strings.length; j++) {
				sudoku[i][j] = Integer.parseInt(strings[j - 1]);
				if (sudoku[i][j] == 0) {
					Points.add((new Point(j, i)));
				}
			}
		}
		recursive(0);
	}

	static void recursive(int index) {
		if (index == Points.size()) {
			printSudoku();
			System.exit(0);
		} else {
			Point current = (Point) Points.get(index);
			for (int i = 1; i <= 9; i++) {
				if (checkSudoku(current.x, current.y, i)) {
					sudoku[current.y][current.x] = i;
					recursive(index + 1);
					sudoku[current.y][current.x] = 0;
				}
			}
		}
	}

	static boolean checkSudoku(int x, int y, int value) {
		boolean check = true;

		for (int i = 1; i <= n; i++) {
			if (sudoku[y][i] == value) return check = false;
		}

		for (int i = 1; i <= n; i++) {
			if (sudoku[i][x] == value) return check = false;
		}

		for (int ty = ((y - 1) / 3) * 3 + 1; ty < ((y - 1) / 3) * 3 + 4; ty++) {			
			for (int tx = ((x - 1) / 3) * 3 + 1; tx < ((x - 1) / 3) * 3 + 4; tx++) {				
				if (sudoku[ty][tx] == value) check = false;
			}
		}

		return check;
	}

	static void printSudoku() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

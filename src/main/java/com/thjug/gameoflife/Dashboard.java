/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thjug.gameoflife;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author nuboat
 */
public class Dashboard {

	private static final int LOW = 1;
	private static final int HIGH = 100;

	private final int len;
	private boolean[][]printboard;

	public Dashboard(final int len) {
		this.len = len;
		printboard = new boolean[len][len];
	}

	public boolean[][] getBoard() {
		return printboard;
	}

	public void random() {
		final Random r = new Random();

		for (int i=0; i<len; i++) {
			for (int j=0; j<len; j++) {
				printboard[i][j] = (r.nextInt(HIGH-LOW) + LOW) % 2 == 1;
			}
		}
	}

	public void render() {
		for (int i=0; i<len; i++) {
			for (int j=0; j<len; j++) {
				if (printboard[i][j]) {
					System.out.print("[*]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}

		for (int i=0; i<len*3; i++) {
			System.out.print("_");
		}

		System.out.println();
	}

	public void update() {

		final boolean[][] newboard = new boolean[len][len];

		for (int i=0; i<len; i++) {
			for (int j=0; j<len; j++) {
				newboard[i][j] = Check.isAlive(printboard, i, j);
			}
		}

		printboard = Arrays.copyOf(newboard, len);
	}

}

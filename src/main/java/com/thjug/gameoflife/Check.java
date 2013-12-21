/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thjug.gameoflife;

/**
 *
 * @author nuboat
 */
public class Check {

	private static boolean isDead(final boolean[][] board, final int x, final int y) {

		int count = 0;

		for (int i = y - 1; i <= y + 1; i++) {
			for (int j = x - 1; j <= x + 1; j++) {
				if (i == y && j == x) {
					continue;
				}

				if (i >= 0 && j >= 0 && i < board.length && j < board.length) {
					if (board[i][j]) {
						count++;
					}
				}
			}
		}

		return !(count == 2 || count == 3);
	}

	private static boolean isReborn(final boolean[][] board, final int x, final int y) {

		int count = 0;

		for (int i = y - 1; i <= y + 1; i++) {
			for (int j = x - 1; j <= x + 1; j++) {
				if (i == y && j == x) {
					continue;
				}

				if (i >= 0 && j >= 0 && i < board.length && j < board.length) {
					if (board[i][j]) {
						count++;
					}
				}
			}
		}
		return count == 3;
	}

	public static boolean isAlive(final boolean[][] board, final int x, final int y) {
		if (board[x][y]) {
			return !isDead(board, x, y);
		} else {
			return isReborn(board, x, y);
		}
	}

}

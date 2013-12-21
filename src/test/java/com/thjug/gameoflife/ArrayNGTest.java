/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thjug.gameoflife;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class ArrayNGTest {

	private static final boolean T = true;
	private static final boolean F = false;

	@Test
	public void testLength() {
		final boolean[][] printboard =
		{ {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		System.out.println("Length: " + printboard.length);
	}

	@Test
	public void testStatus() {
		final boolean[][] printboard =
		{ {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {T,F,F,F,F,F,F,F,F},
		};

		System.out.println("Status: " + printboard[0][8]);
	}

}

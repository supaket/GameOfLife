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
public class CheckNGTest {

	private static final boolean T = true;
	private static final boolean F = false;

	@Test
	public void testMiddleWithoutFriend() {
		final boolean[][] printboard =
		{ {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,T,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		boolean expResult = false;
		boolean result = Check.isAlive(printboard, 3, 3);

		assertEquals(result, expResult);
	}

	@Test
	public void testTopLeftWithoutFriend() {
		final boolean[][] printboard =
		{ {T,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		boolean expResult = false;
		boolean result = Check.isAlive(printboard, 0, 0);

		assertEquals(result, expResult);
	}

	@Test
	public void testTopRightWithoutFriend() {
		final boolean[][] printboard =
		{ {F,F,F,F,F,F,F,F,T},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		boolean expResult = false;
		boolean result = Check.isAlive(printboard, 8, 0);

		assertEquals(result, expResult);
	}

	@Test
	public void testBottonLeftWithoutFriend() {
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

		boolean expResult = false;
		boolean result = Check.isAlive(printboard, 0, 8);

		assertEquals(result, expResult);
	}

	@Test
	public void testBottonrightWithoutFriend() {
		final boolean[][] printboard =
		{ {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,T},
		};

		boolean expResult = false;
		boolean result = Check.isAlive(printboard, 8, 8);

		assertEquals(result, expResult);
	}

	@Test
	public void topLeftSpotDeadWithTwoFriends() {
		final boolean[][] printboard =
		{ {T,T,F,F,F,F,F,F,F},
		  {T,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		boolean expResult = true;
		boolean result = Check.isAlive(printboard, 0, 0);
		assertEquals(result, expResult);
	}

	@Test
	public void topRebornWithTwoFriends() {
		final boolean[][] printboard =
		{ {T,T,T,F,F,F,F,F,F},
		  {F,T,T,F,F,F,F,F,F},
		  {F,T,T,F,F,F,F,F,F},
		  {T,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		  {F,F,F,F,F,F,F,F,F},
		};

		boolean expResult = true;
		boolean result = Check.isAlive(printboard, 0, 0);
		assertEquals(result, expResult);
	}

}

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
public class DashboardNGTest {

	@Test
	public void testRandom() {
		final Dashboard instance = new Dashboard(9);
		instance.random();
	}

	//@Test
	public void testRender() {
		final Dashboard instance = new Dashboard(9);
		instance.random();
		instance.render();

		for (int i=0; i<9*3; i++) {
			System.out.print("=");
		}

		System.out.println();
	}

	@Test
	public void testRun3Times() {
		final Dashboard instance = new Dashboard(9);
		instance.random();

		instance.render();

		instance.update();
		instance.render();

		instance.update();
		instance.render();

		instance.update();
		instance.render();
	}

}

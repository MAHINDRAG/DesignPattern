package com.app.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.Plan;
import com.app.impl.DomesticPlan;

public class PlanTest {
	Plan plan = new DomesticPlan();
	int units = 50;

	@Test
	public void test() {
		plan.getRate();
		assertEquals(175,plan.calculateBill(units));  
	}

}

package com.training.bms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlstromAppApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(190, 190);
	}

	@Test
	public void testSendMessage() {
		Message message = new Message();
		assertEquals("Hello OFSS!!!", message.getMessage());
	}
}

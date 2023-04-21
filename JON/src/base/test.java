package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testSolicitarPermiso() {
		assertEquals(false, Principal.solicitarPermiso(20));
		assertEquals(true, Principal.solicitarPermiso(90));
	}

}

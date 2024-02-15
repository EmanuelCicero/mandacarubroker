package com.mandacarubroker;

import com.mandacarubroker.domain.stock.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MandacarubrokerApplicationTests {

	@Test
	void checkExchangePrice(){
		double amount = 100;
		boolean increase = true;

		Stock changePrice = new Stock();

		changePrice.changePrice(amount, increase);

		Assertions.assertEquals(100, changePrice.changePrice(amount, increase));
	}

}

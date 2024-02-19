package com.mandacarubroker;

import com.mandacarubroker.controller.StockController;
import com.mandacarubroker.domain.stock.Stock;
import com.mandacarubroker.service.StockService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
class MandacarubrokerApplicationTests {

	@Mock
	private StockService stockService;


	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void checkExchangePrice(){
		double amount = 100;
		boolean increase = false;

		Stock changePrice= new Stock();

		changePrice.changePrice(amount, increase);

		Assertions.assertEquals(100,changePrice.changePrice(amount, increase));
	}
	@Test
	void testSet(){
		List<Stock> stocks = new ArrayList<>();
		stocks.add(new Stock("1","AFF5","Banco do Brasil SA",100));
		stocks.add(new Stock("2","AAD5","Banco Itaú",200));

		StockController stockController = new StockController(stockService);
		when(stockService.getAllStocks()).thenReturn(stocks);
		stockController.getAllStocks();

		Assertions.assertEquals(stocks.size(),stocks.size());
	}

}

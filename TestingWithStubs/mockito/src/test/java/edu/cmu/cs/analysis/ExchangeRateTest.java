package edu.cmu.cs.analysis;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ExchangeRateTest {

  @Mock private ExchangeRate exchangeRate;

  @Test
  public void getRate() {
    MockitoAnnotations.initMocks(this);

    Mockito.when(exchangeRate.getRate("USD", "EUR")).thenReturn(2.0/3);

    Currency testObject = new Currency(3.75, "USD");
    Currency expected = new Currency(2.50, "EUR");

    Currency actual = testObject.toEuros(exchangeRate);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getRateInDollars() {
    MockitoAnnotations.initMocks(this);

    Mockito.when(exchangeRate.getRate("EUR", "USD")).thenReturn(1.5);

    Currency testObject = new Currency(2.50, "EUR");
    Currency expected = new Currency(3.75, "USD");

    Currency actual = testObject.toDollars(exchangeRate);
    Assert.assertEquals(expected, actual);
  }
}
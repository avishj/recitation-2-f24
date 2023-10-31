package edu.cmu.cs.analysis;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

public class ExchangeRateTest {

  @Test
  public void getRate() {
    Currency testObject = new Currency(2.50, "USD");
    Currency expected = new Currency(3.75, "EUR");

    ExchangeRate mock = EasyMock.createMock(ExchangeRate.class);
    EasyMock.expect(mock.getRate("USD", "EUR")).andReturn(1.5);
    EasyMock.replay(mock);

    Currency actual = testObject.toEuros(mock);
    Assert.assertEquals(expected, actual);
  }
}

package lesson5;

public class Euro implements Currency{
    float balance;
    FakeCantor conversion;
    float addedValue;

    @Override
    public Euro addedCurrency(float value, String currency) {
        this.conversion = new FakeCantor();
        this.addedValue = value/this.conversion.euroToRate(currency);
        return null;
    }

    @Override
    public Euro subtractedCurrency(float value, String currency) {
        return null;
    }

    @Override
    public String abbreviation() {
        return null;
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public String balance() {
        return null;
    }

    @Override
    public float toDollarExchangeRate() {
        return 0;
    }

}

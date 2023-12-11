public class CalcServiceBiz implements ICalcService {

    @Override
    public NumberDTO add(NumberDTO number) {
        double result = number.getNum1() + number.getNum2();
        number.setResult(floorToTwoDecimals(result));
        return number;
    }

    @Override
    public NumberDTO sub(NumberDTO number) {
        double result = number.getNum1() - number.getNum2();
        number.setResult(floorToTwoDecimals(result));
        return number;
    }

    @Override
    public NumberDTO mul(NumberDTO number) {
        double result = number.getNum1() * number.getNum2();
        number.setResult(floorToTwoDecimals(result));
        return number;
    }

    @Override
    public NumberDTO div(NumberDTO number) {
        double result = number.getNum1() / (double) number.getNum2();
        number.setResult(floorToTwoDecimals(result));
        return number;
    }

    @Override
    public NumberDTO mod(NumberDTO number) {
        double result = number.getNum1() % number.getNum2();
        number.setResult(floorToTwoDecimals(result));
        return number;
    }

    private double floorToTwoDecimals(double value) {
        return Math.floor(value * 100) / 100;
    }
}

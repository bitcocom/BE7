public class CalcController {
    private ICalcService service;
    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        NumberDTO number = new NumberDTO();
        CalcView view = new CalcView();

        while (true) {
            String op = view.inputNumber(number);

            if (op.equalsIgnoreCase("E"))
                break;

            switch (op) {
                case "+":
                    number = service.add(number);
                    break;
                case "-":
                    number = service.sub(number);
                    break;
                case "*":
                    number = service.mul(number);
                    break;
                case "/":
                    if (number.getNum2() != 0) {
                        number = service.div(number);
                        break;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                case "%":
                    if (number.getNum2() != 0) {
                        number = service.mod(number);
                        break;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                default:
                    System.out.println("잘못된 연산자입니다.");
                    continue;
            }
            view.printResult(number, op);
        }
    }
}


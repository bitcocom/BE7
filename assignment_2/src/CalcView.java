import java.util.Scanner;

public class CalcView {
    private Scanner scan = new Scanner(System.in);

    public String inputNumber(NumberDTO number) {
        String op = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.print("두 수와 연산자를 입력하세요.(ex: 6 7 +): ");
            String input = scan.nextLine();
            String[] inputs = input.split(" ");

            if (inputs.length != 3) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            } else {
                try {
                    number.setNum1(Integer.parseInt(inputs[0]));
                    number.setNum2(Integer.parseInt(inputs[1]));
                    op = inputs[2];

                    if (op.length() != 1) {
                        System.out.println("연산자는 하나의 문자여야 합니다. 다시 입력해주세요.");
                    } else {
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        }

        return op;
    }



    public void printResult(NumberDTO number, String op) {
        if (number != null) {
            switch (op) {
                case "+":
                    System.out.printf("두 수 %d와 %d의 add의 결과는 %.2f입니다.\n",
                            number.getNum1(), number.getNum2(), number.getResult());
                    break;
                case "-":
                    System.out.printf("두 수 %d와 %d의 sub의 결과는 %.2f입니다.\n",
                            number.getNum1(), number.getNum2(), number.getResult());
                    break;
                case "*":
                    System.out.printf("두 수 %d와 %d의 mul의 결과는 %.2f입니다.\n",
                            number.getNum1(), number.getNum2(), number.getResult());
                    break;
                case "/":
                    System.out.printf("두 수 %d와 %d의 div의 결과는 %.2f입니다.\n",
                            number.getNum1(), number.getNum2(), number.getResult());
                    break;
                case "%":
                    System.out.printf("두 수 %d와 %d의 mod의 결과는 %.2f입니다.\n",
                            number.getNum1(), number.getNum2(), number.getResult());
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    break;
            }
        }
    }
}


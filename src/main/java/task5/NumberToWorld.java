package task5;

public class NumberToWorld {

    private int number;
    private int absNumber;
    private StringBuilder stringBuilder;

    private static final String[] forFirstTen = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
            "девять"};
    private static final String[] forTens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] fromTenToTwenty = {"", "", "", "", "", "", "", "", "", "",
            "десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};

    private static final String[] forHundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"};

    public NumberToWorld(int number, StringBuilder stringBuilder) {
        this.number = number;
        this.absNumber = Math.abs(number);
        this.stringBuilder = stringBuilder;
    }

    public String getNumberLikeString() {

        int numberOfDigits;
        String numberLikeString;

        if (number == 0) {
            return "ноль";
        }
        if (number < 0) {

            String minus = "минус";
            stringBuilder.append(minus).append(" ");

            numberOfDigits = String.valueOf(Math.abs(number)).length();
            numberLikeString = getStringFromAbsNumber(numberOfDigits);

            return stringBuilder.append(numberLikeString).toString();

        } else {

            numberOfDigits = String.valueOf(number).length();
            numberLikeString = getStringFromAbsNumber(numberOfDigits);

            return stringBuilder.append(numberLikeString).toString();
        }
    }

    private String getStringFromAbsNumber(int numberOfDigits) {

        switch (numberOfDigits) {
            case 1:
                return getStringFromOneToNine();
            case 2:
                return getStringFromTenToNinetyNine();
            case 3:
                return getStringFromOneHundredToThousand();
            case 4:
                return getStringFromThousand();
            case 5:
                return getStringFromTenThousand();
            case 6:
                return getStringFromHundredThousand();
            case 7:
                return getStringFromMillion();
            default:
                return "This number is not supported!";
        }
    }

    private String getStringFromOneToNine() {
        int[] integers = getNumbers();
        return forFirstTen[integers[0]];
    }

    private String getStringFromTenToNinetyNine() {
        int index = absNumber;

        if (index > 9 && index < 21) {
            return fromTenToTwenty[index];
        } else {
            int ones = index % 10;
            int tens = index / 10;
            return forTens[tens] + " " + forFirstTen[ones];
        }
    }

    private String getStringFromOneHundredToThousand() {
        int[] integers = getNumbers();
        return forHundreds[integers[0]] + " " + forTens[integers[1]] + " " + forFirstTen[integers[2]];
    }

    private String getStringFromThousand() {
        int[] integers = getNumbers();
        String thousandOrThousands;

        if (integers[0] > 4) {
            thousandOrThousands = " тысяч ";
        } else if (integers[0] > 1 && integers[0] < 4) {
            thousandOrThousands = " тысячи ";
        } else thousandOrThousands = " тысяча ";

        return forFirstTen[integers[0]] +
                thousandOrThousands + forHundreds[integers[1]] + " " + forTens[integers[2]] + " " + forFirstTen[integers[3]];
    }

    private String getStringFromTenThousand() {

        int index = absNumber;
        int ones = index % 10;
        int tens = (index / 10) % 10;
        int hundred = (index / 100) % 10;
        int thousands = index / 1000;

        if (thousands > 9 && thousands < 21) {
            return fromTenToTwenty[thousands] +
                    " тысяч " + forHundreds[hundred] + " " + forTens[tens] + " " + forFirstTen[ones];
        } else {
            int tempOnes = thousands % 10;
            int tempTens = thousands / 10;
            return forTens[tempTens] + " " + forFirstTen[tempOnes] +
                    " тысяча " + forHundreds[hundred] + " " + forTens[tens] + " " + forFirstTen[ones];
        }
    }

    private String getStringFromHundredThousand() {
        int[] integers = getNumbers();

        return forHundreds[integers[0]] + " " + forTens[integers[1]] + " " + forFirstTen[integers[2]] + " тысяча " +
                forHundreds[integers[3]] + " " + forTens[integers[4]] + " " + forFirstTen[integers[5]];
    }

    private String getStringFromMillion() {
        int[] integers = getNumbers();

        return forFirstTen[integers[0]] + " " + "миллион" + " " + forHundreds[integers[1]] + " " +
                forTens[integers[2]] + " " + forFirstTen[integers[3]] + " " + "тысяч" + " "
                + forHundreds[integers[4]] + " " + forTens[integers[5]] + " " + forFirstTen[integers[6]];
    }

    private int[] getNumbers() {
        String digits = Integer.toString(absNumber);
        char[] charArray = digits.toCharArray();
        int[] integers = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            integers[i] = Character.getNumericValue(charArray[i]);
        }
        return integers;
    }
}


package calculator;

public class StringSplit {

    public int add(String input) {

        String delimiter = ",|:";  // 기본 구분자 설정 : , 또는 :
        String numbers = input;

        // 구분자를 기준으로 숫자 분리
        String[] tokens = numbers.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            sum += num;
        }

        return sum;
    }
}
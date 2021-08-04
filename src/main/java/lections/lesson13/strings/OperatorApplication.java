package lections.lesson13.strings;

public class OperatorApplication {

    public static void main(String[] args) {
        StringOperator sameStringOperator = s -> s;

        StringOperator reverseOperator = s -> new StringBuilder(s).reverse().toString();

        System.out.println(sameStringOperator.process("abcdef"));
        System.out.println(reverseOperator.process("abcdef"));
    }

}

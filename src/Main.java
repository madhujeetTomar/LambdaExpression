interface LambdaExpression {
    void foo();
}

@FunctionalInterface
interface LengthOfSring
{
    int stringLength(String string);

}

public class Main {

    public static void main(String[] args) {

        LambdaExpression lambdaExpression1 = new LambdaExpressionImplementation();
        lambdaExpression1.foo();

        LambdaExpression lambdaExpression = () -> System.out.println("My First lambda Example");
        lambdaExpression.foo();

        LengthOfSring lengthOfSring = s -> s.length();
       System.out.println(lengthOfSring.stringLength("My First lambda Example"));




    }


}

class LambdaExpressionImplementation implements LambdaExpression {

    @Override
    public void foo() {
        System.out.println("This is normal expression");
    }
}

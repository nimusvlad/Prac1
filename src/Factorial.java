public class Factorial {
    public static int factorial(int n)
    {
        int answer = 1;
        for (int i=2; i<=n; i++)
        {
            answer *= i;
        }
        return answer;
    }
}
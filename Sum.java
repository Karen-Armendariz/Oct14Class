package Oct14class;

public class Sum
{
    public static void main(String[] args)
    {
        Sum sum = new Sum();
        double result = sum.getSum(1.1, 4.5); // 1.1,2.1,3.1,4.1,4.5= 10.9
        System.out.println(result);
    }

    /** this method is going to compute the sum of numbers between num1 and num2 inclusive
     * @param num1
     * @param num2
     * @return
     */
    public double getSum(double num1, double num2) //1.2 to 4.5
            {
                double sum = 0.0;
                //num1 cannot go over num2
                //as long as num1 <=num2

                for (int i=0; i<=num2; i++) // i=0, 0<=4.5.
                {
                    if(num1<=num2)
                    {
                        sum += num1; //add 1.1 to sum.   sum = 0+1.1 = 1.1, then i=1 which is <=1.1 so 1.1+1=2.1.
                        num1++;     // add 1.1 to sum 1.1, sum=2.1
                    }
                }
                return sum;
            }
}

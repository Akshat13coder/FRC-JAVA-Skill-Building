package module05;

public class exercise2_5 {
    public static void main(String[] args) {
        float CP1 = 1000.0f;
        float lossAmount = 0.1f * CP1;
        float SP1 = CP1 - lossAmount;

        float CP2 = 1000.0f;
        float profitAmount = 0.2f * CP2;
        float SP2 = CP2 + profitAmount;

        float netCost = CP1 + CP2;
        float netRevenue = SP1 + SP2;
        float profitnet = netRevenue - netCost;
        System.out.printf("net profit is : %f\n", profitnet);
    }
}

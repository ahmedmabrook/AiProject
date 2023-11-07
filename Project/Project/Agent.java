public class Agent {
    private static int startBudget = 100000;
    private static boolean request = false;

    public static void RequestFood(int amount, int delay)
    {
            request = true;
            startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();
            
    }
    public static void RequestMaterials(int amount, int delay)
    {
            request = true;
            startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();

    }

    public static void RequestEnergy(int amount, int delay)
    {
            request = true;
            startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();

    }

    public static void WAIT()
    {
        if (request == true){
            startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();
        }else{
            System.out.println("no requests");
        }
    }

    public static void BUILD1(int priceBuildOne)
    {
        startBudget -= Town.getPriceBuild1() +Town.getFoodUseBUILD1() * Resources.getUnitPriceFood() + Town.getMaterialsUseBUILD1()* Resources.getUnitPriceMaterials()  + Town.getEnergyUseBUILD1()* Resources.getUnitPriceEnegry();
        Town.setProsperity(Town.getProsperity() + Town.getProsperityBUILD1());
    }
    public static void BUILD2()
    {

    }
    public static void main(String[] args) {
        RequestFood(50, 2);
    }
}

public class Operators {
    static int initialProsperity;
    static int initialFood;
    static int initialMaterials ;
    static int initialEnergy ;
    static int unitPriceFood ;
    static int unitPriceMaterials ;
    static int unitPriceEnergy ;
    static int amountRequestFood ;
    static int delayRequestFood ;
    static int amountRequestMaterials ;
    static int delayRequestMaterials ;
    static int amountRequestEnergy ;
    static int delayRequestEnergy ;
    static int priceBUILD1 ;
    static int foodUseBUILD1 ;
    static int materialsUseBUILD1 ;
    static int energyUseBUILD1 ;
    static int prosperityBUILD1 ;
    static int priceBUILD2 ;
    static int foodUseBUILD2 ;
    static int materialsUseBUILD2 ;
    static int energyUseBUILD2 ;
    static int prosperityBUILD2 ;

    private static int startBudget = 100000;
    private static boolean request = false;
    public static int delay1 = 0;


    // fillin the initial values and fill the values with the givens
    public static void parse (String initialState){
        String[] parts = initialState.split(";");
        if (parts.length == 8) {
            initialProsperity = Integer.parseInt(parts[0]);

            String[] initialFoodParts = parts[1].split(",");
            initialFood = Integer.parseInt(initialFoodParts[0]);
            initialMaterials = Integer.parseInt(initialFoodParts[1]);
            initialEnergy = Integer.parseInt(initialFoodParts[2]);

            String[] unitPriceFoodParts = parts[2].split(",");
            unitPriceFood = Integer.parseInt(unitPriceFoodParts[0]);
            unitPriceMaterials = Integer.parseInt(unitPriceFoodParts[1]);
            unitPriceEnergy = Integer.parseInt(unitPriceFoodParts[2]);

            String[] amountRequestFoodParts = parts[3].split(",");
            amountRequestFood = Integer.parseInt(amountRequestFoodParts[0]);
            delayRequestFood = Integer.parseInt(amountRequestFoodParts[1]);

            String[] amountRequestMaterialsParts = parts[4].split(",");
            amountRequestMaterials = Integer.parseInt(amountRequestMaterialsParts[0]);
            delayRequestMaterials = Integer.parseInt(amountRequestMaterialsParts[1]);

            String[] amountRequestEnergyParts = parts[5].split(",");
            amountRequestEnergy = Integer.parseInt(amountRequestEnergyParts[0]);
            delayRequestEnergy = Integer.parseInt(amountRequestEnergyParts[1]);

            String[] build1Parts = parts[6].split(",");
            priceBUILD1 = Integer.parseInt(build1Parts[0]);
            foodUseBUILD1 = Integer.parseInt(build1Parts[1]);
            materialsUseBUILD1 = Integer.parseInt(build1Parts[2]);
            energyUseBUILD1 = Integer.parseInt(build1Parts[3]);
            prosperityBUILD1 = Integer.parseInt(build1Parts[4]);

            String[] build2Parts = parts[7].split(",");
            priceBUILD2 = Integer.parseInt(build2Parts[0]);
            foodUseBUILD2 = Integer.parseInt(build2Parts[1]);
            materialsUseBUILD2 = Integer.parseInt(build2Parts[2]);
            energyUseBUILD2 = Integer.parseInt(build2Parts[3]);
            prosperityBUILD2 = Integer.parseInt(build2Parts[4]);

            // Now you have all the values assigned to their respective variables.
            // You can use these variables in your Java code as needed.
        } else {
            System.out.println("Invalid input format.");
        }
    }



    public static void RequestFood()
    {
            System.out.println(startBudget);
            startBudget -= unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            System.out.println(startBudget);
    }
    public static void RequestMaterials()
    {
            startBudget -= unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            System.out.println(startBudget);

    }

    public static void RequestEnergy()
    {
            startBudget -= unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            System.out.println(startBudget);

    }

    public static void WAIT()
    {
            startBudget -= unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            System.out.println(startBudget);

        // if (request == true){
        //     startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();
        // }else{
        //     System.out.println("no requests");
        // }
    }

    public static void BUILD1(int priceBuildOne)
    {
        startBudget -= priceBuildOne +foodUseBUILD1 * unitPriceFood + materialsUseBUILD1* unitPriceMaterials  + energyUseBUILD1* unitPriceEnergy;
        initialProsperity += prosperityBUILD1;
    }
    public static void BUILD2()
    {
        startBudget -= priceBUILD2 +foodUseBUILD2 * unitPriceFood + materialsUseBUILD2* unitPriceMaterials  + energyUseBUILD2* unitPriceEnergy;
        initialProsperity += prosperityBUILD2;
    }
    public static int getStartBudget() {
        return startBudget;
    }

    public static void setStartBudget(int startBudget) {
        Operators.startBudget = startBudget;
    }
    public static int getInitialProsperity() {
        return initialProsperity;
    }

    // Setter for 'initialProsperity'
    public static void setInitialProsperity(int prosperity) {
        initialProsperity = prosperity;
    }
    public static void main(String[] args) {
        System.out.println(LLAPSearch.getLLAPInitialState());
    }
}

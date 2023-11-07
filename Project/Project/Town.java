
import java.security.PrivateKey;
import java.util.*;
public class Town {

    private int prosperity;
    private Resources resources;
    private int amountRequestFood;
    private int delayRequestFood;
    private int amountRequestEnergy;
    private int delayRequestEnergy;
    private int amountRequestMaterials;
   private int delayRequestMaterials;
    private static int startBudget = 100000;
    private Build build1 ;
    private Build build2;


    public Town(int prosperity,Resources resources, int amountRequestFood ,
                int delayRequestFood , int amountRequestEnergy , int delayRequestEnergy,
                int amountRequestMaterials, int delayRequestMaterials, Build build1 , Build build2)
    {
        this.prosperity = prosperity;
        this.resources = resources;
        this.amountRequestEnergy = amountRequestEnergy;
        this.amountRequestFood = amountRequestFood;
        this.amountRequestMaterials = amountRequestMaterials;
        this.delayRequestEnergy=delayRequestEnergy;
        this.delayRequestFood = delayRequestFood;
        this.delayRequestMaterials = delayRequestMaterials;
        this.build1 = build1;
        this.build2 = build2;
    }


    public static void main(String[] args) {
        String init = "";
        Build build1 = new Build(50,50,
                                50,50,
                                50);
        Build build2 = new Build(50,50,
                                50,50,
                                50);
        Resources resources = new Resources(22, 22, 
                                            22, 70, 
                                            50, 60);
        Town t = new Town(50 , resources,
                            30 , 2 ,
                            19, 1 ,
                            15,1,
                            build1 , build2
                            );
        Actions.RequestEnergy(t.amountRequestEnergy,t.delayRequestEnergy);
        
    }
}

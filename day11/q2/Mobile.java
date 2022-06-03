package Day11.q2;

import Day11.Main;

public class Mobile {
   static String[] outdatedModels = {"note4","note5","note6","note7"};
    void searchOutdatedModel(String companyName,String ...model) {


        System.out.println(companyName);
         {
            for(int i=0;i<outdatedModels.length;i++){
                for(int j=0;j<model.length;j++){
                    if(outdatedModels[i].equals(model[j])){
                        System.out.println("company is: "+companyName+" model is: "+model[j]+"_OUTDATED");
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Mobile mob=new Mobile();
        mob.searchOutdatedModel("mi");
    }

}

package Day11.q3;

import java.util.Scanner;

public class Ipl {
    void homeTeamStadium(Stadium stadium){
        if(stadium==Stadium.CHIDAMBARAM_STADIUM){
            System.out.println("This is the home ground of CSK");
        }else if(stadium==Stadium.WANKHEDE_STADIUM){
            System.out.println("This is the home ground of Mumbai Indians");
        }else if(stadium==Stadium.M_CHINNASWAMY_STADIUM){
            System.out.println("This is the home ground of RCB");
        }else if(stadium==Stadium.EDEN_GARDENS_STADIUM){
            System.out.println("This is the home ground of KKR");
        }else if(stadium ==null){
            System.out.println("Enter the valid city");
        }
    }

    public static void main(String[] args) {
        Ipl ipl=new Ipl();
//        Stadium st=Stadium.CHIDAMBARAM_STADIUM;




            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter stadium name");
                String re = sc.next();
                Stadium s = Stadium.valueOf(re);
                ipl.homeTeamStadium(s);
            }
//            }catch (ArithmeticException ae){
//                System.out.println(ae.getMessage());
//                System.out.println("ae");
//            }
//            catch (NumberFormatException nu){
//                System.out.println(nu.getMessage());
//                System.out.println("nu");
//            }
//            catch (NullPointerException nul){
//                System.out.println(nul.getMessage());
//                System.out.println("nul");
//            }

            catch (Exception e){
//                System.out.println(e.getMessage());
                System.out.println("Pleas Enter the valid city");
            }

//        ipl.homeTeamStadium(Stadium.CHIDAMBARAM_STADIUM);
    }

}

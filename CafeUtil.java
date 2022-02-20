import java.util.ArrayList;

public class CafeUtil{

    public static int getStreakGoal(){
        
        int numWeeks=11;
        int appTest = 0;
        for (int i = 0; i < numWeeks; i++){
            appTest = appTest + i;
        }
        return appTest;
    }
    public int getStreakGoal( int numWeeks ){
        int appTest = 0;
        for (int i = 0; i <= numWeeks; i++){
            appTest = appTest + i;
        }
        return appTest;
        
    }

    public double getOrderTotal(double[] prices){
        
        double sum = 0;
        for (int a = 0; a < prices.length; a++){
            sum += prices[a];
        }
        return sum;
        
    }

    public void displayMenu(ArrayList<String> menu){

        for (int a = 0; a < menu.size(); a++){
            System.out.println(a+" "+menu.get(a));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Ingrese su nombre por favor");
        String userName = System.console().readLine();
        System.out.println("Hola " + userName);
        System.out.println("Hay " + customers.size() + " personas frente a ti" );
        customers.add( userName );
        System.out.println( customers );
    }





}

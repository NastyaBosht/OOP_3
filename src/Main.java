import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //searching transfer by weight of goods
    public static void Search(ArrayList<Transfer> transfers, double weight){
       for(int i=0; i<transfers.size();i++){
           if(transfers.get(i).max_weight > weight){
               transfers.get(i).Display();
           }
       }
    }

    //sort ArrayList by time and display fastest delivery
    public static void sort (ArrayList<Transfer> transfers) {
        double a;
        for (int i = 0; i < transfers.size() - 1; i++) {
            if (transfers.get(i).time > transfers.get(i + 1).time) {
                a = transfers.get(i).time;
                transfers.get(i).time = transfers.get(i + 1).time;
                transfers.get(i + 1).time = a;
                            }
        }
            transfers.get(0).Display();

    }

    public static void main(String[] args) {
        //creating ArrayList and objects
        ArrayList<Transfer> transfers = new ArrayList<>();
        Transfer t = new Transfer("Mykolaiv","Odessa",300,80,870);
        Transfer t_1 = new Transfer("Odessa","Kerch",670,70,500);
        Transfer t_2 = new Transfer("Kerch","Italy",800,75,945.1);

        transfers.add(t);
        transfers.add(t_1);
        transfers.add(t_2);
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Введіть вагу товару, який ви хочете перевозити ");
      double weight = scan.nextDouble();
      System.out.println("Список перевізників, які підлягають заданому параметру ");
      Search(transfers, weight);

      System.out.println("Посортований ArrayList ");
      sort(transfers);


    }
}

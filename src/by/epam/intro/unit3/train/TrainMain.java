package by.epam.intro.unit3.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainMain {
	public static void main(String[] args) throws IOException {
       TrainLogic trL = new TrainLogic();
       
		Train[] tr = new Train[5];
        tr[0] = new Train("Minsk");
        tr[1] = new Train("Gomel");
        tr[2] = new Train("Brest");
        tr[3] = new Train("Minsk");
        tr[4] = new Train("Vitebsk");

        System.out.println("------------Train's information------------");
        for (int i = 0; i <tr.length; i++) {
           trL.info( tr[i]);
        }
        
        System.out.println("--------------- Sort by numbers -------------");
        trL.sortByNum(tr);
        for (int i = 0; i <tr.length; i++) {
            trL.info( tr[i]);
         }
    // не работает
        /*
        System.out.println("--------------- Sort by destination -------------");
        trL.sortByDestination(tr);
        for (int i = 0; i <tr.length; i++) {
            trL.info( tr[i]);
         }
         */
        
        
       System.out.println("Insert train's number to get the information --> ");
        //чтение значений с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num=Integer.parseInt(str);
        trL.infoByNum(tr, num);  
       
       

}
	}

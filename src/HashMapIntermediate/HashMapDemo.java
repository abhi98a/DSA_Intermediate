package HashMapIntermediate;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        //Restaurant Menu
        //Wrapper Classes for all primitives
        HashMap<String,Integer> menu = new HashMap<>();

        menu.put("Burger",80);
        menu.put("pizza",100);
        menu.put("Drinks",70);
        menu.put("Noodles",90);
        menu.put("Egg",20);

        menu.remove("pizza");
        if(menu.containsKey("pizza")){
            System.out.println("Yes pizza is available in this restaurant at price = "+ menu.get("pizza"));
        }else{
            System.out.println("Stock is finished for pizza");
        }

        //Iterate over all key value pairs
        for(String key: menu.keySet()){
            System.out.println(key +"- "+ menu.get(key));
        }

    }
}

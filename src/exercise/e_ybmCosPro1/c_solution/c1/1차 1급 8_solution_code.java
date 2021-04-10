import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    interface DeliveryStore{
        public void set_order_list(String[] order_list);
        public int get_total_price();
    }
    
    class Food{
        public String name;
        public int price;
        public Food(String name, int price){
            this.name = name;
            this.price = price;
        }
    }
    
    class PizzaStore implements DeliveryStore {
        private ArrayList<Food> menu_list;
        private ArrayList<String> order_list;
        
        public PizzaStore(){
            //init menu_list
            menu_list = new ArrayList<Food>();
            String[] menu_names = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
            int[] menu_prices = {11100, 12600, 13300, 21000, 19500};
            for(int i = 0; i < 5; ++i)
                menu_list.add(new Food(menu_names[i], menu_prices[i]));
            
            //init order_list
            order_list = new ArrayList<String>();
        }
        
        public void set_order_list(String[] order_list){
            for(int i = 0; i < order_list.length; i++)
                this.order_list.add(order_list[i]);
        }
        
        public int get_total_price(){
            int total_price = 0;
            Iterator<String> iter = order_list.iterator();
            while (iter.hasNext()) {
                String order = iter.next();
                for(int i = 0; i < menu_list.size(); ++i)
                    if(order.equals(menu_list.get(i).name))
                        total_price += menu_list.get(i).price;
            }
            return total_price;
        }
    }
    
    public int solution(String[] order_list) {
        DeliveryStore delivery_store = new PizzaStore();
        
        delivery_store.set_order_list(order_list);
        int total_price = delivery_store.get_total_price();
        
        return total_price;
    }
}
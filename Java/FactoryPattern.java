package Java;

interface Food{
    public String getType();
}

class Pizza implements Food{
    @Override
    public String getType(){
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food{
    @Override
    public String getType(){
        return "Someone ordered a Dessert!";
    }

    class FoodFactory{
        public Food getFood(String order){
            if(order.compareTo("cake") == 0){
                return new Cake();
            }
          
            return new Pizza();
        }
    }
}

public class FactoryPattern {
    
}

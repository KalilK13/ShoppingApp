package shop;

public enum Special {
    SUN, MON, TUE, WED, THU, FRI, SAT;

    static void checkSaleDay(Special special){
        if(special == SUN || special == TUE){
            System.out.println("B.O.G.O FREE");
        }
//        else if (cart.getSpecial() == FRI) {
//            System.out.println("Buy 4 get 1 half off!");
//        }
        else {
            System.out.println("No sales today.");
        }
    }
}

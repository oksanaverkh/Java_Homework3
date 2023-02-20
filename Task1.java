import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Task1 {

    public static void main(String[] args) {
        Goods1 item1 = new Goods1("Black tea vysshiy", 100, 1);
        Goods1 item2 = new Goods1("White wine vysshiy", 1000, 2);
        Goods1 item3 = new Goods1("Sugar", 70, 5);
        Goods1 item4 = new Goods1("Flour vysshiy", 80, 2);
        Goods1 item5 = new Goods1("Green tea vysshiy", 100, 2);
        Goods1 item6 = new Goods1("Black pepper vysshiy", 90, 3);
        Goods1 item7 = new Goods1("Non-filtered beer", 200, 4);

        List<Goods1> goodslist = new ArrayList<>();
        goodslist.add(item1);
        goodslist.add(item2);
        goodslist.add(item3);
        goodslist.add(item4);
        goodslist.add(item5);
        goodslist.add(item6);
        goodslist.add(item7);

        String searchName = "vysshiy";
        Integer maxPrice = 0;
        List<String> maxPriceGoods = new ArrayList<>();
        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getName().contains(searchName)) {
                if (goodslist.get(i).getGrade().equals(1) || goodslist.get(i).getGrade().equals(2)) {
                    if (goodslist.get(i).getPrice() >= maxPrice) {
                        maxPrice = goodslist.get(i).getPrice();
                    }
                }
            }
        }

        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getPrice()==maxPrice) {
                maxPriceGoods.add(goodslist.get(i).getName());
            }
        }

        System.out.println("Max price of goods of 1 or 2 grade with 'vysshiy' in name = " + maxPrice);
        System.out.println("Goods with max price: " + maxPriceGoods.toString());
    }
}
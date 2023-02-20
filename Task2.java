// 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
// Получить наименования товаров заданного сорта с наименьшей ценой.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Goods2 item1 = new Goods2("Red wine", "Italy", 1.0, 750, 1);
        Goods2 item2 = new Goods2("White wine", "France", 0.75, 900, 1);
        Goods2 item3 = new Goods2("Dark beer", "Germany", 0.5, 200, 2);
        Goods2 item4 = new Goods2("Light beer", "Netherlands", 0.5, 200, 2);
        Goods2 item5 = new Goods2("Non-filtered beer", "Belgium", 0.33, 300, 2);
        Goods2 item6 = new Goods2("Apple cider", "Belgium", 0.5, 200, 2);
        Goods2 item7 = new Goods2("White rum", "Cuba", 1.0, 1750, 3);
        Goods2 item8 = new Goods2("Black rum", "Cuba", 1.0, 1550, 3);

        List<Goods2> goodslist = new ArrayList<>();
        goodslist.add(item1);
        goodslist.add(item2);
        goodslist.add(item3);
        goodslist.add(item4);
        goodslist.add(item5);
        goodslist.add(item6);
        goodslist.add(item7);
        goodslist.add(item8);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter goods grade: ");
        int grade = scanner.nextInt();

        Integer minPrice = Integer.MAX_VALUE;
        List<String> minPriceGoods = new ArrayList<>();

        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getGrade().equals(grade)) {
                if (goodslist.get(i).getPrice() <= minPrice) {
                    minPrice = goodslist.get(i).getPrice();
                }
            }
        }

        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getPrice().equals(minPrice) && goodslist.get(i).getGrade().equals(grade)) {
                minPriceGoods.add(goodslist.get(i).getName());
            }
        }

        System.out.println("Min price of goods of " + grade + " grade = " + minPrice);
        System.out.println("Goods with min price in " + grade + " grade: " + minPriceGoods.toString());

    }

}

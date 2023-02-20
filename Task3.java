import java.util.ArrayList;
import java.util.List;

// 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

public class Task3 {
    public static void main(String[] args) {
        Books item1 = new Books("Book1", "Anyukov", 1040, 2011, 19);
        Books item2 = new Books("Book2", "Noyer", 1140, 2009, 219);
        Books item3 = new Books("Book3", "Donnaruma", 1200, 2012, 193);
        Books item4 = new Books("Book4", "Pogba", 700, 2022, 199);
        Books item5 = new Books("Book5", "Pickford", 800, 2010, 149);
        Books item6 = new Books("Book6", "Kulibali", 1040, 2018, 190);
        Books item7 = new Books("Book7", "Kjaer", 970, 2006, 197);

        List<Books> bookslist = new ArrayList<>();
        bookslist.add(item1);
        bookslist.add(item2);
        bookslist.add(item3);
        bookslist.add(item4);
        bookslist.add(item5);
        bookslist.add(item6);
        bookslist.add(item7);

        String searchLetter = "a";
        List<String> booksNames = new ArrayList<>();

        for (int i = 0; i < bookslist.size(); i++) {
            if (bookslist.get(i).getAuthor().toLowerCase().contains(searchLetter)) {
                if (bookslist.get(i).getYear() >= 2010) {
                    if (isSimple(bookslist.get(i).getPages()) == true) {
                        booksNames.add(bookslist.get(i).getName());
                    }
                }
            }
        }
        System.out.println("Books list: "+booksNames.toString());
    }

    public static Boolean isSimple(int number) {
        Boolean flag = false;
        for (int i = 0; i < number; i++) {
            if ((number) == 1 || (number) == 2 || (number) == 3) {
                flag = true;
            } else if (number % 2 == 0) {
                flag = false;
            } else {
                int j = 3;
                while (j < (number) / 2 + 1) {
                    if (number % j == 0) {
                        flag = false;
                    }
                    j = j + 2;
                }

                if (number % j != 0) {
                    flag = true;
                }
            }
        }

        return flag;
    }

}

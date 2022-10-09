package ad211.Smyk;
import java.util.Scanner;
/*У методі Main необхідно створити об'єкт класу «Кошик» з деякою максимальною
кількістю елементів у стеку.
А) Заповнити кошик об'єктами класу Item (5-6 об'єктів буде достатньо);
Б) Вивести суму цін товарів усередині кошика;
В) Підняти ціни в кошику на 15%, вивести змінену суму цін на консоль.
Г) Знизити ціни в кошику на 30%, вивести змінену суму цін на консоль.
*/
public class Main {
    public static void main(String[] args){
        Cart shoppingCart;
        shoppingCart = inputItems();

        System.out.println("\tIn your cart:");
        outputItems(shoppingCart);

        System.out.println("*\t*\t*\t*\t*\t*\nThe total price of all items in your cats: "+shoppingCart.sumItems());

        System.out.println("*\t*\t*\t*\t*\t*\nIncrease the price of all items by 15%: ");
        shoppingCart.increaseItems(15);
        outputItems(shoppingCart);
        System.out.println("*\t*\t*\t*\t*\t*\nThe total price of all items in your cats: "+shoppingCart.sumItems());

        System.out.println("*\t*\t*\t*\t*\t*\nDecrease the prise of all items by 30%: ");
        shoppingCart.decreaseItems(30);
        outputItems(shoppingCart);
        System.out.println("*\t*\t*\t*\t*\t*\nThe total price of all items in your cats: "+shoppingCart.sumItems());

    }
    public static Cart inputItems(){
        int currentItem;
        Cart shoppingCart;
        Scanner inNum = new Scanner(System.in);
        Scanner inName = new Scanner(System.in);
        do{
            System.out.println("Input the number of items: ");
            currentItem = inNum.nextInt();
            if(currentItem <= 0)
                System.out.println("Error! Number of items isn't positive! Try again!)");
        }while(currentItem <= 0);

        shoppingCart = new Cart(currentItem);

        for(int i = 0; i < currentItem; i++){
            System.out.println("Input name of item #" + (i + 1));
            String name = inName.nextLine();
            System.out.println("Input price of item #" + (i + 1));
            float price = inNum.nextFloat();
            shoppingCart.addItem(new Item(name,price));
        }
        return shoppingCart;
    }
    public static void outputItems(Cart shoppingCart){
        for(int i = 0; i < shoppingCart.getCurrentItem();i++){
            System.out.println("Item #" + (i + 1) + " - " + shoppingCart.getStack()[i].getName() + " - " + shoppingCart.getStack()[i].getPrice());
        }
    }
}
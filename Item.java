package ad211.Smyk;
/*1. Створіть клас "Товар" (Item).
А) Клас «Товар» має містити такі поля: найменування (рядок), ціна (float).
Б) Клас «Товар» повинен містити конструктор, який приймає два параметри: найменування та початкову ціну товару.
В) Клас «Товар» повинен мати такі публічні методи: підвищення ціни на певний відсоток (значення відсотка типу float передається
 як аргумент методу); зниження ціни певний відсоток (значення відсотка типу float передається як аргумент методу).
Г) У класі має бути реалізована перевірка ціни на негативне значення. Якщо конструкторі передається негативне значення ціни,
 чи результаті зниження ціни на >100% ціна стає негативною, вона має бути примусово встановлено 0.
*/
public class Item {
    private String name;
    private float price;

    public Item(String name, float price){
        this.name = name;
        this.price = price;
        checkOfNegativePrice();
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public void increasePrice( float percent){
        price += price * percent / 100;
    }
    public void decreasePrice( float percent){
        price -= price * percent / 100;
    }
    public void checkOfNegativePrice(){
        if(price < 0){
            price = 0;
        }
    }
}

package ad211.Smyk;
/*2. Створіть клас «Кошик» (Cart).
А) «Кошик» має реалізовувати структуру даних стек, у якому містяться об'єкти класу «товар».
Вважатимемо, що ми додаємо завжди по 1 одиниці товару. Стек «всередині» реалізується традиційним масивом об'єктів Item.
 Клас повинен містити перевірки, пов'язані з роботою стека - переповнення стека, спроба витягти елемент
  із порожнього стека і т.д.
Б) «Кошик» повинен містити конструктор з 1 параметром – максимальною кількістю елементів у стеку.
 У цьому архітекторі відбувалася ініціалізація масиву, який реалізує стек.
В) «Кошик» повинен містити такі публічні методи: додавання товару, видалення товару,
підрахунок суми цін товарів у кошику (пройтися за елементами масиву та скласти всі значення цін), підвищення та
зниження цін усіх товарів у стеку (два окремі методи, значення ціни передається як параметр методу,
 необхідно пройтись по всіх елементах масиву та передати відповідне повідомлення об'єктам.
*/
public class Cart {
   private Item[] stack;
   private int currentItem;

   public Cart(int maxCurrentItem){
      stack = new Item[maxCurrentItem];
      currentItem = 0;
   }

   public Item[] getStack(){
      return stack;
   }
   public int getCurrentItem(){
      return currentItem;
   }

   public void addItem(Item item){
      if(stackFull())
         return;
      stack[currentItem] = item;
      currentItem++;
   }
   public void deleteItem(){
      if(stackEmpty())
         return;
      stack[currentItem-1] = null;
      currentItem--;
   }
   public float sumItems(){
      float sum = 0;
      for(Item item: stack){
         sum += item.getPrice();
      }
      return sum;
   }

   private boolean stackFull(){
      boolean check = currentItem == stack.length;
      if(check)
         System.out.println("\t\tYour card is full");
      return check;
   }
   private boolean stackEmpty(){
      boolean check = currentItem == 0;
      if(check)
         System.out.println("\t\tYour card is empty");
      return check;
   }

   public void increaseItems(float percent){
      for (Item item: stack)
         item.increasePrice(percent);
   }
   public void decreaseItems(float percent){
      for (Item item: stack)
         item.decreasePrice(percent);
   }
}

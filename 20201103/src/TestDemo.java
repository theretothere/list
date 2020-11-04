import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/3
 * Content:
 */
class Card{
    public int cardNumber;//数字
    public String suit;//花色

    @Override
    public String toString() {
        return "Card{" + "cardNumber=" + cardNumber + ", suit='" + suit + '\'' + '}';
    }

    public Card(int cardNumber, String suit) {
        this.cardNumber = cardNumber;
        this.suit = suit;
    }
}

class BoxCard{
    public String[] suits = {"♥","♣","♠","♦"};
    public List<Card> buyDeck(){
        List<Card> cards = new ArrayList<>();
        for ( int i = 0 ; i < 4 ; i++){// 外层循环，控制花色
            for (int j = 1; j <= 13 ; j++) {// 内层循环，控制点数
                int cardNumber = j;
                String suit = suits[i];
                Card card = new Card(cardNumber,suit);
                cards.add(card);
            }
        }
        return cards;
    }

    public void swap(List<Card> cards ,int i ,int j){
        //Card tmp = null;
        Card tmp = cards.get(i);
        Card card = cards.get(j);
        cards.set( i, card);
        cards.set( j, tmp);

    }
    public void shuffle (List<Card> cards){
        Random random = new Random();
        int size = cards.size();
        for (int i = size - 1 ; i >= 0 ; i--) {
            int j = random.nextInt(i);
            swap(cards , i , j);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        BoxCard card = new BoxCard();
        List<Card> list = card.buyDeck();
        System.out.println(list);
        System.out.println("=====================");
        card.shuffle(list);
        System.out.println(list);
        System.out.println("翻牌");

        List<List<Card>> hands = new ArrayList<>();
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();
        hands.add(hands1);
        hands.add(hands2);
        hands.add(hands3);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3 ; j++) {
                Card cardTmp = list.remove(0);
                //hands1.add(cardTmp);下边是由这个转换而来的
                hands.get(j).add(cardTmp);//外围表示揭牌的次数
                //里边表示的是揭牌的人数
            }
        }
        System.out.println("第一个人的牌是：" + hands1);
        System.out.println("第二个人的牌是：" + hands2);
        System.out.println("第三个人的牌是：" + hands3);

        System.out.println("剩余的牌" + hands);
        System.out.println("剩余的牌" + list);
    }
}

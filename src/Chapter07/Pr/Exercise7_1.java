package Chapter07.Pr;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0;i<deck.cards.length;i++){
            System.out.print(deck.cards[i] + ",");
        }
    }
}
class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck() {
        for (int i=0;i<cards.length;i++){
            int num = i % 10 + 1;
            boolean k = (num < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num,k);
        }
    }
    void shuffle(){
        for(int i=0;i<cards.length;i++){
            int j = (int)Math.random() * cards.length;
            SutdaCard c = cards[i];
            cards[i] = cards[j];
            cards[j] = c;
        }
    }

    SutdaCard pick(int index){
        return cards[index];
    }

    SutdaCard pick(){
        int num = (int)Math.random() * cards.length;
        return cards[num];
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
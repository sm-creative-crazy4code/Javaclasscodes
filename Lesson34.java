public class Lesson34{
  public static void main(String[] args){
    String[] suit = {"Spades","Heart","Diamonds","Clubs"};
    String[] rank ={"Ace","2","3","4","5","6","7","8","9","Jack","Queen","King"};
    
  int[] deck = new int[52];



  for(int i=0;i<52;i++){
    deck[i] =i+1;
}

    
    
    
// Random shuffling

for(int i=0;i<52;i++){
    int index= (int)(Math.random())*52;

     int temp = deck[i];
    deck[i] = deck[index];
    deck[index] = temp;
}


int cardNo=(int) (Math.random()*1000)%52;
    System.out.println(cardNo);

int suiId= deck[cardNo]/13;
int ramkId= deck[cardNo]%13;

    System.out.println("Card Suit "+ suit[suiId]);
    System.out.println("Card rank "+ rank[ramkId]);


    




  }
}
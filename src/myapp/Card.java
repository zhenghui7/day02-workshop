package myapp;

public class Card {

    private String suit;
    private String name;
    private int rank;

    public Card (String suit, String name, int rank) {
        this.suit = suit;
        this.name = name;
        this.rank = rank;
    }


    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "card{suit=%s, name=%s, rank=%d}".formatted(this.suit, this.name, this.rank);
    }
    
    
}





// private String[] cardNumber = new String [13];
//     private String[] cardShape = new String [4];
//     private String randCombi;

//     public Cards(String[] cardNumber, String[] cardShape) {
//         this.cardNumber = cardNumber;
//         this.cardShape = cardShape;
//     }

//     public Cards() {
     
//     }

//     public String[] getCardNumber() {
//         return cardNumber;
//     }
  

//     public void printCards() {
//         int i = 0;
    
//         cardNumber [0] = "1";
//         cardNumber [1] = "2";
//         cardNumber [2] = "3";
//         cardNumber [3] = "4";
//         cardNumber [4] = "5";
//         cardNumber [5] = "6";
//         cardNumber [6] = "7";
//         cardNumber [7] = "8";
//         cardNumber [8] = "9";
//         cardNumber [9] = "10";
//         cardNumber [10] = "J";
//         cardNumber [11] = "Q";
//         cardNumber [12] = "K";


//         for (i = 0; i < cardNumber.length ; i++) {
//         System.out.println(cardNumber[i]);
//         }

//     }

//     public void printShapes() {
//         int j = 0;
    
//         cardShape [0] = "Spade";
//         cardShape [1] = "Hearts";
//         cardShape [2] = "Club";
//         cardShape [3] = "Diamond";

//         for (j = 0; j < cardShape.length ; j++) {
//             System.out.println(cardShape[j]);

//         }
//     }


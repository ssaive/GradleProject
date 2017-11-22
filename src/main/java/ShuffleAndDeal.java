import java.util.ArrayList;
import java.util.Collections;

public class ShuffleAndDeal {

	private static final int SIZE = 52;
	public void shuffle(ArrayList<String> deck) //shuffles the deck
			{
				Collections.shuffle(deck);
				
				
			}
			
			
	public String dealOneCard(ArrayList<String> deck) //deals one card
			{
				int index=0;
				String card="";
				int newDeckSize=deck.size();
				if(newDeckSize > 0)
				{
				 try
				 	{
					 index=(int) (Math.ceil(( Math.random() * newDeckSize-1)));
					 card=deck.get(index);
					}
				
				 catch(IndexOutOfBoundsException i)
				 	{
					 System.out.println("No more cards available to deal");
					 
					  }
				
				 finally
				 	{
					 //System.out.println("In finally");
					 }
				 System.out.println("The card dealt is : " + card + " at index :" +index);
				 return card;
				}
				
			
				else
				{
					System.out.println("No card dealt.All the available cards were dealt already.");
				}
				return card;
				
			}

	public static void main(String[] args) {
		ShuffleAndDeal d=new ShuffleAndDeal();
		ArrayList<String> Deck= new ArrayList<String>(SIZE);
		String[] suits = {"Spades", "Diamonds","Hearts","Clubs"}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		for(int j=0;j<suits.length;j++)
				{
				for(int k=0;k<ranks.length;k++)
					{
				Deck.add(j*k,suits[j]+" "+ranks[k]);
					}
				}	
		
		System.out.println("New deck created");
		for(int i=0;i<SIZE;i++)
			{
				System.out.print(" " + Deck.get(i) + ", ");
			}
		System.out.println("");
		System.out.println("Calling shuffle()...");
		d.shuffle(Deck);
		System.out.println("The deck was shuffled");
		for(int i=0;i<SIZE;i++)
			{
				System.out.print(" " + Deck.get(i) + ", ");
			}
		System.out.println("");
		System.out.println("Calling dealOneCard() 53 times...");
		System.out.println("Deck size :"+Deck.size());
		for(int t=0;t<SIZE+1;t++)
			{
				String i=d.dealOneCard(Deck);
				Deck.remove(i);
				System.out.println("Deck size :"+ Deck.size());
			}
				
				

			}


	}



package cardgameweek4;
/**
 * Starter code for the Card class.
 * 
 * @author srinivsi, 2020
 */
public class Card {
    
        public enum Color {RED, YELLOW, GREEN, BLUE};
        public enum Rank{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Color color;
        private final Rank rank;
        
        public Card(Color s, Rank gVal)
        {
           color =s;
           rank= gVal;
        }
	public Rank getRank() {
		return this.rank;
	}

	
	public Color getColor() {
		return this.color;
        }
}
package zaffora;

/**
 * @author Jin An
 * Delaware Technical Community College
 *
 */

public class StackTestDriver {

	public static void main(String[] args) {
		ArrayStack<Integer> numberContainer = new ArrayStack<>();
		ArrayStack<String> wordContainer = new ArrayStack<>();
		ArrayStack<Pokemon> pokedex = new ArrayStack<>();
		
		// Fill the numberContainer object with numbers from 0 to 23
		for (int i = 0; i < 24; i++) {
			numberContainer.push(i);
		}
		System.out.println(numberContainer);
		
		wordContainer.push("Hello");
		wordContainer.push("World");
		wordContainer.push("This");
		wordContainer.push("Is");
		wordContainer.push("A");
		wordContainer.push("Container");
		System.out.println(wordContainer);

		pokedex.push(new Pokemon("Bulbasaur", "Grass", 45));
		pokedex.push(new Pokemon("Ivysaur", "Grass", 60));
		pokedex.push(new Pokemon("Venusaur", "Grass", 80));
		pokedex.push(new Pokemon("VenusaurMega Venusaur", "Grass", 80));
		System.out.println(pokedex);

	}

}

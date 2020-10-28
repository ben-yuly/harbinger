/**
 * 
 */
package com.benjaminyuly.harbinger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Ben Yuly
 *
 */

@Component
public class HarbingerRunner implements CommandLineRunner {
	
	@Autowired
	private ExpansionRepository expansionRepository;

	@Override
	public void run(String... args) throws Exception {
		expansionRepository.deleteAll();
		
		expansionRepository.save(new Expansion("Dominion (Base Game)",
				"You are a monarch, like your parents before you, a ruler of a small pleasant kingdom of rivers and evergreens. Unlike your parents, however, you have hopes and dreams! You want a bigger and more pleasant kingdom, with more rivers and a wider variety of trees. You want a Dominion! In all directions lie fiefs, freeholds, and feodums. All are small bits of land, controlled by petty lords and verging on anarchy. You will bring civilization to these people, uniting them under your banner. But wait! It must be something in the air; several other monarchs have had the exact same idea. You must race to get as much of the unclaimed land as possible, fending them off along the way. To do this you will hire minions, construct buildings, spruce up your castle, and fill the coffers of your treasury. Your parents wouldn’t be proud, but your grandparents, on your mothers side, would be delighted.",
				"This is a game of building a deck of cards. The deck represents your Dominion. It contains your resources, victory points, and the things you can do. It starts out a small sad collection of Estates and Coppers, but you hope that by the end of the game it will be brimming with Gold, Provinces, and the inhabitants and structures of your castle and kingdom. You win by having the most VP in your deck when the game ends."));

		expansionRepository.save(new Expansion("Intrigue",
				"Somethings afoot. The steward smiles at you like he has a secret, or like he thinks you have a secret, or like you think he thinks you have a secret. There are secret plots brewing, youre sure of it. At the very least, there are yours. A passing servant murmurs, 'The eggs are on the plate.' You frantically search your codebook for the translation before realizing he means that breakfast is ready. Excellent. Everything is going according to plan.",
				"This is the 1st expansion to the game of Dominion. It has 300 cards. There are victory cards that do something before the end of the game, cards that interact with victory cards, and underlings that give you a choice as to what they do."));
		
		System.out.println("here!");
	}
	
}

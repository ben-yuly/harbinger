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
		
		// Initialize Expansions
		expansionRepository.deleteAll();
		
		expansionRepository.save(new Expansion("Dominion (Base Game)",
				"You are a monarch, like your parents before you, a ruler of a small pleasant kingdom of rivers and evergreens. Unlike your parents, however, you have hopes and dreams! You want a bigger and more pleasant kingdom, with more rivers and a wider variety of trees. You want a Dominion! In all directions lie fiefs, freeholds, and feodums. All are small bits of land, controlled by petty lords and verging on anarchy. You will bring civilization to these people, uniting them under your banner. But wait! It must be something in the air; several other monarchs have had the exact same idea. You must race to get as much of the unclaimed land as possible, fending them off along the way. To do this you will hire minions, construct buildings, spruce up your castle, and fill the coffers of your treasury. Your parents wouldn’t be proud, but your grandparents, on your mothers side, would be delighted.",
				"This is a game of building a deck of cards. The deck represents your Dominion. It contains your resources, victory points, and the things you can do. It starts out a small sad collection of Estates and Coppers, but you hope that by the end of the game it will be brimming with Gold, Provinces, and the inhabitants and structures of your castle and kingdom. You win by having the most VP in your deck when the game ends."));

		expansionRepository.save(new Expansion("Intrigue",
				"Somethings afoot. The steward smiles at you like he has a secret, or like he thinks you have a secret, or like you think he thinks you have a secret. There are secret plots brewing, youre sure of it. At the very least, there are yours. A passing servant murmurs, 'The eggs are on the plate.' You frantically search your codebook for the translation before realizing he means that breakfast is ready. Excellent. Everything is going according to plan.",
				"This is the 1st expansion to the game of Dominion. It has 300 cards. There are victory cards that do something before the end of the game, cards that interact with victory cards, and underlings that give you a choice as to what they do."));
		
		expansionRepository.save(new Expansion("Seaside",
				"All you ask is a tall ship and a star to steer her by. And someone who knows how to steer ships using stars. You finally got some of those rivers you'd wanted, and they led to the sea. These are dangerous, pirate-infested waters, and you cautiously send rat-infested ships across them, to establish lucrative trade at far-off merchant-infested ports. First, you will take over some islands, as a foothold. The natives seem friendly enough, crying their peace cries, and giving you spears and poison darts before you are even close enough to accept them properly. When you finally reach those ports you will conquer them, and from there you will look for more rivers. One day, all the rivers will be yours.",
				"his is the 2nd addition to the game of Dominion. It adds 26 new Kingdom cards to Dominion. The central theme is your next turn; there are cards that do something this turn and next, cards that set up your next turn, and other ways to step outside of the bounds of a normal turn."));
				
		expansionRepository.save(new Expansion("Alchemy",
				"There are strange things going on in your basement laboratories. They keep calling up for more barrels of quicksilver, or bits of your hair. It's all in the name of progress. They're looking for a way to turn lead into gold, or at least into something better than lead. That lead had just been too good of a bargain to pass up; you didn't think where you would put all the lead or what you will do with the lead. Well that will all be sorted out. They're also looking for a universal solvent. If they manage that one, you will take whatever they use to hold it in and build a castle out of it. A castle that can't be dissolved! Now that's progress.",
				"This is the 3rd expansion to Dominion. It adds 12 new Kingdom cards to Dominion, plus a new resource, PotionsPotion.jpg."));

		expansionRepository.save(new Expansion("Prosperity",
				"Ah, money. There's nothing like the sound of coins clinking in your hands. You vastly prefer it to the sound of coins clinking in someone else's hands, or the sound of coins just sitting there in a pile that no-one can quite reach without getting up. Getting up, that's all behind you now. Life has been good to you. Just ten years ago, you were tilling your own fields in a simple straw hat. Today, your kingdom stretches from sea to sea, and your straw hat is the largest the world has ever known. You also have the world's smallest dog, and a life-size statue of yourself made out of baklava. Sure, money can't buy happiness, but it can buy envy, anger, and also this kind of blank feeling. You still have problems - troublesome neighbors that must be conquered. But this time, you'll conquer them in style.",
				"none"));
		
		expansionRepository.save(new Expansion("Cornucopia",
				"Autumn. It seemed like the summer would never end, but that fortune teller was right. It's over. Autumn, the time of the harvest. Agriculture has advanced significantly in recent years, ever since the discovery of the maxim, \"leaves of three, let it be.\" Autumn, a time of celebration. The peasants have spent a hard week scything hay in the fields, but tonight the festivities begin, starting with a sumptuous banquet of roast hay. Then, the annual nose-stealing competition. Then you have two jesters, one who always lies, one who always tells the truth, both hilariously. This celebration will truly have something for everyone.",
				"This is the 5th addition to the game of Dominion. It adds 13 new Kingdom cards to Dominion, plus 5 unique cards. The central theme is variety; there are cards that reward you for having a variety of cards in your deck, in your hand, and in play, as well cards that help you get that variety."));
		
		
		expansionRepository.save(new Expansion("Hinterlands",
				"The world is big and your kingdom small. Small when compared to the world, that is; it’s moderate-sized when compared to other kingdoms. But in a big world like this one - big when compared to smaller worlds anyway, if such things exist; it’s moderate-sized when compared to worlds of roughly the same size, and a little small when compared to worlds just a little larger - well, to make a long story short - short when compared to longer stories anyway - it is time to stretch your borders. You’ve heard of far-off places - exotic countries, where they have pancakes but not waffles, where the people wear the wrong number of shirts, and don’t even have a word for the look two people give each other when they each hope that the other will do something that they both want done but which neither of them wants to do. It is to these lands that you now turn your gaze.",
				"none"));
		
		
		expansionRepository.save(new Expansion("Dark Ages",
				"Times have been hard. To save on money, you've moved out of your old castle, and into a luxurious ravine. You didn't like that castle anyway; it was always getting looted, and never at a reasonable hour. And if it wasn't barbarians it was the plague, or sometimes both would come at once, and there wouldn't be enough chairs. The ravine is great; you get lots of sun, and you can just drop garbage wherever you want. In your free time you've taken up begging. Begging is brilliant conceptually, but tricky in practice, since no-one has any money. You beg twigs from the villagers, and they beg them back, but no-one really seems to come out ahead. That's just how life is sometimes. You're quietly conquering people, minding your own business, when suddenly there's a plague, or barbarians, or everyone's illiterate, and it's all you can do to cling to some wreckage as the storm passes through. Still, you are sure that, as always, you will triumph over this adversity, or at least do slightly better than everyone else.",
				"none"));
		
		expansionRepository.save(new Expansion("Guilds",
				"Jobs, everyone’s worried about jobs. Whatever happened to tilling the fields in obscurity? The economy is just a trick, like stealing someone's nose, but lately people seem to have seen through it, like when you realize someone hasn’t really stolen your nose. So now everyone’s joining a guild, learning a craft, and working on a masterpiece - a painting so beautiful it blinds you, or a cheese grater so amazing that you never eat cheese again. The only people left tilling the fields are the ones doing it ironically. The guilds cover everything - ironic tilling, butchering, baking, candlestick making, shoemaking, cheesemaking, cheese destruction. Your advisor is convinced that somehow, control of the stonecutters is key to world domination. Very well. You will have stone handled so expertly that the world trembles before you.",
				"none"));
		
		expansionRepository.save(new Expansion("Adventures",
				"Life is either a daring adventure or nothing. You're not sure which, but at least you've narrowed it down. You are rich with life experiences, but have had trouble trading them for goods and services. It's time to seek your fortune, or anyone's really, whoever's is closest. To the west there's a land of milk and honey, full of giant bees and monstrous cows. To the east, a land of eggs and licorice. To the north, treacherous swamps; to the south, loyal jungles. But all of them have been thoroughly pillaged. You've heard legends though of a fifth direction, as yet unspoiled, with its treasures conveniently gathered into troves. You have your sword and your trail mix, handed down from your father, and his father before him. You've recruited some recruits and hired some hirelings; you've shined your armor and distressed a damsel. You put up a sign saying \"Gone Adventuring.\" Then you put up another sign, saying \"Beware of Dog,\" in case people get any ideas. You're ready. You saddle up your trusty steed, and head florst.",
				"none"));
		
		expansionRepository.save(new Expansion("Empires",
				"The world is big and your kingdom gigantic. It's no longer a kingdom really; it's an empire. Which makes you the emperor. This entitles you to a better chair, plus you can name a salad after yourself. It's not easy being emperor. The day starts early, when you light the sacred flame; then it's hours of committee meetings, trying to establish exactly why the sacred flame keeps going out. Sometimes your armies take over a continent and you just have no idea where to put it. And there's the risk of assassination; you have a food taster, who tastes anything before you eat it, and a dagger tester, who gets stabbed by anything before it stabs you. You've taken to staying at home whenever it's the Ides of anything. Still overall it's a great job. You wouldn't trade it for the world - especially given how much of the world you already have.",
				"none"));
		
		expansionRepository.save(new Expansion("Nocturne",
				"You've always been a night person; lately you've even considered becoming a vampire. There are a lot of advantages: you don't age; you don't have to see yourself in mirrors anymore; if someone asks you to do something, you can just turn into a bat, and then say, sorry, I'm a bat. There are probably some downsides though. You always think of the statue in the town square, that came to life, and now works as the tavern barmaid. The pedestal came to life too, so she has to hop around. The village blacksmith turns into a wolf whenever there's a full moon; when there's a crescent moon, he turns into a chihuahua. That's how this stuff goes sometimes. Still, when you breathe in the night air, you feel ready for anything.",
				"none"));
		
		expansionRepository.save(new Expansion("Renaissance",
				"It's a momentous time. Art has been revolutionized by the invention of \"perspective,\" and also of \"funding.\" A picture used to be worth a dozen or so words; these new ones are more like a hundred. Oil paintings have gotten so realistic that you've hired an artist to do a portrait of you each morning, so you can make sure your hair is good. Busts have gotten better too; no more stopping at the shoulders, they go all the way to the ground. Science and medicine have advanced; there's no more superstition, now they know the perfect number of leeches to apply for each ailment. You have a clock accurate to within an hour, and a calendar accurate to within a week. Your physician heals himself, and your barber cuts his own hair. This is truly a golden age.",
				"none"));
		
		expansionRepository.save(new Expansion("Menagerie",
				"Dominion, that's what you're trying to achieve. This time with animals! They each have a lesson to teach, whether it's how to spit really far, or what kind of grass tastes the best. It's a lot to keep track of, but you're like an elephant: you remember everything. And you're afraid of mice. You've taken up riding. Horses are intimidating; they say you can lead a horse to water, but you haven't managed it. So you're working your way up, starting with dogs. So far so good; the dog hasn't bucked you off yet. Your menagerie got off to a poor start, with just a goat, two rats, and the advisor who suggested starting a menagerie. You couldn't get that fox you wanted, but it was probably bad anyway. Now you've got some camels, which are just as useless for sewing as you'd been warned, and a turtle that can hold its breath for longer than anyone can stay interested. Soon the animal kingdom will be yours.",
				"none"));
		
		expansionRepository.save(new Expansion("Promo",
				"These are promotional cards. Is not an expansion in it's own right.",
				"These are promotional cards. Is not an expansion in it's own right."));
	}
	
}

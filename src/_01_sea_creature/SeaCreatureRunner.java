package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		patrick.getName();
		squidward.getName();
		patrick.eat();
		squidward.eat();
		patrick.laugh();
		squidward.laugh();
	}
}

public class IteratorSample {
	public static void main(String args[]) {
		ZooImpl zoo = new ZooImpl();
		zoo.addAnimal(new Animal("Tiger", "Wild"));
		zoo.addAnimal(new Animal("Lion", "Wild"));
		zoo.addAnimal(new Animal("Cat", "Domestic"));
		zoo.addAnimal(new Animal("Bull", "Wild"));
		zoo.addAnimal(new Animal("Dog", "Domestic"));

		Iterator wildIterator = zoo.createIterator("Wild");
		while (!wildIterator.isLastAnimal()) {
			System.out.println("Wild Animal: "
					+ wildIterator.nextAnimal().getAnimalName());
		}

		Iterator domesticIterator = zoo.createIterator("Domestic");
		while (!domesticIterator.isLastAnimal()) {
			System.out.println("Domestic Animal: "
					+ domesticIterator.nextAnimal().getAnimalName());
		}
	}
}
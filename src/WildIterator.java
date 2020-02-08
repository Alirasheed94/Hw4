import java.util.List;

public class WildIterator implements Iterator {

	public List animalList;
	private int position;

	public WildIterator(List animalList) {
		this.animalList = animalList;
	}

	
	public Animal nextAnimal() {
		Animal animal = null;
		for (; position < animalList.size(); position++) {
			if ("Wild".equals(((Animal) animalList.get(position)).getAnimalType())) {
				animal = (Animal) animalList.get(position);
				position++;
				break;
			}
		}
		return animal;
	}

	
	public boolean isLastAnimal() {
		for (int i = position; i < animalList.size(); i++) {
			if ("Wild".equals(((Animal) animalList.get(i)).getAnimalType())) {
				return false;
			}
		}
		return true;
	}

	
	public Animal currentAnimal() {
		if (position < animalList.size()) {
			return (Animal) animalList.get(position);
		}
		return null;
	}

}
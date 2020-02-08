import java.util.List;

public class DomesticIterator implements Iterator {

	List animalList;
	private int position;

	public DomesticIterator(List animalList) {
		this.animalList = animalList;
	}

	
	public Animal nextAnimal() {
		Animal animal = null;
		for (; position < animalList.size(); position++) {
			if ("Domestic".equals(((Animal) animalList.get(position)).getAnimalType())) {
				animal = (Animal) animalList.get(position);
				position++;
				break;
			}
		}
		return animal;
	}

	
	public boolean isLastAnimal() {
		for (int i = position; i < animalList.size(); i++) {
			if ("Domestic".equals(((Animal) animalList.get(i)).getAnimalType())) {
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
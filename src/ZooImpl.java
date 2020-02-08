import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements IZoo {

	List animalList;

	public ZooImpl() {
		animalList = new ArrayList();
	}

	
	public List getAnimals() {

		return animalList;
	}

	
	public void addAnimal(Animal animal) {
		animalList.add(animal);

	}

	
	public void removeAnimal(Animal animal) {
		animalList.remove(animal);

	}

	
	public Iterator createIterator(String iteratorType) {
		if ("Wild".equals(iteratorType)) {
			return new WildIterator(animalList);
		} else {
			return new DomesticIterator(animalList);
		}
	}
}
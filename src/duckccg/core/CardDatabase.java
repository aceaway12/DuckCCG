package duckccg.core;

import duckccg.ducks.*;
import duckccg.resources.*;
//
//FOR THOSE WHO WISH NOT TO DIE YOUNG, REFER TO THE ID LIST FILES FILE BEFORE PERUSING THIS CLASS
//
public class CardDatabase {
	/**Get a new duck object from a duck id
	 * @param id the id of the duck type
	 * @return a new duck object
	 */
	public static Duck getDuck(int id) {
		switch(id) {
		case 0:
			return new DuckGeneralQuack();
		case 1:
			return new DuckDuckhouse();
		default:
			return new DuckDuckhouse();
		}
	}

	/**Get a new resource object from a resource id
	 * @param id the id of the resource type
	 * @return a new resource object
	 */
	public static Resource getResource(int id) {
		switch(id) {
		case 0:
			return new ResourceRock();
		default:
			return new ResourceRock();
		}
	}
}

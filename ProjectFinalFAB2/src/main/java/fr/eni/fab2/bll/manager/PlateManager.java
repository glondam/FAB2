package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;

public interface PlateManager {
	
    public Plate add(Plate plate);
	
	public void delete(Plate plate);
	
	public Plate getById(int id);
	
	public void update(Plate plate);

	public List<Plate> getAll();
	
	public List<Plate> getByRestaurants(Restaurant restaurant);

}

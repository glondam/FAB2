package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.exceptions.BLLException;

 class OrderManagerImplTest implements OrderManager {

	@Override
	public Order add (Order order) throws BLLException {

		return order;
	}

	@Override
	public void delete (Order order) throws BLLException {

	}

	@Override
	public Order getById(int id) throws BLLException {
		return new Order();
	}

	@Override
	public void update (Order order) throws BLLException {

	}

	@Override
	public List<Order> getAll()  throws BLLException {
		List<Order> orders = null;
		return orders;
	}

}
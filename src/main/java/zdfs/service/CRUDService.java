package zdfs.service;

import java.util.List;

public interface CRUDService<T> {
	
	public int add(T t);
	
	public int deleteById(int id);
	
	public int update(T t);
	
	public T findById(int id);
}

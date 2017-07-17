package zdfs.service;

import java.io.Serializable;
import java.util.List;

public interface CRUDService<T> {
	
	public Serializable add(T t);
	
	public int deleteById(Serializable id);
	
	public int update(T t);
	
	public T findById(Serializable id);

}

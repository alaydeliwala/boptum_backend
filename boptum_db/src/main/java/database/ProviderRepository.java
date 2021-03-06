package database;



import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import database.data.Provider;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
/**
 * This is the place where all of the data will be stored 
 * @author adeliwal
 *
 */
@Repository
@Transactional
public interface ProviderRepository extends CrudRepository<Provider, Integer> {
}

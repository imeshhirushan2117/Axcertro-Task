package lk.axcertroTask.crud.repo;

import lk.axcertroTask.crud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Imesh Hirushan
 * Project Name : crud
 * Package Name : lk.axcertroTask.crud.repo
 * Date : Apr 4, 2024
 * Time : 3:16 PM
 */
public interface CustomerRepo extends JpaRepository <Customer , Long> {
}

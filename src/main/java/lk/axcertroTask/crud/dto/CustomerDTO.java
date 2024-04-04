package lk.axcertroTask.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By Imesh Hirushan
 * Project Name : crud
 * Package Name : lk.axcertroTask.crud.dto
 * Date : Apr 4, 2024
 * Time : 3:16 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private long CustomerId;
    private String firstName;
    private String lastName;
    private String email;
}

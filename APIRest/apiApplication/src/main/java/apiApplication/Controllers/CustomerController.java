package apiApplication.Controllers;

import apiApplication.Domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customerList = new ArrayList<>(Arrays.asList(
            new Customer(123,"Michael","mikah","mikah123"),
            new Customer(456, "Laura", "lau", "lau456"),
            new Customer(789, "Peter", "pete", "pete789"),
            new Customer(321, "Christine", "chris", "chris321")
    ));

    @GetMapping("customers")
    public List<Customer> getCustomerList(){
        return customerList;
    }
}

package apiApplication.Controllers;

import apiApplication.Domain.Customer;
import org.springframework.web.bind.annotation.*;

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

    //------------------ GET REQUESTS ------------------

    @GetMapping("/customers")
    public List<Customer> getCustomerList(){
        return customerList;
    }

    @GetMapping("/customers/{username}")
    public Customer getCustomer(@PathVariable String username){
        for(Customer customer: customerList){
            if(customer.getUsername().equalsIgnoreCase(username)){
                return customer;
            }
        }
        return null;
    }

    //------------------ POST REQUESTS ------------------

    @PostMapping("/customers")
    public Customer postCustomer(@RequestBody Customer customer){
        customerList.add(customer);
        return customer;
    }

    //------------------ PUT REQUESTS ------------------

    @PutMapping("/customers")
    public Customer putCustomer(@RequestBody Customer customer){
        for(Customer myCustomer: customerList){
            if(myCustomer.getId() == customer.getId()){
                myCustomer.setName(customer.getName());
                myCustomer.setUsername(customer.getUsername());
                myCustomer.setPassword(customer.getPassword());

                return myCustomer;
            }
        }

        return null;
    }

    //------------------ DELETE REQUESTS ------------------

    @DeleteMapping("/customers")
    public Customer deleteCustomer(@RequestBody int id){

        for(Customer customer: customerList){
            if(id == customer.getId()){
                customerList.remove(customer);

                return customer;
            }
        }

        return null;
    }

    //------------------ DELETE REQUESTS ------------------

    @PatchMapping("/customers")
    public Customer patchCustomer(@RequestBody Customer customer){
        for (Customer myCustomer: customerList){
            if(myCustomer.getId() == customer.getId()){

                if(customer.getName() != null){
                    myCustomer.setName(customer.getName());
                }
                if(customer.getUsername() != null){
                    myCustomer.setUsername(customer.getUsername());
                }
                if(customer.getPassword() != null){
                    myCustomer.setPassword(customer.getPassword());
                }

                return myCustomer;
            }
        }

        return null;
    }
}

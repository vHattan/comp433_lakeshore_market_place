package com.lmp.view;

import com.lmp.dao.CustomerDao;
import com.lmp.dao.CustomerOrderDao;
import com.lmp.dao.ProductDao;
import com.lmp.dao.PartnerDao;
import com.lmp.model.Customer;
import com.lmp.model.CustomerAddress;
import com.lmp.model.CustomerBillingInfo;
import com.lmp.model.CustomerOrder;
import com.lmp.model.CustomerOrderDetail;
import com.lmp.model.Payment;
import com.lmp.model.Product;
import com.lmp.model.Partner;
import com.lmp.service.CustomerOrderService;
import com.lmp.service.CustomerService;
import com.lmp.service.ProductService;
import com.lmp.service.PartnerService;

import java.math.BigDecimal;

public class TestClient {

    public static void main(String[] args) throws Exception {

        /*System.out.println("###CustomerService Test###");
        CustomerService customerService = new CustomerService(new CustomerDao());
        System.out.println("getCustomer(1): " + customerService.getCustomer(1));
        System.out.println("listCustomers: " + customerService.listCustomers());

        Customer customer1 = new Customer("Dan", "Danson", "847-123-4567", "test1@test.com", true);
        customerService.addCustomer(customer1);
        System.out.println("listCustomers - after new customer add: " + customerService.listCustomers());

        Customer customer2 = new Customer(1, "Edward", "Edwardson", "444-555-6666", "test2@test.com", true);
        customerService.updateCustomer(customer2);
        System.out.println("listCustomers - after update: " + customerService.listCustomers());

        customerService.deleteCustomer(1);
        System.out.println("listCustomers - after delete: " + customerService.listCustomers());

        CustomerAddress customerAddress1 = new CustomerAddress("456 fake ln", "unit 402", "Chicago", "IL", "60642", "USA", true, true, true, 1);
        customerService.addCustomerAddress(customerAddress1);

        System.out.println("getCustomerAddress(1): " + customerService.getCustomerAddress(1));
        System.out.println("listCustomerAddressesByCustId(1): " + customerService.getCustomerAddressesByCustId(1));

        CustomerAddress customerAddress2 = new CustomerAddress(1, "555 super fake ln", "unit 555", "Chicago", "IL", "123456", "USA", true, false, true, 1);
        customerService.updateCustomerAddress(customerAddress2);

        System.out.println("listCustomerAddressesByCustId(1) - after update: " + customerService.getCustomerAddressesByCustId(1));

        customerService.deleteCustomerAddress(1);
        System.out.println("getCustomerAddress(1) - after 1: " + customerService.getCustomerAddress(1));

        System.out.println("getCustomerBillingInfo(1): " + customerService.getCustomerBillingInfo(1));

        CustomerBillingInfo customerBillingInfo1 = new CustomerBillingInfo("4444444444444444444", "1117", true, 1);
        customerService.addCustomerBillingInfo(customerBillingInfo1);

        CustomerBillingInfo customerBillingInfo2 = new CustomerBillingInfo(1, "5555555555555555555", "1218", false);
        customerService.updateCustomerBillingInfo(customerBillingInfo2);

        System.out.println("getCustomerBillingInfoByCustId(1): " + customerService.getCustomerBillingInfoByCustId(1));*/

        System.out.println("###CustomerOrder Test###");
        CustomerOrderService customerOrderService = new CustomerOrderService(new CustomerOrderDao());

        CustomerOrder customerOrder1 = new CustomerOrder(BigDecimal.valueOf(99.95), "NEW", "1000", 1, 1, 1);
        customerOrderService.addCustomerOrder(customerOrder1);

        System.out.println("getCustomerOrder(1): " + customerOrderService.getCustomerOrder(1));
        System.out.println("getAllCustomerOrdersByCustId(1): " + customerOrderService.getAllCustomerOrdersByCustId(1));

        System.out.println("getDetailedCustomerOrder(1): " + customerOrderService.getDetailedCustomerOrder(1));

        System.out.println("getCustomerOrderStatus(1): " + customerOrderService.getCustomerOrderStatus(1));
     

        CustomerOrder customerOrder2 = new CustomerOrder(1, BigDecimal.valueOf(88.88), "SHIPPED", "2222", 2, 2, 2);
        customerOrderService.updateCustomerOrder(customerOrder2);

        System.out.println("getCustomerOrder(1) - after update: " + customerOrderService.getCustomerOrder(1));

        Payment payment1 = new Payment(1, "PAYMENT", "PROCESSED");
        customerOrderService.addPayment(payment1);

        System.out.println("getPayment(1): " + customerOrderService.getPayment(1));
        customerOrderService.updatePayment(1, "REFUNDED");
        System.out.println("getPayment(1) - after status update: " + customerOrderService.getPayment(1));

        System.out.println("getPaymentsByOrderId(1): " + customerOrderService.getPaymentsByOrderId(1));

        CustomerOrderDetail customerOrderDetail1 = new CustomerOrderDetail(1, 3);
        customerOrderService.addCustomerOrderDetail(customerOrderDetail1);

        System.out.println("getCustomerOrderDetail(2): " + customerOrderService.getCustomerOrderDetail(2));
        System.out.println("getCustomerOrderDetailsByOrderId(1): "  + customerOrderService.getCustomerOrderDetailsByOrderId(1));
        
        
        
  //Start of the Product test
        
        System.out.println("###Product Test###");       
        ProductService productService = new ProductService(new ProductDao());

       Product productTest = new Product(1, "1234", "ProductTest", "veryCool", true, 1, 1, "picture");
       productService.createProduct(productTest);
        
        System.out.println("Select productTest by id: " + productService.getProduct(4));
        
        System.out.println("select All Products: " + productService.selectAllProducts());
        

       
  //End of product test
  
  //Partner test started
        
        System.out.println("###Partner Test###");       
        PartnerService partnerService = new PartnerService(new PartnerDao());

        Partner partnerTest = new Partner(1, "Myco", "6331 N Kenmore Ave", "Chicago", "IL", "60660", "USA", "800-556-8876", "abc@xyz.com", "http://www.xyz.com/", true);
        partnerService.createPartner(partnerTest);
        
        System.out.println("Select partnerTest by id: " + partnerService.getPartner(1));
        
        System.out.println("select All Partners: " + partnerService.selectAllPartner());
        
     
  //End of partner test
    }
}

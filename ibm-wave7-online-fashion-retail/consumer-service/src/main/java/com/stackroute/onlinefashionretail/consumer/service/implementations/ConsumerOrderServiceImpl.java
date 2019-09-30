package com.stackroute.onlinefashionretail.consumer.service.implementations;

import com.mongodb.MongoSocketOpenException;
import com.stackroute.onlinefashionretail.consumer.domain.Address;
import com.stackroute.onlinefashionretail.consumer.domain.ConsumerOrder;
import com.stackroute.onlinefashionretail.consumer.exception.ConsumerOrder.ConsumerOrderAlreadyExistsException;
import com.stackroute.onlinefashionretail.consumer.exception.ConsumerOrder.ConsumerOrderNotFoundException;
import com.stackroute.onlinefashionretail.consumer.repository.ConsumerOrderRepository;
import com.stackroute.onlinefashionretail.consumer.service.interfaces.ConsumerOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service Class contains the business logic
@Service
public class ConsumerOrderServiceImpl implements ConsumerOrderService {

    //ConsumerOrderRepository object to perform database operations
    private final ConsumerOrderRepository consumerOrderRepository;

    private final Logger logger = LoggerFactory.getLogger(ConsumerOrderServiceImpl.class);

    @Autowired
    public ConsumerOrderServiceImpl(ConsumerOrderRepository consumerOrderRepository) {
        this.consumerOrderRepository = consumerOrderRepository;
    }

    //method to save an order
    @Override
    public ConsumerOrder placeOrder(ConsumerOrder consumerOrder) throws ConsumerOrderAlreadyExistsException {
        logger.info("Entered into placeOrder method in ConsumerOrderServiceImpl");
        try {
            if (consumerOrderRepository.existsById(consumerOrder.getId()))
                throw new ConsumerOrderAlreadyExistsException("An order with this id already exists!");
            return consumerOrderRepository.save(consumerOrder);
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    //method to cancel an order
    @Override
    public ConsumerOrder cancelOrder(ConsumerOrder consumerOrder) throws ConsumerOrderNotFoundException {
        logger.info("Entered into cancelOrder method in ConsumerOrderServiceImpl");
        try {
            if (!consumerOrderRepository.existsById(consumerOrder.getId()))
                throw new ConsumerOrderNotFoundException("Consumer order with given id not found!");
            consumerOrder.setStatus("cancelled");
            return consumerOrderRepository.save(consumerOrder);
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    //method to edit the shipping address of an order
    @Override
    public ConsumerOrder editShippingAddress(String consumerOrderId, Address address) throws ConsumerOrderNotFoundException {
        logger.info("Entered into editShippingAddress method in ConsumerOrderServiceImpl");
        try {
            ConsumerOrder consumerOrder = consumerOrderRepository.findById(consumerOrderId).orElseThrow(() -> new ConsumerOrderNotFoundException("Consumer order with given id not found!"));
            consumerOrder.setShippingAddress(address);
            return consumerOrderRepository.save(consumerOrder);
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    //method to edit the status of an order
    @Override
    public ConsumerOrder editStatus(String consumerOrderId, String status) throws ConsumerOrderNotFoundException {
        logger.info("Entered into editStatus method in ConsumerOrderServiceImpl");
        try {
            ConsumerOrder consumerOrder = consumerOrderRepository.findById(consumerOrderId).orElseThrow(() -> new ConsumerOrderNotFoundException("Consumer order with given id not found!"));
            consumerOrder.setStatus(status);
            return consumerOrderRepository.save(consumerOrder);
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    //method to get all orders
    @Override
    public List<ConsumerOrder> getAllOrders() {
        logger.info("Entered into getAllOrders method in ConsumerOrderServiceImpl");
        try {
            return consumerOrderRepository.findAll();
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    //method to get an order by id
    @Override
    public ConsumerOrder getOrderById(String id) throws ConsumerOrderNotFoundException {
        logger.info("Entered into getOrderById method in ConsumerOrderServiceImpl");
        try {
            return consumerOrderRepository.findById(id).orElseThrow(() -> new ConsumerOrderNotFoundException("Consumer order with given id not found!"));
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }

    @Override
    public Integer getProductCount() {
        logger.info("Entered into getProductCount method in ConsumerOrderServiceImpl");
        try {
            int count = 0;
            List<ConsumerOrder> orders = consumerOrderRepository.findAll();
            for (ConsumerOrder order :
                    orders) {
                count += order.getProducts().size();
            }
            return count;
        }
        catch (MongoSocketOpenException exception){
            logger.error("Error connecting to database: ",exception);
            return null;
        }
    }
}

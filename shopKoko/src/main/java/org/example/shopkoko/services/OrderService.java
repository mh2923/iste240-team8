package org.example.shopkoko.services;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Order;
import org.example.shopkoko.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findOrdersByCustomerId(customerId);
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id).map(order -> {
            order.setOrderDate(updatedOrder.getOrderDate());
            order.setOrderDescription(updatedOrder.getOrderDescription());
            order.setStatus(updatedOrder.getStatus());
            order.setProduct(updatedOrder.getProduct());
            order.setCustomer(updatedOrder.getCustomer());
            return orderRepository.save(order);
        }).orElse(null);
    }

    public int updateOrderStatus(Long id, String status) {
        return orderRepository.updateStatusById(id, status);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
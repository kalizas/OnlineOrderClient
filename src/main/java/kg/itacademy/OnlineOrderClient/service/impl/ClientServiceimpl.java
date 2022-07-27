package kg.itacademy.OnlineOrderClient.service.impl;


import kg.itacademy.OnlineOrderClient.entity.Order;
import kg.itacademy.OnlineOrderClient.model.OrderModel;

public class ClientServiceimpl {

    @Override
    public OrderModel createOrder(OrderModel orderModel){
        Order order = new Order();
    }

//    @Override
//    public OrderModel createOrder(OrderModel orderModel) {
//        Order order = new Order();
//        order.setId(orderModel.getId());
//        order.setScheduleTime(orderModel.getScheduleTime());
//        //TODO сетит энтити меню

//        order.setMenu(orderModel.getMenu());
//        return orderModel;
//    }
//
//    @Override
//    public OrderModel viewOrder(OrderModel orderModel) {
//        return null;
//    }
}

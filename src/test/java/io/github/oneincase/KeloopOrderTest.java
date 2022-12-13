package io.github.oneincase;

import io.github.oneincase.core.OrderBase;
import io.github.oneincase.service.KeloopOrderService;
import io.github.oneincase.service.impl.KeloopOrderServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class KeloopOrderTest {

    public static KeloopOrderService keloopOrderService;

    @BeforeAll
    public static void initService() {
        keloopOrderService = new KeloopOrderServiceImpl(Init.getBaseService());
    }

    /**
     * 创建订单
     */
    @Test
    public void createOrder() {

    }

    /**
     * 获取订单详情
     */
    @Test
    public void getOrderInfo() {
        OrderBase orderBase = new OrderBase();
        orderBase.setTrade_no("20071316082100002");
        OrderBase orderBaseRes = keloopOrderService.getOrderInfo(orderBase).parseObj(OrderBase.class);
        System.out.println(orderBaseRes);
    }

}

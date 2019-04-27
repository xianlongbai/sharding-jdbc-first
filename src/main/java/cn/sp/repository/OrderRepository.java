package cn.sp.repository;

import cn.sp.bean.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order,Long> {

}

package com.wiltech.admin.dashboard.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiltech.admin.dashboard.entities.OrderRecieved;

@Repository
@Qualifier(value = "orderRecievedRepository")
public interface OrderRecievedRepository extends JpaRepository<OrderRecieved, Long> {
}

package com.CommuVerse.CommuVerse_api.repository;

import com.CommuVerse.CommuVerse_api.model.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

    List<Subscription> findByUserId(Integer userId);
}
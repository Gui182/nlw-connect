package br.com.nlw.events.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.nlw.events.model.Subscription;

public interface SubscriptionRepo extends CrudRepository<Subscription, Integer> {

}

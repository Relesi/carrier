package br.com.relesi.cloud.services.carrier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.relesi.cloud.services.carrier.model.Delivery;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {

}

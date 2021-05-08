package br.com.relesi.cloud.services.carrier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.relesi.cloud.services.carrier.dto.DeliveryDTO;
import br.com.relesi.cloud.services.carrier.dto.VoucherDTO;
import br.com.relesi.cloud.services.carrier.model.Delivery;
import br.com.relesi.cloud.services.carrier.repository.DeliveryRepository;

@Service
public class DeliveryService {

	@Autowired
	private DeliveryRepository repository;

	//correct method syntax
	public VoucherDTO reservationDelivery(DeliveryDTO deliveryDTO) {

		Delivery delivery = new Delivery();

//		delivery.setDateForSearch(deliveryDTO.getDateForDelivery());
//		delivery.setDeliveryScheduled(deliveryDTO.getDateForDelivery().plusDays(1l));
//		delivery.setDestinationAddress(deliveryDTO.getDestinationAddress());
//		delivery.setOriginAddress(deliveryDTO.getOriginAddress());
//		delivery.setOrderId(deliveryDTO.getOrderId());

		repository.save(delivery);

		VoucherDTO voucher = new VoucherDTO();
		voucher.setNumber(delivery.getId());
		voucher.setDeliveryScheduled(delivery.getDeliveryScheduled());

		return voucher;
	}

}

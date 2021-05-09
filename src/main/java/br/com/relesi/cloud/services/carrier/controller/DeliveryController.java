package br.com.relesi.cloud.services.carrier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.relesi.cloud.services.carrier.dto.DeliveryDTO;
import br.com.relesi.cloud.services.carrier.dto.VoucherDTO;
import br.com.relesi.cloud.services.carrier.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@Autowired
	private DeliveryService deliveryService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservationDelivery(@RequestBody DeliveryDTO deliveryDTO) {
		return deliveryService.reservationDelivery(deliveryDTO);
	}
}

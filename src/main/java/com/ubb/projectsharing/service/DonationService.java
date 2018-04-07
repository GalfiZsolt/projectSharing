package com.ubb.projectsharing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ubb.projectsharing.domain.Donation;
import com.ubb.projectsharing.repository.DonationRepository;

@Service
@Transactional
public class DonationService {

	private final Logger log = LoggerFactory.getLogger(DonationService.class);

	private final DonationRepository donationRepository;

	public DonationService(DonationRepository donationRepository) {
		super();
		this.donationRepository = donationRepository;
	}

	public Donation findDonationByTitle(String title) {
		Donation donation = donationRepository.findByTitle(title);
		return donation;
	}

}

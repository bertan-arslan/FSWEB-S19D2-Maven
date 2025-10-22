package com.workintech.s18d4.service;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.repository.AddressRepository;
import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.repository.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address find(long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address delete(long id) {
        Address address = find(id);
        addressRepository.delete(address);
        return address;
    }

}
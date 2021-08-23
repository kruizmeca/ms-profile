package com.spring.msprofile.repository;

import com.spring.msprofile.entity.TypeCustomer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface TypeCustomerRepository extends ReactiveMongoRepository<TypeCustomer, String> {
    Mono<TypeCustomer> findBySubTypeId(String id);
}

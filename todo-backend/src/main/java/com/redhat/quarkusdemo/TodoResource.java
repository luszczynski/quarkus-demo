package com.redhat.quarkusdemo;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface TodoResource extends PanacheEntityResource<Todo, Long> {
    
}
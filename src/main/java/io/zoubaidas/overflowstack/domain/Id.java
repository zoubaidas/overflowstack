package io.zoubaidas.overflowstack.domain;

import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode
public abstract class Id {
    private UUID id;

    public Id(){
        id = UUID.randomUUID();
    }

    public Id(String id){

    }
    public Id(UUID id){
        if (id == null){
            throw new NullPointerException();
        }
        this.id = id;
    }

    public String asString(){
        return id.toString();
    }
}
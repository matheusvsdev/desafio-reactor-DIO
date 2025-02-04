package com.matheusvsdev.desafioreactordio;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        long adminCount = users.stream().filter(user -> user.isAdmin()).count();
        return Mono.just(adminCount);
    }

}

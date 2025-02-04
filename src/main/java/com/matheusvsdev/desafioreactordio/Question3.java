package com.matheusvsdev.desafioreactordio;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        if(user.password().length() > 8){
            return Mono.empty();
        }
        return Mono.error(new IllegalArgumentException("Password length must be 8"));
    }

}

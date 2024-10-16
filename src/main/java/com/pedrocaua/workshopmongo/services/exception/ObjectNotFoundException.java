package com.pedrocaua.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {				//ao buscar um id especifico e nao existir, retorna essa excecao
	private static final long serialVersionUID = 1L;				

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
}

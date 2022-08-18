package model.exceptions;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);//Para permitirmos instanciar a excecao personalizada passando uma mensagem
	}
	
	
}

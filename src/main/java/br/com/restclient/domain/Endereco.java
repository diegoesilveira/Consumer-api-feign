package br.com.restclient.domain;

import lombok.Data;

@Data
public class Endereco {
	
	  private String cep;
	  private String logradouro;
	  private String complemento;
	  private String bairro;
	  private String localidade;
	  private String uf;
	  private long ibge;

}

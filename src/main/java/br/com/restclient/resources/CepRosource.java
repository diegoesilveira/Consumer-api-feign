package br.com.restclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.restclient.client.ViaCepClient;
import br.com.restclient.domain.Endereco;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/ceps")
public class CepRosource {

	@Autowired 
	private ViaCepClient viaCepClient;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value= "/{cep}", method = RequestMethod.GET)
	public Endereco getCep(@PathVariable String cep) {
		return viaCepClient.buscaEnderecoPor(cep);
	}
}

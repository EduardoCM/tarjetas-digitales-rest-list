package com.certificatic.tarjetas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certificatic.tarjetas.model.Tarjeta;
import com.certificatic.tarjetas.service.TarjetaService;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaApi {
	
	@Autowired
	private TarjetaService tarjetaService;
	
	@PostMapping
	public Tarjeta creartarjeta(@RequestBody Tarjeta tarjeta) {
		return tarjetaService.creartarjeta(tarjeta);	
	}

	@GetMapping
	public  List<Tarjeta> obtenerTarjetas(){
		return tarjetaService.obtenerTarjetas();
	}

	@GetMapping("/{numeroTarjeta}")
	public Tarjeta obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		return tarjetaService.obtenerTarjeta(numeroTarjeta);		
	}

	@DeleteMapping("/{numeroTarjeta}")
	public void eliminarTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}

	@PutMapping("/{index}")
	public Tarjeta actualizarTarjeta(@PathVariable(name="index") int index, @RequestBody Tarjeta tarjeta) {
		return tarjetaService.actualizarTarjeta(index, tarjeta);
	}

}

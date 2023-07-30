package br.ufscar.dc.dsw.Trabalho2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufscar.dc.dsw.Trabalho2.dao.ISiteReservaDAO;

@Controller
@RequestMapping("/sitereserva")
public class SiteReservaController {

	@Autowired
	private ISiteReservaDAO siteReserva;
}

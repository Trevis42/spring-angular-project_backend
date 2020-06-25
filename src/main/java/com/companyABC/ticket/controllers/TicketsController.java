package com.companyABC.ticket.controllers;

import java.util.List;

import com.companyABC.ticket.models.Ticket;
import com.companyABC.ticket.repositories.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tickets") // site path for api
public class TicketsController {
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping // api endpoint forwards get replies to this method if using HTTP GET
    public List<Ticket> list() {
        return ticketRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @GetMapping("/id")
    public Ticket get(@PathVariable("id") long id) {
        return ticketRepository.getOne(id);
    }
}
package com.companyABC.ticket.repositories;

import com.companyABC.ticket.models.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
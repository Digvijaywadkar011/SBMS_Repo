package in.SBMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}

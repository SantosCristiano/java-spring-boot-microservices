package academy.devdojo.youtube.core.repository;


import academy.devdojo.youtube.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Cristiano Santos
 */
public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);

}

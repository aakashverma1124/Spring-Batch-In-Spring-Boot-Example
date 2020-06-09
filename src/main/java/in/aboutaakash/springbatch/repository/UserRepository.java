package in.aboutaakash.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aboutaakash.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

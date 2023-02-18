package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.DPActorEntity;
import srl.neotech.repository.DPActorRepository;

@Component
public class DPActorDao {
	
	@Autowired
	DPActorRepository dPActorRepository;
	
	public List<DPActorEntity> getDPActor (String role1, String role2) {
		return dPActorRepository.getDPActor(role1, role2);
	}
	
}

package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.entities.concretes.JobPosition;


public interface JobPositionService {

	List<JobPosition> getAll();	
	
}

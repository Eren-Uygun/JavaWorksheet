package kodlamaIo.Hrms.entities.concretes;


import javax.persistence.*;

import kodlamaIo.Hrms.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
	@Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="jobs")
	public class Job implements IEntity  {
    	
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="job_name")
		private String position_name;

		/*
		 * public int getId() { return id; }
		 * 
		 * public void setId(int id) { this.id = id; }
		 * 
		 * public String getPosition_name() { return position_name; }
		 * 
		 * public void setPosition_name(String position_name) { this.position_name =
		 * position_name; }
		 */
		

}

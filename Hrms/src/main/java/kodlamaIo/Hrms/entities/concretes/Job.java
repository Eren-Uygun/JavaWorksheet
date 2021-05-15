package kodlamaIo.Hrms.entities.concretes;

import javax.persistence.*;

	@Entity
	@Table(name="jobs")
	public class Job {
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="job_name")
		private String position_name;

		public Job() {

		}

		public Job(int id, String position_name) {
			super();
			this.id = id;
			this.position_name = position_name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPosition_name() {
			return position_name;
		}

		public void setPosition_name(String position_name) {
			this.position_name = position_name;
		}
		

}

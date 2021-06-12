package kodlamaio.Hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "photos")
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	@ApiModelProperty(hidden = true)
	private int id;
	
	@Column(name = "image_url")
	private String urlAddress;
	
	@OneToOne()
    @JoinColumn(name = "candidate_id", referencedColumnName = "user_id")
    private Candidate candidate;	

}

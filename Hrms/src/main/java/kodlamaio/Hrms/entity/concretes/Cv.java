package kodlamaio.Hrms.entity.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate"})
public class Cv {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    @ApiModelProperty(hidden = true)
	    private int id;
	  
	  
	    @Column(name = "description")
	    private String description;
	    
	    @Column(name = "github_link")
	    private String github;

	    @Column(name = "linkedin_link")
	    private String linkedin;
	    
	    @Column(name="is_active")
		private boolean isActive;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "candidate_id")
	    @JsonIgnore()
	    private Candidate candidate;

}

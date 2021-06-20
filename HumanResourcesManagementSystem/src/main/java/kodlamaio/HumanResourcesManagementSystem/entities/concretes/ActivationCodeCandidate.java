package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.Activation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "activation_code_candidates")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer"})
public class ActivationCodeCandidate extends Activation {
	
    @OneToOne
    @JoinColumn(name = "candidate_id")
    @ApiModelProperty(hidden = true)
    private Candidate candidate;

}

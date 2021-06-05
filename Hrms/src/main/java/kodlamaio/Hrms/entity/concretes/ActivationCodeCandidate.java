package kodlamaio.Hrms.entity.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.Hrms.entity.abstracts.Activation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "activation_code_candidates")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate"})
public class ActivationCodeCandidate extends Activation {
	
    @OneToOne
    @JoinColumn(name = "candidate_id")
    @ApiModelProperty(hidden = true)
    private Candidate candidate;

}

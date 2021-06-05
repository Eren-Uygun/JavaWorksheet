package kodlamaio.Hrms.entity.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.Hrms.entity.abstracts.Activation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "activation_code_employers")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer"})
public class ActivationCodeEmployer extends Activation {
	
    @OneToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
	

}

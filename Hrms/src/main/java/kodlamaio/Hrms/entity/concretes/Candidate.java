package kodlamaio.Hrms.entity.concretes;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.Hrms.entity.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","activationCodeCandidate","educations","candidate","cv"})
public class Candidate extends User {
	
	@Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "national_identity_number",nullable = false)
    private String nationalIdentityNumber;

    @Column(name = "birth_day")
    private Date birthDay;
    
    @OneToOne(mappedBy = "candidate",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore()
    private ActivationCodeCandidate activationCodeCandidate;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL)
    @JsonIgnore()
    private List<JobExperience> jobExperience;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL)
    @JsonIgnore()
    private List<Education> educations;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    @JsonIgnore()
    private List<Language> language;

    @OneToOne(mappedBy = "candidate",cascade = CascadeType.ALL)
    @JsonIgnore()
    private Cv cv;

}

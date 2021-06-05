package kodlamaio.Hrms.entity.concretes;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobExperiences","candidate"})
public class JobExperience {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(hidden = true)
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    @ApiModelProperty(hidden = true)
    private Candidate candidate;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name ="job_id")
    @NotNull
    @NotBlank
    private Job job;

    @Column(name = "start_year")
    @NotNull
    @NotBlank
    private Date startYear;

    @Column(name = "finish_year")
    private Date finishYear;

}

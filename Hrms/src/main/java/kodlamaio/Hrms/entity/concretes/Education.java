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
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "educations")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","candidate"})
public class Education {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private int id;

    @NotNull
    @NotBlank
    @Column(name="school_name")
    private String schoolName;

    @NotNull
    @NotBlank
    @Column(name = "department")
    private String department;

    @NotBlank
    @NotNull
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private String finishDate;

    @Column(name = "status")
    private String status;

    @ManyToOne( cascade=CascadeType.ALL)
    @JoinColumn(name = "candidate_id")
    @ApiModelProperty(hidden = true)
    private Candidate candidate;
    
    public String getFinishDate() {
        if (finishDate == null){
            this.finishDate = "Okuyor";
           // this.status = "Okuyor";
        }
        else {
        	//this.status = "Mezun";
        	return finishDate;
        }
        
        return finishDate;
        
    }
	
	

}

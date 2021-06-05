package kodlamaio.Hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.Hrms.entity.abstracts.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "employees")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerActivationByEmployee"})
public class Employee extends User {
	
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(mappedBy = "employee")
    @ApiModelProperty(hidden = true)
    private EmployerActivationByEmployee employerActivationByEmployee;

}

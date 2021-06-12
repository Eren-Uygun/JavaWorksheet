package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "employees")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerActivationByEmployee"})
public class Employee extends User {
	
	@NotBlank
	@NotNull
    @Column(name = "first_name")
    private String firstName;

	@NotBlank
	@NotNull
    @Column(name = "last_name")
    private String lastName;
    
	@NotBlank
	@NotNull
    @Column(name="department")
    private String department;
    
    
    @OneToOne(mappedBy = "employee")
    @ApiModelProperty(hidden = true)
    private EmployerActivationByEmployee employerActivationByEmployee;

}

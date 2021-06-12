package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.util.Date;

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


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employer_activation_by_employess")
public class EmployerActivationByEmployee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private int id;

    @Column(name = "confirmed_employee_id")
    private int confirmedEmployeeId;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "confirmed_date")
    private Date confirmedDate;

    @OneToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

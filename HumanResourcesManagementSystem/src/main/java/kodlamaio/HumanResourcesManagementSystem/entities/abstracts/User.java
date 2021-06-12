package kodlamaio.HumanResourcesManagementSystem.entities.abstracts;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Email
	@NotNull
	@NotBlank
	@Column(name = "email",nullable = false)
	private String email;
	
	@NotNull
	@NotBlank
	@Column(name = "password",nullable = false)
	private String password;
	
	@NotNull
	@NotBlank
	@Column(name = "password_repeat",nullable = false)
	private String passwordRepeat;
}

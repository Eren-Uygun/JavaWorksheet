package kodlamaio.Hrms.entity.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
	
	//Şifreler normalde hash ve salt olarak saklanacaktır.Ancak şu aşamada buna gerek yok.
	//ApiModelProperty anotasyonu ile id'miz otomatik olarak geleceği için kayıt yaparken id vermemize gerek yok.Bu kod onu kayıt sırasınra gizleyecektir.
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ApiModelProperty(hidden = true)
	private int id;
	
	@Column(name = "email",nullable = false)
	private String email;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	@Column(name = "password_repeat",nullable = false)
	private String passwordRepeat;
	
	


}

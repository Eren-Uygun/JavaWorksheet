package kodlamaio.Hrms.entity.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cover_letters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@JoinColumn(name = "cv_id")
	@ManyToOne
	private Cv cV;
	
	@NotNull
	@Size(max = 50)
	@Column(name="title")
	private String title;
	
	@NotNull
	@Size(max = 250)
	@Column(name="cover_letter")
	private String coverLetter;
	
	@NotNull
	@Column(name="is_active")
	private boolean isActive;
	
	@NotNull
	@Column(name="created_date")
	private LocalDate createdDate = LocalDate.now();

}

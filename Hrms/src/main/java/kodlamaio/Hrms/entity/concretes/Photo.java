package kodlamaio.Hrms.entity.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="photos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
public class Photo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @ApiModelProperty(hidden = true)
    private int id;

    @Column(name="url")
    private String url;

    @Column(name="public_id")
    private String PublicId;

    @Column(name="upload_date")
    private Date uploadDate;

    @ManyToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;

}

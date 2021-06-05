package kodlamaio.Hrms.entity.concretes;

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
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate"})
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @ApiModelProperty(hidden = true)
    private int id;

    @NotNull
    @NotBlank
    @Column(name = "language")
    private String language;

    @NotNull
    @NotBlank
    @Column(name = "level")
    private int level;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    @ApiModelProperty(hidden = true)
    private Candidate candidate;

}


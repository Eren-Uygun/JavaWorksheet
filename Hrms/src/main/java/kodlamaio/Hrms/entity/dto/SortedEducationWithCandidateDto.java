package kodlamaio.Hrms.entity.dto;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class SortedEducationWithCandidateDto {
	
    private int id;
    private String candidateName;
    private String candidateSurname;
    private String schoolName;
    private String graduateYear;

    public SortedEducationWithCandidateDto(int id, String candidateName, String candidateSurname, String schoolName, Date graduateYear) {
        this.id = id;
        this.candidateName = candidateName;
        this.candidateSurname = candidateSurname;
        this.schoolName = schoolName;
        
        if (graduateYear == null){
            this.graduateYear = "Okuyor";
        }else {
            int year = getYear(graduateYear);
            this.graduateYear = String.valueOf(year);
        }
    }
    private int getYear(Date date){
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        return year;
    }

}

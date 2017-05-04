package estimation.bean;

import java.util.List;

/**
 * Created by xuawai on 03/05/2017.
 */
public class Transaction {

    private String transcationName;

    private String transcationType;

    private String transcationDescription;

    private List<Step> steps;

    private String regulationOfSameLogic;

    private String regulationOfReturningStatus;

    public String getTranscationName() {
        return transcationName;
    }

    public void setTranscationName(String transcationName) {
        this.transcationName = transcationName;
    }

    public String getTranscationType() {
        return transcationType;
    }

    public void setTranscationType(String transcationType) {
        this.transcationType = transcationType;
    }

    public String getTranscationDescription() {
        return transcationDescription;
    }

    public void setTranscationDescription(String transcationDescription) {
        this.transcationDescription = transcationDescription;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getRegulationOfSameLogic() {
        return regulationOfSameLogic;
    }

    public void setRegulationOfSameLogic(String regulationOfSameLogic) {
        this.regulationOfSameLogic = regulationOfSameLogic;
    }

    public String getRegulationOfReturningStatus() {
        return regulationOfReturningStatus;
    }

    public void setRegulationOfReturningStatus(String regulationOfReturningStatus) {
        this.regulationOfReturningStatus = regulationOfReturningStatus;
    }
}

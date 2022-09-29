package tz.go.moh.him.ddr.mediator.esrs.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TestRejections {
    @JsonProperty("DateTimeStamp")
    @SerializedName("DateTimeStamp")
    private String dateTimeStamp;

    @JsonProperty("Versionstamp")
    @SerializedName("Versionstamp")
    private String versionStamp;

    @JsonProperty("LIMSDateTimeStamp")
    @SerializedName("LIMSDateTimeStamp")
    private String limsDateTimeStamp;

    @JsonProperty("OBRSetID")
    @SerializedName("OBRSetID")
    private Integer obrSetID;

    @JsonProperty("LOINCPanelCode")
    @SerializedName("LOINCPanelCode")
    private String loincPanelCode;

    @JsonProperty("LIMSPanelCode")
    @SerializedName("LIMSPanelCode")
    private String limsPanelCode;

    @JsonProperty("LIMSPanelDesc")
    @SerializedName("LIMSPanelDesc")
    private String limsPanelDesc;

    @JsonProperty("SpecimenDateTime")
    @SerializedName("SpecimenDateTime")
    private String specimenDateTime;

    @JsonProperty("ReceivedDateTime")
    @SerializedName("ReceivedDateTime")
    private String receivedDateTime;

    @JsonProperty("RegisteredDateTime")
    @SerializedName("RegisteredDateTime")
    private String registeredDateTime;

    @JsonProperty("AnalysisDateTime")
    @SerializedName("AnalysisDateTime")
    private String analysisDateTime;

    @JsonProperty("AuthorisedDateTime")
    @SerializedName("AuthorisedDateTime")
    private String authorisedDateTime;

    @JsonProperty("RequestingFacilityCode")
    @SerializedName("RequestingFacilityCode")
    private String requestingFacilityCode;

    @JsonProperty("ReceivingFacilityCode")
    @SerializedName("ReceivingFacilityCode")
    private String receivingFacilityCode;

    @JsonProperty("RegisteredBy")
    @SerializedName("RegisteredBy")
    private String registeredBy;

    @JsonProperty("TestedBy")
    @SerializedName("TestedBy")
    private String testedBy;

    @JsonProperty("AuthorisedBy")
    @SerializedName("AuthorisedBy")
    private String authorisedBy;

    @JsonProperty("EncryptedPatientID")
    @SerializedName("EncryptedPatientID")
    private String encryptedPatientID;

    @JsonProperty("HL7EthnicGroupCode")
    @SerializedName("HL7EthnicGroupCode")
    private String hl7EthnicGroupCode;

    @JsonProperty("TestingFacilityCode")
    @SerializedName("TestingFacilityCode")
    private String testingFacilityCode;

    @JsonProperty("LIMSFacilityCode")
    @SerializedName("LIMSFacilityCode")
    private String limsFacilityCode;

    @JsonProperty("TBLResults")
    @SerializedName("TBLResults")
    private List<Result> tblResults;

    public static class Result {
        @JsonProperty("DateTimeStamp")
        @SerializedName("DateTimeStamp")
        private String dateTimeStamp;

        @JsonProperty("Versionstamp")
        @SerializedName("Versionstamp")
        private String versionStamp;

        @JsonProperty("RequestID")
        @SerializedName("RequestID")
        private String requestID;

        @JsonProperty("OBRSetID")
        @SerializedName("OBRSetID")
        private Integer obrSetID;

        @JsonProperty("OBXSetID")
        @SerializedName("OBXSetID")
        private Integer obxSetID;

        @JsonProperty("LIMSObservationCode")
        @SerializedName("LIMSObservationCode")
        private String limsObservationCode;

        @JsonProperty("LIMSObservationDesc")
        @SerializedName("LIMSObservationDesc")
        private String limsObservationDesc;

        @JsonProperty("LIMSRptResult")
        @SerializedName("LIMSRptResult")
        private String limsRptResult;

        public String getDateTimeStamp() {
            return dateTimeStamp;
        }

        public void setDateTimeStamp(String dateTimeStamp) {
            this.dateTimeStamp = dateTimeStamp;
        }

        public String getVersionStamp() {
            return versionStamp;
        }

        public void setVersionStamp(String versionStamp) {
            this.versionStamp = versionStamp;
        }

        public String getRequestID() {
            return requestID;
        }

        public void setRequestID(String requestID) {
            this.requestID = requestID;
        }

        public Integer getObrSetID() {
            return obrSetID;
        }

        public void setObrSetID(Integer obrSetID) {
            this.obrSetID = obrSetID;
        }

        public Integer getObxSetID() {
            return obxSetID;
        }

        public void setObxSetID(Integer obxSetID) {
            this.obxSetID = obxSetID;
        }

        public String getLimsObservationCode() {
            return limsObservationCode;
        }

        public void setLimsObservationCode(String limsObservationCode) {
            this.limsObservationCode = limsObservationCode;
        }

        public String getLimsObservationDesc() {
            return limsObservationDesc;
        }

        public void setLimsObservationDesc(String limsObservationDesc) {
            this.limsObservationDesc = limsObservationDesc;
        }

        public String getLimsRptResult() {
            return limsRptResult;
        }

        public void setLimsRptResult(String limsRptResult) {
            this.limsRptResult = limsRptResult;
        }
    }

    public String getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(String dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getVersionStamp() {
        return versionStamp;
    }

    public void setVersionStamp(String versionStamp) {
        this.versionStamp = versionStamp;
    }

    public String getLimsDateTimeStamp() {
        return limsDateTimeStamp;
    }

    public void setLimsDateTimeStamp(String limsDateTimeStamp) {
        this.limsDateTimeStamp = limsDateTimeStamp;
    }

    public Integer getObrSetID() {
        return obrSetID;
    }

    public void setObrSetID(Integer obrSetID) {
        this.obrSetID = obrSetID;
    }

    public String getLoincPanelCode() {
        return loincPanelCode;
    }

    public void setLoincPanelCode(String loincPanelCode) {
        this.loincPanelCode = loincPanelCode;
    }

    public String getLimsPanelCode() {
        return limsPanelCode;
    }

    public void setLimsPanelCode(String limsPanelCode) {
        this.limsPanelCode = limsPanelCode;
    }

    public String getLimsPanelDesc() {
        return limsPanelDesc;
    }

    public void setLimsPanelDesc(String limsPanelDesc) {
        this.limsPanelDesc = limsPanelDesc;
    }

    public String getSpecimenDateTime() {
        return specimenDateTime;
    }

    public void setSpecimenDateTime(String specimenDateTime) {
        this.specimenDateTime = specimenDateTime;
    }

    public String getReceivedDateTime() {
        return receivedDateTime;
    }

    public void setReceivedDateTime(String receivedDateTime) {
        this.receivedDateTime = receivedDateTime;
    }

    public String getRegisteredDateTime() {
        return registeredDateTime;
    }

    public void setRegisteredDateTime(String registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
    }

    public String getAnalysisDateTime() {
        return analysisDateTime;
    }

    public void setAnalysisDateTime(String analysisDateTime) {
        this.analysisDateTime = analysisDateTime;
    }

    public String getAuthorisedDateTime() {
        return authorisedDateTime;
    }

    public void setAuthorisedDateTime(String authorisedDateTime) {
        this.authorisedDateTime = authorisedDateTime;
    }

    public String getRequestingFacilityCode() {
        return requestingFacilityCode;
    }

    public void setRequestingFacilityCode(String requestingFacilityCode) {
        this.requestingFacilityCode = requestingFacilityCode;
    }

    public String getReceivingFacilityCode() {
        return receivingFacilityCode;
    }

    public void setReceivingFacilityCode(String receivingFacilityCode) {
        this.receivingFacilityCode = receivingFacilityCode;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getTestedBy() {
        return testedBy;
    }

    public void setTestedBy(String testedBy) {
        this.testedBy = testedBy;
    }

    public String getAuthorisedBy() {
        return authorisedBy;
    }

    public void setAuthorisedBy(String authorisedBy) {
        this.authorisedBy = authorisedBy;
    }

    public String getEncryptedPatientID() {
        return encryptedPatientID;
    }

    public void setEncryptedPatientID(String encryptedPatientID) {
        this.encryptedPatientID = encryptedPatientID;
    }

    public String getHl7EthnicGroupCode() {
        return hl7EthnicGroupCode;
    }

    public void setHl7EthnicGroupCode(String hl7EthnicGroupCode) {
        this.hl7EthnicGroupCode = hl7EthnicGroupCode;
    }

    public String getTestingFacilityCode() {
        return testingFacilityCode;
    }

    public void setTestingFacilityCode(String testingFacilityCode) {
        this.testingFacilityCode = testingFacilityCode;
    }

    public String getLimsFacilityCode() {
        return limsFacilityCode;
    }

    public void setLimsFacilityCode(String limsFacilityCode) {
        this.limsFacilityCode = limsFacilityCode;
    }

    public List<Result> getTblResults() {
        return tblResults;
    }

    public void setTblResults(List<Result> tblResults) {
        this.tblResults = tblResults;
    }
}

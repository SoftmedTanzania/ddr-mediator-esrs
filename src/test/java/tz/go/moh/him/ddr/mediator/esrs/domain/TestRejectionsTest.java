package tz.go.moh.him.ddr.mediator.esrs.domain;
import com.google.gson.Gson;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestRejectionsTest {

    @Test
    public void testESRSAck() throws Exception {
        String jsonManifestPayload = "{\n" +
                "  \"DateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "  \"Versionstamp\": \"1.0.0\",\n" +
                "  \"LIMSDateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "  \"LIMSVersionstamp\": \"01.00.00.000\",\n" +
                "  \"RequestID\": \"TZTILLE-BB03-22010009\",\n" +
                "  \"OBRSetID\": 2,\n" +
                "  \"LOINCPanelCode\": \"test-code\",\n" +
                "  \"LIMSPanelCode\": \"EID\",\n" +
                "  \"LIMSPanelDesc\": \"EID\",\n" +
                "  \"HL7PriorityCode\": \"R\",\n" +
                "  \"SpecimenDateTime\": \"2022-01-28 10:30:00\",\n" +
                "  \"ReceivedDateTime\": \"2022-01-27 20:12:03\",\n" +
                "  \"RegisteredDateTime\": \"2022-01-27 20:12:03\",\n" +
                "  \"AnalysisDateTime\": null,\n" +
                "  \"AuthorisedDateTime\": null,\n" +
                "  \"AdmitAttendDateTime\": null,\n" +
                "  \"CollectionVolume\": \"0.0\",\n" +
                "  \"RequestingFacilityCode\": \"106002-9\",\n" +
                "  \"ReceivingFacilityCode\": \"102162-5\",\n" +
                "  \"LIMSPointOfCareDesc\": \"Bukoba\",\n" +
                "  \"RequestTypeCode\": \"\",\n" +
                "  \"ICD10ClinicalInfoCodes\": \"\",\n" +
                "  \"ClinicalInfo\": \"\",\n" +
                "  \"HL7SpecimenSourceCode\": \"\",\n" +
                "  \"LIMSSpecimenSourceCode\": \"\",\n" +
                "  \"LIMSSpecimenSourceDesc\": \"dbs\",\n" +
                "  \"HL7SpecimenSiteCode\": \"\",\n" +
                "  \"LIMSSpecimenSiteCode\": \"\",\n" +
                "  \"LIMSSpecimenSiteDesc\": \"\",\n" +
                "  \"WorkUnits\": \"0.0\",\n" +
                "  \"CostUnits\": \"0.0\",\n" +
                "  \"HL7SectionCode\": \"\",\n" +
                "  \"HL7ResultStatusCode\": \"\",\n" +
                "  \"RegisteredBy\": \"Rama Hussein\",\n" +
                "  \"TestedBy\": null,\n" +
                "  \"AuthorisedBy\": null,\n" +
                "  \"OrderingNotes\": \"\",\n" +
                "  \"EncryptedPatientID\": \"237f306841bd23a418878792252ff6c8\",\n" +
                "  \"AgeInYears\": 1,\n" +
                "  \"AgeInDays\": 410,\n" +
                "  \"HL7SexCode\": \"M\",\n" +
                "  \"HL7EthnicGroupCode\": \"\",\n" +
                "  \"Deceased\": \"false\",\n" +
                "  \"Newborn\": \"false\",\n" +
                "  \"HL7PatientClassCode\": \"\",\n" +
                "  \"AttendingDoctor\": \"\",\n" +
                "  \"TestingFacilityCode\": \"102162-5\",\n" +
                "  \"ReferringRequestID\": \"\",\n" +
                "  \"Therapy\": \"\",\n" +
                "  \"LIMSAnalyzerCode\": \"\",\n" +
                "  \"TargetTimeDays\": \"0\",\n" +
                "  \"TargetTimeMins\": \"0\",\n" +
                "  \"LIMSRejectionCode\": \"EID3\",\n" +
                "  \"LIMSRejectionDesc\": \"Unfilled/ empty DBS card\",\n" +
                "  \"LIMSFacilityCode\": \"203\",\n" +
                "  \"Repeated\": 0,\n" +
                "  \"TBLResults\": [\n" +
                "    {\n" +
                "      \"DateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "      \"Versionstamp\": \"1.0.0\",\n" +
                "      \"LIMSDateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "      \"LIMSVersionStamp\": \"01.00.00.000\",\n" +
                "      \"RequestID\": \"TZTILLE-BB03-22010009\",\n" +
                "      \"OBRSetID\": 2,\n" +
                "      \"OBXSetID\": 10,\n" +
                "      \"OBXSubID\": \"0\",\n" +
                "      \"LOINCCode\": \"\",\n" +
                "      \"HL7ResultTypeCode\": null,\n" +
                "      \"SIValue\": 0,\n" +
                "      \"SIUnits\": \"\",\n" +
                "      \"SILoRange\": \"0.0\",\n" +
                "      \"SIHiRange\": \"0.0\",\n" +
                "      \"HL7AbnormalFlagCodes\": \"\",\n" +
                "      \"DateTimeValue\": \"\",\n" +
                "      \"CodedValue\": \"\",\n" +
                "      \"ResultSemiquantitive\": \"0\",\n" +
                "      \"Note\": \"false\",\n" +
                "      \"LIMSObservationCode\": \"ARVRT\",\n" +
                "      \"LIMSObservationDesc\": \"Reason for HVL Testing\",\n" +
                "      \"LIMSRptResult\": \"DNAPCRConfirmationTestAfter6month\",\n" +
                "      \"LIMSRptUnits\": null,\n" +
                "      \"LIMSRptFlag\": \"\",\n" +
                "      \"LIMSRptRange\": \"\",\n" +
                "      \"LIMSCodedValue\": \"\",\n" +
                "      \"WorkUnits\": \"0.0\",\n" +
                "      \"CostUnits\": \"0.0\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"DateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "      \"Versionstamp\": \"1.0.0\",\n" +
                "      \"LIMSDateTimeStamp\": \"2022-09-22 10:38:36\",\n" +
                "      \"LIMSVersionStamp\": \"01.00.00.000\",\n" +
                "      \"RequestID\": \"TZTILLE-BB03-22010009\",\n" +
                "      \"OBRSetID\": 2,\n" +
                "      \"OBXSetID\": 2,\n" +
                "      \"OBXSubID\": \"0\",\n" +
                "      \"LOINCCode\": \"\",\n" +
                "      \"HL7ResultTypeCode\": null,\n" +
                "      \"SIValue\": 0,\n" +
                "      \"SIUnits\": \"\",\n" +
                "      \"SILoRange\": \"0.0\",\n" +
                "      \"SIHiRange\": \"0.0\",\n" +
                "      \"HL7AbnormalFlagCodes\": \"\",\n" +
                "      \"DateTimeValue\": \"\",\n" +
                "      \"CodedValue\": \"\",\n" +
                "      \"ResultSemiquantitive\": \"0\",\n" +
                "      \"Note\": \"false\",\n" +
                "      \"LIMSObservationCode\": \"CEN\",\n" +
                "      \"LIMSObservationDesc\": \"CTC/EID Number\",\n" +
                "      \"LIMSRptResult\": \"8569aedc3359ae2aa7eb8327a2330f4d40ebe56c21\",\n" +
                "      \"LIMSRptUnits\": null,\n" +
                "      \"LIMSRptFlag\": \"\",\n" +
                "      \"LIMSRptRange\": \"\",\n" +
                "      \"LIMSCodedValue\": \"\",\n" +
                "      \"WorkUnits\": \"0.0\",\n" +
                "      \"CostUnits\": \"0.0\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"LIMSRejectionArray\": [\n" +
                "    {\n" +
                "      \"EID3\": \"Unfilled/ empty DBS card\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        TestRejections testRejections = new Gson().fromJson(jsonManifestPayload, TestRejections.class);

        assertEquals("2022-09-22 10:38:36", testRejections.getDateTimeStamp());
        assertEquals("1.0.0", testRejections.getVersionStamp());
        assertEquals("test-code", testRejections.getLoincPanelCode());
        assertEquals("EID", testRejections.getLimsPanelCode());
        assertEquals("EID", testRejections.getLimsPanelDesc());
        assertEquals("2022-01-28 10:30:00", testRejections.getSpecimenDateTime());
        assertEquals("2022-01-27 20:12:03", testRejections.getReceivedDateTime());
        assertEquals("2022-01-27 20:12:03", testRejections.getRegisteredDateTime());
    }
}

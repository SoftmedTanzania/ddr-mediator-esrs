package tz.go.moh.him.ddr.mediator.esrs.orchestrator;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.codehaus.plexus.util.StringUtils;
import org.openhim.mediator.engine.MediatorConfig;
import org.openhim.mediator.engine.messages.MediatorHTTPRequest;
import org.openhim.mediator.engine.messages.MediatorHTTPResponse;
import tz.go.moh.him.ddr.mediator.esrs.utils.Constants;
import tz.go.moh.him.mediator.core.domain.ErrorMessage;
import tz.go.moh.him.mediator.core.domain.ResultDetail;
import tz.go.moh.him.mediator.core.validator.DateValidatorUtils;
import tz.go.moh.him.ddr.mediator.esrs.domain.TestRejections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRejectionOrchestrator extends BaseOrchestrator {

    /**
     * Initializes a new instance of the {@link TestRejectionOrchestrator} class.
     *
     * @param config The mediator configuration.
     */
    public TestRejectionOrchestrator(MediatorConfig config) {
        super(config);
    }

    /**
     * Validate iRIMS Request Required Fields
     *
     * @param testRejection to be validated
     * @return array list of validation results details for failed validations
     */
    public List<ResultDetail> validateRequiredFields(TestRejections testRejection) {
        List<ResultDetail> resultDetailsList = new ArrayList<>();

        if (StringUtils.isBlank(testRejection.getDateTimeStamp()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "dateTimeStamp"), null));

        if (StringUtils.isBlank(testRejection.getVersionStamp()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "versionStamp"), null));

        if (StringUtils.isBlank(String.valueOf(testRejection.getObrSetID())))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "obrSetID"), null));

        if (StringUtils.isBlank(testRejection.getLoincPanelCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LOINCPanelCode"), null));

        if (StringUtils.isBlank(testRejection.getLimsPanelCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LIMSPanelCode"), null));

        if (StringUtils.isBlank(testRejection.getLimsPanelDesc()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LIMSPanelDesc"), null));

        if (StringUtils.isBlank(testRejection.getSpecimenDateTime()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "specimenDateTime"), null));

        if (StringUtils.isBlank(testRejection.getRegisteredDateTime()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "registeredDateTime"), null));

        if (StringUtils.isBlank(testRejection.getReceivedDateTime()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "receivedDateTime"), null));

        if (StringUtils.isBlank(testRejection.getAnalysisDateTime()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "analysisDateTime"), null));

        if (StringUtils.isBlank(testRejection.getAuthorisedDateTime()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "authorisedDateTime"), null));

        if (StringUtils.isBlank(testRejection.getRequestingFacilityCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "requestingFacilityCode"), null));

        if (StringUtils.isBlank(testRejection.getReceivingFacilityCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "receivingFacilityCode"), null));

        if (StringUtils.isBlank(testRejection.getRegisteredBy()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "registeredBy"), null));

        if (StringUtils.isBlank(testRejection.getTestedBy()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "testedBy"), null));

        if (StringUtils.isBlank(testRejection.getAuthorisedBy()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "authorisedBy"), null));

        if (StringUtils.isBlank(testRejection.getEncryptedPatientID()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "encryptedPatientID"), null));

        if (StringUtils.isBlank(testRejection.getHl7EthnicGroupCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "hl7EthnicGroupCode"), null));

        if (StringUtils.isBlank(testRejection.getTestingFacilityCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "testingFAcilityCode"), null));

        if (StringUtils.isBlank(testRejection.getLimsFacilityCode()))
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "limsFacilityCode"), null));

        if (testRejection.getTblResults().size() == 0)
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "tblResults"), null));

        if (testRejection.getTblResults().size() > 0)
        {
            for (int i = 0; i < testRejection.getTblResults().size(); i++) {
                if (StringUtils.isBlank(testRejection.getTblResults().get(i).getDateTimeStamp()))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "dateTimeStamp"), null));

                if (StringUtils.isBlank(testRejection.getTblResults().get(i).getVersionStamp()))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "versionStamp"), null));

                if (StringUtils.isBlank(String.valueOf(testRejection.getTblResults().get(i).getRequestID())))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "requestID"), null));

                if (StringUtils.isBlank(String.valueOf(testRejection.getTblResults().get(i).getObrSetID())))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "obrSetID"), null));

                if (StringUtils.isBlank(String.valueOf(testRejection.getTblResults().get(i).getObxSetID())))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "obxSetID"), null));

                if (StringUtils.isBlank(testRejection.getTblResults().get(i).getLimsObservationCode()))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LIMSObservationCode"), null));

                if (StringUtils.isBlank(testRejection.getTblResults().get(i).getLimsObservationDesc()))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LIMSObservationDesc"), null));

                if (StringUtils.isBlank(testRejection.getTblResults().get(i).getLimsRptResult()))
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("GENERIC_ERR"), "LIMSRptResult"), null));

                try {
                    if (!DateValidatorUtils.isValidPastDate(testRejection.getTblResults().get(i).getDateTimeStamp(), checkDateFormatStrings(testRejection.getTblResults().get(i).getDateTimeStamp()))) {
                        resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "dateTimeStamp"), null));
                    } else {
                        SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getTblResults().get(i).getDateTimeStamp()));
                        testRejection.getTblResults().get(i).setDateTimeStamp(ldrDateFormat.format(requestDateFormat.parse(testRejection.getTblResults().get(i).getDateTimeStamp())));

                    }
                } catch (ParseException e) {
                    log.info(e.toString());
                    resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_INVALID_PAYLOAD"), ""), null));
                }
            }

        }

        try {
            if (!DateValidatorUtils.isValidPastDate(testRejection.getDateTimeStamp(), checkDateFormatStrings(testRejection.getDateTimeStamp()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "dateTimeStamp"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getDateTimeStamp()));
                testRejection.setDateTimeStamp(ldrDateFormat.format(requestDateFormat.parse(testRejection.getDateTimeStamp())));

            }

            if (!DateValidatorUtils.isValidPastDate(testRejection.getSpecimenDateTime(), checkDateFormatStrings(testRejection.getSpecimenDateTime()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "specimenDateTime"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getSpecimenDateTime()));
                testRejection.setSpecimenDateTime(ldrDateFormat.format(requestDateFormat.parse(testRejection.getSpecimenDateTime())));
            }

            if (!DateValidatorUtils.isValidPastDate(testRejection.getReceivedDateTime(), checkDateFormatStrings(testRejection.getReceivedDateTime()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "receivedDateTime"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getReceivedDateTime()));
                testRejection.setReceivedDateTime(ldrDateFormat.format(requestDateFormat.parse(testRejection.getReceivedDateTime())));
            }

            if (!DateValidatorUtils.isValidPastDate(testRejection.getRegisteredDateTime(), checkDateFormatStrings(testRejection.getRegisteredDateTime()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "registeredDateTime"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getRegisteredDateTime()));
                testRejection.setRegisteredDateTime(ldrDateFormat.format(requestDateFormat.parse(testRejection.getRegisteredDateTime())));
            }

            if (!DateValidatorUtils.isValidPastDate(testRejection.getAnalysisDateTime(), checkDateFormatStrings(testRejection.getAnalysisDateTime()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "analysisDateTime"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getAnalysisDateTime()));
                testRejection.setAnalysisDateTime(ldrDateFormat.format(requestDateFormat.parse(testRejection.getAnalysisDateTime())));
            }

            if (!DateValidatorUtils.isValidPastDate(testRejection.getAuthorisedDateTime(), checkDateFormatStrings(testRejection.getAuthorisedDateTime()))) {
                resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_DATE_IS_NOT_VALID_PAST_DATE"), "authorisedDateTime"), null));
            } else {
                SimpleDateFormat requestDateFormat = new SimpleDateFormat(checkDateFormatStrings(testRejection.getAuthorisedDateTime()));
                testRejection.setAuthorisedDateTime(ldrDateFormat.format(requestDateFormat.parse(testRejection.getAuthorisedDateTime())));
            }

        } catch (ParseException e) {
            resultDetailsList.add(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, String.format(errorMessageResource.getString("ERROR_INVALID_PAYLOAD"), ""), null));
        }

        log.info("results are" + resultDetailsList);
        return resultDetailsList;
    }

    @Override
    public void onReceive(Object msg) {
        if (msg instanceof MediatorHTTPRequest) {
            workingRequest = (MediatorHTTPRequest) msg;

            log.info("Received request: " + workingRequest.getHost() + " " + workingRequest.getMethod() + " " + workingRequest.getPath());

            //Converting the received request body to POJO List
            TestRejections testRequest;
            try {
                testRequest = convertMessageBodyToPojoList(((MediatorHTTPRequest) msg).getBody());
                log.info("Received payload in JSON = " + new Gson().toJson(testRequest));

                TestRejections validatedRequest;
                if (validateRequiredFields(testRequest).size() > 0) {

                    for (ResultDetail resultDetail : validateRequiredFields(testRequest)) {
                        ErrorMessage errorMessage = new ErrorMessage(
                                workingRequest.getBody(),
                                Arrays.asList(
                                        new ResultDetail(resultDetail.getType(), resultDetail.getMessage(), resultDetail.getStackTrace())
                                )
                        );
                        errorMessages.add(errorMessage);
                    }

                    validatedRequest = null;
                } else {
                    validatedRequest = testRequest;

                }

                sendDataToLDR(new Gson().toJson(validatedRequest), Constants.REQUEST);

            } catch (Exception e) {
                //In-case of an exception creating an error message with the stack trace
                ErrorMessage errorMessage = new ErrorMessage(
                        workingRequest.getBody(),
                        Arrays.asList(new ResultDetail(ResultDetail.ResultsDetailsType.ERROR, e.getMessage(), tz.go.moh.him.mediator.core.utils.StringUtils.writeStackTraceToString(e)))
                );
                errorMessages.add(errorMessage);
            }

        } else if (msg instanceof MediatorHTTPResponse) { //respond
            log.info("Received response from ddr");
            (workingRequest).getRequestHandler().tell(((MediatorHTTPResponse) msg).toFinishRequest(), getSelf());
        } else {
            unhandled(msg);
        }
    }

    protected TestRejections convertMessageBodyToPojoList(String msg) throws JsonSyntaxException {
        return new Gson().fromJson(msg, TestRejections.class);
    }


}



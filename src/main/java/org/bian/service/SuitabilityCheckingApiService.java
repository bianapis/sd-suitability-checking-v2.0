/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SuitabilityCheckingApiService {

	SDSuitabilityCheckingActivateOutputModel activate(SDSuitabilityCheckingActivateInputModel request);
	
	SDSuitabilityCheckingConfigureOutputModel configure(String sdReferenceId, SDSuitabilityCheckingConfigureInputModel request);
	
	CRSuitabilityAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRSuitabilityAssessmentEvaluateInputModel request);
	
	CRSuitabilityAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentExchangeInputModel request);
	
	SDSuitabilityCheckingFeedbackOutputModel feedback(String sdReferenceId, SDSuitabilityCheckingFeedbackInputModel request);
	
	CRSuitabilityAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentGrantInputModel request);
	
	CRSuitabilityAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentRequestInputModel request);
	
	SDSuitabilityCheckingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSuitabilityAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRSuitabilityAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentUpdateInputModel request);
	
}

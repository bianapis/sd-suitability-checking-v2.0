/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SuitabilityCheckingApiServiceImpl implements SuitabilityCheckingApiService {

	public SDSuitabilityCheckingActivateOutputModel activate(SDSuitabilityCheckingActivateInputModel request){
		return JsonReader.read("activate-SDSuitabilityCheckingActivateOutputModel.json",new TypeReference<SDSuitabilityCheckingActivateOutputModel>(){});
	}
	
	public SDSuitabilityCheckingConfigureOutputModel configure(String sdReferenceId, SDSuitabilityCheckingConfigureInputModel request){
		return JsonReader.read("configure-SDSuitabilityCheckingConfigureOutputModel.json",new TypeReference<SDSuitabilityCheckingConfigureOutputModel>(){});
	}
	
	public CRSuitabilityAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRSuitabilityAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRSuitabilityAssessmentEvaluateOutputModel.json",new TypeReference<CRSuitabilityAssessmentEvaluateOutputModel>(){});
	}
	
	public CRSuitabilityAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRSuitabilityAssessmentExchangeOutputModel.json",new TypeReference<CRSuitabilityAssessmentExchangeOutputModel>(){});
	}
	
	public SDSuitabilityCheckingFeedbackOutputModel feedback(String sdReferenceId, SDSuitabilityCheckingFeedbackInputModel request){
		return JsonReader.read("feedback-SDSuitabilityCheckingFeedbackOutputModel.json",new TypeReference<SDSuitabilityCheckingFeedbackOutputModel>(){});
	}
	
	public CRSuitabilityAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRSuitabilityAssessmentGrantOutputModel.json",new TypeReference<CRSuitabilityAssessmentGrantOutputModel>(){});
	}
	
	public CRSuitabilityAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentRequestInputModel request){
		return JsonReader.read("request-CRSuitabilityAssessmentRequestOutputModel.json",new TypeReference<CRSuitabilityAssessmentRequestOutputModel>(){});
	}
	
	public SDSuitabilityCheckingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSuitabilityCheckingRetrieveOutputModel.json",new TypeReference<SDSuitabilityCheckingRetrieveOutputModel>(){});
	}
	
	public CRSuitabilityAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSuitabilityAssessmentRetrieveOutputModel.json",new TypeReference<CRSuitabilityAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRSuitabilityAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSuitabilityAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRSuitabilityAssessmentUpdateOutputModel.json",new TypeReference<CRSuitabilityAssessmentUpdateOutputModel>(){});
	}
	
}

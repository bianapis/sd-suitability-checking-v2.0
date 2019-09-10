package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentEvaluateInputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentEvaluateInputModel
 */
public class CRSuitabilityAssessmentEvaluateInputModel   {
  private String suitabilityCheckingServicingSessionReference = null;

  private Object suitabilityAssessmentEvaluateActionRecord = null;

  private String suitabilityAssessmentInstanceStatus = null;

  private CRSuitabilityAssessmentEvaluateInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return suitabilityCheckingServicingSessionReference
  **/

  public String getSuitabilityCheckingServicingSessionReference() {
    return suitabilityCheckingServicingSessionReference;
  }

  public void setSuitabilityCheckingServicingSessionReference(String suitabilityCheckingServicingSessionReference) {
    this.suitabilityCheckingServicingSessionReference = suitabilityCheckingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return suitabilityAssessmentEvaluateActionRecord
  **/

  public Object getSuitabilityAssessmentEvaluateActionRecord() {
    return suitabilityAssessmentEvaluateActionRecord;
  }

  public void setSuitabilityAssessmentEvaluateActionRecord(Object suitabilityAssessmentEvaluateActionRecord) {
    this.suitabilityAssessmentEvaluateActionRecord = suitabilityAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Suitability Assessment instance (e.g. initialised, pending, active) 
   * @return suitabilityAssessmentInstanceStatus
  **/

  public String getSuitabilityAssessmentInstanceStatus() {
    return suitabilityAssessmentInstanceStatus;
  }

  public void setSuitabilityAssessmentInstanceStatus(String suitabilityAssessmentInstanceStatus) {
    this.suitabilityAssessmentInstanceStatus = suitabilityAssessmentInstanceStatus;
  }


  /**
   * Get suitabilityAssessmentInstanceRecord
   * @return suitabilityAssessmentInstanceRecord
  **/

  public CRSuitabilityAssessmentEvaluateInputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentEvaluateInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
  }


}


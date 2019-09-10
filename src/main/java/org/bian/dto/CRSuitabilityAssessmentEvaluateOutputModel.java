package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentEvaluateOutputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentEvaluateOutputModel
 */
public class CRSuitabilityAssessmentEvaluateOutputModel   {
  private String suitabilityAssessmentInstanceReference = null;

  private String suitabilityAssessmentEvaluateActionReference = null;

  private Object suitabilityAssessmentEvaluateActionRecord = null;

  private String suitabilityAssessmentInstanceStatus = null;

  private CRSuitabilityAssessmentEvaluateOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Suitability Assessment instance 
   * @return suitabilityAssessmentInstanceReference
  **/

  public String getSuitabilityAssessmentInstanceReference() {
    return suitabilityAssessmentInstanceReference;
  }

  public void setSuitabilityAssessmentInstanceReference(String suitabilityAssessmentInstanceReference) {
    this.suitabilityAssessmentInstanceReference = suitabilityAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return suitabilityAssessmentEvaluateActionReference
  **/

  public String getSuitabilityAssessmentEvaluateActionReference() {
    return suitabilityAssessmentEvaluateActionReference;
  }

  public void setSuitabilityAssessmentEvaluateActionReference(String suitabilityAssessmentEvaluateActionReference) {
    this.suitabilityAssessmentEvaluateActionReference = suitabilityAssessmentEvaluateActionReference;
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

  public CRSuitabilityAssessmentEvaluateOutputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentEvaluateOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
  }


}


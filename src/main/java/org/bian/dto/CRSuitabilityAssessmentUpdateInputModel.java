package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentUpdateInputModel
 */
public class CRSuitabilityAssessmentUpdateInputModel   {
  private String suitabilityCheckingServicingSessionReference = null;

  private String suitabilityAssessmentInstanceReference = null;

  private CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;

  private Object suitabilityAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get suitabilityAssessmentInstanceRecord
   * @return suitabilityAssessmentInstanceRecord
  **/

  public CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return suitabilityAssessmentUpdateActionTaskRecord
  **/

  public Object getSuitabilityAssessmentUpdateActionTaskRecord() {
    return suitabilityAssessmentUpdateActionTaskRecord;
  }

  public void setSuitabilityAssessmentUpdateActionTaskRecord(Object suitabilityAssessmentUpdateActionTaskRecord) {
    this.suitabilityAssessmentUpdateActionTaskRecord = suitabilityAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


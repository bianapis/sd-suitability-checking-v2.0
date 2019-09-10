package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentExchangeInputModelSuitabilityAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentExchangeInputModel
 */
public class CRSuitabilityAssessmentExchangeInputModel   {
  private String suitabilityCheckingServicingSessionReference = null;

  private String suitabilityAssessmentInstanceReference = null;

  private Object suitabilityAssessmentExchangeActionTaskRecord = null;

  private CRSuitabilityAssessmentExchangeInputModelSuitabilityAssessmentExchangeActionRequest suitabilityAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return suitabilityAssessmentExchangeActionTaskRecord
  **/

  public Object getSuitabilityAssessmentExchangeActionTaskRecord() {
    return suitabilityAssessmentExchangeActionTaskRecord;
  }

  public void setSuitabilityAssessmentExchangeActionTaskRecord(Object suitabilityAssessmentExchangeActionTaskRecord) {
    this.suitabilityAssessmentExchangeActionTaskRecord = suitabilityAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get suitabilityAssessmentExchangeActionRequest
   * @return suitabilityAssessmentExchangeActionRequest
  **/

  public CRSuitabilityAssessmentExchangeInputModelSuitabilityAssessmentExchangeActionRequest getSuitabilityAssessmentExchangeActionRequest() {
    return suitabilityAssessmentExchangeActionRequest;
  }

  public void setSuitabilityAssessmentExchangeActionRequest(CRSuitabilityAssessmentExchangeInputModelSuitabilityAssessmentExchangeActionRequest suitabilityAssessmentExchangeActionRequest) {
    this.suitabilityAssessmentExchangeActionRequest = suitabilityAssessmentExchangeActionRequest;
  }


}


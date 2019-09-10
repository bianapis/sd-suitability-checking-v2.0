package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentExchangeOutputModel
 */
public class CRSuitabilityAssessmentExchangeOutputModel   {
  private String suitabilityAssessmentExchangeActionTaskReference = null;

  private Object suitabilityAssessmentExchangeActionTaskRecord = null;

  private String suitabilityAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Suitability Assessment instance exchange service call 
   * @return suitabilityAssessmentExchangeActionTaskReference
  **/

  public String getSuitabilityAssessmentExchangeActionTaskReference() {
    return suitabilityAssessmentExchangeActionTaskReference;
  }

  public void setSuitabilityAssessmentExchangeActionTaskReference(String suitabilityAssessmentExchangeActionTaskReference) {
    this.suitabilityAssessmentExchangeActionTaskReference = suitabilityAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return suitabilityAssessmentExchangeActionResponse
  **/

  public String getSuitabilityAssessmentExchangeActionResponse() {
    return suitabilityAssessmentExchangeActionResponse;
  }

  public void setSuitabilityAssessmentExchangeActionResponse(String suitabilityAssessmentExchangeActionResponse) {
    this.suitabilityAssessmentExchangeActionResponse = suitabilityAssessmentExchangeActionResponse;
  }


}


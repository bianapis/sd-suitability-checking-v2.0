package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentRequestOutputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRequestOutputModel
 */
public class CRSuitabilityAssessmentRequestOutputModel   {
  private CRSuitabilityAssessmentRequestOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;

  private String suitabilityAssessmentRequestActionTaskReference = null;

  private Object suitabilityAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get suitabilityAssessmentInstanceRecord
   * @return suitabilityAssessmentInstanceRecord
  **/

  public CRSuitabilityAssessmentRequestOutputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentRequestOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Suitability Assessment instance request service call 
   * @return suitabilityAssessmentRequestActionTaskReference
  **/

  public String getSuitabilityAssessmentRequestActionTaskReference() {
    return suitabilityAssessmentRequestActionTaskReference;
  }

  public void setSuitabilityAssessmentRequestActionTaskReference(String suitabilityAssessmentRequestActionTaskReference) {
    this.suitabilityAssessmentRequestActionTaskReference = suitabilityAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return suitabilityAssessmentRequestActionTaskRecord
  **/

  public Object getSuitabilityAssessmentRequestActionTaskRecord() {
    return suitabilityAssessmentRequestActionTaskRecord;
  }

  public void setSuitabilityAssessmentRequestActionTaskRecord(Object suitabilityAssessmentRequestActionTaskRecord) {
    this.suitabilityAssessmentRequestActionTaskRecord = suitabilityAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


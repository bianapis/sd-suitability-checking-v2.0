package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentRequestInputModelRequestRecordType;
import org.bian.dto.CRSuitabilityAssessmentRequestInputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRequestInputModel
 */
public class CRSuitabilityAssessmentRequestInputModel   {
  private String suitabilityCheckingServicingSessionReference = null;

  private String suitabilityAssessmentInstanceReference = null;

  private CRSuitabilityAssessmentRequestInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;

  private Object suitabilityAssessmentRequestActionTaskRecord = null;

  private CRSuitabilityAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRSuitabilityAssessmentRequestInputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentRequestInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRSuitabilityAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRSuitabilityAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


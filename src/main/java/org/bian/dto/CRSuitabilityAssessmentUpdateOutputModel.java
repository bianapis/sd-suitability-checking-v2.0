package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentUpdateOutputModel
 */
public class CRSuitabilityAssessmentUpdateOutputModel   {
  private CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;

  private String suitabilityAssessmentUpdateActionTaskReference = null;

  private Object suitabilityAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return suitabilityAssessmentUpdateActionTaskReference
  **/

  public String getSuitabilityAssessmentUpdateActionTaskReference() {
    return suitabilityAssessmentUpdateActionTaskReference;
  }

  public void setSuitabilityAssessmentUpdateActionTaskReference(String suitabilityAssessmentUpdateActionTaskReference) {
    this.suitabilityAssessmentUpdateActionTaskReference = suitabilityAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


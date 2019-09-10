package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentGrantOutputModel
 */
public class CRSuitabilityAssessmentGrantOutputModel   {
  private String suitabilityAssessmentGrantActionTaskReference = null;

  private Object suitabilityAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRSuitabilityAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Suitability Assessment instance grant service call 
   * @return suitabilityAssessmentGrantActionTaskReference
  **/

  public String getSuitabilityAssessmentGrantActionTaskReference() {
    return suitabilityAssessmentGrantActionTaskReference;
  }

  public void setSuitabilityAssessmentGrantActionTaskReference(String suitabilityAssessmentGrantActionTaskReference) {
    this.suitabilityAssessmentGrantActionTaskReference = suitabilityAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return suitabilityAssessmentGrantActionTaskRecord
  **/

  public Object getSuitabilityAssessmentGrantActionTaskRecord() {
    return suitabilityAssessmentGrantActionTaskRecord;
  }

  public void setSuitabilityAssessmentGrantActionTaskRecord(Object suitabilityAssessmentGrantActionTaskRecord) {
    this.suitabilityAssessmentGrantActionTaskRecord = suitabilityAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRSuitabilityAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRSuitabilityAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentGrantInputModel
 */
public class CRSuitabilityAssessmentGrantInputModel   {
  private String suitabilityCheckingServicingSessionReference = null;

  private String suitabilityAssessmentInstanceReference = null;

  private Object suitabilityAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRSuitabilityAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRSuitabilityAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRSuitabilityAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}


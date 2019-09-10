package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis;
import org.bian.dto.CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceRecord;
import org.bian.dto.CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveOutputModel
 */
public class CRSuitabilityAssessmentRetrieveOutputModel   {
  private CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord = null;

  private String suitabilityAssessmentRetrieveActionTaskReference = null;

  private Object suitabilityAssessmentRetrieveActionTaskRecord = null;

  private String suitabilityAssessmentRetrieveActionResponse = null;

  private CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord suitabilityAssessmentInstanceReportRecord = null;

  private CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis suitabilityAssessmentInstanceAnalysis = null;


  /**
   * Get suitabilityAssessmentInstanceRecord
   * @return suitabilityAssessmentInstanceRecord
  **/

  public CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceRecord getSuitabilityAssessmentInstanceRecord() {
    return suitabilityAssessmentInstanceRecord;
  }

  public void setSuitabilityAssessmentInstanceRecord(CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceRecord suitabilityAssessmentInstanceRecord) {
    this.suitabilityAssessmentInstanceRecord = suitabilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Suitability Assessment instance retrieve service call 
   * @return suitabilityAssessmentRetrieveActionTaskReference
  **/

  public String getSuitabilityAssessmentRetrieveActionTaskReference() {
    return suitabilityAssessmentRetrieveActionTaskReference;
  }

  public void setSuitabilityAssessmentRetrieveActionTaskReference(String suitabilityAssessmentRetrieveActionTaskReference) {
    this.suitabilityAssessmentRetrieveActionTaskReference = suitabilityAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return suitabilityAssessmentRetrieveActionTaskRecord
  **/

  public Object getSuitabilityAssessmentRetrieveActionTaskRecord() {
    return suitabilityAssessmentRetrieveActionTaskRecord;
  }

  public void setSuitabilityAssessmentRetrieveActionTaskRecord(Object suitabilityAssessmentRetrieveActionTaskRecord) {
    this.suitabilityAssessmentRetrieveActionTaskRecord = suitabilityAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return suitabilityAssessmentRetrieveActionResponse
  **/

  public String getSuitabilityAssessmentRetrieveActionResponse() {
    return suitabilityAssessmentRetrieveActionResponse;
  }

  public void setSuitabilityAssessmentRetrieveActionResponse(String suitabilityAssessmentRetrieveActionResponse) {
    this.suitabilityAssessmentRetrieveActionResponse = suitabilityAssessmentRetrieveActionResponse;
  }


  /**
   * Get suitabilityAssessmentInstanceReportRecord
   * @return suitabilityAssessmentInstanceReportRecord
  **/

  public CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord getSuitabilityAssessmentInstanceReportRecord() {
    return suitabilityAssessmentInstanceReportRecord;
  }

  public void setSuitabilityAssessmentInstanceReportRecord(CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord suitabilityAssessmentInstanceReportRecord) {
    this.suitabilityAssessmentInstanceReportRecord = suitabilityAssessmentInstanceReportRecord;
  }


  /**
   * Get suitabilityAssessmentInstanceAnalysis
   * @return suitabilityAssessmentInstanceAnalysis
  **/

  public CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis getSuitabilityAssessmentInstanceAnalysis() {
    return suitabilityAssessmentInstanceAnalysis;
  }

  public void setSuitabilityAssessmentInstanceAnalysis(CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis suitabilityAssessmentInstanceAnalysis) {
    this.suitabilityAssessmentInstanceAnalysis = suitabilityAssessmentInstanceAnalysis;
  }


}


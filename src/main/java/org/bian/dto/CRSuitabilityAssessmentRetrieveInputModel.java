package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis;
import org.bian.dto.CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveInputModel
 */
public class CRSuitabilityAssessmentRetrieveInputModel   {
  private Object suitabilityAssessmentRetrieveActionTaskRecord = null;

  private String suitabilityAssessmentRetrieveActionRequest = null;

  private CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord suitabilityAssessmentInstanceReportRecord = null;

  private CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis suitabilityAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return suitabilityAssessmentRetrieveActionRequest
  **/

  public String getSuitabilityAssessmentRetrieveActionRequest() {
    return suitabilityAssessmentRetrieveActionRequest;
  }

  public void setSuitabilityAssessmentRetrieveActionRequest(String suitabilityAssessmentRetrieveActionRequest) {
    this.suitabilityAssessmentRetrieveActionRequest = suitabilityAssessmentRetrieveActionRequest;
  }


  /**
   * Get suitabilityAssessmentInstanceReportRecord
   * @return suitabilityAssessmentInstanceReportRecord
  **/

  public CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord getSuitabilityAssessmentInstanceReportRecord() {
    return suitabilityAssessmentInstanceReportRecord;
  }

  public void setSuitabilityAssessmentInstanceReportRecord(CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord suitabilityAssessmentInstanceReportRecord) {
    this.suitabilityAssessmentInstanceReportRecord = suitabilityAssessmentInstanceReportRecord;
  }


  /**
   * Get suitabilityAssessmentInstanceAnalysis
   * @return suitabilityAssessmentInstanceAnalysis
  **/

  public CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis getSuitabilityAssessmentInstanceAnalysis() {
    return suitabilityAssessmentInstanceAnalysis;
  }

  public void setSuitabilityAssessmentInstanceAnalysis(CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis suitabilityAssessmentInstanceAnalysis) {
    this.suitabilityAssessmentInstanceAnalysis = suitabilityAssessmentInstanceAnalysis;
  }


}


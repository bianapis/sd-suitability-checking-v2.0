package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord
 */
public class CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceReportRecord   {
  private String suitabilityAssessmentInstanceReportData = null;

  private String suitabilityAssessmentInstanceReportType = null;

  private Object suitabilityAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return suitabilityAssessmentInstanceReportData
  **/

  public String getSuitabilityAssessmentInstanceReportData() {
    return suitabilityAssessmentInstanceReportData;
  }

  public void setSuitabilityAssessmentInstanceReportData(String suitabilityAssessmentInstanceReportData) {
    this.suitabilityAssessmentInstanceReportData = suitabilityAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return suitabilityAssessmentInstanceReportType
  **/

  public String getSuitabilityAssessmentInstanceReportType() {
    return suitabilityAssessmentInstanceReportType;
  }

  public void setSuitabilityAssessmentInstanceReportType(String suitabilityAssessmentInstanceReportType) {
    this.suitabilityAssessmentInstanceReportType = suitabilityAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return suitabilityAssessmentInstanceReport
  **/

  public Object getSuitabilityAssessmentInstanceReport() {
    return suitabilityAssessmentInstanceReport;
  }

  public void setSuitabilityAssessmentInstanceReport(Object suitabilityAssessmentInstanceReport) {
    this.suitabilityAssessmentInstanceReport = suitabilityAssessmentInstanceReport;
  }


}


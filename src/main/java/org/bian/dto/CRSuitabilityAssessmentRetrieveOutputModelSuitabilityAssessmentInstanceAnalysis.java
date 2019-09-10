package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis
 */
public class CRSuitabilityAssessmentRetrieveOutputModelSuitabilityAssessmentInstanceAnalysis   {
  private String suitabilityAssessmentInstanceAnalysisData = null;

  private String suitabilityAssessmentInstanceAnalysisReportType = null;

  private Object suitabilityAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return suitabilityAssessmentInstanceAnalysisData
  **/

  public String getSuitabilityAssessmentInstanceAnalysisData() {
    return suitabilityAssessmentInstanceAnalysisData;
  }

  public void setSuitabilityAssessmentInstanceAnalysisData(String suitabilityAssessmentInstanceAnalysisData) {
    this.suitabilityAssessmentInstanceAnalysisData = suitabilityAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return suitabilityAssessmentInstanceAnalysisReportType
  **/

  public String getSuitabilityAssessmentInstanceAnalysisReportType() {
    return suitabilityAssessmentInstanceAnalysisReportType;
  }

  public void setSuitabilityAssessmentInstanceAnalysisReportType(String suitabilityAssessmentInstanceAnalysisReportType) {
    this.suitabilityAssessmentInstanceAnalysisReportType = suitabilityAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return suitabilityAssessmentInstanceAnalysisReport
  **/

  public Object getSuitabilityAssessmentInstanceAnalysisReport() {
    return suitabilityAssessmentInstanceAnalysisReport;
  }

  public void setSuitabilityAssessmentInstanceAnalysisReport(Object suitabilityAssessmentInstanceAnalysisReport) {
    this.suitabilityAssessmentInstanceAnalysisReport = suitabilityAssessmentInstanceAnalysisReport;
  }


}


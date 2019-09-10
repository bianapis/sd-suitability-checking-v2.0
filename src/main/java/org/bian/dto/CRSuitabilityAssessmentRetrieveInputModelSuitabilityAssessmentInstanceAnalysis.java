package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis
 */
public class CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceAnalysis   {
  private String suitabilityAssessmentInstanceAnalysisReference = null;

  private String suitabilityAssessmentInstanceAnalysisReportType = null;

  private String suitabilityAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return suitabilityAssessmentInstanceAnalysisReference
  **/

  public String getSuitabilityAssessmentInstanceAnalysisReference() {
    return suitabilityAssessmentInstanceAnalysisReference;
  }

  public void setSuitabilityAssessmentInstanceAnalysisReference(String suitabilityAssessmentInstanceAnalysisReference) {
    this.suitabilityAssessmentInstanceAnalysisReference = suitabilityAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return suitabilityAssessmentInstanceAnalysisParameters
  **/

  public String getSuitabilityAssessmentInstanceAnalysisParameters() {
    return suitabilityAssessmentInstanceAnalysisParameters;
  }

  public void setSuitabilityAssessmentInstanceAnalysisParameters(String suitabilityAssessmentInstanceAnalysisParameters) {
    this.suitabilityAssessmentInstanceAnalysisParameters = suitabilityAssessmentInstanceAnalysisParameters;
  }


}


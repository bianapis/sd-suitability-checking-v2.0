package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord
 */
public class CRSuitabilityAssessmentRetrieveInputModelSuitabilityAssessmentInstanceReportRecord   {
  private String suitabilityAssessmentInstanceReportReference = null;

  private String suitabilityAssessmentInstanceReportType = null;

  private String suitabilityAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return suitabilityAssessmentInstanceReportReference
  **/

  public String getSuitabilityAssessmentInstanceReportReference() {
    return suitabilityAssessmentInstanceReportReference;
  }

  public void setSuitabilityAssessmentInstanceReportReference(String suitabilityAssessmentInstanceReportReference) {
    this.suitabilityAssessmentInstanceReportReference = suitabilityAssessmentInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return suitabilityAssessmentInstanceReportParameters
  **/

  public String getSuitabilityAssessmentInstanceReportParameters() {
    return suitabilityAssessmentInstanceReportParameters;
  }

  public void setSuitabilityAssessmentInstanceReportParameters(String suitabilityAssessmentInstanceReportParameters) {
    this.suitabilityAssessmentInstanceReportParameters = suitabilityAssessmentInstanceReportParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecordProposedMarketOrderTransaction;

import javax.validation.Valid;
  
/**
 * CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord
 */
public class CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private String customerReference = null;

  private String marketOrderType = null;

  private String investmentPortfolioInstanceReference = null;

  private String customerMarketOrderProcessingInstruction = null;

  private CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecordProposedMarketOrderTransaction proposedMarketOrderTransaction = null;

  private String suitabilityAssessmentType = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private String suitabilityComplianceAssessmentWorkProducts = null;

  private String suitabilityComplianceAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit submitting the proposed transaction for review 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer related to the proposed transaction 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of market order (e.g. Managed Investment, Corporate Finance) 
   * @return marketOrderType
  **/

  public String getMarketOrderType() {
    return marketOrderType;
  }

  public void setMarketOrderType(String marketOrderType) {
    this.marketOrderType = marketOrderType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated investment portfolio record of all holdings (referenced to check securities availability if necessary) 
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any customer specific processing preferences or requirements 
   * @return customerMarketOrderProcessingInstruction
  **/

  public String getCustomerMarketOrderProcessingInstruction() {
    return customerMarketOrderProcessingInstruction;
  }

  public void setCustomerMarketOrderProcessingInstruction(String customerMarketOrderProcessingInstruction) {
    this.customerMarketOrderProcessingInstruction = customerMarketOrderProcessingInstruction;
  }


  /**
   * Get proposedMarketOrderTransaction
   * @return proposedMarketOrderTransaction
  **/

  public CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecordProposedMarketOrderTransaction getProposedMarketOrderTransaction() {
    return proposedMarketOrderTransaction;
  }

  public void setProposedMarketOrderTransaction(CRSuitabilityAssessmentUpdateInputModelSuitabilityAssessmentInstanceRecordProposedMarketOrderTransaction proposedMarketOrderTransaction) {
    this.proposedMarketOrderTransaction = proposedMarketOrderTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type and make-up of suitability compliance tests referenced in the assessment 
   * @return suitabilityAssessmentType
  **/

  public String getSuitabilityAssessmentType() {
    return suitabilityAssessmentType;
  }

  public void setSuitabilityAssessmentType(String suitabilityAssessmentType) {
    this.suitabilityAssessmentType = suitabilityAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for any documents accessed and generated (e.g. disclosures) 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any correspondence generated by the suitability check 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the assessment 
   * @return suitabilityComplianceAssessmentWorkProducts
  **/

  public String getSuitabilityComplianceAssessmentWorkProducts() {
    return suitabilityComplianceAssessmentWorkProducts;
  }

  public void setSuitabilityComplianceAssessmentWorkProducts(String suitabilityComplianceAssessmentWorkProducts) {
    this.suitabilityComplianceAssessmentWorkProducts = suitabilityComplianceAssessmentWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outcome/result of the suitability assessment, can include reported details if appropriate 
   * @return suitabilityComplianceAssessmentResult
  **/

  public String getSuitabilityComplianceAssessmentResult() {
    return suitabilityComplianceAssessmentResult;
  }

  public void setSuitabilityComplianceAssessmentResult(String suitabilityComplianceAssessmentResult) {
    this.suitabilityComplianceAssessmentResult = suitabilityComplianceAssessmentResult;
  }


}


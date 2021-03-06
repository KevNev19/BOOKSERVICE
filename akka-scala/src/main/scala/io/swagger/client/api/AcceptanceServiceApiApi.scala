/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.AirwaybillPost
import io.swagger.client.model.AirwaybillView
import io.swagger.client.model.ErrorResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AcceptanceServiceApiApi {

  /**
   * Get airwaybill given the airwaybill number.
   * 
   * Expected answers:
   *   code 200 : AirwaybillView (Airwaybill retrieved successfuly)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Report not found)
   *   code 406 :  (Unsupported format)
   *   code 500 :  (Report generation failed)
   * 
   * @param accept expected reponse mime type
   * @param airwaybillId Airwaybill number of the cargo for acceptance.
   */
  def getAirwaybillGivenAirwaybillNumber(accept: String, airwaybillId: String): ApiRequest[AirwaybillView] =
    ApiRequest[AirwaybillView](ApiMethods.GET, "http://api-dev.champ.aero/acceptance/v1.0", "/airwaybills/{airwaybillId}", "application/json")
      .withPathParam("airwaybillId", airwaybillId)
      .withHeaderParam("accept", accept)
      .withSuccessResponse[AirwaybillView](200)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](406)
      .withErrorResponse[Unit](500)
        /**
   * Save an acceptance.
   * 
   * Expected answers:
   *   code 204 :  (Airwaybill updated for acceptance)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Airwaybill for acceptance not found)
   *   code 422 : ErrorResponse (Airwaybill for acceptance failed validation)
   * 
   * @param damage Damage report object that needs to be added
   */
  def saveAcceptance(damage: AirwaybillPost): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "http://api-dev.champ.aero/acceptance/v1.0", "/airwaybills/", "application/json")
      .withBody(damage)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      .withErrorResponse[Unit](404)
      .withErrorResponse[ErrorResponse](422)
      

}


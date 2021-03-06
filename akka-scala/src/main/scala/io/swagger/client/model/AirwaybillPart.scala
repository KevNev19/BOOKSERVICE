/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class AirwaybillPart (
  id: Option[String],
  pieces: Option[Int],
  weight: Option[AmountUnit],
  volume: Option[AmountUnit],
  receivedPieces: Option[Int],
  receivedWeight: Option[AmountUnit],
  receivedVolume: Option[AmountUnit],
  acceptanceStatus: Option[String],
  specialHandling: Option[SHC],
  doneXray: Option[Boolean],
  readyForCarriageChecked: Option[Boolean],
  blockedForManifesting: Option[Boolean],
  security: Option[Boolean],
  itinerary: Option[Seq[Itinerary]],
  numberOfSplits: Option[Int],
  split: Option[Seq[AirwaybillSplit]],
  link: Option[Link]
) extends ApiModel



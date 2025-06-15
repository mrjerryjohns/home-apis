// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OccupancySensingImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OccupancySensingTrait.Attributes) : com.google.home.matter.standard.OccupancySensing, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OccupancySensingTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.OccupancySensing, com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OccupancySensingTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.OccupancySensingTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val holdTime: kotlin.UShort? /* compiled code */

    public open val holdTimeLimits: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct? /* compiled code */

    public open val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? /* compiled code */

    public open val occupancySensorType: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum? /* compiled code */

    public open val occupancySensorTypeBitmap: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap? /* compiled code */

    public open val physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

    public open val physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

    public open val physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

    public open val pirOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

    public open val pirUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

    public open val pirUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

    public open val ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

    public open val ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

    public open val ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OccupancySensing.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.OccupancySensing) -> kotlin.Unit, init: com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.OccupancySensing { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


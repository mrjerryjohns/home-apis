// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class FillImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.FillTrait.Attributes) : com.google.home.google.Fill, com.google.home.matter.MatterTraitImpl, com.google.home.google.FillTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.FillTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val availableFillLevels: com.google.home.google.FillTrait.AvailableFillLevels? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentFillLevel: kotlin.String? /* compiled code */

    public open val currentFillPercent: kotlin.Float? /* compiled code */

    public open val featureMap: com.google.home.google.FillTrait.FillFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isFilled: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Fill.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Fill.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun fill(fill: kotlin.Boolean, fillLevel: kotlin.String, fillPercent: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun fillBatchable(fill: kotlin.Boolean, fillLevel: kotlin.String, fillPercent: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

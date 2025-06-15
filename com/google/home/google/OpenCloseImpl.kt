// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class OpenCloseImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.OpenCloseTrait.Attributes) : com.google.home.google.OpenClose, com.google.home.matter.MatterTraitImpl, com.google.home.google.OpenCloseTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.OpenCloseTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.google.OpenCloseTrait.OpenCloseFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val openPercent: kotlin.Double? /* compiled code */

    public open val openState: kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>? /* compiled code */

    public open val supportedDirections: kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>? /* compiled code */

    public open val targetOpenPercent: kotlin.Double? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.OpenClose.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.OpenClose.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun open(openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open suspend fun close(): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToOpenPercentage(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open suspend fun step(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open fun openBatchable(openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToOpenPercentageBatchable(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepBatchable(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RotationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.RotationTrait.Attributes) : com.google.home.google.Rotation, com.google.home.matter.MatterTraitImpl, com.google.home.google.RotationTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.RotationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.google.RotationTrait.RotationFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val rotationDegrees: kotlin.Float? /* compiled code */

    public open val rotationDegreesRange: com.google.home.google.RotationTrait.RotationDegreesRange? /* compiled code */

    public open val rotationPercent: kotlin.Float? /* compiled code */

    public open val targetRotationPercent: kotlin.Float? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Rotation.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Rotation.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun rotateToDegrees(rotationDegrees: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open suspend fun rotateToPercentage(rotationPercent: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun rotateToDegreesBatchable(rotationDegrees: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun rotateToPercentageBatchable(rotationPercent: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

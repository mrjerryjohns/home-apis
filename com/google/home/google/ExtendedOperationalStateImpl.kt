// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedOperationalStateImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedOperationalStateTrait.Attributes) : com.google.home.google.ExtendedOperationalState, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedOperationalStateTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedOperationalStateTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeOperationZones: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentPhaseCountdownTimeSeconds: kotlin.UInt? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxOperationDurationSeconds: kotlin.UInt? /* compiled code */

    public open val minOperationDurationSeconds: kotlin.UInt? /* compiled code */

    public open val operationCompletionTimestamp: kotlin.Long? /* compiled code */

    public open val operationZones: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedOperationalState.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedOperationalState.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun startWithOperationZones(operationZones: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

    public open suspend fun startWithDuration(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun startWithOperationZonesBatchable(operationZones: kotlin.collections.List<kotlin.String>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startWithDurationBatchable(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

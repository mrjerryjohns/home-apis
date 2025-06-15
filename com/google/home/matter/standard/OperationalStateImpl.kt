// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OperationalStateImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OperationalStateTrait.Attributes) : com.google.home.matter.standard.OperationalState, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OperationalStateTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OperationalStateTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val countdownTime: kotlin.UInt? /* compiled code */

    public open val currentPhase: kotlin.UByte? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val operationalError: com.google.home.matter.standard.OperationalStateTrait.ErrorStateStruct? /* compiled code */

    public open val operationalState: com.google.home.matter.standard.OperationalStateTrait.OperationalStateEnum? /* compiled code */

    public open val operationalStateList: kotlin.collections.List<com.google.home.matter.standard.OperationalStateTrait.OperationalStateStruct>? /* compiled code */

    public open val phaseList: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OperationalState.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.OperationalState.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun pause(): com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response { /* compiled code */ }

    public open suspend fun stop(): com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response { /* compiled code */ }

    public open suspend fun start(): com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response { /* compiled code */ }

    public open suspend fun resume(): com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response { /* compiled code */ }

    public open fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response> { /* compiled code */ }

    public open fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response> { /* compiled code */ }

    public open fun startBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response> { /* compiled code */ }

    public open fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


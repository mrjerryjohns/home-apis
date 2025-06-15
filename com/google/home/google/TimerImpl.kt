// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class TimerImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.TimerTrait.Attributes) : com.google.home.google.Timer, com.google.home.matter.MatterTraitImpl, com.google.home.google.TimerTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.TimerTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val commandOnlyTimer: kotlin.Boolean? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxTimerLimitSeconds: kotlin.Int? /* compiled code */

    public open val timerPaused: kotlin.Boolean? /* compiled code */

    public open val timerRemainingSeconds: kotlin.Int? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Timer.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Timer.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun timerStart(timerTimeSeconds: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerAdjust(adjustmentTimeSeconds: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerPause(): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerResume(): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerCancel(): kotlin.Unit { /* compiled code */ }

    public open fun timerStartBatchable(timerTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerAdjustBatchable(adjustmentTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerPauseBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerResumeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerCancelBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


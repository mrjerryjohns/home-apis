// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OnOffCommandsDefaultImpl : com.google.home.matter.standard.OnOffCommands {
    public open suspend fun off(): kotlin.Unit { /* compiled code */ }

    public open suspend fun on(): kotlin.Unit { /* compiled code */ }

    public open suspend fun toggle(): kotlin.Unit { /* compiled code */ }

    public open suspend fun offWithEffect(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun onWithRecallGlobalScene(): kotlin.Unit { /* compiled code */ }

    public open suspend fun onWithTimedOff(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open fun offBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toggleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun offWithEffectBatchable(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onWithRecallGlobalSceneBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onWithTimedOffBatchable(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


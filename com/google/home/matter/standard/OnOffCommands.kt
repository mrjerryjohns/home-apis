// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OnOffCommands {
    public abstract suspend fun off(): kotlin.Unit

    public abstract suspend fun on(): kotlin.Unit

    public abstract suspend fun toggle(): kotlin.Unit

    public abstract suspend fun offWithEffect(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): kotlin.Unit

    public abstract suspend fun onWithRecallGlobalScene(): kotlin.Unit

    public abstract suspend fun onWithTimedOff(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): kotlin.Unit

    public abstract fun offBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun onBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun toggleBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun offWithEffectBatchable(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun onWithRecallGlobalSceneBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun onWithTimedOffBatchable(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>
}


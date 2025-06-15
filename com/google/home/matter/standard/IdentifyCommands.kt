// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface IdentifyCommands {
    public abstract suspend fun identify(identifyTime: kotlin.UShort): kotlin.Unit

    public abstract suspend fun triggerEffect(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): kotlin.Unit

    public abstract fun identifyBatchable(identifyTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun triggerEffectBatchable(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): com.google.home.BatchableCommand<kotlin.Unit>
}

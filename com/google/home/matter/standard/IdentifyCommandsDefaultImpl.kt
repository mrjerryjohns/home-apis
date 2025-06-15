// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface IdentifyCommandsDefaultImpl : com.google.home.matter.standard.IdentifyCommands {
    public open suspend fun identify(identifyTime: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun triggerEffect(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): kotlin.Unit { /* compiled code */ }

    public open fun identifyBatchable(identifyTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun triggerEffectBatchable(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

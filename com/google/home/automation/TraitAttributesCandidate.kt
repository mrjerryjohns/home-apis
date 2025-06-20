// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class TraitAttributesCandidate public constructor(entity: com.google.home.HasId, types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>>, trait: com.google.home.TraitFactory<out com.google.home.Trait>, fields: kotlin.collections.Map<kotlin.String, com.google.home.automation.AttributeDetails>, fieldDetailsMap: kotlin.collections.Map<com.google.home.Field, com.google.home.automation.FieldDetails> = COMPILED_CODE, unsupportedReasons: kotlin.collections.List<com.google.home.automation.UnsupportedCandidateReason> = COMPILED_CODE) : com.google.home.automation.StarterCandidate, com.google.home.automation.StateReaderCandidate, com.google.home.automation.ActionCandidate {
    public open val entity: com.google.home.HasId /* compiled code */

    public open val types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>> /* compiled code */

    public open val trait: com.google.home.TraitFactory<out com.google.home.Trait> /* compiled code */

    @kotlin.Deprecated public open val fields: kotlin.collections.Map<kotlin.String, com.google.home.automation.AttributeDetails> /* compiled code */

    public open val fieldDetailsMap: kotlin.collections.Map<com.google.home.Field, com.google.home.automation.FieldDetails> /* compiled code */

    public open val unsupportedReasons: kotlin.collections.List<com.google.home.automation.UnsupportedCandidateReason> /* compiled code */

    @com.google.android.gms.common.internal.ShowFirstParty public open fun toStarter(params: kotlin.collections.List<com.google.home.automation.Parameter>): com.google.home.automation.Starter { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun toStateReader(): com.google.home.automation.StateReader { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun toAction(params: kotlin.collections.Map<com.google.home.Field, kotlin.Any?>): com.google.home.automation.Action { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

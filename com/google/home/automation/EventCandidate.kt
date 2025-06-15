// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class EventCandidate public constructor(entity: com.google.home.HasId, types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>>, trait: com.google.home.TraitFactory<out com.google.home.Trait>, fields: kotlin.collections.Map<kotlin.String, com.google.home.automation.EventFieldDetails>, fieldDetailsMap: kotlin.collections.Map<com.google.home.Field, com.google.home.automation.FieldDetails> = COMPILED_CODE, unsupportedReasons: kotlin.collections.List<com.google.home.automation.UnsupportedCandidateReason> = COMPILED_CODE, eventId: kotlin.String, eventFactory: com.google.home.EventFactory<out com.google.home.Event>) : com.google.home.automation.StarterCandidate {
    public open val entity: com.google.home.HasId /* compiled code */

    public open val types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>> /* compiled code */

    public open val trait: com.google.home.TraitFactory<out com.google.home.Trait> /* compiled code */

    @kotlin.Deprecated public open val fields: kotlin.collections.Map<kotlin.String, com.google.home.automation.EventFieldDetails> /* compiled code */

    public open val fieldDetailsMap: kotlin.collections.Map<com.google.home.Field, com.google.home.automation.FieldDetails> /* compiled code */

    public open val unsupportedReasons: kotlin.collections.List<com.google.home.automation.UnsupportedCandidateReason> /* compiled code */

    @kotlin.Deprecated public final val eventId: kotlin.String /* compiled code */

    public final val eventFactory: com.google.home.EventFactory<out com.google.home.Event> /* compiled code */

    @com.google.android.gms.common.internal.ShowFirstParty public open fun toStarter(params: kotlin.collections.List<com.google.home.automation.Parameter>): com.google.home.automation.Starter { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


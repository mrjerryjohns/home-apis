// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class SmokeCoAlarmImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes) : com.google.home.matter.standard.SmokeCoAlarm, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.SmokeCoAlarm, com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val batteryAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val coState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

    public open val contaminationState: com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum? /* compiled code */

    public open val deviceMuted: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum? /* compiled code */

    public open val endOfServiceAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum? /* compiled code */

    public open val expiryDate: kotlin.UInt? /* compiled code */

    public open val expressedState: com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val hardwareFaultAlert: kotlin.Boolean? /* compiled code */

    public open val interconnectCoAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

    public open val interconnectSmokeAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

    public open val smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? /* compiled code */

    public open val smokeState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

    public open val testInProgress: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.SmokeCoAlarm.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.SmokeCoAlarm.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun selfTestRequest(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.SmokeCoAlarm) -> kotlin.Unit, init: com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.SmokeCoAlarm { /* compiled code */ }

    public open fun selfTestRequestBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

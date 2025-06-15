// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class DishwasherAlarmImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.DishwasherAlarmTrait.Attributes) : com.google.home.matter.standard.DishwasherAlarm, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.DishwasherAlarmTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.DishwasherAlarmTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.DishwasherAlarmTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val latch: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

    public open val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

    public open val state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

    public open val supported: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.DishwasherAlarm.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.DishwasherAlarm.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun reset(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun modifyEnabledAlarms(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit { /* compiled code */ }

    public open fun resetBatchable(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun modifyEnabledAlarmsBatchable(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class BooleanStateConfigurationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes) : com.google.home.matter.standard.BooleanStateConfiguration, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.BooleanStateConfiguration, com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

    public open val alarmsEnabled: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

    public open val alarmsSupported: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

    public open val alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentSensitivityLevel: kotlin.UByte? /* compiled code */

    public open val defaultSensitivityLevel: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? /* compiled code */

    public open val supportedSensitivityLevels: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.BooleanStateConfiguration.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.BooleanStateConfiguration.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun suppressAlarm(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDisableAlarm(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.BooleanStateConfiguration) -> kotlin.Unit, init: com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.BooleanStateConfiguration { /* compiled code */ }

    public open fun suppressAlarmBatchable(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDisableAlarmBatchable(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

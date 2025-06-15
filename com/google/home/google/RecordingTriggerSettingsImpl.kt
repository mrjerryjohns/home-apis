// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RecordingTriggerSettingsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.RecordingTriggerSettingsTrait.Attributes) : com.google.home.google.RecordingTriggerSettings, com.google.home.matter.MatterTraitImpl, com.google.home.google.RecordingTriggerSettingsTrait.Attributes, com.google.home.Updatable<com.google.home.google.RecordingTriggerSettings, com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.RecordingTriggerSettingsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val defaultSafetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.RecordingTriggerSettings.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.RecordingTriggerSettings) -> kotlin.Unit, init: com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.RecordingTriggerSettings { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

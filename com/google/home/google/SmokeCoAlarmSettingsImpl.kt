// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class SmokeCoAlarmSettingsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes) : com.google.home.google.SmokeCoAlarmSettings, com.google.home.matter.MatterTraitImpl, com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes, com.google.home.Updatable<com.google.home.google.SmokeCoAlarmSettings, com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val enableHeadsUpAlert: kotlin.Boolean? /* compiled code */

    public open val enableNightlyPromise: kotlin.Boolean? /* compiled code */

    public open val enableSteamCheck: kotlin.Boolean? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.SmokeCoAlarmSettings.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.SmokeCoAlarmSettings) -> kotlin.Unit, init: com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.SmokeCoAlarmSettings { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


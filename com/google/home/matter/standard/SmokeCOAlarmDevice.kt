// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class SmokeCOAlarmDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.SmokeCOAlarmDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.SmokeCOAlarmDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.SmokeCOAlarmDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.SmokeCOAlarmDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.SmokeCOAlarmDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.SmokeCOAlarmDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement?, smokeCoAlarmSettings: com.google.home.google.SmokeCoAlarmSettings?) {
        public final val smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement? /* compiled code */

        public final val smokeCoAlarmSettings: com.google.home.google.SmokeCoAlarmSettings? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, smokeCoAlarm: com.google.home.matter.standard.SmokeCoAlarm?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?, carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val smokeCoAlarm: com.google.home.matter.standard.SmokeCoAlarm? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public final val carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.SmokeCOAlarmDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.SmokeCOAlarmDevice { /* compiled code */ }
    }
}


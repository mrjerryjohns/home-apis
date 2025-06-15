// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class HumiditySensorDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.HumiditySensorDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.HumiditySensorDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.HumiditySensorDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.HumiditySensorDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.HumiditySensorDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.HumiditySensorDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedFanControl: com.google.home.google.ExtendedFanControl?, relativeHumidityControl: com.google.home.google.RelativeHumidityControl?, extendedOperationalState: com.google.home.google.ExtendedOperationalState?) {
        public final val extendedFanControl: com.google.home.google.ExtendedFanControl? /* compiled code */

        public final val relativeHumidityControl: com.google.home.google.RelativeHumidityControl? /* compiled code */

        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.HumiditySensorDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.HumiditySensorDevice { /* compiled code */ }
    }
}


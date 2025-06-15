// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class RoboticVacuumCleanerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.RoboticVacuumCleanerDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.RoboticVacuumCleanerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RoboticVacuumCleanerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.RoboticVacuumCleanerDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.RoboticVacuumCleanerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RoboticVacuumCleanerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedPowerSource: com.google.home.google.ExtendedPowerSource?, locator: com.google.home.google.Locator?, extendedOperationalState: com.google.home.google.ExtendedOperationalState?) {
        public final val extendedPowerSource: com.google.home.google.ExtendedPowerSource? /* compiled code */

        public final val locator: com.google.home.google.Locator? /* compiled code */

        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, rvcRunMode: com.google.home.matter.standard.RvcRunMode?, rvcOperationalState: com.google.home.matter.standard.RvcOperationalState?, rvcCleanMode: com.google.home.matter.standard.RvcCleanMode?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val rvcRunMode: com.google.home.matter.standard.RvcRunMode? /* compiled code */

        public final val rvcOperationalState: com.google.home.matter.standard.RvcOperationalState? /* compiled code */

        public final val rvcCleanMode: com.google.home.matter.standard.RvcCleanMode? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.RoboticVacuumCleanerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.RoboticVacuumCleanerDevice { /* compiled code */ }
    }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleNetworkDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleNetworkDevice.GoogleTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleNetworkDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleNetworkDevice.GoogleTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleNetworkDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(networkControl: com.google.home.google.NetworkControl?, reboot: com.google.home.google.Reboot?, softwareUpdate: com.google.home.google.SoftwareUpdate?) {
        public final val networkControl: com.google.home.google.NetworkControl? /* compiled code */

        public final val reboot: com.google.home.google.Reboot? /* compiled code */

        public final val softwareUpdate: com.google.home.google.SoftwareUpdate? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleNetworkDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleNetworkDevice { /* compiled code */ }
    }
}


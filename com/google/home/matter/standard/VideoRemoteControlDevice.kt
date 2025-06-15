// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class VideoRemoteControlDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.VideoRemoteControlDevice.GoogleTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.VideoRemoteControlDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.VideoRemoteControlDevice.GoogleTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.VideoRemoteControlDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedLevelControl: com.google.home.google.ExtendedLevelControl?, extendedChannel: com.google.home.google.ExtendedChannel?, extendedMediaInput: com.google.home.google.ExtendedMediaInput?, extendedApplicationLauncher: com.google.home.google.ExtendedApplicationLauncher?, extendedMediaPlayback: com.google.home.google.ExtendedMediaPlayback?, mediaActivityState: com.google.home.google.MediaActivityState?) {
        public final val extendedLevelControl: com.google.home.google.ExtendedLevelControl? /* compiled code */

        public final val extendedChannel: com.google.home.google.ExtendedChannel? /* compiled code */

        public final val extendedMediaInput: com.google.home.google.ExtendedMediaInput? /* compiled code */

        public final val extendedApplicationLauncher: com.google.home.google.ExtendedApplicationLauncher? /* compiled code */

        public final val extendedMediaPlayback: com.google.home.google.ExtendedMediaPlayback? /* compiled code */

        public final val mediaActivityState: com.google.home.google.MediaActivityState? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.VideoRemoteControlDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.VideoRemoteControlDevice { /* compiled code */ }
    }
}


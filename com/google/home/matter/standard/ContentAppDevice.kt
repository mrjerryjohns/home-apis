// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ContentAppDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.ContentAppDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.ContentAppDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.ContentAppDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.ContentAppDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.ContentAppDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.ContentAppDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedApplicationLauncher: com.google.home.google.ExtendedApplicationLauncher?, mediaActivityState: com.google.home.google.MediaActivityState?, extendedMediaPlayback: com.google.home.google.ExtendedMediaPlayback?) {
        public final val extendedApplicationLauncher: com.google.home.google.ExtendedApplicationLauncher? /* compiled code */

        public final val mediaActivityState: com.google.home.google.MediaActivityState? /* compiled code */

        public final val extendedMediaPlayback: com.google.home.google.ExtendedMediaPlayback? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(keypadInput: com.google.home.matter.standard.KeypadInput?, applicationLauncher: com.google.home.matter.standard.ApplicationLauncher?, applicationBasic: com.google.home.matter.standard.ApplicationBasic?, binding: com.google.home.matter.standard.Binding?, channel: com.google.home.matter.standard.Channel?, targetNavigator: com.google.home.matter.standard.TargetNavigator?, mediaPlayback: com.google.home.matter.standard.MediaPlayback?, contentLauncher: com.google.home.matter.standard.ContentLauncher?, accountLogin: com.google.home.matter.standard.AccountLogin?) {
        public final val keypadInput: com.google.home.matter.standard.KeypadInput? /* compiled code */

        public final val applicationLauncher: com.google.home.matter.standard.ApplicationLauncher? /* compiled code */

        public final val applicationBasic: com.google.home.matter.standard.ApplicationBasic? /* compiled code */

        public final val binding: com.google.home.matter.standard.Binding? /* compiled code */

        public final val channel: com.google.home.matter.standard.Channel? /* compiled code */

        public final val targetNavigator: com.google.home.matter.standard.TargetNavigator? /* compiled code */

        public final val mediaPlayback: com.google.home.matter.standard.MediaPlayback? /* compiled code */

        public final val contentLauncher: com.google.home.matter.standard.ContentLauncher? /* compiled code */

        public final val accountLogin: com.google.home.matter.standard.AccountLogin? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.ContentAppDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.ContentAppDevice { /* compiled code */ }
    }
}


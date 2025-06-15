// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class BasicVideoPlayerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, standardTraits: com.google.home.matter.standard.BasicVideoPlayerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.BasicVideoPlayerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.BasicVideoPlayerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.BasicVideoPlayerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class StandardTraits public constructor(onOff: com.google.home.matter.standard.OnOff?, mediaPlayback: com.google.home.matter.standard.MediaPlayback?, keypadInput: com.google.home.matter.standard.KeypadInput?, wakeOnLan: com.google.home.matter.standard.WakeOnLan?, channel: com.google.home.matter.standard.Channel?, targetNavigator: com.google.home.matter.standard.TargetNavigator?, mediaInput: com.google.home.matter.standard.MediaInput?, lowPower: com.google.home.matter.standard.LowPower?, audioOutput: com.google.home.matter.standard.AudioOutput?) {
        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val mediaPlayback: com.google.home.matter.standard.MediaPlayback? /* compiled code */

        public final val keypadInput: com.google.home.matter.standard.KeypadInput? /* compiled code */

        public final val wakeOnLan: com.google.home.matter.standard.WakeOnLan? /* compiled code */

        public final val channel: com.google.home.matter.standard.Channel? /* compiled code */

        public final val targetNavigator: com.google.home.matter.standard.TargetNavigator? /* compiled code */

        public final val mediaInput: com.google.home.matter.standard.MediaInput? /* compiled code */

        public final val lowPower: com.google.home.matter.standard.LowPower? /* compiled code */

        public final val audioOutput: com.google.home.matter.standard.AudioOutput? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.BasicVideoPlayerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.BasicVideoPlayerDevice { /* compiled code */ }
    }
}


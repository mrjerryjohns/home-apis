// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedKeypadInputTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class KeyCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedKeypadInputTrait.KeyCode> {
        @androidx.annotation.NonNull Select,

        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull Left,

        @androidx.annotation.NonNull Right,

        @androidx.annotation.NonNull RightUp,

        @androidx.annotation.NonNull RightDown,

        @androidx.annotation.NonNull LeftUp,

        @androidx.annotation.NonNull LeftDown,

        @androidx.annotation.NonNull RootMenu,

        @androidx.annotation.NonNull SetupMenu,

        @androidx.annotation.NonNull ContentsMenu,

        @androidx.annotation.NonNull FavoriteMenu,

        @androidx.annotation.NonNull Exit,

        @androidx.annotation.NonNull MediaTopMenu,

        @androidx.annotation.NonNull MediaContextSensitiveMenu,

        @androidx.annotation.NonNull NumberEntryMode,

        @androidx.annotation.NonNull Number11,

        @androidx.annotation.NonNull Number12,

        @androidx.annotation.NonNull Number0OrNumber10,

        @androidx.annotation.NonNull Numbers1,

        @androidx.annotation.NonNull Numbers2,

        @androidx.annotation.NonNull Numbers3,

        @androidx.annotation.NonNull Numbers4,

        @androidx.annotation.NonNull Numbers5,

        @androidx.annotation.NonNull Numbers6,

        @androidx.annotation.NonNull Numbers7,

        @androidx.annotation.NonNull Numbers8,

        @androidx.annotation.NonNull Numbers9,

        @androidx.annotation.NonNull Dot,

        @androidx.annotation.NonNull Enter,

        @androidx.annotation.NonNull Clear,

        @androidx.annotation.NonNull NextFavorite,

        @androidx.annotation.NonNull ChannelUp,

        @androidx.annotation.NonNull ChannelDown,

        @androidx.annotation.NonNull PreviousChannel,

        @androidx.annotation.NonNull SoundSelect,

        @androidx.annotation.NonNull InputSelect,

        @androidx.annotation.NonNull DisplayInformation,

        @androidx.annotation.NonNull Help,

        @androidx.annotation.NonNull PageUp,

        @androidx.annotation.NonNull PageDown,

        @androidx.annotation.NonNull Power,

        @androidx.annotation.NonNull VolumeUp,

        @androidx.annotation.NonNull VolumeDown,

        @androidx.annotation.NonNull Mute,

        @androidx.annotation.NonNull Play,

        @androidx.annotation.NonNull Stop,

        @androidx.annotation.NonNull Pause,

        @androidx.annotation.NonNull Record,

        @androidx.annotation.NonNull Rewind,

        @androidx.annotation.NonNull FastForward,

        @androidx.annotation.NonNull Eject,

        @androidx.annotation.NonNull Forward,

        @androidx.annotation.NonNull Backward,

        @androidx.annotation.NonNull StopRecord,

        @androidx.annotation.NonNull PauseRecord,

        @androidx.annotation.NonNull Reserved,

        @androidx.annotation.NonNull Angle,

        @androidx.annotation.NonNull SubPicture,

        @androidx.annotation.NonNull VideoOnDemand,

        @androidx.annotation.NonNull ElectronicProgramGuide,

        @androidx.annotation.NonNull TimerProgramming,

        @androidx.annotation.NonNull InitialConfiguration,

        @androidx.annotation.NonNull SelectBroadcastType,

        @androidx.annotation.NonNull SelectSoundPresentation,

        @androidx.annotation.NonNull PlayFunction,

        @androidx.annotation.NonNull PausePlayFunction,

        @androidx.annotation.NonNull RecordFunction,

        @androidx.annotation.NonNull PauseRecordFunction,

        @androidx.annotation.NonNull StopFunction,

        @androidx.annotation.NonNull MuteFunction,

        @androidx.annotation.NonNull RestoreVolumeFunction,

        @androidx.annotation.NonNull TuneFunction,

        @androidx.annotation.NonNull SelectMediaFunction,

        @androidx.annotation.NonNull SelectAvInputFunction,

        @androidx.annotation.NonNull SelectAudioInputFunction,

        @androidx.annotation.NonNull PowerToggleFunction,

        @androidx.annotation.NonNull PowerOffFunction,

        @androidx.annotation.NonNull PowerOnFunction,

        @androidx.annotation.NonNull F1Blue,

        @androidx.annotation.NonNull F2Red,

        @androidx.annotation.NonNull F3Green,

        @androidx.annotation.NonNull F4Yellow,

        @androidx.annotation.NonNull F5,

        @androidx.annotation.NonNull Data,

        @androidx.annotation.NonNull A,

        @androidx.annotation.NonNull B,

        @androidx.annotation.NonNull X,

        @androidx.annotation.NonNull Y,

        @androidx.annotation.NonNull Start,

        @androidx.annotation.NonNull Confirm,

        @androidx.annotation.NonNull Back,

        @androidx.annotation.NonNull Cancel,

        @androidx.annotation.NonNull Home,

        @androidx.annotation.NonNull Hamburger,

        @androidx.annotation.NonNull Menu,

        @androidx.annotation.NonNull Options,

        @androidx.annotation.NonNull Triangle,

        @androidx.annotation.NonNull Rectangle,

        @androidx.annotation.NonNull Circle,

        @androidx.annotation.NonNull Cross,

        @androidx.annotation.NonNull LeftBumper,

        @androidx.annotation.NonNull RightBumper,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedKeypadInputTrait.KeyCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class Key public constructor(keyCode: com.google.home.google.ExtendedKeypadInputTrait.KeyCode = COMPILED_CODE, isVirtualKey: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedKeypadInputTrait.Key>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedKeypadInputTrait.Key?>.keyCode: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedKeypadInputTrait.KeyCode> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedKeypadInputTrait.Key?>.isVirtualKey: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedKeypadInputTrait.Key): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedKeypadInputTrait.Key { /* compiled code */ }
        }

        public final val keyCode: com.google.home.google.ExtendedKeypadInputTrait.KeyCode /* compiled code */

        public final val isVirtualKey: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedKeypadInputTrait.Key.StructFields> {
            @androidx.annotation.NonNull keyCode,

            @androidx.annotation.NonNull isVirtualKey;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedKeypadInputTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedKeypadInputTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedKeypadInputTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedKeys: kotlin.collections.List<com.google.home.google.ExtendedKeypadInputTrait.Key>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedKeys: kotlin.collections.List<com.google.home.google.ExtendedKeypadInputTrait.Key>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedKeypadInputTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedKeypadInputTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedKeypadInputTrait.Attributes) { /* compiled code */ }

        public open val supportedKeys: kotlin.collections.List<com.google.home.google.ExtendedKeypadInputTrait.Key>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedKeys: kotlin.collections.List<com.google.home.google.ExtendedKeypadInputTrait.Key>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedKeypadInputTrait.AttributesImpl { /* compiled code */ }
    }

    public object ExtendedSendKeyCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedKeypadInputTrait.ExtendedSendKeyCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedKeypadInputTrait.ExtendedSendKeyCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedKeypadInputTrait.ExtendedSendKeyCommand.Request { /* compiled code */ }
            }

            public final val keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedKeypadInputTrait.ExtendedSendKeyCommand.Request.CommandFields> {
                @androidx.annotation.NonNull keyCode;

                public companion object {
                    public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
                }

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }
    }
}

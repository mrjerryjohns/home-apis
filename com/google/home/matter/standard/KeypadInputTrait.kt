// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object KeypadInputTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CecKeyCodeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum> {
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

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.KeypadInputTrait.StatusEnum> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull UnsupportedKey,

        @androidx.annotation.NonNull InvalidKeyInCurrentState,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.KeypadInputTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(navigationKeyCodes: kotlin.Boolean = COMPILED_CODE, locationKeys: kotlin.Boolean = COMPILED_CODE, numberKeys: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.KeypadInputTrait.Feature> {
            private const final val NAVIGATION_KEY_CODES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCATION_KEYS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NUMBER_KEYS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.KeypadInputTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.KeypadInputTrait.Feature { /* compiled code */ }
        }

        public final val navigationKeyCodes: kotlin.Boolean /* compiled code */

        public final val locationKeys: kotlin.Boolean /* compiled code */

        public final val numberKeys: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(navigationKeyCodes: kotlin.Boolean = COMPILED_CODE, locationKeys: kotlin.Boolean = COMPILED_CODE, numberKeys: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.KeypadInputTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.KeypadInputTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.KeypadInputTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.KeypadInputTrait.Attributes { /* compiled code */ }
        }

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.KeypadInputTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.KeypadInputTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.KeypadInputTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.KeypadInputTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.KeypadInputTrait.Attributes) { /* compiled code */ }

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.KeypadInputTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.KeypadInputTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.KeypadInputTrait.AttributesImpl { /* compiled code */ }
    }

    public object SendKeyCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Request { /* compiled code */ }
            }

            public final val keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Request.CommandFields> {
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

        public final class Response public constructor(status: com.google.home.matter.standard.KeypadInputTrait.StatusEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.KeypadInputTrait.StatusEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status;

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

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ContentLauncherTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CharacteristicEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.CharacteristicEnum> {
        @androidx.annotation.NonNull ForcedSubtitles,

        @androidx.annotation.NonNull DescribesVideo,

        @androidx.annotation.NonNull EasyToRead,

        @androidx.annotation.NonNull FrameBased,

        @androidx.annotation.NonNull MainProgram,

        @androidx.annotation.NonNull OriginalContent,

        @androidx.annotation.NonNull VoiceOverTranslation,

        @androidx.annotation.NonNull Caption,

        @androidx.annotation.NonNull Subtitle,

        @androidx.annotation.NonNull Alternate,

        @androidx.annotation.NonNull Supplementary,

        @androidx.annotation.NonNull Commentary,

        @androidx.annotation.NonNull DubbedTranslation,

        @androidx.annotation.NonNull Description,

        @androidx.annotation.NonNull Metadata,

        @androidx.annotation.NonNull EnhancedAudioIntelligibility,

        @androidx.annotation.NonNull Emergency,

        @androidx.annotation.NonNull Karaoke,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ContentLauncherTrait.CharacteristicEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MetricTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.MetricTypeEnum> {
        @androidx.annotation.NonNull Pixels,

        @androidx.annotation.NonNull Percentage,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ContentLauncherTrait.MetricTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ParameterEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.ParameterEnum> {
        @androidx.annotation.NonNull Actor,

        @androidx.annotation.NonNull Channel,

        @androidx.annotation.NonNull Character,

        @androidx.annotation.NonNull Director,

        @androidx.annotation.NonNull Event,

        @androidx.annotation.NonNull Franchise,

        @androidx.annotation.NonNull Genre,

        @androidx.annotation.NonNull League,

        @androidx.annotation.NonNull Popularity,

        @androidx.annotation.NonNull Provider,

        @androidx.annotation.NonNull Sport,

        @androidx.annotation.NonNull SportsTeam,

        @androidx.annotation.NonNull Type,

        @androidx.annotation.NonNull Video,

        @androidx.annotation.NonNull Season,

        @androidx.annotation.NonNull Episode,

        @androidx.annotation.NonNull Any,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ContentLauncherTrait.ParameterEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.StatusEnum> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull UrlNotAvailable,

        @androidx.annotation.NonNull AuthFailed,

        @androidx.annotation.NonNull TextTrackNotAvailable,

        @androidx.annotation.NonNull AudioTrackNotAvailable,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ContentLauncherTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(contentSearch: kotlin.Boolean = COMPILED_CODE, urlPlayback: kotlin.Boolean = COMPILED_CODE, advancedSeek: kotlin.Boolean = COMPILED_CODE, textTracks: kotlin.Boolean = COMPILED_CODE, audioTracks: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ContentLauncherTrait.Feature> {
            private const final val CONTENT_SEARCH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val URL_PLAYBACK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ADVANCED_SEEK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TEXT_TRACKS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUDIO_TRACKS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ContentLauncherTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ContentLauncherTrait.Feature { /* compiled code */ }
        }

        public final val contentSearch: kotlin.Boolean /* compiled code */

        public final val urlPlayback: kotlin.Boolean /* compiled code */

        public final val advancedSeek: kotlin.Boolean /* compiled code */

        public final val textTracks: kotlin.Boolean /* compiled code */

        public final val audioTracks: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(contentSearch: kotlin.Boolean = COMPILED_CODE, urlPlayback: kotlin.Boolean = COMPILED_CODE, advancedSeek: kotlin.Boolean = COMPILED_CODE, textTracks: kotlin.Boolean = COMPILED_CODE, audioTracks: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ContentLauncherTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class SupportedProtocolsBitmap public constructor(dash: kotlin.Boolean = COMPILED_CODE, hls: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap> {
            private const final val DASH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HLS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap { /* compiled code */ }
        }

        public final val dash: kotlin.Boolean /* compiled code */

        public final val hls: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(dash: kotlin.Boolean = COMPILED_CODE, hls: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class DimensionStruct public constructor(width: kotlin.Double = COMPILED_CODE, height: kotlin.Double = COMPILED_CODE, metric: com.google.home.matter.standard.ContentLauncherTrait.MetricTypeEnum = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct?>.width: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct?>.height: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct?>.metric: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ContentLauncherTrait.MetricTypeEnum> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct { /* compiled code */ }
        }

        public final val width: kotlin.Double /* compiled code */

        public final val height: kotlin.Double /* compiled code */

        public final val metric: com.google.home.matter.standard.ContentLauncherTrait.MetricTypeEnum /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct.StructFields> {
            @androidx.annotation.NonNull width,

            @androidx.annotation.NonNull height,

            @androidx.annotation.NonNull metric;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TrackPreferenceStruct public constructor(languageCode: kotlin.String = COMPILED_CODE, characteristics: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.CharacteristicEnum>> = COMPILED_CODE, audioOutputIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct?>.languageCode: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct?>.characteristics: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.CharacteristicEnum>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct?>.audioOutputIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct { /* compiled code */ }
        }

        public final val languageCode: kotlin.String /* compiled code */

        public final val characteristics: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.CharacteristicEnum>> /* compiled code */

        public final val audioOutputIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct.StructFields> {
            @androidx.annotation.NonNull languageCode,

            @androidx.annotation.NonNull characteristics,

            @androidx.annotation.NonNull audioOutputIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class PlaybackPreferencesStruct public constructor(playbackPosition: kotlin.ULong = COMPILED_CODE, textTrack: com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct = COMPILED_CODE, audioTracks: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct>> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct?>.playbackPosition: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct?>.textTrack: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct?>.audioTracks: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct>>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct { /* compiled code */ }
        }

        public final val playbackPosition: kotlin.ULong /* compiled code */

        public final val textTrack: com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct /* compiled code */

        public final val audioTracks: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.TrackPreferenceStruct>> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct.StructFields> {
            @androidx.annotation.NonNull playbackPosition,

            @androidx.annotation.NonNull textTrack,

            @androidx.annotation.NonNull audioTracks;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AdditionalInfoStruct public constructor(name: kotlin.String = COMPILED_CODE, value: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct?>.value: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val value: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct.StructFields> {
            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull value;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ParameterStruct public constructor(type: com.google.home.matter.standard.ContentLauncherTrait.ParameterEnum = COMPILED_CODE, value: kotlin.String = COMPILED_CODE, externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct>> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ContentLauncherTrait.ParameterEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct?>.value: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct?>.externalIdList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct>>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct { /* compiled code */ }
        }

        public final val type: com.google.home.matter.standard.ContentLauncherTrait.ParameterEnum /* compiled code */

        public final val value: kotlin.String /* compiled code */

        public final val externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.AdditionalInfoStruct>> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct.StructFields> {
            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull value,

            @androidx.annotation.NonNull externalIdList;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ContentSearchStruct public constructor(parameterList: kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct?>.parameterList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct { /* compiled code */ }
        }

        public final val parameterList: kotlin.collections.List<com.google.home.matter.standard.ContentLauncherTrait.ParameterStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct.StructFields> {
            @androidx.annotation.NonNull parameterList;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class StyleInformationStruct public constructor(imageUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, color: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, size: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct?>.imageUrl: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct?>.color: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct?>.size: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct { /* compiled code */ }
        }

        public final val imageUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val color: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val size: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.DimensionStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct.StructFields> {
            @androidx.annotation.NonNull imageUrl,

            @androidx.annotation.NonNull color,

            @androidx.annotation.NonNull size;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

        public final class BrandingInformationStruct public constructor(providerName: kotlin.String = COMPILED_CODE, background: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> = COMPILED_CODE, logo: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> = COMPILED_CODE, progressBar: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> = COMPILED_CODE, splash: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> = COMPILED_CODE, waterMark:
        com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.providerName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.background: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.logo: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.progressBar: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.splash: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct?>.waterMark: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct { /* compiled code */ }
        }

        public final val providerName: kotlin.String /* compiled code */

        public final val background: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> /* compiled code */

        public final val logo: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> /* compiled code */

        public final val progressBar: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> /* compiled code */

        public final val splash: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> /* compiled code */

        public final val waterMark: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.StyleInformationStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct.StructFields> {
            @androidx.annotation.NonNull providerName,

            @androidx.annotation.NonNull background,

            @androidx.annotation.NonNull logo,

            @androidx.annotation.NonNull progressBar,

            @androidx.annotation.NonNull splash,

            @androidx.annotation.NonNull waterMark;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.Attributes { /* compiled code */ }
        }

        public abstract val acceptHeader: kotlin.collections.List<kotlin.String>?

        public abstract val supportedStreamingProtocols: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ContentLauncherTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(acceptHeader: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, supportedStreamingProtocols: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ContentLauncherTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ContentLauncherTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ContentLauncherTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ContentLauncherTrait.Attributes) { /* compiled code */ }

        public open val acceptHeader: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val supportedStreamingProtocols: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ContentLauncherTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(acceptHeader: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, supportedStreamingProtocols: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ContentLauncherTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ContentLauncherTrait.AttributesImpl { /* compiled code */ }
    }

    public object LaunchContentCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct = COMPILED_CODE, autoPlay: kotlin.Boolean = COMPILED_CODE, data: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, playbackPreferences: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct> = COMPILED_CODE, useCurrentContext: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Request { /* compiled code */ }
            }

            public final val search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct /* compiled code */

            public final val autoPlay: kotlin.Boolean /* compiled code */

            public final val data: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val playbackPreferences: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct> /* compiled code */

            public final val useCurrentContext: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Request.CommandFields> {
                @androidx.annotation.NonNull search,

                @androidx.annotation.NonNull autoPlay,

                @androidx.annotation.NonNull data,

                @androidx.annotation.NonNull playbackPreferences,

                @androidx.annotation.NonNull useCurrentContext;

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

        public interface OptionalArgs {
            public abstract var data: kotlin.String

            public abstract var playbackPreferences: com.google.home.matter.standard.ContentLauncherTrait.PlaybackPreferencesStruct

            public abstract var useCurrentContext: kotlin.Boolean
        }

        public final class Response public constructor(status: com.google.home.matter.standard.ContentLauncherTrait.StatusEnum = COMPILED_CODE, data: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.ContentLauncherTrait.StatusEnum /* compiled code */

            public final val data: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull data;

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

    public object LaunchUrlCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(contentUrl: kotlin.String = COMPILED_CODE, displayString: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, brandingInformation: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Request { /* compiled code */ }
            }

            public final val contentUrl: kotlin.String /* compiled code */

            public final val displayString: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val brandingInformation: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Request.CommandFields> {
                @androidx.annotation.NonNull contentUrl,

                @androidx.annotation.NonNull displayString,

                @androidx.annotation.NonNull brandingInformation;

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

        public interface OptionalArgs {
            public abstract var displayString: kotlin.String

            public abstract var brandingInformation: com.google.home.matter.standard.ContentLauncherTrait.BrandingInformationStruct
        }

        public final class Response public constructor(status: com.google.home.matter.standard.ContentLauncherTrait.StatusEnum = COMPILED_CODE, data: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.ContentLauncherTrait.StatusEnum /* compiled code */

            public final val data: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull data;

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

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ChannelTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ChannelTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChannelTypeEnum> {
        @androidx.annotation.NonNull Satellite,

        @androidx.annotation.NonNull Cable,

        @androidx.annotation.NonNull Terrestrial,

        @androidx.annotation.NonNull OTT,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ChannelTrait.ChannelTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class LineupInfoTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.LineupInfoTypeEnum> {
        @androidx.annotation.NonNull MSO,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ChannelTrait.LineupInfoTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.StatusEnum> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull MultipleMatches,

        @androidx.annotation.NonNull NoMatches,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ChannelTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(channelList: kotlin.Boolean = COMPILED_CODE, lineupInfo: kotlin.Boolean = COMPILED_CODE, electronicGuide: kotlin.Boolean = COMPILED_CODE, recordProgram: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ChannelTrait.Feature> {
            private const final val CHANNEL_LIST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LINEUP_INFO_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ELECTRONIC_GUIDE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RECORD_PROGRAM_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ChannelTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ChannelTrait.Feature { /* compiled code */ }
        }

        public final val channelList: kotlin.Boolean /* compiled code */

        public final val lineupInfo: kotlin.Boolean /* compiled code */

        public final val electronicGuide: kotlin.Boolean /* compiled code */

        public final val recordProgram: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(channelList: kotlin.Boolean = COMPILED_CODE, lineupInfo: kotlin.Boolean = COMPILED_CODE, electronicGuide: kotlin.Boolean = COMPILED_CODE, recordProgram: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ChannelTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class RecordingFlagBitmap public constructor(scheduled: kotlin.Boolean = COMPILED_CODE, recordSeries: kotlin.Boolean = COMPILED_CODE, recorded: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap> {
            private const final val SCHEDULED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RECORD_SERIES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RECORDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap { /* compiled code */ }
        }

        public final val scheduled: kotlin.Boolean /* compiled code */

        public final val recordSeries: kotlin.Boolean /* compiled code */

        public final val recorded: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(scheduled: kotlin.Boolean = COMPILED_CODE, recordSeries: kotlin.Boolean = COMPILED_CODE, recorded: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ProgramCastStruct public constructor(name: kotlin.String = COMPILED_CODE, role: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramCastStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramCastStruct?>.role: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ProgramCastStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ProgramCastStruct { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val role: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct.StructFields> {
            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull role;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ProgramCategoryStruct public constructor(category: kotlin.String = COMPILED_CODE, subCategory: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct?>.category: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct?>.subCategory: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct { /* compiled code */ }
        }

        public final val category: kotlin.String /* compiled code */

        public final val subCategory: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct.StructFields> {
            @androidx.annotation.NonNull category,

            @androidx.annotation.NonNull subCategory;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class SeriesInfoStruct public constructor(season: kotlin.String = COMPILED_CODE, episode: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct?>.season: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct?>.episode: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct { /* compiled code */ }
        }

        public final val season: kotlin.String /* compiled code */

        public final val episode: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct.StructFields> {
            @androidx.annotation.NonNull season,

            @androidx.annotation.NonNull episode;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ChannelInfoStruct public constructor(majorNumber: kotlin.UShort = COMPILED_CODE, minorNumber: kotlin.UShort = COMPILED_CODE, name: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, callSign: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, affiliateCallSign: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, identifier: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, type: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.ChannelTypeEnum> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.majorNumber: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.minorNumber: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.name: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.callSign: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.affiliateCallSign: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.identifier: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.ChannelTypeEnum>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct { /* compiled code */ }
        }

        public final val majorNumber: kotlin.UShort /* compiled code */

        public final val minorNumber: kotlin.UShort /* compiled code */

        public final val name: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val callSign: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val affiliateCallSign: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val identifier: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val type: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.ChannelTypeEnum> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct.StructFields> {
            @androidx.annotation.NonNull majorNumber,

            @androidx.annotation.NonNull minorNumber,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull callSign,

            @androidx.annotation.NonNull affiliateCallSign,

            @androidx.annotation.NonNull identifier,

            @androidx.annotation.NonNull type;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ProgramStruct public constructor(identifier: kotlin.String = COMPILED_CODE, channel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct = COMPILED_CODE, startTime: kotlin.UInt = COMPILED_CODE, endTime: kotlin.UInt = COMPILED_CODE, title: kotlin.String = COMPILED_CODE, subtitle: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, description: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, audioLanguages: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> = COMPILED_CODE, ratings: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> = COMPILED_CODE, thumbnailUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, posterArtUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, dvbiUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, releaseDate: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, parentalGuidanceText: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, recordingFlag: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap> = COMPILED_CODE, seriesInfo: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct?> = COMPILED_CODE, categoryList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct>> = COMPILED_CODE, castList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>> = COMPILED_CODE, externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ProgramStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.identifier: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.channel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.startTime: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.endTime: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.title: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.subtitle: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.description: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.audioLanguages: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.ratings: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.thumbnailUrl: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.posterArtUrl: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.dvbiUrl: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.releaseDate: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.parentalGuidanceText: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.recordingFlag: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.seriesInfo: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.categoryList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.castList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ProgramStruct?>.externalIdList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ProgramStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ProgramStruct { /* compiled code */ }
        }

        public final val identifier: kotlin.String /* compiled code */

        public final val channel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct /* compiled code */

        public final val startTime: kotlin.UInt /* compiled code */

        public final val endTime: kotlin.UInt /* compiled code */

        public final val title: kotlin.String /* compiled code */

        public final val subtitle: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val description: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val audioLanguages: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> /* compiled code */

        public final val ratings: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> /* compiled code */

        public final val thumbnailUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val posterArtUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val dvbiUrl: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val releaseDate: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val parentalGuidanceText: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val recordingFlag: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap> /* compiled code */

        public final val seriesInfo: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.SeriesInfoStruct?> /* compiled code */

        public final val categoryList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCategoryStruct>> /* compiled code */

        public final val castList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>> /* compiled code */

        public final val externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramCastStruct>> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ProgramStruct.StructFields> {
            @androidx.annotation.NonNull identifier,

            @androidx.annotation.NonNull channel,

            @androidx.annotation.NonNull startTime,

            @androidx.annotation.NonNull endTime,

            @androidx.annotation.NonNull title,

            @androidx.annotation.NonNull subtitle,

            @androidx.annotation.NonNull description,

            @androidx.annotation.NonNull audioLanguages,

            @androidx.annotation.NonNull ratings,

            @androidx.annotation.NonNull thumbnailUrl,

            @androidx.annotation.NonNull posterArtUrl,

            @androidx.annotation.NonNull dvbiUrl,

            @androidx.annotation.NonNull releaseDate,

            @androidx.annotation.NonNull parentalGuidanceText,

            @androidx.annotation.NonNull recordingFlag,

            @androidx.annotation.NonNull seriesInfo,

            @androidx.annotation.NonNull categoryList,

            @androidx.annotation.NonNull castList,

            @androidx.annotation.NonNull externalIdList;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class PageTokenStruct public constructor(limit: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, after: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, before: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.PageTokenStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.PageTokenStruct?>.limit: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.PageTokenStruct?>.after: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.PageTokenStruct?>.before: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.PageTokenStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.PageTokenStruct { /* compiled code */ }
        }

        public final val limit: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val after: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val before: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.PageTokenStruct.StructFields> {
            @androidx.annotation.NonNull limit,

            @androidx.annotation.NonNull after,

            @androidx.annotation.NonNull before;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ChannelPagingStruct public constructor(previousToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?> = COMPILED_CODE, nextToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct?>.previousToken: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct?>.nextToken: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct { /* compiled code */ }
        }

        public final val previousToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?> /* compiled code */

        public final val nextToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct.StructFields> {
            @androidx.annotation.NonNull previousToken,

            @androidx.annotation.NonNull nextToken;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AdditionalInfoStruct public constructor(name: kotlin.String = COMPILED_CODE, value: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct?>.value: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val value: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct.StructFields> {
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

    public final class LineupInfoStruct public constructor(operatorName: kotlin.String = COMPILED_CODE, lineupName: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, postalCode: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, lineupInfoType: com.google.home.matter.standard.ChannelTrait.LineupInfoTypeEnum = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.LineupInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?>.operatorName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?>.lineupName: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?>.postalCode: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?>.lineupInfoType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ChannelTrait.LineupInfoTypeEnum> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.LineupInfoStruct { /* compiled code */ }
        }

        public final val operatorName: kotlin.String /* compiled code */

        public final val lineupName: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val postalCode: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val lineupInfoType: com.google.home.matter.standard.ChannelTrait.LineupInfoTypeEnum /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.LineupInfoStruct.StructFields> {
            @androidx.annotation.NonNull operatorName,

            @androidx.annotation.NonNull lineupName,

            @androidx.annotation.NonNull postalCode,

            @androidx.annotation.NonNull lineupInfoType;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.Attributes { /* compiled code */ }
        }

        public abstract val channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>?

        public abstract val lineup: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?

        public abstract val currentChannel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ChannelTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>? = COMPILED_CODE, lineup: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct? = COMPILED_CODE, currentChannel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ChannelTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ChannelTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ChannelTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ChannelTrait.Attributes) { /* compiled code */ }

        public open val channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>? /* compiled code */

        public open val lineup: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct? /* compiled code */

        public open val currentChannel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ChannelTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>? = COMPILED_CODE, lineup: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct? = COMPILED_CODE, currentChannel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ChannelTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ChannelTrait.AttributesImpl { /* compiled code */ }
    }

    public object ChangeChannelCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(match: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Request { /* compiled code */ }
            }

            public final val match: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Request.CommandFields> {
                @androidx.annotation.NonNull match;

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

        public final class Response public constructor(status: com.google.home.matter.standard.ChannelTrait.StatusEnum = COMPILED_CODE, data: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.ChannelTrait.StatusEnum /* compiled code */

            public final val data: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response.CommandFields> {
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

    public object ChangeChannelByNumberCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(majorNumber: kotlin.UShort = COMPILED_CODE, minorNumber: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.ChangeChannelByNumberCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.ChangeChannelByNumberCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.ChangeChannelByNumberCommand.Request { /* compiled code */ }
            }

            public final val majorNumber: kotlin.UShort /* compiled code */

            public final val minorNumber: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.ChangeChannelByNumberCommand.Request.CommandFields> {
                @androidx.annotation.NonNull majorNumber,

                @androidx.annotation.NonNull minorNumber;

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

    public object SkipChannelCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(count: kotlin.Short = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.SkipChannelCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.SkipChannelCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.SkipChannelCommand.Request { /* compiled code */ }
            }

            public final val count: kotlin.Short /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.SkipChannelCommand.Request.CommandFields> {
                @androidx.annotation.NonNull count;

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

    public object GetProgramGuideCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(startTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, endTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, channelList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>> = COMPILED_CODE, pageToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct> = COMPILED_CODE, recordingFlag: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap> = COMPILED_CODE, externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>> = COMPILED_CODE, data: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Request { /* compiled code */ }
            }

            public final val startTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val endTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val channelList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>> /* compiled code */

            public final val pageToken: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.PageTokenStruct> /* compiled code */

            public final val recordingFlag: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap> /* compiled code */

            public final val externalIdList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>> /* compiled code */

            public final val data: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Request.CommandFields> {
                @androidx.annotation.NonNull startTime,

                @androidx.annotation.NonNull endTime,

                @androidx.annotation.NonNull channelList,

                @androidx.annotation.NonNull pageToken,

                @androidx.annotation.NonNull recordingFlag,

                @androidx.annotation.NonNull externalIdList,

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

        public interface OptionalArgs {
            public abstract var startTime: kotlin.UInt

            public abstract var endTime: kotlin.UInt

            public abstract var channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>

            public abstract var pageToken: com.google.home.matter.standard.ChannelTrait.PageTokenStruct

            public abstract var recordingFlag: com.google.home.matter.standard.ChannelTrait.RecordingFlagBitmap

            public abstract var externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>

            public abstract var data: kotlin.ByteArray
        }

        public final class Response public constructor(paging: com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct = COMPILED_CODE, programList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response { /* compiled code */ }
            }

            public final val paging: com.google.home.matter.standard.ChannelTrait.ChannelPagingStruct /* compiled code */

            public final val programList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ProgramStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response.CommandFields> {
                @androidx.annotation.NonNull paging,

                @androidx.annotation.NonNull programList;

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

    public object RecordProgramCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(programIdentifier: kotlin.String = COMPILED_CODE, shouldRecordSeries: kotlin.Boolean = COMPILED_CODE, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct> = COMPILED_CODE, data: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.RecordProgramCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.RecordProgramCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.RecordProgramCommand.Request { /* compiled code */ }
            }

            public final val programIdentifier: kotlin.String /* compiled code */

            public final val shouldRecordSeries: kotlin.Boolean /* compiled code */

            public final val externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct> /* compiled code */

            public final val data: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.RecordProgramCommand.Request.CommandFields> {
                @androidx.annotation.NonNull programIdentifier,

                @androidx.annotation.NonNull shouldRecordSeries,

                @androidx.annotation.NonNull externalIdList,

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

    public object CancelRecordProgramCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(programIdentifier: kotlin.String = COMPILED_CODE, shouldRecordSeries: kotlin.Boolean = COMPILED_CODE, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct> = COMPILED_CODE, data: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ChannelTrait.CancelRecordProgramCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ChannelTrait.CancelRecordProgramCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ChannelTrait.CancelRecordProgramCommand.Request { /* compiled code */ }
            }

            public final val programIdentifier: kotlin.String /* compiled code */

            public final val shouldRecordSeries: kotlin.Boolean /* compiled code */

            public final val externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct> /* compiled code */

            public final val data: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ChannelTrait.CancelRecordProgramCommand.Request.CommandFields> {
                @androidx.annotation.NonNull programIdentifier,

                @androidx.annotation.NonNull shouldRecordSeries,

                @androidx.annotation.NonNull externalIdList,

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


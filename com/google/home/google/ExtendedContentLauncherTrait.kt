// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedContentLauncherTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class MediaType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedContentLauncherTrait.MediaType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull MusicRecording,

        @androidx.annotation.NonNull MusicAlbum,

        @androidx.annotation.NonNull MusicGroup,

        @androidx.annotation.NonNull MusicPlaylist,

        @androidx.annotation.NonNull Person,

        @androidx.annotation.NonNull TVSeason,

        @androidx.annotation.NonNull TVSeries,

        @androidx.annotation.NonNull TVEpisode,

        @androidx.annotation.NonNull RadioBroadcastService,

        @androidx.annotation.NonNull TelevisionChannel,

        @androidx.annotation.NonNull MovieSeries,

        @androidx.annotation.NonNull Movie,

        @androidx.annotation.NonNull SportsEvent,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedContentLauncherTrait.MediaType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class ContentLaunchFeature public constructor(supportsAudioTracks: kotlin.Boolean = COMPILED_CODE, supportsVideo: kotlin.Boolean = COMPILED_CODE, supportSMediaInitiationByDescription: kotlin.Boolean = COMPILED_CODE, supportsAppDeepLinks: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ExtendedContentLauncherTrait.ContentLaunchFeature> {
            private const final val SUPPORTS_AUDIO_TRACKS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_VIDEO_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORT_S_MEDIA_INITIATION_BY_DESCRIPTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_APP_DEEP_LINKS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ExtendedContentLauncherTrait.ContentLaunchFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ExtendedContentLauncherTrait.ContentLaunchFeature { /* compiled code */ }
        }

        public final val supportsAudioTracks: kotlin.Boolean /* compiled code */

        public final val supportsVideo: kotlin.Boolean /* compiled code */

        public final val supportSMediaInitiationByDescription: kotlin.Boolean /* compiled code */

        public final val supportsAppDeepLinks: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsAudioTracks: kotlin.Boolean = COMPILED_CODE, supportsVideo: kotlin.Boolean = COMPILED_CODE, supportSMediaInitiationByDescription: kotlin.Boolean = COMPILED_CODE, supportsAppDeepLinks: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ExtendedContentLauncherTrait.ContentLaunchFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedContentLauncherTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedContentLauncherTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedContentLauncherTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedMediaTypes: kotlin.collections.List<com.google.home.google.ExtendedContentLauncherTrait.MediaType>?

        public abstract val availableProviders: kotlin.collections.List<kotlin.String>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedMediaTypes: kotlin.collections.List<com.google.home.google.ExtendedContentLauncherTrait.MediaType>? = COMPILED_CODE, availableProviders: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedContentLauncherTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedContentLauncherTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedContentLauncherTrait.Attributes) { /* compiled code */ }

        public open val supportedMediaTypes: kotlin.collections.List<com.google.home.google.ExtendedContentLauncherTrait.MediaType>? /* compiled code */

        public open val availableProviders: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedMediaTypes: kotlin.collections.List<com.google.home.google.ExtendedContentLauncherTrait.MediaType>? = COMPILED_CODE, availableProviders: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedContentLauncherTrait.AttributesImpl { /* compiled code */ }
    }

    public object ExtendedLaunchContentCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(action: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedContentLauncherTrait.ExtendedLaunchContentCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedContentLauncherTrait.ExtendedLaunchContentCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedContentLauncherTrait.ExtendedLaunchContentCommand.Request { /* compiled code */ }
            }

            public final val action: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedContentLauncherTrait.ExtendedLaunchContentCommand.Request.CommandFields> {
                @androidx.annotation.NonNull action;

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


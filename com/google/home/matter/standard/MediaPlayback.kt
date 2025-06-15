// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MediaPlayback : com.google.home.matter.standard.MediaPlaybackTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.MediaPlaybackCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.MediaPlayback> {
        public final val currentState: com.google.home.automation.Attribute<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum?> /* compiled code */
            public final get

        public final val startTime: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val duration: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val sampledPosition: com.google.home.automation.Attribute<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackPositionStruct?> /* compiled code */
            public final get

        public final val playbackSpeed: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val seekRangeEnd: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val seekRangeStart: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val activeAudioTrack: com.google.home.automation.Attribute<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct?> /* compiled code */
            public final get

        public final val availableAudioTracks: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>?> /* compiled code */
            public final get

        public final val activeTextTrack: com.google.home.automation.Attribute<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct?> /* compiled code */
            public final get

        public final val availableTextTracks: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.MediaPlaybackTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.currentState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.startTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.duration: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.sampledPosition: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackPositionStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.playbackSpeed: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.seekRangeEnd: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.seekRangeStart: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.activeAudioTrack: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.availableAudioTracks: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.activeTextTrack: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.availableTextTracks: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun play(): com.google.home.automation.Command { /* compiled code */ }

        public final fun pause(): com.google.home.automation.Command { /* compiled code */ }

        public final fun stop(): com.google.home.automation.Command { /* compiled code */ }

        public final fun startOver(): com.google.home.automation.Command { /* compiled code */ }

        public final fun previous(): com.google.home.automation.Command { /* compiled code */ }

        public final fun next(): com.google.home.automation.Command { /* compiled code */ }

        public final fun rewind(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun fastForward(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun skipForward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun skipBackward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun seek(position: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun activateAudioTrack(trackId: kotlin.String, audioOutputIndex: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun activateTextTrack(trackId: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun deactivateTextTrack(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.MediaPlayback> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.MediaPlayback.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.MediaPlayback.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.MediaPlayback.Attribute> {
        @androidx.annotation.NonNull currentState,

        @androidx.annotation.NonNull startTime,

        @androidx.annotation.NonNull duration,

        @androidx.annotation.NonNull sampledPosition,

        @androidx.annotation.NonNull playbackSpeed,

        @androidx.annotation.NonNull seekRangeEnd,

        @androidx.annotation.NonNull seekRangeStart,

        @androidx.annotation.NonNull activeAudioTrack,

        @androidx.annotation.NonNull availableAudioTracks,

        @androidx.annotation.NonNull activeTextTrack,

        @androidx.annotation.NonNull availableTextTracks,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.MediaPlayback.Command> {
        @androidx.annotation.NonNull Play,

        @androidx.annotation.NonNull Pause,

        @androidx.annotation.NonNull Stop,

        @androidx.annotation.NonNull StartOver,

        @androidx.annotation.NonNull Previous,

        @androidx.annotation.NonNull Next,

        @androidx.annotation.NonNull Rewind,

        @androidx.annotation.NonNull FastForward,

        @androidx.annotation.NonNull SkipForward,

        @androidx.annotation.NonNull SkipBackward,

        @androidx.annotation.NonNull Seek,

        @androidx.annotation.NonNull ActivateAudioTrack,

        @androidx.annotation.NonNull ActivateTextTrack,

        @androidx.annotation.NonNull DeactivateTextTrack;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class StateChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.MediaPlaybackTrait.StateChanged) : com.google.home.Event, com.google.home.matter.standard.MediaPlaybackTrait.StateChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.MediaPlayback.StateChangedEvent> {
            public final val currentState: com.google.home.automation.EventField<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum?> /* compiled code */
                public final get

            public final val startTime: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val duration: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val playbackSpeed: com.google.home.automation.EventField<kotlin.Float?> /* compiled code */
                public final get

            public final val seekRangeEnd: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val seekRangeStart: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val data: com.google.home.automation.EventField<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val audioAdvanceUnmuted: com.google.home.automation.EventField<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.currentState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.startTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.duration: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.playbackSpeed: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.seekRangeEnd: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.seekRangeStart: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.data: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MediaPlayback.StateChangedEvent?>.audioAdvanceUnmuted: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.MediaPlaybackTrait.StateChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val audioAdvanceUnmuted: kotlin.Boolean? /* compiled code */

        public open val currentState: com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum? /* compiled code */

        public open val data: kotlin.ByteArray? /* compiled code */

        public open val duration: kotlin.ULong? /* compiled code */

        public open val playbackSpeed: kotlin.Float? /* compiled code */

        public open val sampledPosition: com.google.home.matter.standard.MediaPlaybackTrait.PlaybackPositionStruct? /* compiled code */

        public open val seekRangeEnd: kotlin.ULong? /* compiled code */

        public open val seekRangeStart: kotlin.ULong? /* compiled code */

        public open val startTime: kotlin.ULong? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.MediaPlayback.StateChangedEvent.EventFields> {
            @androidx.annotation.NonNull currentState,

            @androidx.annotation.NonNull startTime,

            @androidx.annotation.NonNull duration,

            @androidx.annotation.NonNull sampledPosition,

            @androidx.annotation.NonNull playbackSpeed,

            @androidx.annotation.NonNull seekRangeEnd,

            @androidx.annotation.NonNull seekRangeStart,

            @androidx.annotation.NonNull data,

            @androidx.annotation.NonNull audioAdvanceUnmuted;

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

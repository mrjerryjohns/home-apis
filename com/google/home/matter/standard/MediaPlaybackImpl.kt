// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class MediaPlaybackImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.MediaPlaybackTrait.Attributes) : com.google.home.matter.standard.MediaPlayback, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.MediaPlaybackTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.MediaPlaybackTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeAudioTrack: com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct? /* compiled code */

    public open val activeTextTrack: com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val availableAudioTracks: kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>? /* compiled code */

    public open val availableTextTracks: kotlin.collections.List<com.google.home.matter.standard.MediaPlaybackTrait.TrackStruct>? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentState: com.google.home.matter.standard.MediaPlaybackTrait.PlaybackStateEnum? /* compiled code */

    public open val duration: kotlin.ULong? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.MediaPlaybackTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val playbackSpeed: kotlin.Float? /* compiled code */

    public open val sampledPosition: com.google.home.matter.standard.MediaPlaybackTrait.PlaybackPositionStruct? /* compiled code */

    public open val seekRangeEnd: kotlin.ULong? /* compiled code */

    public open val seekRangeStart: kotlin.ULong? /* compiled code */

    public open val startTime: kotlin.ULong? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.MediaPlayback.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.MediaPlayback.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun play(): com.google.home.matter.standard.MediaPlaybackTrait.PlayCommand.Response { /* compiled code */ }

    public open suspend fun pause(): com.google.home.matter.standard.MediaPlaybackTrait.PauseCommand.Response { /* compiled code */ }

    public open suspend fun stop(): com.google.home.matter.standard.MediaPlaybackTrait.StopCommand.Response { /* compiled code */ }

    public open suspend fun startOver(): com.google.home.matter.standard.MediaPlaybackTrait.StartOverCommand.Response { /* compiled code */ }

    public open suspend fun previous(): com.google.home.matter.standard.MediaPlaybackTrait.PreviousCommand.Response { /* compiled code */ }

    public open suspend fun next(): com.google.home.matter.standard.MediaPlaybackTrait.NextCommand.Response { /* compiled code */ }

    public open suspend fun rewind(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.Response { /* compiled code */ }

    public open suspend fun fastForward(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.Response { /* compiled code */ }

    public open suspend fun skipForward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SkipForwardCommand.Response { /* compiled code */ }

    public open suspend fun skipBackward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SkipBackwardCommand.Response { /* compiled code */ }

    public open suspend fun seek(position: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SeekCommand.Response { /* compiled code */ }

    public open suspend fun activateAudioTrack(trackId: kotlin.String, audioOutputIndex: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun activateTextTrack(trackId: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun deactivateTextTrack(): kotlin.Unit { /* compiled code */ }

    public open fun playBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PlayCommand.Response> { /* compiled code */ }

    public open fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PauseCommand.Response> { /* compiled code */ }

    public open fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.StopCommand.Response> { /* compiled code */ }

    public open fun startOverBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.StartOverCommand.Response> { /* compiled code */ }

    public open fun previousBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PreviousCommand.Response> { /* compiled code */ }

    public open fun nextBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.NextCommand.Response> { /* compiled code */ }

    public open fun rewindBatchable(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.Response> { /* compiled code */ }

    public open fun fastForwardBatchable(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.Response> { /* compiled code */ }

    public open fun skipForwardBatchable(deltaPositionMilliseconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SkipForwardCommand.Response> { /* compiled code */ }

    public open fun skipBackwardBatchable(deltaPositionMilliseconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SkipBackwardCommand.Response> { /* compiled code */ }

    public open fun seekBatchable(position: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SeekCommand.Response> { /* compiled code */ }

    public open fun activateAudioTrackBatchable(trackId: kotlin.String, audioOutputIndex: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun activateTextTrackBatchable(trackId: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun deactivateTextTrackBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

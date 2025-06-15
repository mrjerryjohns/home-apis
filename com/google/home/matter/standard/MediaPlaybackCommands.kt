// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MediaPlaybackCommands {
    public abstract suspend fun play(): com.google.home.matter.standard.MediaPlaybackTrait.PlayCommand.Response

    public abstract suspend fun pause(): com.google.home.matter.standard.MediaPlaybackTrait.PauseCommand.Response

    public abstract suspend fun stop(): com.google.home.matter.standard.MediaPlaybackTrait.StopCommand.Response

    public abstract suspend fun startOver(): com.google.home.matter.standard.MediaPlaybackTrait.StartOverCommand.Response

    public abstract suspend fun previous(): com.google.home.matter.standard.MediaPlaybackTrait.PreviousCommand.Response

    public abstract suspend fun next(): com.google.home.matter.standard.MediaPlaybackTrait.NextCommand.Response

    public abstract suspend fun rewind(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.Response

    public abstract suspend fun fastForward(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.Response

    public abstract suspend fun skipForward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SkipForwardCommand.Response

    public abstract suspend fun skipBackward(deltaPositionMilliseconds: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SkipBackwardCommand.Response

    public abstract suspend fun seek(position: kotlin.ULong): com.google.home.matter.standard.MediaPlaybackTrait.SeekCommand.Response

    public abstract suspend fun activateAudioTrack(trackId: kotlin.String, audioOutputIndex: kotlin.UByte): kotlin.Unit

    public abstract suspend fun activateTextTrack(trackId: kotlin.String): kotlin.Unit

    public abstract suspend fun deactivateTextTrack(): kotlin.Unit

    public abstract fun playBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PlayCommand.Response>

    public abstract fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PauseCommand.Response>

    public abstract fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.StopCommand.Response>

    public abstract fun startOverBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.StartOverCommand.Response>

    public abstract fun previousBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.PreviousCommand.Response>

    public abstract fun nextBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.NextCommand.Response>

    public abstract fun rewindBatchable(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.RewindCommand.Response>

    public abstract fun fastForwardBatchable(optionalArgs: com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.FastForwardCommand.Response>

    public abstract fun skipForwardBatchable(deltaPositionMilliseconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SkipForwardCommand.Response>

    public abstract fun skipBackwardBatchable(deltaPositionMilliseconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SkipBackwardCommand.Response>

    public abstract fun seekBatchable(position: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.MediaPlaybackTrait.SeekCommand.Response>

    public abstract fun activateAudioTrackBatchable(trackId: kotlin.String, audioOutputIndex: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun activateTextTrackBatchable(trackId: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun deactivateTextTrackBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}


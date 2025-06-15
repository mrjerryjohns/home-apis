// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MediaPlaybackCommandsDefaultImpl : com.google.home.matter.standard.MediaPlaybackCommands {
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
}


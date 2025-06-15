// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ActionsCommandsDefaultImpl : com.google.home.matter.standard.ActionsCommands {
    public open suspend fun instantAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun instantActionWithTransition(actionId: kotlin.UShort, transitionTime: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun startAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun startActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StopActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun pauseAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun pauseActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun resumeAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun disableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun disableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun instantActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun instantActionWithTransitionBatchable(actionId: kotlin.UShort, transitionTime: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StopActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun pauseActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun pauseActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun resumeActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun disableActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun disableActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ActionsCommands {
    public abstract suspend fun instantAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun instantActionWithTransition(actionId: kotlin.UShort, transitionTime: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun startAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun startActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun stopAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StopActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun pauseAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun pauseActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun resumeAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun enableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun enableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun disableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun disableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun instantActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun instantActionWithTransitionBatchable(actionId: kotlin.UShort, transitionTime: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun startActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun startActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StopActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun pauseActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun pauseActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun resumeActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun disableActionBatchable(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun disableActionWithDurationBatchable(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}

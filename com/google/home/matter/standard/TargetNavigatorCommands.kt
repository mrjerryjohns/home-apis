// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TargetNavigatorCommands {
    public abstract suspend fun navigateTarget(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response

    public abstract fun navigateTargetBatchable(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response>
}

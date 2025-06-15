// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TargetNavigatorCommandsDefaultImpl : com.google.home.matter.standard.TargetNavigatorCommands {
    public open suspend fun navigateTarget(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response { /* compiled code */ }

    public open fun navigateTargetBatchable(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response> { /* compiled code */ }
}


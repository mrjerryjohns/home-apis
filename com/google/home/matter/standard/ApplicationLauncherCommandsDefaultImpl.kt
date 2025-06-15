// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ApplicationLauncherCommandsDefaultImpl : com.google.home.matter.standard.ApplicationLauncherCommands {
    public open suspend fun launchApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response { /* compiled code */ }

    public open suspend fun stopApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response { /* compiled code */ }

    public open suspend fun hideApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response { /* compiled code */ }

    public open fun launchAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response> { /* compiled code */ }

    public open fun stopAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response> { /* compiled code */ }

    public open fun hideAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response> { /* compiled code */ }
}


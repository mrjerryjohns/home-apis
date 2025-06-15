// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ApplicationLauncherCommands {
    public abstract suspend fun launchApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response

    public abstract suspend fun stopApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response

    public abstract suspend fun hideApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response

    public abstract fun launchAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response>

    public abstract fun stopAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response>

    public abstract fun hideAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response>
}

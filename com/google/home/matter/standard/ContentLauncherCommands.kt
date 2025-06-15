// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ContentLauncherCommands {
    public abstract suspend fun launchContent(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response

    public abstract suspend fun launchUrl(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response

    public abstract fun launchContentBatchable(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response>

    public abstract fun launchUrlBatchable(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response>
}


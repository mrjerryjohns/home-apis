// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ContentLauncherCommandsDefaultImpl : com.google.home.matter.standard.ContentLauncherCommands {
    public open suspend fun launchContent(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response { /* compiled code */ }

    public open suspend fun launchUrl(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response { /* compiled code */ }

    public open fun launchContentBatchable(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response> { /* compiled code */ }

    public open fun launchUrlBatchable(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response> { /* compiled code */ }
}

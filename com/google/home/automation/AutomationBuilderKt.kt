// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public fun automation(block: com.google.home.automation.AutomationBuilder.() -> kotlin.Unit): com.google.home.automation.BaseAutomation /* from: com.google.home.automation.DraftAutomation */ { /* compiled code */ }

public fun sequential(block: com.google.home.automation.SequentialFlowBuilder.() -> kotlin.Unit): com.google.home.automation.SequentialFlow { /* compiled code */ }

public fun sequential(nodes: kotlin.collections.List<com.google.home.automation.Node>): com.google.home.automation.SequentialFlow { /* compiled code */ }

public fun parallel(block: com.google.home.automation.ParallelFlowBuilder.() -> kotlin.Unit): com.google.home.automation.ParallelFlow { /* compiled code */ }

public fun parallel(nodes: kotlin.collections.List<com.google.home.automation.Node>, joinSemantic: com.google.home.automation.JoinSemanticType = COMPILED_CODE): com.google.home.automation.ParallelFlow { /* compiled code */ }

public fun select(block: com.google.home.automation.SelectFlowBuilder.() -> kotlin.Unit): com.google.home.automation.SelectFlow { /* compiled code */ }

public fun select(nodes: kotlin.collections.List<com.google.home.automation.Node>): com.google.home.automation.SelectFlow { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun manualStarter(): com.google.home.automation.ManualStarter { /* compiled code */ }

public fun <T : com.google.home.Trait> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Trait> starter(structure: com.google.home.Structure, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Event> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Event> starter(structure: com.google.home.Structure, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Event> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Event> starter(structure: com.google.home.Structure, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T : com.google.home.Trait> starter(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T : com.google.home.Event> starter(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T : com.google.home.Event> starter(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Trait> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Trait, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Event> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Event, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Event> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Event, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Trait> stateReader(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

public fun <T : com.google.home.Trait> stateReader(structure: com.google.home.Structure, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T : com.google.home.Trait> stateReader(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Trait> stateReader(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

@kotlin.jvm.JvmName public fun <T : com.google.home.Trait, U : com.google.home.HomeObjectType> stateReader(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<kotlin.collections.Map<com.google.home.automation.TypedEntity<U>, T>> { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun condition(block: com.google.home.automation.ConditionBuilder.() -> kotlin.Unit): com.google.home.automation.Condition { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T : com.google.home.Trait> update(trait: com.google.home.TraitFactory<T>, updaterBlock: com.google.home.automation.Updater<T>.() -> kotlin.Unit): com.google.home.automation.ActionBehavior { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun action(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): com.google.home.automation.Action { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun action(structure: com.google.home.Structure, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): com.google.home.automation.Action { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun action(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): com.google.home.automation.Action { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty @kotlin.jvm.JvmName public fun action(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): com.google.home.automation.Action { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty @kotlin.jvm.JvmName public fun <T : com.google.home.HomeObjectType> action(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<T>>?>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): com.google.home.automation.Action { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun delayFor(duration: java.time.Duration): com.google.home.automation.Delay { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun suppressFor(duration: java.time.Duration): com.google.home.automation.Suppression { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<T>.toStarter(): com.google.home.automation.Starter { /* compiled code */ }

@com.google.android.gms.common.internal.ShowFirstParty public fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<T>.toStateReader(): com.google.home.automation.StateReader { /* compiled code */ }

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface StarterNodeDsl : com.google.home.automation.AutomationFlowContributor {
    public open fun <T : com.google.home.Trait> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> starter(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> starter(structure: com.google.home.Structure, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(structure: com.google.home.Structure, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(unknownEntity: com.google.home.automation.UnknownEntity, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Event> starter(structure: com.google.home.Structure, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.StarterCandidate.starter(block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Trait> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Trait, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Event> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Event, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, event: com.google.home.EventFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Event> starter(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Event, U : com.google.home.HomeObjectType> starter(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, event: com.google.home.EventFactory<T>, block: com.google.home.automation.ParametersBuilder.() -> kotlin.Unit): com.google.home.automation.TypedExpression<T> { /* compiled code */ }
}


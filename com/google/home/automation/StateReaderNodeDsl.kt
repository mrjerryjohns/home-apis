// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface StateReaderNodeDsl : com.google.home.automation.AutomationFlowContributor {
    public open fun <T : com.google.home.Trait> stateReader(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> stateReader(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> stateReader(structure: com.google.home.Structure, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.StateReaderCandidate.stateReader(): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Trait> stateReader(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<T> { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.Trait, U : com.google.home.HomeObjectType> stateReader(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<U>>?>, trait: com.google.home.TraitFactory<T>): com.google.home.automation.TypedExpression<kotlin.collections.Map<com.google.home.automation.TypedEntity<U>, T>> { /* compiled code */ }
}


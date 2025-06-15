// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface ActionNodeDsl : com.google.home.automation.AutomationFlowContributor {
    public open fun action(device: com.google.home.HomeDevice, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun action(unknownEntity: com.google.home.automation.UnknownEntity, entityType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun action(structure: com.google.home.Structure, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun action(entityExpression: com.google.home.automation.TypedExpression<out com.google.home.automation.TypedEntity<out com.google.home.HomeObjectType>?>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    @kotlin.jvm.JvmName public open fun <T : com.google.home.HomeObjectType> action(entityExpression: com.google.home.automation.TypedExpression<out kotlin.collections.List<com.google.home.automation.TypedEntity<T>>?>, block: com.google.home.automation.ActionBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun @receiver:androidx.annotation.NonNull com.google.home.automation.CommandCandidate.action(command: com.google.home.automation.Command): kotlin.Unit { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun <T : com.google.home.Trait> @receiver:androidx.annotation.NonNull com.google.home.automation.TraitAttributesCandidate.update(updaterBlock: com.google.home.automation.Updater<T>.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }
}

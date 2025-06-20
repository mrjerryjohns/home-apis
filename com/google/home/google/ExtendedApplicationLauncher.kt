// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedApplicationLauncher : com.google.home.google.ExtendedApplicationLauncherTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.ExtendedApplicationLauncherCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ExtendedApplicationLauncher> {
        public final val availableApplications: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.ExtendedApplicationLauncherTrait.AvailableApplication>?> /* compiled code */
            public final get

        public final val currentApplicationKey: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val useGlobalApplicationCatalog: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val type: com.google.home.automation.Attribute<com.google.home.google.ExtendedApplicationLauncherTrait.ApplicationType?> /* compiled code */
            public final get

        public final val globalApplicationCatalog: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.availableApplications: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedApplicationLauncherTrait.AvailableApplication>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.currentApplicationKey: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.useGlobalApplicationCatalog: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.type: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedApplicationLauncherTrait.ApplicationType?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.globalApplicationCatalog: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedApplicationLauncher?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun installApp(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun searchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun launchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ExtendedApplicationLauncher> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ExtendedApplicationLauncher.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.ExtendedApplicationLauncher.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedApplicationLauncher.Attribute> {
        @androidx.annotation.NonNull availableApplications,

        @androidx.annotation.NonNull currentApplicationKey,

        @androidx.annotation.NonNull useGlobalApplicationCatalog,

        @androidx.annotation.NonNull type,

        @androidx.annotation.NonNull globalApplicationCatalog,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.ExtendedApplicationLauncher.Command> {
        @androidx.annotation.NonNull InstallApp,

        @androidx.annotation.NonNull SearchApp,

        @androidx.annotation.NonNull LaunchApp;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

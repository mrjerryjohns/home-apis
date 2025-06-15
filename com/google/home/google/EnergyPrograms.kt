// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface EnergyPrograms : com.google.home.google.EnergyProgramsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.EnergyProgramsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.EnergyPrograms> {
        public final val enrolledEnergyPrograms: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>?> /* compiled code */
            public final get

        public final val activeEnergyPrograms: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val scheduledEnergyProgramEvents: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.enrolledEnergyPrograms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.activeEnergyPrograms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.scheduledEnergyProgramEvents: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyPrograms?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun cancelEnergyProgramEvent(eventId: kotlin.String, programName: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.EnergyPrograms> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.EnergyPrograms.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.EnergyPrograms.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyPrograms.Attribute> {
        @androidx.annotation.NonNull enrolledEnergyPrograms,

        @androidx.annotation.NonNull activeEnergyPrograms,

        @androidx.annotation.NonNull scheduledEnergyProgramEvents,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.EnergyPrograms.Command> {
        @androidx.annotation.NonNull ScheduleEnergyProgramEvent,

        @androidx.annotation.NonNull CancelEnergyProgramEvent;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


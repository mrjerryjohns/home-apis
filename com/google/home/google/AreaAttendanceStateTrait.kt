// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AreaAttendanceStateTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.AreaAttendanceStateTrait.Attributes> {
            public final fun @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AreaAttendanceStateTrait.AttendanceState.fromProto(): com.google.home.google.AreaAttendanceStateTrait.AttendanceState { /* compiled code */ }

            public final fun @receiver:androidx.annotation.NonNull com.google.home.google.AreaAttendanceStateTrait.AttendanceState.toProto(): com.google.home.platform.traits.AreaAttendanceStateTrait.AttendanceState { /* compiled code */ }

            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AreaAttendanceStateTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AreaAttendanceStateTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val attendanceState: com.google.home.google.AreaAttendanceStateTrait.AttendanceState?
    }

    public final enum class AttendanceState private constructor(id: kotlin.ULong, value: kotlin.String) : com.google.home.google.PlatformEnum, kotlin.Enum<com.google.home.google.AreaAttendanceStateTrait.AttendanceState> {
        @androidx.annotation.NonNull AttendanceStateUnspecified,

        @androidx.annotation.NonNull AttendanceStateUnknown,

        @androidx.annotation.NonNull AttendanceStateNoHouseholdMembers,

        @androidx.annotation.NonNull AttendanceStateSomeHouseholdMembers,

        @androidx.annotation.NonNull AttendanceStateAllHouseholdMembers,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.google.PlatformEnumAdapter<com.google.home.google.AreaAttendanceStateTrait.AttendanceState> /* compiled code */
        }

        public open val id: kotlin.ULong /* compiled code */

        public open val value: kotlin.String /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class AttributesImpl public constructor(attendanceState: com.google.home.google.AreaAttendanceStateTrait.AttendanceState?) : com.google.home.google.AreaAttendanceStateTrait.Attributes {
        public open val attendanceState: com.google.home.google.AreaAttendanceStateTrait.AttendanceState? /* compiled code */

        public final operator fun component1(): com.google.home.google.AreaAttendanceStateTrait.AttendanceState? { /* compiled code */ }

        public final fun copy(attendanceState: com.google.home.google.AreaAttendanceStateTrait.AttendanceState? = COMPILED_CODE): com.google.home.google.AreaAttendanceStateTrait.AttributesImpl { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

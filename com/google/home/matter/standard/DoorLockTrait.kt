// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object DoorLockTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AlarmCodeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum> {
        @androidx.annotation.NonNull LockJammed,

        @androidx.annotation.NonNull LockFactoryReset,

        @androidx.annotation.NonNull LockRadioPowerCycled,

        @androidx.annotation.NonNull WrongCodeEntryLimit,

        @androidx.annotation.NonNull FrontEsceutcheonRemoved,

        @androidx.annotation.NonNull DoorForcedOpen,

        @androidx.annotation.NonNull DoorAjar,

        @androidx.annotation.NonNull ForcedUser,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class CredentialRuleEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum> {
        @androidx.annotation.NonNull Single,

        @androidx.annotation.NonNull Dual,

        @androidx.annotation.NonNull Tri,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class CredentialTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.CredentialTypeEnum> {
        @androidx.annotation.NonNull ProgrammingPin,

        @androidx.annotation.NonNull Pin,

        @androidx.annotation.NonNull Rfid,

        @androidx.annotation.NonNull Fingerprint,

        @androidx.annotation.NonNull FingerVein,

        @androidx.annotation.NonNull Face,

        @androidx.annotation.NonNull AliroCredentialIssuerKey,

        @androidx.annotation.NonNull AliroEvictableEndpointKey,

        @androidx.annotation.NonNull AliroNonEvictableEndpointKey,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.CredentialTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DataOperationTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum> {
        @androidx.annotation.NonNull Add,

        @androidx.annotation.NonNull Clear,

        @androidx.annotation.NonNull Modify,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DlLockState private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DlLockState> {
        @androidx.annotation.NonNull NotFullyLocked,

        @androidx.annotation.NonNull Locked,

        @androidx.annotation.NonNull Unlocked,

        @androidx.annotation.NonNull Unlatched,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DlLockState> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DlLockType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DlLockType> {
        @androidx.annotation.NonNull DeadBolt,

        @androidx.annotation.NonNull Magnetic,

        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull Mortise,

        @androidx.annotation.NonNull Rim,

        @androidx.annotation.NonNull LatchBolt,

        @androidx.annotation.NonNull CylindricalLock,

        @androidx.annotation.NonNull TubularLock,

        @androidx.annotation.NonNull InterconnectedLock,

        @androidx.annotation.NonNull DeadLatch,

        @androidx.annotation.NonNull DoorFurniture,

        @androidx.annotation.NonNull Eurocylinder,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DlLockType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DlStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DlStatus> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull Duplicate,

        @androidx.annotation.NonNull Occupied,

        @androidx.annotation.NonNull InvalidField,

        @androidx.annotation.NonNull ResourceExhausted,

        @androidx.annotation.NonNull NotFound,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DlStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorLockOperationEventCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorLockOperationEventCode> {
        @androidx.annotation.NonNull UnknownOrMfgSpecific,

        @androidx.annotation.NonNull Lock,

        @androidx.annotation.NonNull Unlock,

        @androidx.annotation.NonNull LockInvalidPinOrId,

        @androidx.annotation.NonNull LockInvalidSchedule,

        @androidx.annotation.NonNull UnlockInvalidPinOrId,

        @androidx.annotation.NonNull UnlockInvalidSchedule,

        @androidx.annotation.NonNull OneTouchLock,

        @androidx.annotation.NonNull KeyLock,

        @androidx.annotation.NonNull KeyUnlock,

        @androidx.annotation.NonNull AutoLock,

        @androidx.annotation.NonNull ScheduleLock,

        @androidx.annotation.NonNull ScheduleUnlock,

        @androidx.annotation.NonNull ManualLock,

        @androidx.annotation.NonNull ManualUnlock,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockOperationEventCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorLockProgrammingEventCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorLockProgrammingEventCode> {
        @androidx.annotation.NonNull UnknownOrMfgSpecific,

        @androidx.annotation.NonNull MasterCodeChanged,

        @androidx.annotation.NonNull PinAdded,

        @androidx.annotation.NonNull PinDeleted,

        @androidx.annotation.NonNull PinChanged,

        @androidx.annotation.NonNull IdAdded,

        @androidx.annotation.NonNull IdDeleted,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockProgrammingEventCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorLockSetPinOrIdStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorLockSetPinOrIdStatus> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull GeneralFailure,

        @androidx.annotation.NonNull MemoryFull,

        @androidx.annotation.NonNull DuplicateCodeError,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockSetPinOrIdStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorLockUserStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorLockUserStatus> {
        @androidx.annotation.NonNull Available,

        @androidx.annotation.NonNull OccupiedEnabled,

        @androidx.annotation.NonNull OccupiedDisabled,

        @androidx.annotation.NonNull NotSupported,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockUserStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorLockUserType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorLockUserType> {
        @androidx.annotation.NonNull Unrestricted,

        @androidx.annotation.NonNull YearDayScheduleUser,

        @androidx.annotation.NonNull WeekDayScheduleUser,

        @androidx.annotation.NonNull MasterUser,

        @androidx.annotation.NonNull NonAccessUser,

        @androidx.annotation.NonNull NotSupported,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockUserType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DoorStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum> {
        @androidx.annotation.NonNull DoorOpen,

        @androidx.annotation.NonNull DoorClosed,

        @androidx.annotation.NonNull DoorJammed,

        @androidx.annotation.NonNull DoorForcedOpen,

        @androidx.annotation.NonNull DoorUnspecifiedError,

        @androidx.annotation.NonNull DoorAjar,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class LockDataTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull ProgrammingCode,

        @androidx.annotation.NonNull UserIndex,

        @androidx.annotation.NonNull WeekDaySchedule,

        @androidx.annotation.NonNull YearDaySchedule,

        @androidx.annotation.NonNull HolidaySchedule,

        @androidx.annotation.NonNull Pin,

        @androidx.annotation.NonNull Rfid,

        @androidx.annotation.NonNull Fingerprint,

        @androidx.annotation.NonNull FingerVein,

        @androidx.annotation.NonNull Face,

        @androidx.annotation.NonNull AliroCredentialIssuerKey,

        @androidx.annotation.NonNull AliroEvictableEndpointKey,

        @androidx.annotation.NonNull AliroNonEvictableEndpointKey,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class LockOperationTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum> {
        @androidx.annotation.NonNull Lock,

        @androidx.annotation.NonNull Unlock,

        @androidx.annotation.NonNull NonAccessUserEvent,

        @androidx.annotation.NonNull ForcedUserEvent,

        @androidx.annotation.NonNull Unlatch,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperatingModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Vacation,

        @androidx.annotation.NonNull Privacy,

        @androidx.annotation.NonNull NoRemoteLockUnlock,

        @androidx.annotation.NonNull Passage,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperationErrorEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull InvalidCredential,

        @androidx.annotation.NonNull DisabledUserDenied,

        @androidx.annotation.NonNull Restricted,

        @androidx.annotation.NonNull InsufficientBattery,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperationSourceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Manual,

        @androidx.annotation.NonNull ProprietaryRemote,

        @androidx.annotation.NonNull Keypad,

        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull Button,

        @androidx.annotation.NonNull Schedule,

        @androidx.annotation.NonNull Remote,

        @androidx.annotation.NonNull Rfid,

        @androidx.annotation.NonNull Biometric,

        @androidx.annotation.NonNull Aliro,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class UserStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.UserStatusEnum> {
        @androidx.annotation.NonNull Available,

        @androidx.annotation.NonNull OccupiedEnabled,

        @androidx.annotation.NonNull OccupiedDisabled,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.UserStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class UserTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.UserTypeEnum> {
        @androidx.annotation.NonNull UnrestrictedUser,

        @androidx.annotation.NonNull YearDayScheduleUser,

        @androidx.annotation.NonNull WeekDayScheduleUser,

        @androidx.annotation.NonNull ProgrammingUser,

        @androidx.annotation.NonNull NonAccessUser,

        @androidx.annotation.NonNull ForcedUser,

        @androidx.annotation.NonNull DisposableUser,

        @androidx.annotation.NonNull ExpiringUser,

        @androidx.annotation.NonNull ScheduleRestrictedUser,

        @androidx.annotation.NonNull RemoteOnlyUser,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.DoorLockTrait.UserTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class DaysMaskMap public constructor(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DaysMaskMap> {
            private const final val SUNDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MONDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TUESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEDNESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THURSDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FRIDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SATURDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DaysMaskMap { /* compiled code */ }
        }

        public final val sunday: kotlin.Boolean /* compiled code */

        public final val monday: kotlin.Boolean /* compiled code */

        public final val tuesday: kotlin.Boolean /* compiled code */

        public final val wednesday: kotlin.Boolean /* compiled code */

        public final val thursday: kotlin.Boolean /* compiled code */

        public final val friday: kotlin.Boolean /* compiled code */

        public final val saturday: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DaysMaskMap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlCredentialRuleMask public constructor(single: kotlin.Boolean = COMPILED_CODE, dual: kotlin.Boolean = COMPILED_CODE, tri: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask> {
            private const final val SINGLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DUAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TRI_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask { /* compiled code */ }
        }

        public final val single: kotlin.Boolean /* compiled code */

        public final val dual: kotlin.Boolean /* compiled code */

        public final val tri: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(single: kotlin.Boolean = COMPILED_CODE, dual: kotlin.Boolean = COMPILED_CODE, tri: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlCredentialRulesSupport public constructor(single: kotlin.Boolean = COMPILED_CODE, dual: kotlin.Boolean = COMPILED_CODE, tri: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlCredentialRulesSupport> {
            private const final val SINGLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DUAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TRI_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlCredentialRulesSupport): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlCredentialRulesSupport { /* compiled code */ }
        }

        public final val single: kotlin.Boolean /* compiled code */

        public final val dual: kotlin.Boolean /* compiled code */

        public final val tri: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(single: kotlin.Boolean = COMPILED_CODE, dual: kotlin.Boolean = COMPILED_CODE, tri: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlCredentialRulesSupport { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlDefaultConfigurationRegister public constructor(enableLocalProgrammingEnabled: kotlin.Boolean = COMPILED_CODE, keypadInterfaceDefaultAccessEnabled: kotlin.Boolean = COMPILED_CODE, remoteInterfaceDefaultAccessIsEnabled: kotlin.Boolean = COMPILED_CODE, soundEnabled: kotlin.Boolean = COMPILED_CODE, autoRelockTimeSet: kotlin.Boolean = COMPILED_CODE, ledSettingsSet: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister> {
            private const final val ENABLE_LOCAL_PROGRAMMING_ENABLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val KEYPAD_INTERFACE_DEFAULT_ACCESS_ENABLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REMOTE_INTERFACE_DEFAULT_ACCESS_IS_ENABLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SOUND_ENABLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTO_RELOCK_TIME_SET_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LED_SETTINGS_SET_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister { /* compiled code */ }
        }

        public final val enableLocalProgrammingEnabled: kotlin.Boolean /* compiled code */

        public final val keypadInterfaceDefaultAccessEnabled: kotlin.Boolean /* compiled code */

        public final val remoteInterfaceDefaultAccessIsEnabled: kotlin.Boolean /* compiled code */

        public final val soundEnabled: kotlin.Boolean /* compiled code */

        public final val autoRelockTimeSet: kotlin.Boolean /* compiled code */

        public final val ledSettingsSet: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(enableLocalProgrammingEnabled: kotlin.Boolean = COMPILED_CODE, keypadInterfaceDefaultAccessEnabled: kotlin.Boolean = COMPILED_CODE, remoteInterfaceDefaultAccessIsEnabled: kotlin.Boolean = COMPILED_CODE, soundEnabled: kotlin.Boolean = COMPILED_CODE, autoRelockTimeSet: kotlin.Boolean = COMPILED_CODE, ledSettingsSet: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlKeypadOperationEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidPin: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidCode: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, nonAccessUserOpEvent: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlKeypadOperationEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_PIN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_CODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NON_ACCESS_USER_OP_EVENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlKeypadOperationEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlKeypadOperationEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val lock: kotlin.Boolean /* compiled code */

        public final val unlock: kotlin.Boolean /* compiled code */

        public final val lockInvalidPin: kotlin.Boolean /* compiled code */

        public final val lockInvalidSchedule: kotlin.Boolean /* compiled code */

        public final val unlockInvalidCode: kotlin.Boolean /* compiled code */

        public final val unlockInvalidSchedule: kotlin.Boolean /* compiled code */

        public final val nonAccessUserOpEvent: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidPin: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidCode: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, nonAccessUserOpEvent: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlKeypadOperationEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlKeypadProgrammingEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, programmingPinChanged: kotlin.Boolean = COMPILED_CODE, pinAdded: kotlin.Boolean = COMPILED_CODE, pinCleared: kotlin.Boolean = COMPILED_CODE, pinChanged: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlKeypadProgrammingEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PROGRAMMING_PIN_CHANGED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_ADDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_CLEARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_CHANGED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlKeypadProgrammingEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlKeypadProgrammingEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val programmingPinChanged: kotlin.Boolean /* compiled code */

        public final val pinAdded: kotlin.Boolean /* compiled code */

        public final val pinCleared: kotlin.Boolean /* compiled code */

        public final val pinChanged: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, programmingPinChanged: kotlin.Boolean = COMPILED_CODE, pinAdded: kotlin.Boolean = COMPILED_CODE, pinCleared: kotlin.Boolean = COMPILED_CODE, pinChanged: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlKeypadProgrammingEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlLocalProgrammingFeatures public constructor(addUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, modifyUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, clearUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, adjustLockSettingsLocally: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures> {
            private const final val ADD_USERS_CREDENTIALS_SCHEDULES_LOCALLY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MODIFY_USERS_CREDENTIALS_SCHEDULES_LOCALLY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CLEAR_USERS_CREDENTIALS_SCHEDULES_LOCALLY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ADJUST_LOCK_SETTINGS_LOCALLY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures { /* compiled code */ }
        }

        public final val addUsersCredentialsSchedulesLocally: kotlin.Boolean /* compiled code */

        public final val modifyUsersCredentialsSchedulesLocally: kotlin.Boolean /* compiled code */

        public final val clearUsersCredentialsSchedulesLocally: kotlin.Boolean /* compiled code */

        public final val adjustLockSettingsLocally: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(addUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, modifyUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, clearUsersCredentialsSchedulesLocally: kotlin.Boolean = COMPILED_CODE, adjustLockSettingsLocally: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlManualOperationEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, thumbturnLock: kotlin.Boolean = COMPILED_CODE, thumbturnUnlock: kotlin.Boolean = COMPILED_CODE, oneTouchLock: kotlin.Boolean = COMPILED_CODE, keyLock: kotlin.Boolean = COMPILED_CODE, keyUnlock: kotlin.Boolean = COMPILED_CODE, autoLock: kotlin.Boolean = COMPILED_CODE, scheduleLock: kotlin.Boolean = COMPILED_CODE, scheduleUnlock: kotlin.Boolean = COMPILED_CODE, manualLock: kotlin.Boolean = COMPILED_CODE, manualUnlock: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlManualOperationEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THUMBTURN_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THUMBTURN_UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ONE_TOUCH_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val KEY_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val KEY_UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTO_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SCHEDULE_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SCHEDULE_UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MANUAL_LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MANUAL_UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlManualOperationEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlManualOperationEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val thumbturnLock: kotlin.Boolean /* compiled code */

        public final val thumbturnUnlock: kotlin.Boolean /* compiled code */

        public final val oneTouchLock: kotlin.Boolean /* compiled code */

        public final val keyLock: kotlin.Boolean /* compiled code */

        public final val keyUnlock: kotlin.Boolean /* compiled code */

        public final val autoLock: kotlin.Boolean /* compiled code */

        public final val scheduleLock: kotlin.Boolean /* compiled code */

        public final val scheduleUnlock: kotlin.Boolean /* compiled code */

        public final val manualLock: kotlin.Boolean /* compiled code */

        public final val manualUnlock: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component10(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component11(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, thumbturnLock: kotlin.Boolean = COMPILED_CODE, thumbturnUnlock: kotlin.Boolean = COMPILED_CODE, oneTouchLock: kotlin.Boolean = COMPILED_CODE, keyLock: kotlin.Boolean = COMPILED_CODE, keyUnlock: kotlin.Boolean = COMPILED_CODE, autoLock: kotlin.Boolean = COMPILED_CODE, scheduleLock: kotlin.Boolean = COMPILED_CODE, scheduleUnlock: kotlin.Boolean = COMPILED_CODE, manualLock: kotlin.Boolean = COMPILED_CODE, manualUnlock: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlManualOperationEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlRfidOperationEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidRfid: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidRfid: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlRfidOperationEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_RFID_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_RFID_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlRfidOperationEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlRfidOperationEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val lock: kotlin.Boolean /* compiled code */

        public final val unlock: kotlin.Boolean /* compiled code */

        public final val lockInvalidRfid: kotlin.Boolean /* compiled code */

        public final val lockInvalidSchedule: kotlin.Boolean /* compiled code */

        public final val unlockInvalidRfid: kotlin.Boolean /* compiled code */

        public final val unlockInvalidSchedule: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidRfid: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidRfid: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlRfidOperationEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlRfidProgrammingEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, rfidCodeAdded: kotlin.Boolean = COMPILED_CODE, rfidCodeCleared: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlRfidProgrammingEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_CODE_ADDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_CODE_CLEARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlRfidProgrammingEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlRfidProgrammingEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val rfidCodeAdded: kotlin.Boolean /* compiled code */

        public final val rfidCodeCleared: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, rfidCodeAdded: kotlin.Boolean = COMPILED_CODE, rfidCodeCleared: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlRfidProgrammingEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlRemoteOperationEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidCode: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidCode: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlRemoteOperationEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_CODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_CODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNLOCK_INVALID_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlRemoteOperationEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlRemoteOperationEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val lock: kotlin.Boolean /* compiled code */

        public final val unlock: kotlin.Boolean /* compiled code */

        public final val lockInvalidCode: kotlin.Boolean /* compiled code */

        public final val lockInvalidSchedule: kotlin.Boolean /* compiled code */

        public final val unlockInvalidCode: kotlin.Boolean /* compiled code */

        public final val unlockInvalidSchedule: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, lock: kotlin.Boolean = COMPILED_CODE, unlock: kotlin.Boolean = COMPILED_CODE, lockInvalidCode: kotlin.Boolean = COMPILED_CODE, lockInvalidSchedule: kotlin.Boolean = COMPILED_CODE, unlockInvalidCode: kotlin.Boolean = COMPILED_CODE, unlockInvalidSchedule: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlRemoteOperationEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlRemoteProgrammingEventMask public constructor(unknown: kotlin.Boolean = COMPILED_CODE, programmingPinChanged: kotlin.Boolean = COMPILED_CODE, pinAdded: kotlin.Boolean = COMPILED_CODE, pinCleared: kotlin.Boolean = COMPILED_CODE, pinChanged: kotlin.Boolean = COMPILED_CODE, rfidCodeAdded: kotlin.Boolean = COMPILED_CODE, rfidCodeCleared: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlRemoteProgrammingEventMask> {
            private const final val UNKNOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PROGRAMMING_PIN_CHANGED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_ADDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_CLEARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PIN_CHANGED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_CODE_ADDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_CODE_CLEARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlRemoteProgrammingEventMask): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlRemoteProgrammingEventMask { /* compiled code */ }
        }

        public final val unknown: kotlin.Boolean /* compiled code */

        public final val programmingPinChanged: kotlin.Boolean /* compiled code */

        public final val pinAdded: kotlin.Boolean /* compiled code */

        public final val pinCleared: kotlin.Boolean /* compiled code */

        public final val pinChanged: kotlin.Boolean /* compiled code */

        public final val rfidCodeAdded: kotlin.Boolean /* compiled code */

        public final val rfidCodeCleared: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unknown: kotlin.Boolean = COMPILED_CODE, programmingPinChanged: kotlin.Boolean = COMPILED_CODE, pinAdded: kotlin.Boolean = COMPILED_CODE, pinCleared: kotlin.Boolean = COMPILED_CODE, pinChanged: kotlin.Boolean = COMPILED_CODE, rfidCodeAdded: kotlin.Boolean = COMPILED_CODE, rfidCodeCleared: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlRemoteProgrammingEventMask { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DlSupportedOperatingModes public constructor(normal: kotlin.Boolean = COMPILED_CODE, vacation: kotlin.Boolean = COMPILED_CODE, privacy: kotlin.Boolean = COMPILED_CODE, noRemoteLockUnlock: kotlin.Boolean = COMPILED_CODE, passage: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes> {
            private const final val NORMAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VACATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PRIVACY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NO_REMOTE_LOCK_UNLOCK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PASSAGE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes { /* compiled code */ }
        }

        public final val normal: kotlin.Boolean /* compiled code */

        public final val vacation: kotlin.Boolean /* compiled code */

        public final val privacy: kotlin.Boolean /* compiled code */

        public final val noRemoteLockUnlock: kotlin.Boolean /* compiled code */

        public final val passage: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(normal: kotlin.Boolean = COMPILED_CODE, vacation: kotlin.Boolean = COMPILED_CODE, privacy: kotlin.Boolean = COMPILED_CODE, noRemoteLockUnlock: kotlin.Boolean = COMPILED_CODE, passage: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class DoorLockDayOfWeek public constructor(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockDayOfWeek> {
            private const final val SUNDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MONDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TUESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEDNESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THURSDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FRIDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SATURDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.DoorLockDayOfWeek): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.DoorLockDayOfWeek { /* compiled code */ }
        }

        public final val sunday: kotlin.Boolean /* compiled code */

        public final val monday: kotlin.Boolean /* compiled code */

        public final val tuesday: kotlin.Boolean /* compiled code */

        public final val wednesday: kotlin.Boolean /* compiled code */

        public final val thursday: kotlin.Boolean /* compiled code */

        public final val friday: kotlin.Boolean /* compiled code */

        public final val saturday: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.DoorLockDayOfWeek { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(pinCredential: kotlin.Boolean = COMPILED_CODE, rfidCredential: kotlin.Boolean = COMPILED_CODE, fingerCredentials: kotlin.Boolean = COMPILED_CODE, logging: kotlin.Boolean = COMPILED_CODE, weekDayAccessSchedules: kotlin.Boolean = COMPILED_CODE, doorPositionSensor: kotlin.Boolean = COMPILED_CODE, faceCredentials: kotlin.Boolean = COMPILED_CODE, credentialsOverTheAirAccess: kotlin.Boolean = COMPILED_CODE, user: kotlin.Boolean = COMPILED_CODE, notification: kotlin.Boolean = COMPILED_CODE, yearDayAccessSchedules: kotlin.Boolean = COMPILED_CODE, holidaySchedules: kotlin.Boolean = COMPILED_CODE, unbolt: kotlin.Boolean = COMPILED_CODE, aliroProvisioning: kotlin.Boolean = COMPILED_CODE, aliroBleUwb: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DoorLockTrait.Feature> {
            private const final val PIN_CREDENTIAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_CREDENTIAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FINGER_CREDENTIALS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOGGING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEEK_DAY_ACCESS_SCHEDULES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DOOR_POSITION_SENSOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FACE_CREDENTIALS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CREDENTIALS_OVER_THE_AIR_ACCESS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val USER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NOTIFICATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val YEAR_DAY_ACCESS_SCHEDULES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HOLIDAY_SCHEDULES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UNBOLT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ALIRO_PROVISIONING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ALIRO_BLEUWB_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DoorLockTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DoorLockTrait.Feature { /* compiled code */ }
        }

        public final val pinCredential: kotlin.Boolean /* compiled code */

        public final val rfidCredential: kotlin.Boolean /* compiled code */

        public final val fingerCredentials: kotlin.Boolean /* compiled code */

        public final val logging: kotlin.Boolean /* compiled code */

        public final val weekDayAccessSchedules: kotlin.Boolean /* compiled code */

        public final val doorPositionSensor: kotlin.Boolean /* compiled code */

        public final val faceCredentials: kotlin.Boolean /* compiled code */

        public final val credentialsOverTheAirAccess: kotlin.Boolean /* compiled code */

        public final val user: kotlin.Boolean /* compiled code */

        public final val notification: kotlin.Boolean /* compiled code */

        public final val yearDayAccessSchedules: kotlin.Boolean /* compiled code */

        public final val holidaySchedules: kotlin.Boolean /* compiled code */

        public final val unbolt: kotlin.Boolean /* compiled code */

        public final val aliroProvisioning: kotlin.Boolean /* compiled code */

        public final val aliroBleUwb: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component10(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component11(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component12(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component13(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component14(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component15(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(pinCredential: kotlin.Boolean = COMPILED_CODE, rfidCredential: kotlin.Boolean = COMPILED_CODE, fingerCredentials: kotlin.Boolean = COMPILED_CODE, logging: kotlin.Boolean = COMPILED_CODE, weekDayAccessSchedules: kotlin.Boolean = COMPILED_CODE, doorPositionSensor: kotlin.Boolean = COMPILED_CODE, faceCredentials: kotlin.Boolean = COMPILED_CODE, credentialsOverTheAirAccess: kotlin.Boolean = COMPILED_CODE, user: kotlin.Boolean = COMPILED_CODE, notification: kotlin.Boolean = COMPILED_CODE, yearDayAccessSchedules: kotlin.Boolean = COMPILED_CODE, holidaySchedules: kotlin.Boolean = COMPILED_CODE, unbolt: kotlin.Boolean = COMPILED_CODE, aliroProvisioning: kotlin.Boolean = COMPILED_CODE, aliroBleUwb: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface DoorLockAlarm {
        public abstract val alarmCode: com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum?
    }

    public final class DoorLockAlarmImpl public constructor(alarmCode: com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum? = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm { /* compiled code */ }
        }

        public open val alarmCode: com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface DoorStateChange {
        public abstract val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?
    }

    public final class DoorStateChangeImpl public constructor(doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.DoorStateChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.DoorStateChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.DoorStateChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.DoorStateChange { /* compiled code */ }
        }

        public open val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LockOperation {
        public abstract val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?

        public abstract val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?

        public abstract val userIndex: kotlin.UShort?

        public abstract val fabricIndex: kotlin.UByte?

        public abstract val sourceNode: kotlin.ULong?

        public abstract val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>?
    }

    public final class LockOperationImpl public constructor(lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? = COMPILED_CODE, operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, sourceNode: kotlin.ULong? = COMPILED_CODE, credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.LockOperation {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.LockOperation> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.LockOperation): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.LockOperation { /* compiled code */ }
        }

        public open val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LockOperationError {
        public abstract val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?

        public abstract val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?

        public abstract val operationError: com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum?

        public abstract val userIndex: kotlin.UShort?

        public abstract val fabricIndex: kotlin.UByte?

        public abstract val sourceNode: kotlin.ULong?

        public abstract val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>?
    }

    public final class LockOperationErrorImpl public constructor(lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? = COMPILED_CODE, operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? = COMPILED_CODE, operationError: com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum? = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, sourceNode: kotlin.ULong? = COMPILED_CODE, credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.LockOperationError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.LockOperationError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.LockOperationError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.LockOperationError { /* compiled code */ }
        }

        public open val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val operationError: com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LockUserChange {
        public abstract val lockDataType: com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum?

        public abstract val dataOperationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum?

        public abstract val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?

        public abstract val userIndex: kotlin.UShort?

        public abstract val fabricIndex: kotlin.UByte?

        public abstract val sourceNode: kotlin.ULong?

        public abstract val dataIndex: kotlin.UShort?
    }

    public final class LockUserChangeImpl public constructor(lockDataType: com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum? = COMPILED_CODE, dataOperationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum? = COMPILED_CODE, operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, sourceNode: kotlin.ULong? = COMPILED_CODE, dataIndex: kotlin.UShort? = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.LockUserChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.LockUserChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.LockUserChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.LockUserChange { /* compiled code */ }
        }

        public open val lockDataType: com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum? /* compiled code */

        public open val dataOperationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val dataIndex: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class CredentialStruct public constructor(credentialType: com.google.home.matter.standard.DoorLockTrait.CredentialTypeEnum = COMPILED_CODE, credentialIndex: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLockTrait.CredentialStruct?>.credentialType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.CredentialTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLockTrait.CredentialStruct?>.credentialIndex: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.CredentialStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.CredentialStruct { /* compiled code */ }
        }

        public final val credentialType: com.google.home.matter.standard.DoorLockTrait.CredentialTypeEnum /* compiled code */

        public final val credentialIndex: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.CredentialStruct.StructFields> {
            @androidx.annotation.NonNull credentialType,

            @androidx.annotation.NonNull credentialIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.Attributes { /* compiled code */ }
        }

        public abstract val lockState: com.google.home.matter.standard.DoorLockTrait.DlLockState?

        public abstract val lockType: com.google.home.matter.standard.DoorLockTrait.DlLockType?

        public abstract val actuatorEnabled: kotlin.Boolean?

        public abstract val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?

        public abstract val doorOpenEvents: kotlin.UInt?

        public abstract val doorClosedEvents: kotlin.UInt?

        public abstract val openPeriod: kotlin.UShort?

        public abstract val numberOfTotalUsersSupported: kotlin.UShort?

        public abstract val numberOfPinUsersSupported: kotlin.UShort?

        public abstract val numberOfRfidUsersSupported: kotlin.UShort?

        public abstract val numberOfWeekDaySchedulesSupportedPerUser: kotlin.UByte?

        public abstract val numberOfYearDaySchedulesSupportedPerUser: kotlin.UByte?

        public abstract val numberOfHolidaySchedulesSupported: kotlin.UByte?

        public abstract val maxPinCodeLength: kotlin.UByte?

        public abstract val minPinCodeLength: kotlin.UByte?

        public abstract val maxRfidCodeLength: kotlin.UByte?

        public abstract val minRfidCodeLength: kotlin.UByte?

        public abstract val credentialRulesSupport: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask?

        public abstract val numberOfCredentialsSupportedPerUser: kotlin.UByte?

        public abstract val language: kotlin.String?

        public abstract val ledSettings: kotlin.UByte?

        public abstract val autoRelockTime: kotlin.UInt?

        public abstract val soundVolume: kotlin.UByte?

        public abstract val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum?

        public abstract val supportedOperatingModes: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes?

        public abstract val defaultConfigurationRegister: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister?

        public abstract val enableLocalProgramming: kotlin.Boolean?

        public abstract val enableOneTouchLocking: kotlin.Boolean?

        public abstract val enableInsideStatusLed: kotlin.Boolean?

        public abstract val enablePrivacyModeButton: kotlin.Boolean?

        public abstract val localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures?

        public abstract val wrongCodeEntryLimit: kotlin.UByte?

        public abstract val userCodeTemporaryDisableTime: kotlin.UByte?

        public abstract val sendPinOverTheAir: kotlin.Boolean?

        public abstract val requirePinforRemoteOperation: kotlin.Boolean?

        public abstract val expiringUserTimeout: kotlin.UShort?

        public abstract val aliroReaderVerificationKey: kotlin.ByteArray?

        public abstract val aliroReaderGroupIdentifier: kotlin.ByteArray?

        public abstract val aliroReaderGroupSubIdentifier: kotlin.ByteArray?

        public abstract val aliroExpeditedTransactionSupportedProtocolVersions: kotlin.collections.List<kotlin.ByteArray>?

        public abstract val aliroGroupResolvingKey: kotlin.ByteArray?

        public abstract val aliroSupportedBleUwbProtocolVersions: kotlin.collections.List<kotlin.ByteArray>?

        public abstract val aliroBleAdvertisingVersion: kotlin.UByte?

        public abstract val numberOfAliroCredentialIssuerKeysSupported: kotlin.UShort?

        public abstract val numberOfAliroEndpointKeysSupported: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.DoorLockTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(lockState: com.google.home.matter.standard.DoorLockTrait.DlLockState? = COMPILED_CODE, lockType: com.google.home.matter.standard.DoorLockTrait.DlLockType? = COMPILED_CODE, actuatorEnabled: kotlin.Boolean? = COMPILED_CODE, doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? = COMPILED_CODE, doorOpenEvents: kotlin.UInt? = COMPILED_CODE, doorClosedEvents: kotlin.UInt? = COMPILED_CODE, openPeriod: kotlin.UShort? = COMPILED_CODE, numberOfTotalUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfPinUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfRfidUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfWeekDaySchedulesSupportedPerUser: kotlin.UByte? = COMPILED_CODE, numberOfYearDaySchedulesSupportedPerUser: kotlin.UByte? = COMPILED_CODE, numberOfHolidaySchedulesSupported: kotlin.UByte? = COMPILED_CODE, maxPinCodeLength: kotlin.UByte? = COMPILED_CODE, minPinCodeLength: kotlin.UByte? = COMPILED_CODE, maxRfidCodeLength: kotlin.UByte? = COMPILED_CODE, minRfidCodeLength: kotlin.UByte? = COMPILED_CODE, credentialRulesSupport: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask? = COMPILED_CODE, numberOfCredentialsSupportedPerUser: kotlin.UByte? = COMPILED_CODE, language: kotlin.String? = COMPILED_CODE, ledSettings: kotlin.UByte? = COMPILED_CODE, autoRelockTime: kotlin.UInt? = COMPILED_CODE, soundVolume: kotlin.UByte? = COMPILED_CODE, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? = COMPILED_CODE, supportedOperatingModes: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes? = COMPILED_CODE, defaultConfigurationRegister: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister? = COMPILED_CODE, enableLocalProgramming: kotlin.Boolean? = COMPILED_CODE, enableOneTouchLocking: kotlin.Boolean? = COMPILED_CODE, enableInsideStatusLed: kotlin.Boolean? = COMPILED_CODE, enablePrivacyModeButton: kotlin.Boolean? = COMPILED_CODE, localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? = COMPILED_CODE, wrongCodeEntryLimit: kotlin.UByte? = COMPILED_CODE, userCodeTemporaryDisableTime: kotlin.UByte? = COMPILED_CODE, sendPinOverTheAir: kotlin.Boolean? = COMPILED_CODE, requirePinforRemoteOperation: kotlin.Boolean? = COMPILED_CODE, expiringUserTimeout: kotlin.UShort? = COMPILED_CODE, aliroReaderVerificationKey: kotlin.ByteArray? = COMPILED_CODE, aliroReaderGroupIdentifier: kotlin.ByteArray? = COMPILED_CODE, aliroReaderGroupSubIdentifier: kotlin.ByteArray? = COMPILED_CODE, aliroExpeditedTransactionSupportedProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, aliroGroupResolvingKey: kotlin.ByteArray? = COMPILED_CODE, aliroSupportedBleUwbProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, aliroBleAdvertisingVersion: kotlin.UByte? = COMPILED_CODE, numberOfAliroCredentialIssuerKeysSupported: kotlin.UShort? = COMPILED_CODE, numberOfAliroEndpointKeysSupported: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DoorLockTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.DoorLockTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.DoorLockTrait.Attributes, com.google.home.matter.standard.DoorLockTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.DoorLockTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.DoorLockTrait.Attributes) { /* compiled code */ }

        public open val lockState: com.google.home.matter.standard.DoorLockTrait.DlLockState? /* compiled code */

        public open val lockType: com.google.home.matter.standard.DoorLockTrait.DlLockType? /* compiled code */

        public open val actuatorEnabled: kotlin.Boolean? /* compiled code */

        public open val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? /* compiled code */

        public open val doorOpenEvents: kotlin.UInt? /* compiled code */

        public open val doorClosedEvents: kotlin.UInt? /* compiled code */

        public open val openPeriod: kotlin.UShort? /* compiled code */

        public open val numberOfTotalUsersSupported: kotlin.UShort? /* compiled code */

        public open val numberOfPinUsersSupported: kotlin.UShort? /* compiled code */

        public open val numberOfRfidUsersSupported: kotlin.UShort? /* compiled code */

        public open val numberOfWeekDaySchedulesSupportedPerUser: kotlin.UByte? /* compiled code */

        public open val numberOfYearDaySchedulesSupportedPerUser: kotlin.UByte? /* compiled code */

        public open val numberOfHolidaySchedulesSupported: kotlin.UByte? /* compiled code */

        public open val maxPinCodeLength: kotlin.UByte? /* compiled code */

        public open val minPinCodeLength: kotlin.UByte? /* compiled code */

        public open val maxRfidCodeLength: kotlin.UByte? /* compiled code */

        public open val minRfidCodeLength: kotlin.UByte? /* compiled code */

        public open val credentialRulesSupport: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask? /* compiled code */

        public open val numberOfCredentialsSupportedPerUser: kotlin.UByte? /* compiled code */

        public open val language: kotlin.String? /* compiled code */

        public open val ledSettings: kotlin.UByte? /* compiled code */

        public open val autoRelockTime: kotlin.UInt? /* compiled code */

        public open val soundVolume: kotlin.UByte? /* compiled code */

        public open val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? /* compiled code */

        public open val supportedOperatingModes: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes? /* compiled code */

        public open val defaultConfigurationRegister: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister? /* compiled code */

        public open val enableLocalProgramming: kotlin.Boolean? /* compiled code */

        public open val enableOneTouchLocking: kotlin.Boolean? /* compiled code */

        public open val enableInsideStatusLed: kotlin.Boolean? /* compiled code */

        public open val enablePrivacyModeButton: kotlin.Boolean? /* compiled code */

        public open val localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? /* compiled code */

        public open val wrongCodeEntryLimit: kotlin.UByte? /* compiled code */

        public open val userCodeTemporaryDisableTime: kotlin.UByte? /* compiled code */

        public open val sendPinOverTheAir: kotlin.Boolean? /* compiled code */

        public open val requirePinforRemoteOperation: kotlin.Boolean? /* compiled code */

        public open val expiringUserTimeout: kotlin.UShort? /* compiled code */

        public open val aliroReaderVerificationKey: kotlin.ByteArray? /* compiled code */

        public open val aliroReaderGroupIdentifier: kotlin.ByteArray? /* compiled code */

        public open val aliroReaderGroupSubIdentifier: kotlin.ByteArray? /* compiled code */

        public open val aliroExpeditedTransactionSupportedProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val aliroGroupResolvingKey: kotlin.ByteArray? /* compiled code */

        public open val aliroSupportedBleUwbProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val aliroBleAdvertisingVersion: kotlin.UByte? /* compiled code */

        public open val numberOfAliroCredentialIssuerKeysSupported: kotlin.UShort? /* compiled code */

        public open val numberOfAliroEndpointKeysSupported: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.DoorLockTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.DoorLockTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.DoorLockTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(lockState: com.google.home.matter.standard.DoorLockTrait.DlLockState? = COMPILED_CODE, lockType: com.google.home.matter.standard.DoorLockTrait.DlLockType? = COMPILED_CODE, actuatorEnabled: kotlin.Boolean? = COMPILED_CODE, doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? = COMPILED_CODE, doorOpenEvents: kotlin.UInt? = COMPILED_CODE, doorClosedEvents: kotlin.UInt? = COMPILED_CODE, openPeriod: kotlin.UShort? = COMPILED_CODE, numberOfTotalUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfPinUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfRfidUsersSupported: kotlin.UShort? = COMPILED_CODE, numberOfWeekDaySchedulesSupportedPerUser: kotlin.UByte? = COMPILED_CODE, numberOfYearDaySchedulesSupportedPerUser: kotlin.UByte? = COMPILED_CODE, numberOfHolidaySchedulesSupported: kotlin.UByte? = COMPILED_CODE, maxPinCodeLength: kotlin.UByte? = COMPILED_CODE, minPinCodeLength: kotlin.UByte? = COMPILED_CODE, maxRfidCodeLength: kotlin.UByte? = COMPILED_CODE, minRfidCodeLength: kotlin.UByte? = COMPILED_CODE, credentialRulesSupport: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask? = COMPILED_CODE, numberOfCredentialsSupportedPerUser: kotlin.UByte? = COMPILED_CODE, language: kotlin.String? = COMPILED_CODE, ledSettings: kotlin.UByte? = COMPILED_CODE, autoRelockTime: kotlin.UInt? = COMPILED_CODE, soundVolume: kotlin.UByte? = COMPILED_CODE, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? = COMPILED_CODE, supportedOperatingModes: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes? = COMPILED_CODE, defaultConfigurationRegister: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister? = COMPILED_CODE, enableLocalProgramming: kotlin.Boolean? = COMPILED_CODE, enableOneTouchLocking: kotlin.Boolean? = COMPILED_CODE, enableInsideStatusLed: kotlin.Boolean? = COMPILED_CODE, enablePrivacyModeButton: kotlin.Boolean? = COMPILED_CODE, localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? = COMPILED_CODE, wrongCodeEntryLimit: kotlin.UByte? = COMPILED_CODE, userCodeTemporaryDisableTime: kotlin.UByte? = COMPILED_CODE, sendPinOverTheAir: kotlin.Boolean? = COMPILED_CODE, requirePinforRemoteOperation: kotlin.Boolean? = COMPILED_CODE, expiringUserTimeout: kotlin.UShort? = COMPILED_CODE, aliroReaderVerificationKey: kotlin.ByteArray? = COMPILED_CODE, aliroReaderGroupIdentifier: kotlin.ByteArray? = COMPILED_CODE, aliroReaderGroupSubIdentifier: kotlin.ByteArray? = COMPILED_CODE, aliroExpeditedTransactionSupportedProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, aliroGroupResolvingKey: kotlin.ByteArray? = COMPILED_CODE, aliroSupportedBleUwbProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, aliroBleAdvertisingVersion: kotlin.UByte? = COMPILED_CODE, numberOfAliroCredentialIssuerKeysSupported: kotlin.UShort? = COMPILED_CODE, numberOfAliroEndpointKeysSupported: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DoorLockTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.DoorLockTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.DoorLockTrait.Attributes) : com.google.home.matter.standard.DoorLockTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _doorOpenEvents: kotlin.UInt? /* compiled code */

        public open val doorOpenEvents: kotlin.UInt? /* compiled code */
            public open get

        internal final var _doorClosedEvents: kotlin.UInt? /* compiled code */

        public open val doorClosedEvents: kotlin.UInt? /* compiled code */
            public open get

        internal final var _openPeriod: kotlin.UShort? /* compiled code */

        public open val openPeriod: kotlin.UShort? /* compiled code */
            public open get

        internal final var _language: kotlin.String? /* compiled code */

        public open val language: kotlin.String? /* compiled code */
            public open get

        internal final var _ledSettings: kotlin.UByte? /* compiled code */

        public open val ledSettings: kotlin.UByte? /* compiled code */
            public open get

        internal final var _autoRelockTime: kotlin.UInt? /* compiled code */

        public open val autoRelockTime: kotlin.UInt? /* compiled code */
            public open get

        internal final var _soundVolume: kotlin.UByte? /* compiled code */

        public open val soundVolume: kotlin.UByte? /* compiled code */
            public open get

        internal final var _operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? /* compiled code */

        public open val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? /* compiled code */
            public open get

        internal final var _enableLocalProgramming: kotlin.Boolean? /* compiled code */

        public open val enableLocalProgramming: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _enableOneTouchLocking: kotlin.Boolean? /* compiled code */

        public open val enableOneTouchLocking: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _enableInsideStatusLed: kotlin.Boolean? /* compiled code */

        public open val enableInsideStatusLed: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _enablePrivacyModeButton: kotlin.Boolean? /* compiled code */

        public open val enablePrivacyModeButton: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? /* compiled code */

        public open val localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? /* compiled code */
            public open get

        internal final var _wrongCodeEntryLimit: kotlin.UByte? /* compiled code */

        public open val wrongCodeEntryLimit: kotlin.UByte? /* compiled code */
            public open get

        internal final var _userCodeTemporaryDisableTime: kotlin.UByte? /* compiled code */

        public open val userCodeTemporaryDisableTime: kotlin.UByte? /* compiled code */
            public open get

        internal final var _sendPinOverTheAir: kotlin.Boolean? /* compiled code */

        public open val sendPinOverTheAir: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _requirePinforRemoteOperation: kotlin.Boolean? /* compiled code */

        public open val requirePinforRemoteOperation: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _expiringUserTimeout: kotlin.UShort? /* compiled code */

        public open val expiringUserTimeout: kotlin.UShort? /* compiled code */
            public open get

        public final fun setDoorOpenEvents(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setDoorClosedEvents(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setOpenPeriod(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setLanguage(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun setLedSettings(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setAutoRelockTime(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setSoundVolume(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setOperatingMode(value: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setEnableLocalProgramming(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setEnableOneTouchLocking(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setEnableInsideStatusLed(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setEnablePrivacyModeButton(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setLocalProgrammingFeatures(value: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures): kotlin.Unit { /* compiled code */ }

        public final fun setWrongCodeEntryLimit(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setUserCodeTemporaryDisableTime(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setSendPinOverTheAir(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setRequirePinforRemoteOperation(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setExpiringUserTimeout(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object LockDoorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.Request { /* compiled code */ }
            }

            public final val pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull pinCode;

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
        }

        public interface OptionalArgs {
            public abstract var pinCode: kotlin.ByteArray
        }
    }

    public object UnlockDoorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.Request { /* compiled code */ }
            }

            public final val pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull pinCode;

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
        }

        public interface OptionalArgs {
            public abstract var pinCode: kotlin.ByteArray
        }
    }

    public object UnlockWithTimeoutCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(timeout: kotlin.UShort = COMPILED_CODE, pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.Request { /* compiled code */ }
            }

            public final val timeout: kotlin.UShort /* compiled code */

            public final val pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.Request.CommandFields> {
                @androidx.annotation.NonNull timeout,

                @androidx.annotation.NonNull pinCode;

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
        }

        public interface OptionalArgs {
            public abstract var pinCode: kotlin.ByteArray
        }
    }

    public object SetWeekDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(weekDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap = COMPILED_CODE, startHour: kotlin.UByte = COMPILED_CODE, startMinute: kotlin.UByte = COMPILED_CODE, endHour: kotlin.UByte = COMPILED_CODE, endMinute: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetWeekDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetWeekDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetWeekDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val weekDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap /* compiled code */

            public final val startHour: kotlin.UByte /* compiled code */

            public final val startMinute: kotlin.UByte /* compiled code */

            public final val endHour: kotlin.UByte /* compiled code */

            public final val endMinute: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetWeekDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull weekDayIndex,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull daysMask,

                @androidx.annotation.NonNull startHour,

                @androidx.annotation.NonNull startMinute,

                @androidx.annotation.NonNull endHour,

                @androidx.annotation.NonNull endMinute;

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
        }
    }

    public object GetWeekDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(weekDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val weekDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull weekDayIndex,

                @androidx.annotation.NonNull userIndex;

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
        }

        public final class Response public constructor(weekDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE, status: com.google.home.matter.standard.DoorLockTrait.DlStatus = COMPILED_CODE, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap? = COMPILED_CODE, startHour: kotlin.UByte? = COMPILED_CODE, startMinute: kotlin.UByte? = COMPILED_CODE, endHour: kotlin.UByte? = COMPILED_CODE, endMinute: kotlin.UByte? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response { /* compiled code */ }
            }

            public final val weekDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val status: com.google.home.matter.standard.DoorLockTrait.DlStatus /* compiled code */

            public final val daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap? /* compiled code */

            public final val startHour: kotlin.UByte? /* compiled code */

            public final val startMinute: kotlin.UByte? /* compiled code */

            public final val endHour: kotlin.UByte? /* compiled code */

            public final val endMinute: kotlin.UByte? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response.CommandFields> {
                @androidx.annotation.NonNull weekDayIndex,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull daysMask,

                @androidx.annotation.NonNull startHour,

                @androidx.annotation.NonNull startMinute,

                @androidx.annotation.NonNull endHour,

                @androidx.annotation.NonNull endMinute;

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
        }
    }

    public object ClearWeekDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(weekDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearWeekDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearWeekDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearWeekDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val weekDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearWeekDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull weekDayIndex,

                @androidx.annotation.NonNull userIndex;

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
        }
    }

    public object SetYearDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(yearDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE, localStartTime: kotlin.UInt = COMPILED_CODE, localEndTime: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetYearDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetYearDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetYearDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val yearDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val localStartTime: kotlin.UInt /* compiled code */

            public final val localEndTime: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetYearDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull yearDayIndex,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull localStartTime,

                @androidx.annotation.NonNull localEndTime;

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
        }
    }

    public object GetYearDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(yearDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val yearDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull yearDayIndex,

                @androidx.annotation.NonNull userIndex;

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
        }

        public final class Response public constructor(yearDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE, status: com.google.home.matter.standard.DoorLockTrait.DlStatus = COMPILED_CODE, localStartTime: kotlin.UInt? = COMPILED_CODE, localEndTime: kotlin.UInt? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response { /* compiled code */ }
            }

            public final val yearDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val status: com.google.home.matter.standard.DoorLockTrait.DlStatus /* compiled code */

            public final val localStartTime: kotlin.UInt? /* compiled code */

            public final val localEndTime: kotlin.UInt? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response.CommandFields> {
                @androidx.annotation.NonNull yearDayIndex,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull localStartTime,

                @androidx.annotation.NonNull localEndTime;

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
        }
    }

    public object ClearYearDayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(yearDayIndex: kotlin.UByte = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearYearDayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearYearDayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearYearDayScheduleCommand.Request { /* compiled code */ }
            }

            public final val yearDayIndex: kotlin.UByte /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearYearDayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull yearDayIndex,

                @androidx.annotation.NonNull userIndex;

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
        }
    }

    public object SetHolidayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(holidayIndex: kotlin.UByte = COMPILED_CODE, localStartTime: kotlin.UInt = COMPILED_CODE, localEndTime: kotlin.UInt = COMPILED_CODE, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetHolidayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetHolidayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetHolidayScheduleCommand.Request { /* compiled code */ }
            }

            public final val holidayIndex: kotlin.UByte /* compiled code */

            public final val localStartTime: kotlin.UInt /* compiled code */

            public final val localEndTime: kotlin.UInt /* compiled code */

            public final val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetHolidayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull holidayIndex,

                @androidx.annotation.NonNull localStartTime,

                @androidx.annotation.NonNull localEndTime,

                @androidx.annotation.NonNull operatingMode;

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
        }
    }

    public object GetHolidayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(holidayIndex: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Request { /* compiled code */ }
            }

            public final val holidayIndex: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull holidayIndex;

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
        }

        public final class Response public constructor(holidayIndex: kotlin.UByte = COMPILED_CODE, status: com.google.home.matter.standard.DoorLockTrait.DlStatus = COMPILED_CODE, localStartTime: kotlin.UInt? = COMPILED_CODE, localEndTime: kotlin.UInt? = COMPILED_CODE, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response { /* compiled code */ }
            }

            public final val holidayIndex: kotlin.UByte /* compiled code */

            public final val status: com.google.home.matter.standard.DoorLockTrait.DlStatus /* compiled code */

            public final val localStartTime: kotlin.UInt? /* compiled code */

            public final val localEndTime: kotlin.UInt? /* compiled code */

            public final val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response.CommandFields> {
                @androidx.annotation.NonNull holidayIndex,

                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull localStartTime,

                @androidx.annotation.NonNull localEndTime,

                @androidx.annotation.NonNull operatingMode;

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
        }
    }

    public object ClearHolidayScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(holidayIndex: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearHolidayScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearHolidayScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearHolidayScheduleCommand.Request { /* compiled code */ }
            }

            public final val holidayIndex: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearHolidayScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull holidayIndex;

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
        }
    }

    public object SetUserCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum = COMPILED_CODE, userIndex: kotlin.UShort = COMPILED_CODE, userName: kotlin.String? = COMPILED_CODE, userUniqueId: kotlin.UInt? = COMPILED_CODE, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? = COMPILED_CODE, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? = COMPILED_CODE, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetUserCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetUserCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetUserCommand.Request { /* compiled code */ }
            }

            public final val operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum /* compiled code */

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val userName: kotlin.String? /* compiled code */

            public final val userUniqueId: kotlin.UInt? /* compiled code */

            public final val userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? /* compiled code */

            public final val userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? /* compiled code */

            public final val credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetUserCommand.Request.CommandFields> {
                @androidx.annotation.NonNull operationType,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull userName,

                @androidx.annotation.NonNull userUniqueId,

                @androidx.annotation.NonNull userStatus,

                @androidx.annotation.NonNull userType,

                @androidx.annotation.NonNull credentialRule;

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
        }
    }

    public object GetUserCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Request { /* compiled code */ }
            }

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Request.CommandFields> {
                @androidx.annotation.NonNull userIndex;

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
        }

        public final class Response public constructor(userIndex: kotlin.UShort = COMPILED_CODE, userName: kotlin.String? = COMPILED_CODE, userUniqueId: kotlin.UInt? = COMPILED_CODE, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? = COMPILED_CODE, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? = COMPILED_CODE, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum? = COMPILED_CODE, credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? = COMPILED_CODE, creatorFabricIndex: kotlin.UByte? = COMPILED_CODE, lastModifiedFabricIndex: kotlin.UByte? = COMPILED_CODE, nextUserIndex: kotlin.UShort? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response { /* compiled code */ }
            }

            public final val userIndex: kotlin.UShort /* compiled code */

            public final val userName: kotlin.String? /* compiled code */

            public final val userUniqueId: kotlin.UInt? /* compiled code */

            public final val userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? /* compiled code */

            public final val userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? /* compiled code */

            public final val credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum? /* compiled code */

            public final val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? /* compiled code */

            public final val creatorFabricIndex: kotlin.UByte? /* compiled code */

            public final val lastModifiedFabricIndex: kotlin.UByte? /* compiled code */

            public final val nextUserIndex: kotlin.UShort? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response.CommandFields> {
                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull userName,

                @androidx.annotation.NonNull userUniqueId,

                @androidx.annotation.NonNull userStatus,

                @androidx.annotation.NonNull userType,

                @androidx.annotation.NonNull credentialRule,

                @androidx.annotation.NonNull credentials,

                @androidx.annotation.NonNull creatorFabricIndex,

                @androidx.annotation.NonNull lastModifiedFabricIndex,

                @androidx.annotation.NonNull nextUserIndex;

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
        }
    }

    public object ClearUserCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(userIndex: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearUserCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearUserCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearUserCommand.Request { /* compiled code */ }
            }

            public final val userIndex: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearUserCommand.Request.CommandFields> {
                @androidx.annotation.NonNull userIndex;

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
        }
    }

    public object SetCredentialCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum = COMPILED_CODE, credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct = COMPILED_CODE, credentialData: kotlin.ByteArray = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? = COMPILED_CODE, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Request { /* compiled code */ }
            }

            public final val operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum /* compiled code */

            public final val credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct /* compiled code */

            public final val credentialData: kotlin.ByteArray /* compiled code */

            public final val userIndex: kotlin.UShort? /* compiled code */

            public final val userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum? /* compiled code */

            public final val userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Request.CommandFields> {
                @androidx.annotation.NonNull operationType,

                @androidx.annotation.NonNull credential,

                @androidx.annotation.NonNull credentialData,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull userStatus,

                @androidx.annotation.NonNull userType;

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
        }

        public final class Response public constructor(status: com.google.home.matter.standard.DoorLockTrait.DlStatus = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, nextCredentialIndex: kotlin.UShort? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.DoorLockTrait.DlStatus /* compiled code */

            public final val userIndex: kotlin.UShort? /* compiled code */

            public final val nextCredentialIndex: kotlin.UShort? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull nextCredentialIndex;

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
        }
    }

    public object GetCredentialStatusCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Request { /* compiled code */ }
            }

            public final val credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Request.CommandFields> {
                @androidx.annotation.NonNull credential;

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
        }

        public final class Response public constructor(credentialExists: kotlin.Boolean = COMPILED_CODE, userIndex: kotlin.UShort? = COMPILED_CODE, creatorFabricIndex: kotlin.UByte? = COMPILED_CODE, lastModifiedFabricIndex: kotlin.UByte? = COMPILED_CODE, nextCredentialIndex: kotlin.UShort? = COMPILED_CODE, credentialData: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response { /* compiled code */ }
            }

            public final val credentialExists: kotlin.Boolean /* compiled code */

            public final val userIndex: kotlin.UShort? /* compiled code */

            public final val creatorFabricIndex: kotlin.UByte? /* compiled code */

            public final val lastModifiedFabricIndex: kotlin.UByte? /* compiled code */

            public final val nextCredentialIndex: kotlin.UShort? /* compiled code */

            public final val credentialData: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response.CommandFields> {
                @androidx.annotation.NonNull credentialExists,

                @androidx.annotation.NonNull userIndex,

                @androidx.annotation.NonNull creatorFabricIndex,

                @androidx.annotation.NonNull lastModifiedFabricIndex,

                @androidx.annotation.NonNull nextCredentialIndex,

                @androidx.annotation.NonNull credentialData;

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
        }
    }

    public object ClearCredentialCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearCredentialCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearCredentialCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearCredentialCommand.Request { /* compiled code */ }
            }

            public final val credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearCredentialCommand.Request.CommandFields> {
                @androidx.annotation.NonNull credential;

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
        }
    }

    public object UnboltDoorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.Request { /* compiled code */ }
            }

            public final val pinCode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull pinCode;

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
        }

        public interface OptionalArgs {
            public abstract var pinCode: kotlin.ByteArray
        }
    }

    public object SetAliroReaderConfigCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(signingKey: kotlin.ByteArray = COMPILED_CODE, verificationKey: kotlin.ByteArray = COMPILED_CODE, groupIdentifier: kotlin.ByteArray = COMPILED_CODE, groupResolvingKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.Request { /* compiled code */ }
            }

            public final val signingKey: kotlin.ByteArray /* compiled code */

            public final val verificationKey: kotlin.ByteArray /* compiled code */

            public final val groupIdentifier: kotlin.ByteArray /* compiled code */

            public final val groupResolvingKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.Request.CommandFields> {
                @androidx.annotation.NonNull signingKey,

                @androidx.annotation.NonNull verificationKey,

                @androidx.annotation.NonNull groupIdentifier,

                @androidx.annotation.NonNull groupResolvingKey;

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
        }

        public interface OptionalArgs {
            public abstract var groupResolvingKey: kotlin.ByteArray
        }
    }

    public object ClearAliroReaderConfigCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DoorLockTrait.ClearAliroReaderConfigCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DoorLockTrait.ClearAliroReaderConfigCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DoorLockTrait.ClearAliroReaderConfigCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLockTrait.ClearAliroReaderConfigCommand.Request.CommandFields> {
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
        }
    }
}


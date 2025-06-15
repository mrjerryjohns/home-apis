// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object NotificationTraitKt {
    @kotlin.jvm.JvmName public final inline fun sendNotificationsCommand(block: com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.NotificationTrait.SendNotificationsCommand { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun sendNotificationsCommandResponse(block: com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.NotificationTrait.SendNotificationsCommandResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun user(block: com.google.home.platform.traits.NotificationTraitKt.UserKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.NotificationTrait.User { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.NotificationTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.NotificationTrait.Builder): com.google.home.platform.traits.NotificationTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.NotificationTrait.Builder /* compiled code */

        public final val structureMembers: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.NotificationTrait { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.add(value: com.google.home.platform.traits.NotificationTrait.User): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.plusAssign(value: com.google.home.platform.traits.NotificationTrait.User): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.NotificationTrait.User>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.NotificationTrait.User>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.NotificationTrait.User): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.NotificationTrait.User, com.google.home.platform.traits.NotificationTraitKt.Dsl.StructureMembersProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class StructureMembersProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object SendNotificationsCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommand.Builder): com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommand.Builder /* compiled code */

            public final var title: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var body: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final val optInMemberEmails: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy> /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.NotificationTrait.SendNotificationsCommand { /* compiled code */ }

            public final fun clearTitle(): kotlin.Unit { /* compiled code */ }

            public final fun clearBody(): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandKt.Dsl.OptInMemberEmailsProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final class OptInMemberEmailsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object SendNotificationsCommandResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommandResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommandResponse.Builder): com.google.home.platform.traits.NotificationTraitKt.SendNotificationsCommandResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.NotificationTrait.SendNotificationsCommandResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.NotificationTrait.SendNotificationsCommandResponse { /* compiled code */ }
        }
    }

    public object UserKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.NotificationTrait.User.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.NotificationTrait.User.Builder): com.google.home.platform.traits.NotificationTraitKt.UserKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.NotificationTrait.User.Builder /* compiled code */

            public final var name: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var email: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.NotificationTrait.User { /* compiled code */ }

            public final fun clearName(): kotlin.Unit { /* compiled code */ }

            public final fun clearEmail(): kotlin.Unit { /* compiled code */ }
        }
    }
}


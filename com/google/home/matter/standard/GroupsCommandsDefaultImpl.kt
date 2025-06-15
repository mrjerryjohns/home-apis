// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GroupsCommandsDefaultImpl : com.google.home.matter.standard.GroupsCommands {
    public open suspend fun addGroup(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response { /* compiled code */ }

    public open suspend fun viewGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response { /* compiled code */ }

    public open suspend fun getGroupMembership(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response { /* compiled code */ }

    public open suspend fun removeGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response { /* compiled code */ }

    public open suspend fun removeAllGroups(): kotlin.Unit { /* compiled code */ }

    public open suspend fun addGroupIfIdentifying(groupId: kotlin.UShort, groupName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun addGroupBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response> { /* compiled code */ }

    public open fun viewGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response> { /* compiled code */ }

    public open fun getGroupMembershipBatchable(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response> { /* compiled code */ }

    public open fun removeGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response> { /* compiled code */ }

    public open fun removeAllGroupsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addGroupIfIdentifyingBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


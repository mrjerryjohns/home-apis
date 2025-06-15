// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GroupsCommands {
    public abstract suspend fun addGroup(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response

    public abstract suspend fun viewGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response

    public abstract suspend fun getGroupMembership(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response

    public abstract suspend fun removeGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response

    public abstract suspend fun removeAllGroups(): kotlin.Unit

    public abstract suspend fun addGroupIfIdentifying(groupId: kotlin.UShort, groupName: kotlin.String): kotlin.Unit

    public abstract fun addGroupBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response>

    public abstract fun viewGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response>

    public abstract fun getGroupMembershipBatchable(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response>

    public abstract fun removeGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response>

    public abstract fun removeAllGroupsBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun addGroupIfIdentifyingBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}


package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING

public fun interface FnCallback {
    public operator fun invoke(returncode: HRESULT, context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(returncode: HRESULT, context: Long, selectedxuids: Long, selectedxuidscount: ULong)
}

public fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-1.dll", "CheckGamingPrivilegeSilently", longArrayOf(privilegeid.toLong(), scope, policy, hasprivilege)).toInt()
}

public fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "CheckGamingPrivilegeSilentlyForUser", longArrayOf(user, privilegeid.toLong(), scope, policy, hasprivilege)).toInt()
}

public fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-1.dll", "CheckGamingPrivilegeWithUI", longArrayOf(privilegeid.toLong(), scope, policy, friendlymessage, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "CheckGamingPrivilegeWithUIForUser", longArrayOf(user, privilegeid.toLong(), scope, policy, friendlymessage, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-expandedresources-l1-1-0.dll", "GetExpandedResourceExclusiveCpuCount", longArrayOf(exclusivecpucount)).toInt()
}

public fun GetGamingDeviceModelInformation(information: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-deviceinformation-l1-1-0.dll", "GetGamingDeviceModelInformation", longArrayOf(information)).toInt()
}

public fun HasExpandedResources(hasexpandedresources: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-expandedresources-l1-1-0.dll", "HasExpandedResources", longArrayOf(hasexpandedresources)).toInt()
}

public fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ProcessPendingGameUI", longArrayOf(waitforcompletion.toLong())).toInt()
}

public fun ReleaseExclusiveCpuSets(): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-expandedresources-l1-1-0.dll", "ReleaseExclusiveCpuSets", longArrayOf()).toInt()
}

public fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ShowChangeFriendRelationshipUI", longArrayOf(targetuserxuid, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "ShowChangeFriendRelationshipUIForUser", longArrayOf(user, targetuserxuid, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowCustomizeUserProfileUI", longArrayOf(Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowCustomizeUserProfileUIForUser", longArrayOf(user, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowFindFriendsUI", longArrayOf(Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowFindFriendsUIForUser", longArrayOf(user, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowGameInfoUI", longArrayOf(titleid.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowGameInfoUIForUser", longArrayOf(user, titleid.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ShowGameInviteUI", longArrayOf(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "ShowGameInviteUIForUser", longArrayOf(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-3.dll", "ShowGameInviteUIWithContext", longArrayOf(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-3.dll", "ShowGameInviteUIWithContextForUser", longArrayOf(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ShowPlayerPickerUI", longArrayOf(promptdisplaytext, xuids, xuidscount.toLong(), preselectedxuids, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "ShowPlayerPickerUIForUser", longArrayOf(user, promptdisplaytext, xuids, xuidscount.toLong(), preselectedxuids, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ShowProfileCardUI", longArrayOf(targetuserxuid, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "ShowProfileCardUIForUser", longArrayOf(user, targetuserxuid, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "ShowTitleAchievementsUI", longArrayOf(titleid.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-2.dll", "ShowTitleAchievementsUIForUser", longArrayOf(user, titleid.toLong(), Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowUserSettingsUI", longArrayOf(Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-4.dll", "ShowUserSettingsUIForUser", longArrayOf(user, Win32DynamicFfi.objectSlot(completionroutine), context)).toInt()
}

public fun TryCancelPendingGameUI(): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-gaming-tcui-l1-1-0.dll", "TryCancelPendingGameUI", longArrayOf()).toInt()
}

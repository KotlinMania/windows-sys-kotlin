@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING

private object WindowsWin32GamingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_gaming_CheckGamingPrivilegeSilently(privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUI(privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_GetGamingDeviceModelInformation(information: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_HasExpandedResources(hasexpandedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ProcessPendingGameUI(waitforcompletion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ReleaseExclusiveCpuSets(): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowCustomizeUserProfileUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowFindFriendsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowFindFriendsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInfoUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInfoUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInviteUI(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInviteUIForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInviteUIWithContext(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowPlayerPickerUI(promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowProfileCardUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowProfileCardUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowTitleAchievementsUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowTitleAchievementsUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowUserSettingsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_ShowUserSettingsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_TryCancelPendingGameUI(): Int
}

public actual fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilently(privilegeid.toInt(), scope, policy, hasprivilege)

public actual fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilentlyForUser(user, privilegeid.toInt(), scope, policy, hasprivilege)

public actual fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUI(privilegeid.toInt(), scope, policy, friendlymessage, completionroutine.toLong(), context)

public actual fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUIForUser(user, privilegeid.toInt(), scope, policy, friendlymessage, completionroutine.toLong(), context)

public actual fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_GetExpandedResourceExclusiveCpuCount(exclusivecpucount)

public actual fun GetGamingDeviceModelInformation(information: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_GetGamingDeviceModelInformation(information)

public actual fun HasExpandedResources(hasexpandedresources: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_HasExpandedResources(hasexpandedresources)

public actual fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ProcessPendingGameUI(waitforcompletion)

public actual fun ReleaseExclusiveCpuSets(): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ReleaseExclusiveCpuSets()

public actual fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUI(targetuserxuid, completionroutine.toLong(), context)

public actual fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUIForUser(user, targetuserxuid, completionroutine.toLong(), context)

public actual fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUI(completionroutine.toLong(), context)

public actual fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUIForUser(user, completionroutine.toLong(), context)

public actual fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowFindFriendsUI(completionroutine.toLong(), context)

public actual fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowFindFriendsUIForUser(user, completionroutine.toLong(), context)

public actual fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInfoUI(titleid.toInt(), completionroutine.toLong(), context)

public actual fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInfoUIForUser(user, titleid.toInt(), completionroutine.toLong(), context)

public actual fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInviteUI(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, completionroutine.toLong(), context)

public actual fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInviteUIForUser(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, completionroutine.toLong(), context)

public actual fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInviteUIWithContext(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, completionroutine.toLong(), context)

public actual fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowGameInviteUIWithContextForUser(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, completionroutine.toLong(), context)

public actual fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowPlayerPickerUI(promptdisplaytext, xuids, xuidscount.toLong(), preselectedxuids, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), completionroutine.toLong(), context)

public actual fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowPlayerPickerUIForUser(user, promptdisplaytext, xuids, xuidscount.toLong(), preselectedxuids, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), completionroutine.toLong(), context)

public actual fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowProfileCardUI(targetuserxuid, completionroutine.toLong(), context)

public actual fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowProfileCardUIForUser(user, targetuserxuid, completionroutine.toLong(), context)

public actual fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowTitleAchievementsUI(titleid.toInt(), completionroutine.toLong(), context)

public actual fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowTitleAchievementsUIForUser(user, titleid.toInt(), completionroutine.toLong(), context)

public actual fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowUserSettingsUI(completionroutine.toLong(), context)

public actual fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_ShowUserSettingsUIForUser(user, completionroutine.toLong(), context)

public actual fun TryCancelPendingGameUI(): BOOL =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_TryCancelPendingGameUI()

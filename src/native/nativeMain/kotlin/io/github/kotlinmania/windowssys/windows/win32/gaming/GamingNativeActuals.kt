@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilently(privilegeid, scope.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>(), hasprivilege.toCPointer<ByteVar>())

public actual fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilentlyForUser(user.toCPointer<ByteVar>(), privilegeid, scope.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>(), hasprivilege.toCPointer<ByteVar>())

public actual fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUI(privilegeid, scope.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>(), friendlymessage.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUIForUser(user.toCPointer<ByteVar>(), privilegeid, scope.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>(), friendlymessage.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_GetExpandedResourceExclusiveCpuCount(exclusivecpucount.toCPointer<ByteVar>())

public actual fun GetGamingDeviceModelInformation(information: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_GetGamingDeviceModelInformation(information.toCPointer<ByteVar>())

public actual fun HasExpandedResources(hasexpandedresources: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_HasExpandedResources(hasexpandedresources.toCPointer<ByteVar>())

public actual fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ProcessPendingGameUI(waitforcompletion)

public actual fun ReleaseExclusiveCpuSets(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ReleaseExclusiveCpuSets()

public actual fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUI(targetuserxuid.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUIForUser(user.toCPointer<ByteVar>(), targetuserxuid.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUI(completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUIForUser(user.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowFindFriendsUI(completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowFindFriendsUIForUser(user.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInfoUI(titleid, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInfoUIForUser(user.toCPointer<ByteVar>(), titleid, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInviteUI(serviceconfigurationid.toCPointer<ByteVar>(), sessiontemplatename.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>(), invitationdisplaytext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInviteUIForUser(user.toCPointer<ByteVar>(), serviceconfigurationid.toCPointer<ByteVar>(), sessiontemplatename.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>(), invitationdisplaytext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInviteUIWithContext(serviceconfigurationid.toCPointer<ByteVar>(), sessiontemplatename.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>(), invitationdisplaytext.toCPointer<ByteVar>(), customactivationcontext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowGameInviteUIWithContextForUser(user.toCPointer<ByteVar>(), serviceconfigurationid.toCPointer<ByteVar>(), sessiontemplatename.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>(), invitationdisplaytext.toCPointer<ByteVar>(), customactivationcontext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowPlayerPickerUI(promptdisplaytext.toCPointer<ByteVar>(), xuids.toCPointer<ByteVar>(), xuidscount, preselectedxuids.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowPlayerPickerUIForUser(user.toCPointer<ByteVar>(), promptdisplaytext.toCPointer<ByteVar>(), xuids.toCPointer<ByteVar>(), xuidscount, preselectedxuids.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowProfileCardUI(targetuserxuid.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowProfileCardUIForUser(user.toCPointer<ByteVar>(), targetuserxuid.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowTitleAchievementsUI(titleid, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowTitleAchievementsUIForUser(user.toCPointer<ByteVar>(), titleid, completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowUserSettingsUI(completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_ShowUserSettingsUIForUser(user.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun TryCancelPendingGameUI(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_TryCancelPendingGameUI()

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING

private val _windowsWin32GamingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilently(privilegeid.toInt(), scope.toString(), policy.toString(), hasprivilege.toString()) as Int) else 0

public actual fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_CheckGamingPrivilegeSilentlyForUser(user.toString(), privilegeid.toInt(), scope.toString(), policy.toString(), hasprivilege.toString()) as Int) else 0

public actual fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUI(privilegeid.toInt(), scope.toString(), policy.toString(), friendlymessage.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUIForUser(user.toString(), privilegeid.toInt(), scope.toString(), policy.toString(), friendlymessage.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_GetExpandedResourceExclusiveCpuCount(exclusivecpucount.toString()) as Int) else 0

public actual fun GetGamingDeviceModelInformation(information: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_GetGamingDeviceModelInformation(information.toString()) as Int) else 0

public actual fun HasExpandedResources(hasexpandedresources: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_HasExpandedResources(hasexpandedresources.toString()) as Int) else 0

public actual fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ProcessPendingGameUI(waitforcompletion) as Int) else 0

public actual fun ReleaseExclusiveCpuSets(): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ReleaseExclusiveCpuSets() as Int) else 0

public actual fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUI(targetuserxuid.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUIForUser(user.toString(), targetuserxuid.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUI(completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowCustomizeUserProfileUIForUser(user.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowFindFriendsUI(completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowFindFriendsUIForUser(user.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInfoUI(titleid.toInt(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInfoUIForUser(user.toString(), titleid.toInt(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInviteUI(serviceconfigurationid.toString(), sessiontemplatename.toString(), sessionid.toString(), invitationdisplaytext.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInviteUIForUser(user.toString(), serviceconfigurationid.toString(), sessiontemplatename.toString(), sessionid.toString(), invitationdisplaytext.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInviteUIWithContext(serviceconfigurationid.toString(), sessiontemplatename.toString(), sessionid.toString(), invitationdisplaytext.toString(), customactivationcontext.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowGameInviteUIWithContextForUser(user.toString(), serviceconfigurationid.toString(), sessiontemplatename.toString(), sessionid.toString(), invitationdisplaytext.toString(), customactivationcontext.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowPlayerPickerUI(promptdisplaytext.toString(), xuids.toString(), xuidscount.toString(), preselectedxuids.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowPlayerPickerUIForUser(user.toString(), promptdisplaytext.toString(), xuids.toString(), xuidscount.toString(), preselectedxuids.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowProfileCardUI(targetuserxuid.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowProfileCardUIForUser(user.toString(), targetuserxuid.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowTitleAchievementsUI(titleid.toInt(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowTitleAchievementsUIForUser(user.toString(), titleid.toInt(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowUserSettingsUI(completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_ShowUserSettingsUIForUser(user.toString(), completionroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun TryCancelPendingGameUI(): BOOL =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_TryCancelPendingGameUI() as Int) else 0

@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_checkGamingPrivilegeSilently
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_getGamingDeviceModelInformation
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_hasExpandedResources
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_processPendingGameUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_releaseExclusiveCpuSets
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showChangeFriendRelationshipUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showCustomizeUserProfileUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showFindFriendsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showFindFriendsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInfoUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInfoUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInviteUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInviteUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInviteUIWithContext
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showPlayerPickerUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showPlayerPickerUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showProfileCardUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showProfileCardUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showTitleAchievementsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showTitleAchievementsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showUserSettingsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_showUserSettingsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssys_windows_win32_gaming_tryCancelPendingGameUI
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(privilegeid, scope?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), hasprivilege?.value?.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(user?.value?.toCPointer<ByteVar>(), privilegeid, scope?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), hasprivilege?.value?.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(privilegeid, scope?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), friendlymessage?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(user?.value?.toCPointer<ByteVar>(), privilegeid, scope?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), friendlymessage?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(exclusivecpucount?.value?.toCPointer<ByteVar>())

public actual fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_getGamingDeviceModelInformation(information?.value?.toCPointer<ByteVar>())

public actual fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_hasExpandedResources(hasexpandedresources?.value?.toCPointer<ByteVar>())

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    windowssys_windows_win32_gaming_processPendingGameUI(waitforcompletion)

public actual fun releaseExclusiveCpuSets(): Hresult =
    windowssys_windows_win32_gaming_releaseExclusiveCpuSets()

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(targetuserxuid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(user?.value?.toCPointer<ByteVar>(), targetuserxuid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showCustomizeUserProfileUI(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(user?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showFindFriendsUI(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showFindFriendsUIForUser(user?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInfoUI(titleid, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInfoUIForUser(user?.value?.toCPointer<ByteVar>(), titleid, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInviteUI(serviceconfigurationid?.value?.toCPointer<ByteVar>(), sessiontemplatename?.value?.toCPointer<ByteVar>(), sessionid?.value?.toCPointer<ByteVar>(), invitationdisplaytext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInviteUIForUser(user?.value?.toCPointer<ByteVar>(), serviceconfigurationid?.value?.toCPointer<ByteVar>(), sessiontemplatename?.value?.toCPointer<ByteVar>(), sessionid?.value?.toCPointer<ByteVar>(), invitationdisplaytext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInviteUIWithContext(serviceconfigurationid?.value?.toCPointer<ByteVar>(), sessiontemplatename?.value?.toCPointer<ByteVar>(), sessionid?.value?.toCPointer<ByteVar>(), invitationdisplaytext?.value?.toCPointer<ByteVar>(), customactivationcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(user?.value?.toCPointer<ByteVar>(), serviceconfigurationid?.value?.toCPointer<ByteVar>(), sessiontemplatename?.value?.toCPointer<ByteVar>(), sessionid?.value?.toCPointer<ByteVar>(), invitationdisplaytext?.value?.toCPointer<ByteVar>(), customactivationcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showPlayerPickerUI(promptdisplaytext?.value?.toCPointer<ByteVar>(), xuids?.value?.toCPointer<ByteVar>(), xuidscount, preselectedxuids?.value?.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showPlayerPickerUIForUser(user?.value?.toCPointer<ByteVar>(), promptdisplaytext?.value?.toCPointer<ByteVar>(), xuids?.value?.toCPointer<ByteVar>(), xuidscount, preselectedxuids?.value?.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showProfileCardUI(targetuserxuid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showProfileCardUIForUser(user?.value?.toCPointer<ByteVar>(), targetuserxuid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showTitleAchievementsUI(titleid, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(user?.value?.toCPointer<ByteVar>(), titleid, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showUserSettingsUI(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_gaming_showUserSettingsUIForUser(user?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun tryCancelPendingGameUI(): Bool =
    windowssys_windows_win32_gaming_tryCancelPendingGameUI()

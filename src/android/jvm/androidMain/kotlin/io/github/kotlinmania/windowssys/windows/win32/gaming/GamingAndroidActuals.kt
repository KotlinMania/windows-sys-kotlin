@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

private object WindowsWin32GamingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_getGamingDeviceModelInformation(information: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_hasExpandedResources(hasexpandedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_processPendingGameUI(waitforcompletion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_releaseExclusiveCpuSets(): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showCustomizeUserProfileUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showFindFriendsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showFindFriendsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInfoUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInfoUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInviteUI(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInviteUIForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInviteUIWithContext(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showPlayerPickerUI(promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showPlayerPickerUIForUser(user: Long, promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showProfileCardUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showProfileCardUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showTitleAchievementsUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showUserSettingsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_showUserSettingsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_gaming_tryCancelPendingGameUI(): Int
}

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(privilegeid.toInt(), (scope?.value ?: 0L), (policy?.value ?: 0L), (hasprivilege?.value ?: 0L))

public actual fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser((user?.value ?: 0L), privilegeid.toInt(), (scope?.value ?: 0L), (policy?.value ?: 0L), (hasprivilege?.value ?: 0L))

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(privilegeid.toInt(), (scope?.value ?: 0L), (policy?.value ?: 0L), (friendlymessage?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser((user?.value ?: 0L), privilegeid.toInt(), (scope?.value ?: 0L), (policy?.value ?: 0L), (friendlymessage?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount((exclusivecpucount?.value ?: 0L))

public actual fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_getGamingDeviceModelInformation((information?.value ?: 0L))

public actual fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_hasExpandedResources((hasexpandedresources?.value ?: 0L))

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_processPendingGameUI(waitforcompletion)

public actual fun releaseExclusiveCpuSets(): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_releaseExclusiveCpuSets()

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showChangeFriendRelationshipUI((targetuserxuid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser((user?.value ?: 0L), (targetuserxuid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showCustomizeUserProfileUI(0L, (context?.value ?: 0L))

public actual fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser((user?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showFindFriendsUI(0L, (context?.value ?: 0L))

public actual fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showFindFriendsUIForUser((user?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInfoUI(titleid.toInt(), 0L, (context?.value ?: 0L))

public actual fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInfoUIForUser((user?.value ?: 0L), titleid.toInt(), 0L, (context?.value ?: 0L))

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInviteUI((serviceconfigurationid?.value ?: 0L), (sessiontemplatename?.value ?: 0L), (sessionid?.value ?: 0L), (invitationdisplaytext?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInviteUIForUser((user?.value ?: 0L), (serviceconfigurationid?.value ?: 0L), (sessiontemplatename?.value ?: 0L), (sessionid?.value ?: 0L), (invitationdisplaytext?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInviteUIWithContext((serviceconfigurationid?.value ?: 0L), (sessiontemplatename?.value ?: 0L), (sessionid?.value ?: 0L), (invitationdisplaytext?.value ?: 0L), (customactivationcontext?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser((user?.value ?: 0L), (serviceconfigurationid?.value ?: 0L), (sessiontemplatename?.value ?: 0L), (sessionid?.value ?: 0L), (invitationdisplaytext?.value ?: 0L), (customactivationcontext?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showPlayerPickerUI((promptdisplaytext?.value ?: 0L), (xuids?.value ?: 0L), xuidscount.toLong(), (preselectedxuids?.value ?: 0L), preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), 0L, (context?.value ?: 0L))

public actual fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showPlayerPickerUIForUser((user?.value ?: 0L), (promptdisplaytext?.value ?: 0L), (xuids?.value ?: 0L), xuidscount.toLong(), (preselectedxuids?.value ?: 0L), preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), 0L, (context?.value ?: 0L))

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showProfileCardUI((targetuserxuid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showProfileCardUIForUser((user?.value ?: 0L), (targetuserxuid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showTitleAchievementsUI(titleid.toInt(), 0L, (context?.value ?: 0L))

public actual fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showTitleAchievementsUIForUser((user?.value ?: 0L), titleid.toInt(), 0L, (context?.value ?: 0L))

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showUserSettingsUI(0L, (context?.value ?: 0L))

public actual fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_showUserSettingsUIForUser((user?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun tryCancelPendingGameUI(): Bool =
    WindowsWin32GamingJniBridge.windowssys_windows_win32_gaming_tryCancelPendingGameUI()

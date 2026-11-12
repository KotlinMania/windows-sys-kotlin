@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

private object WindowsWin32GamingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, hasprivilege: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: Int, scope: Long, policy: Long, friendlymessage: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingGetGamingDeviceModelInformation(information: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingHasExpandedResources(hasexpandedresources: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingReleaseExclusiveCpuSets(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowCustomizeUserProfileUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowFindFriendsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowFindFriendsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInfoUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInfoUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInviteUI(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInviteUIForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInviteUIWithContext(serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: Long, sessiontemplatename: Long, sessionid: Long, invitationdisplaytext: Long, customactivationcontext: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowPlayerPickerUI(promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowPlayerPickerUIForUser(user: Long, promptdisplaytext: Long, xuids: Long, xuidscount: Long, preselectedxuids: Long, preselectedxuidscount: Long, minselectioncount: Long, maxselectioncount: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowProfileCardUI(targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowProfileCardUIForUser(user: Long, targetuserxuid: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowTitleAchievementsUI(titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(user: Long, titleid: Int, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowUserSettingsUI(completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingShowUserSettingsUIForUser(user: Long, completionroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GamingTryCancelPendingGameUI(): Int
}

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(privilegeid.toInt(), scope.rawAddress, policy.rawAddress, hasprivilege.rawAddress)

public actual fun checkGamingPrivilegeSilentlyForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(user.rawAddress, privilegeid.toInt(), scope.rawAddress, policy.rawAddress, hasprivilege.rawAddress)

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(privilegeid.toInt(), scope.rawAddress, policy.rawAddress, friendlymessage.rawAddress, 0L, context.rawAddress)

public actual fun checkGamingPrivilegeWithUIForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(user.rawAddress, privilegeid.toInt(), scope.rawAddress, policy.rawAddress, friendlymessage.rawAddress, 0L, context.rawAddress)

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(exclusivecpucount.rawAddress)

public actual fun getGamingDeviceModelInformation(information: MutPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingGetGamingDeviceModelInformation(information.rawAddress)

public actual fun hasExpandedResources(hasexpandedresources: MutPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingHasExpandedResources(hasexpandedresources.rawAddress)

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion)

public actual fun releaseExclusiveCpuSets(): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingReleaseExclusiveCpuSets()

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(targetuserxuid.rawAddress, 0L, context.rawAddress)

public actual fun showChangeFriendRelationshipUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(user.rawAddress, targetuserxuid.rawAddress, 0L, context.rawAddress)

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowCustomizeUserProfileUI(0L, context.rawAddress)

public actual fun showCustomizeUserProfileUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(user.rawAddress, 0L, context.rawAddress)

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowFindFriendsUI(0L, context.rawAddress)

public actual fun showFindFriendsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowFindFriendsUIForUser(user.rawAddress, 0L, context.rawAddress)

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInfoUI(titleid.toInt(), 0L, context.rawAddress)

public actual fun showGameInfoUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInfoUIForUser(user.rawAddress, titleid.toInt(), 0L, context.rawAddress)

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInviteUI(serviceconfigurationid.rawAddress, sessiontemplatename.rawAddress, sessionid.rawAddress, invitationdisplaytext.rawAddress, 0L, context.rawAddress)

public actual fun showGameInviteUIForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInviteUIForUser(user.rawAddress, serviceconfigurationid.rawAddress, sessiontemplatename.rawAddress, sessionid.rawAddress, invitationdisplaytext.rawAddress, 0L, context.rawAddress)

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInviteUIWithContext(serviceconfigurationid.rawAddress, sessiontemplatename.rawAddress, sessionid.rawAddress, invitationdisplaytext.rawAddress, customactivationcontext.rawAddress, 0L, context.rawAddress)

public actual fun showGameInviteUIWithContextForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(user.rawAddress, serviceconfigurationid.rawAddress, sessiontemplatename.rawAddress, sessionid.rawAddress, invitationdisplaytext.rawAddress, customactivationcontext.rawAddress, 0L, context.rawAddress)

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowPlayerPickerUI(promptdisplaytext.rawAddress, xuids.rawAddress, xuidscount.toLong(), preselectedxuids.rawAddress, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), 0L, context.rawAddress)

public actual fun showPlayerPickerUIForUser(user: MutPtr, promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowPlayerPickerUIForUser(user.rawAddress, promptdisplaytext.rawAddress, xuids.rawAddress, xuidscount.toLong(), preselectedxuids.rawAddress, preselectedxuidscount.toLong(), minselectioncount.toLong(), maxselectioncount.toLong(), 0L, context.rawAddress)

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowProfileCardUI(targetuserxuid.rawAddress, 0L, context.rawAddress)

public actual fun showProfileCardUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowProfileCardUIForUser(user.rawAddress, targetuserxuid.rawAddress, 0L, context.rawAddress)

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowTitleAchievementsUI(titleid.toInt(), 0L, context.rawAddress)

public actual fun showTitleAchievementsUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(user.rawAddress, titleid.toInt(), 0L, context.rawAddress)

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowUserSettingsUI(0L, context.rawAddress)

public actual fun showUserSettingsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingShowUserSettingsUIForUser(user.rawAddress, 0L, context.rawAddress)

public actual fun tryCancelPendingGameUI(): Bool =
    WindowsWin32GamingJniBridge.windowssysWindowsWin32GamingTryCancelPendingGameUI()

@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingCheckGamingPrivilegeSilently
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingGetGamingDeviceModelInformation
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingHasExpandedResources
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingProcessPendingGameUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingReleaseExclusiveCpuSets
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowChangeFriendRelationshipUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowCustomizeUserProfileUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowFindFriendsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowFindFriendsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInfoUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInfoUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInviteUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInviteUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInviteUIWithContext
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowPlayerPickerUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowPlayerPickerUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowProfileCardUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowProfileCardUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowTitleAchievementsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowTitleAchievementsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowUserSettingsUI
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingShowUserSettingsUIForUser
import io.github.kotlinmania.windowssys.windows.win32.gaming.cinterop.windowssysWindowsWin32GamingTryCancelPendingGameUI
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult =
    windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(privilegeid, scope.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), hasprivilege.rawAddress.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeSilentlyForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult =
    windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(user.rawAddress.toCPointer<ByteVar>(), privilegeid, scope.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), hasprivilege.rawAddress.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(privilegeid, scope.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), friendlymessage.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun checkGamingPrivilegeWithUIForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(user.rawAddress.toCPointer<ByteVar>(), privilegeid, scope.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), friendlymessage.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr): Hresult =
    windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(exclusivecpucount.rawAddress.toCPointer<ByteVar>())

public actual fun getGamingDeviceModelInformation(information: MutPtr): Hresult =
    windowssysWindowsWin32GamingGetGamingDeviceModelInformation(information.rawAddress.toCPointer<ByteVar>())

public actual fun hasExpandedResources(hasexpandedresources: MutPtr): Hresult =
    windowssysWindowsWin32GamingHasExpandedResources(hasexpandedresources.rawAddress.toCPointer<ByteVar>())

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    windowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion)

public actual fun releaseExclusiveCpuSets(): Hresult =
    windowssysWindowsWin32GamingReleaseExclusiveCpuSets()

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(targetuserxuid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showChangeFriendRelationshipUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(user.rawAddress.toCPointer<ByteVar>(), targetuserxuid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowCustomizeUserProfileUI(0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showCustomizeUserProfileUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(user.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowFindFriendsUI(0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showFindFriendsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowFindFriendsUIForUser(user.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInfoUI(titleid, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInfoUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInfoUIForUser(user.rawAddress.toCPointer<ByteVar>(), titleid, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInviteUI(serviceconfigurationid.rawAddress.toCPointer<ByteVar>(), sessiontemplatename.rawAddress.toCPointer<ByteVar>(), sessionid.rawAddress.toCPointer<ByteVar>(), invitationdisplaytext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInviteUIForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInviteUIForUser(user.rawAddress.toCPointer<ByteVar>(), serviceconfigurationid.rawAddress.toCPointer<ByteVar>(), sessiontemplatename.rawAddress.toCPointer<ByteVar>(), sessionid.rawAddress.toCPointer<ByteVar>(), invitationdisplaytext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInviteUIWithContext(serviceconfigurationid.rawAddress.toCPointer<ByteVar>(), sessiontemplatename.rawAddress.toCPointer<ByteVar>(), sessionid.rawAddress.toCPointer<ByteVar>(), invitationdisplaytext.rawAddress.toCPointer<ByteVar>(), customactivationcontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showGameInviteUIWithContextForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(user.rawAddress.toCPointer<ByteVar>(), serviceconfigurationid.rawAddress.toCPointer<ByteVar>(), sessiontemplatename.rawAddress.toCPointer<ByteVar>(), sessionid.rawAddress.toCPointer<ByteVar>(), invitationdisplaytext.rawAddress.toCPointer<ByteVar>(), customactivationcontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowPlayerPickerUI(promptdisplaytext.rawAddress.toCPointer<ByteVar>(), xuids.rawAddress.toCPointer<ByteVar>(), xuidscount, preselectedxuids.rawAddress.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showPlayerPickerUIForUser(user: MutPtr, promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowPlayerPickerUIForUser(user.rawAddress.toCPointer<ByteVar>(), promptdisplaytext.rawAddress.toCPointer<ByteVar>(), xuids.rawAddress.toCPointer<ByteVar>(), xuidscount, preselectedxuids.rawAddress.toCPointer<ByteVar>(), preselectedxuidscount, minselectioncount, maxselectioncount, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowProfileCardUI(targetuserxuid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showProfileCardUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowProfileCardUIForUser(user.rawAddress.toCPointer<ByteVar>(), targetuserxuid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowTitleAchievementsUI(titleid, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showTitleAchievementsUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(user.rawAddress.toCPointer<ByteVar>(), titleid, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowUserSettingsUI(0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun showUserSettingsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult =
    windowssysWindowsWin32GamingShowUserSettingsUIForUser(user.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun tryCancelPendingGameUI(): Bool =
    windowssysWindowsWin32GamingTryCancelPendingGameUI()

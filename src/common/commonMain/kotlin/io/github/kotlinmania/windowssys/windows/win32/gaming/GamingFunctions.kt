package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

public expect fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult

public expect fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult

public expect fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult

public expect fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult

public expect fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult

public expect fun processPendingGameUI(waitforcompletion: Bool): Hresult

public expect fun releaseExclusiveCpuSets(): Hresult

public expect fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult

public expect fun tryCancelPendingGameUI(): Bool

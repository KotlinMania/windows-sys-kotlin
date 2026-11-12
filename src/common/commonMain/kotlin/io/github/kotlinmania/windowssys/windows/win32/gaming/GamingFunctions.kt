package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

public expect fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult

public expect fun checkGamingPrivilegeSilentlyForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr): Hresult

public expect fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun checkGamingPrivilegeWithUIForUser(user: MutPtr, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr): Hresult

public expect fun getGamingDeviceModelInformation(information: MutPtr): Hresult

public expect fun hasExpandedResources(hasexpandedresources: MutPtr): Hresult

public expect fun processPendingGameUI(waitforcompletion: Bool): Hresult

public expect fun releaseExclusiveCpuSets(): Hresult

public expect fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showChangeFriendRelationshipUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showCustomizeUserProfileUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showFindFriendsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInfoUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInviteUIForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showGameInviteUIWithContextForUser(user: MutPtr, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showPlayerPickerUIForUser(user: MutPtr, promptdisplaytext: Hstring, xuids: ConstPtr, xuidscount: ULong, preselectedxuids: ConstPtr, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showProfileCardUIForUser(user: MutPtr, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showTitleAchievementsUIForUser(user: MutPtr, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun showUserSettingsUIForUser(user: MutPtr, completionroutine: GameUICompletionRoutine, context: ConstPtr): Hresult

public expect fun tryCancelPendingGameUI(): Bool

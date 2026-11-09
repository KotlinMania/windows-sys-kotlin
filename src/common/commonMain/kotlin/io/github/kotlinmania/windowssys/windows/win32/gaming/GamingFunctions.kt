package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING

public expect fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT

public expect fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT

public expect fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT

public expect fun GetGamingDeviceModelInformation(information: Long): HRESULT

public expect fun HasExpandedResources(hasexpandedresources: Long): HRESULT

public expect fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT

public expect fun ReleaseExclusiveCpuSets(): HRESULT

public expect fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT

public expect fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT

public expect fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT

public expect fun TryCancelPendingGameUI(): BOOL

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.HSTRING

public actual fun CheckGamingPrivilegeSilently(privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    0

public actual fun CheckGamingPrivilegeSilentlyForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, hasprivilege: Long): HRESULT =
    0

public actual fun CheckGamingPrivilegeWithUI(privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun CheckGamingPrivilegeWithUIForUser(user: Long, privilegeid: UInt, scope: HSTRING, policy: HSTRING, friendlymessage: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun GetExpandedResourceExclusiveCpuCount(exclusivecpucount: Long): HRESULT =
    0

public actual fun GetGamingDeviceModelInformation(information: Long): HRESULT =
    0

public actual fun HasExpandedResources(hasexpandedresources: Long): HRESULT =
    0

public actual fun ProcessPendingGameUI(waitforcompletion: BOOL): HRESULT =
    0

public actual fun ReleaseExclusiveCpuSets(): HRESULT =
    0

public actual fun ShowChangeFriendRelationshipUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowChangeFriendRelationshipUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowCustomizeUserProfileUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowFindFriendsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowFindFriendsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInfoUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInviteUI(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInviteUIForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInviteUIWithContext(serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowGameInviteUIWithContextForUser(user: Long, serviceconfigurationid: HSTRING, sessiontemplatename: HSTRING, sessionid: HSTRING, invitationdisplaytext: HSTRING, customactivationcontext: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowPlayerPickerUI(promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowPlayerPickerUIForUser(user: Long, promptdisplaytext: HSTRING, xuids: Long, xuidscount: ULong, preselectedxuids: Long, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowProfileCardUI(targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowProfileCardUIForUser(user: Long, targetuserxuid: HSTRING, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowTitleAchievementsUIForUser(user: Long, titleid: UInt, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowUserSettingsUI(completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun ShowUserSettingsUIForUser(user: Long, completionroutine: GameUICompletionRoutine, context: Long): HRESULT =
    0

public actual fun TryCancelPendingGameUI(): BOOL =
    0

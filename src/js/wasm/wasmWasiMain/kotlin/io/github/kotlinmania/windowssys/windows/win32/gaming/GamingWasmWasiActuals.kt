@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseExclusiveCpuSets(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tryCancelPendingGameUI(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

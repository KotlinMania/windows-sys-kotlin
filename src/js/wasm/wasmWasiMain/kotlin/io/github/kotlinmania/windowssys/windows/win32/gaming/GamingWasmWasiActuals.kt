@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingCheckGamingPrivilegeSilently")

public actual fun checkGamingPrivilegeSilentlyForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI")

public actual fun checkGamingPrivilegeWithUIForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount")

public actual fun getGamingDeviceModelInformation(information: MutPtr<GamingDeviceModelInformation>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingGetGamingDeviceModelInformation")

public actual fun hasExpandedResources(hasexpandedresources: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingHasExpandedResources")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GamingProcessPendingGameUI")
private external fun wasiWindowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion: Int): Int

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    wasiWindowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GamingReleaseExclusiveCpuSets")
private external fun wasiWindowssysWindowsWin32GamingReleaseExclusiveCpuSets(): Int

public actual fun releaseExclusiveCpuSets(): Hresult =
    wasiWindowssysWindowsWin32GamingReleaseExclusiveCpuSets().toInt()

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowChangeFriendRelationshipUI")

public actual fun showChangeFriendRelationshipUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowCustomizeUserProfileUI")

public actual fun showCustomizeUserProfileUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowFindFriendsUI")

public actual fun showFindFriendsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowFindFriendsUIForUser")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInfoUI")

public actual fun showGameInfoUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInfoUIForUser")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInviteUI")

public actual fun showGameInviteUIForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInviteUIForUser")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInviteUIWithContext")

public actual fun showGameInviteUIWithContextForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowPlayerPickerUI")

public actual fun showPlayerPickerUIForUser(user: MutPtr<CVoid>, promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowPlayerPickerUIForUser")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowProfileCardUI")

public actual fun showProfileCardUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowProfileCardUIForUser")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowTitleAchievementsUI")

public actual fun showTitleAchievementsUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowTitleAchievementsUIForUser")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowUserSettingsUI")

public actual fun showUserSettingsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GamingShowUserSettingsUIForUser")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GamingTryCancelPendingGameUI")
private external fun wasiWindowssysWindowsWin32GamingTryCancelPendingGameUI(): Int

public actual fun tryCancelPendingGameUI(): Bool =
    wasiWindowssysWindowsWin32GamingTryCancelPendingGameUI().toInt()

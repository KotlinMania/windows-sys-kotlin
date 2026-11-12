@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

private val windowsWin32GamingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), hasprivilege.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeSilentlyForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(user.rawAddress.toString(), privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), hasprivilege.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), friendlymessage.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUIForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(user.rawAddress.toString(), privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), friendlymessage.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr<UInt>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(exclusivecpucount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGamingDeviceModelInformation(information: MutPtr<GamingDeviceModelInformation>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingGetGamingDeviceModelInformation(information.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasExpandedResources(hasexpandedresources: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingHasExpandedResources(hasexpandedresources.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseExclusiveCpuSets(): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingReleaseExclusiveCpuSets() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(user.rawAddress.toString(), targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowCustomizeUserProfileUI(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowFindFriendsUI(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowFindFriendsUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInfoUI(titleid.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInfoUIForUser(user.rawAddress.toString(), titleid.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInviteUI(serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInviteUIForUser(user.rawAddress.toString(), serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInviteUIWithContext(serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), customactivationcontext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContextForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(user.rawAddress.toString(), serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), customactivationcontext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowPlayerPickerUI(promptdisplaytext.rawAddress.toString(), xuids.rawAddress.toString(), xuidscount.toString(), preselectedxuids.rawAddress.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUIForUser(user: MutPtr<CVoid>, promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowPlayerPickerUIForUser(user.rawAddress.toString(), promptdisplaytext.rawAddress.toString(), xuids.rawAddress.toString(), xuidscount.toString(), preselectedxuids.rawAddress.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowProfileCardUI(targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowProfileCardUIForUser(user.rawAddress.toString(), targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowTitleAchievementsUI(titleid.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(user.rawAddress.toString(), titleid.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowUserSettingsUI(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingShowUserSettingsUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCancelPendingGameUI(): Bool =
    if (windowsWin32GamingNapiAddon != null) (windowsWin32GamingNapiAddon.windowssysWindowsWin32GamingTryCancelPendingGameUI() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

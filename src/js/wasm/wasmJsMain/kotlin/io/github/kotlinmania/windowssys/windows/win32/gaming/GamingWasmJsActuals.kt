@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GamingNapiAddon(): Boolean

private val windowsWin32GamingNapiAvailable: Boolean = initWindowsWin32GamingNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeSilently(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(p0)")
private external fun wasmWindowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingGetGamingDeviceModelInformation(p0)")
private external fun wasmWindowssysWindowsWin32GamingGetGamingDeviceModelInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingHasExpandedResources(p0)")
private external fun wasmWindowssysWindowsWin32GamingHasExpandedResources(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingProcessPendingGameUI(p0)")
private external fun wasmWindowssysWindowsWin32GamingProcessPendingGameUI(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingReleaseExclusiveCpuSets()")
private external fun wasmWindowssysWindowsWin32GamingReleaseExclusiveCpuSets(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowChangeFriendRelationshipUI(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowCustomizeUserProfileUI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GamingShowCustomizeUserProfileUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowFindFriendsUI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GamingShowFindFriendsUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowFindFriendsUIForUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowFindFriendsUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInfoUI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInfoUI(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInfoUIForUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInfoUIForUser(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInviteUI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInviteUI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInviteUIForUser(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInviteUIForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInviteUIWithContext(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInviteUIWithContext(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowPlayerPickerUI(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GamingShowPlayerPickerUI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowPlayerPickerUIForUser(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GamingShowPlayerPickerUIForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowProfileCardUI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowProfileCardUI(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowProfileCardUIForUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GamingShowProfileCardUIForUser(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowTitleAchievementsUI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowTitleAchievementsUI(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GamingShowTitleAchievementsUIForUser(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowUserSettingsUI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GamingShowUserSettingsUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingShowUserSettingsUIForUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GamingShowUserSettingsUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GamingTryCancelPendingGameUI()")
private external fun wasmWindowssysWindowsWin32GamingTryCancelPendingGameUI(): Int

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeSilently(privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), hasprivilege.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeSilentlyForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(user.rawAddress.toString(), privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), hasprivilege.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), friendlymessage.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUIForUser(user: MutPtr<CVoid>, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(user.rawAddress.toString(), privilegeid.toInt(), scope.rawAddress.toString(), policy.rawAddress.toString(), friendlymessage.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: MutPtr<UInt>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(exclusivecpucount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGamingDeviceModelInformation(information: MutPtr<GamingDeviceModelInformation>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingGetGamingDeviceModelInformation(information.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasExpandedResources(hasexpandedresources: MutPtr<Bool>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingHasExpandedResources(hasexpandedresources.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingProcessPendingGameUI(waitforcompletion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseExclusiveCpuSets(): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingReleaseExclusiveCpuSets() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowChangeFriendRelationshipUI(targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(user.rawAddress.toString(), targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowCustomizeUserProfileUI(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowFindFriendsUI(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowFindFriendsUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInfoUI(titleid.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInfoUIForUser(user.rawAddress.toString(), titleid.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInviteUI(serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInviteUIForUser(user.rawAddress.toString(), serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInviteUIWithContext(serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), customactivationcontext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContextForUser(user: MutPtr<CVoid>, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(user.rawAddress.toString(), serviceconfigurationid.rawAddress.toString(), sessiontemplatename.rawAddress.toString(), sessionid.rawAddress.toString(), invitationdisplaytext.rawAddress.toString(), customactivationcontext.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowPlayerPickerUI(promptdisplaytext.rawAddress.toString(), xuids.rawAddress.toString(), xuidscount.toString(), preselectedxuids.rawAddress.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUIForUser(user: MutPtr<CVoid>, promptdisplaytext: Hstring, xuids: ConstPtr<Hstring>, xuidscount: ULong, preselectedxuids: ConstPtr<Hstring>, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowPlayerPickerUIForUser(user.rawAddress.toString(), promptdisplaytext.rawAddress.toString(), xuids.rawAddress.toString(), xuidscount.toString(), preselectedxuids.rawAddress.toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowProfileCardUI(targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUIForUser(user: MutPtr<CVoid>, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowProfileCardUIForUser(user.rawAddress.toString(), targetuserxuid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowTitleAchievementsUI(titleid.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUIForUser(user: MutPtr<CVoid>, titleid: UInt, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowTitleAchievementsUIForUser(user.rawAddress.toString(), titleid.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowUserSettingsUI(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUIForUser(user: MutPtr<CVoid>, completionroutine: GameUICompletionRoutine, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingShowUserSettingsUIForUser(user.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCancelPendingGameUI(): Bool =
    if (windowsWin32GamingNapiAvailable) wasmWindowssysWindowsWin32GamingTryCancelPendingGameUI() else throw UnsupportedOperationException("Native FFI addon is not available")

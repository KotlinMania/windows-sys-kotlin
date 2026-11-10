@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32GamingNapiAddon(): Boolean

private val _windowsWin32GamingNapiAvailable: Boolean = _initWindowsWin32GamingNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(p0)")
private external fun _wasm_windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_getGamingDeviceModelInformation(p0)")
private external fun _wasm_windowssys_windows_win32_gaming_getGamingDeviceModelInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_hasExpandedResources(p0)")
private external fun _wasm_windowssys_windows_win32_gaming_hasExpandedResources(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_processPendingGameUI(p0)")
private external fun _wasm_windowssys_windows_win32_gaming_processPendingGameUI(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_releaseExclusiveCpuSets()")
private external fun _wasm_windowssys_windows_win32_gaming_releaseExclusiveCpuSets(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showCustomizeUserProfileUI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_gaming_showCustomizeUserProfileUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showFindFriendsUI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_gaming_showFindFriendsUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showFindFriendsUIForUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showFindFriendsUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInfoUI(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInfoUI(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInfoUIForUser(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInfoUIForUser(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInviteUI(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInviteUI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInviteUIForUser(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInviteUIForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInviteUIWithContext(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInviteUIWithContext(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showPlayerPickerUI(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_gaming_showPlayerPickerUI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showPlayerPickerUIForUser(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_gaming_showPlayerPickerUIForUser(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showProfileCardUI(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showProfileCardUI(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showProfileCardUIForUser(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_gaming_showProfileCardUIForUser(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showTitleAchievementsUI(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showTitleAchievementsUI(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showUserSettingsUI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_gaming_showUserSettingsUI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_showUserSettingsUIForUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_gaming_showUserSettingsUIForUser(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_gaming_tryCancelPendingGameUI()")
private external fun _wasm_windowssys_windows_win32_gaming_tryCancelPendingGameUI(): Int

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (hasprivilege?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser((user?.value ?: 0L).toString(), privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (hasprivilege?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (friendlymessage?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser((user?.value ?: 0L).toString(), privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (friendlymessage?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount((exclusivecpucount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_getGamingDeviceModelInformation((information?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_hasExpandedResources((hasexpandedresources?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_processPendingGameUI(waitforcompletion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseExclusiveCpuSets(): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_releaseExclusiveCpuSets() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showChangeFriendRelationshipUI((targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser((user?.value ?: 0L).toString(), (targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showCustomizeUserProfileUI(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showFindFriendsUI(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showFindFriendsUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInfoUI(titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInfoUIForUser((user?.value ?: 0L).toString(), titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInviteUI((serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInviteUIForUser((user?.value ?: 0L).toString(), (serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInviteUIWithContext((serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), (customactivationcontext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser((user?.value ?: 0L).toString(), (serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), (customactivationcontext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showPlayerPickerUI((promptdisplaytext?.value ?: 0L).toString(), (xuids?.value ?: 0L).toString(), xuidscount.toString(), (preselectedxuids?.value ?: 0L).toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showPlayerPickerUIForUser((user?.value ?: 0L).toString(), (promptdisplaytext?.value ?: 0L).toString(), (xuids?.value ?: 0L).toString(), xuidscount.toString(), (preselectedxuids?.value ?: 0L).toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showProfileCardUI((targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showProfileCardUIForUser((user?.value ?: 0L).toString(), (targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showTitleAchievementsUI(titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showTitleAchievementsUIForUser((user?.value ?: 0L).toString(), titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showUserSettingsUI(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_showUserSettingsUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCancelPendingGameUI(): Bool =
    if (_windowsWin32GamingNapiAvailable) _wasm_windowssys_windows_win32_gaming_tryCancelPendingGameUI() else throw UnsupportedOperationException("Native FFI addon is not available")

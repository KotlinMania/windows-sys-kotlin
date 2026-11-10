@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Hstring

private val _windowsWin32GamingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun checkGamingPrivilegeSilently(privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (hasprivilege?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeSilentlyForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, hasprivilege: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser((user?.value ?: 0L).toString(), privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (hasprivilege?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUI(privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (friendlymessage?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkGamingPrivilegeWithUIForUser(user: COpaquePointer?, privilegeid: UInt, scope: Hstring, policy: Hstring, friendlymessage: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser((user?.value ?: 0L).toString(), privilegeid.toInt(), (scope?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (friendlymessage?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedResourceExclusiveCpuCount(exclusivecpucount: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount((exclusivecpucount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGamingDeviceModelInformation(information: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_getGamingDeviceModelInformation((information?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasExpandedResources(hasexpandedresources: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_hasExpandedResources((hasexpandedresources?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPendingGameUI(waitforcompletion: Bool): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_processPendingGameUI(waitforcompletion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseExclusiveCpuSets(): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_releaseExclusiveCpuSets() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showChangeFriendRelationshipUI((targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showChangeFriendRelationshipUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser((user?.value ?: 0L).toString(), (targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showCustomizeUserProfileUI(0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCustomizeUserProfileUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showFindFriendsUI(0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showFindFriendsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showFindFriendsUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInfoUI(titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInfoUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInfoUIForUser((user?.value ?: 0L).toString(), titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUI(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInviteUI((serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInviteUIForUser((user?.value ?: 0L).toString(), (serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContext(serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInviteUIWithContext((serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), (customactivationcontext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showGameInviteUIWithContextForUser(user: COpaquePointer?, serviceconfigurationid: Hstring, sessiontemplatename: Hstring, sessionid: Hstring, invitationdisplaytext: Hstring, customactivationcontext: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser((user?.value ?: 0L).toString(), (serviceconfigurationid?.value ?: 0L).toString(), (sessiontemplatename?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (invitationdisplaytext?.value ?: 0L).toString(), (customactivationcontext?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUI(promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showPlayerPickerUI((promptdisplaytext?.value ?: 0L).toString(), (xuids?.value ?: 0L).toString(), xuidscount.toString(), (preselectedxuids?.value ?: 0L).toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showPlayerPickerUIForUser(user: COpaquePointer?, promptdisplaytext: Hstring, xuids: COpaquePointer?, xuidscount: ULong, preselectedxuids: COpaquePointer?, preselectedxuidscount: ULong, minselectioncount: ULong, maxselectioncount: ULong, completionroutine: PlayerPickerUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showPlayerPickerUIForUser((user?.value ?: 0L).toString(), (promptdisplaytext?.value ?: 0L).toString(), (xuids?.value ?: 0L).toString(), xuidscount.toString(), (preselectedxuids?.value ?: 0L).toString(), preselectedxuidscount.toString(), minselectioncount.toString(), maxselectioncount.toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUI(targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showProfileCardUI((targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showProfileCardUIForUser(user: COpaquePointer?, targetuserxuid: Hstring, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showProfileCardUIForUser((user?.value ?: 0L).toString(), (targetuserxuid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUI(titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showTitleAchievementsUI(titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showTitleAchievementsUIForUser(user: COpaquePointer?, titleid: UInt, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showTitleAchievementsUIForUser((user?.value ?: 0L).toString(), titleid.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUI(completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showUserSettingsUI(0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showUserSettingsUIForUser(user: COpaquePointer?, completionroutine: GameUICompletionRoutine, context: COpaquePointer?): Hresult =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_showUserSettingsUIForUser((user?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCancelPendingGameUI(): Bool =
    if (_windowsWin32GamingNapiAddon != null) (_windowsWin32GamingNapiAddon.windowssys_windows_win32_gaming_tryCancelPendingGameUI() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

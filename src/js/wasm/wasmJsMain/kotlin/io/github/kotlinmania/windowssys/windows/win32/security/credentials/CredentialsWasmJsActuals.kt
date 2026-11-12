@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCredentialsNapiAddon(): Boolean

private val windowsWin32SecurityCredentialsNapiAvailable: Boolean = initWindowsWin32SecurityCredentialsNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredDeleteA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredDeleteA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredDeleteW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredDeleteW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredEnumerateA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredEnumerateA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredEnumerateW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredEnumerateW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredFree(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredIsProtectedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredIsProtectedW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredProtectA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredProtectA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredProtectW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredProtectW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredReadA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredReadA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredReadW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredReadW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredRenameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredRenameA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredRenameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredRenameW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnprotectA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnprotectA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredUnprotectW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredUnprotectW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredWriteA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredWriteA(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsCredWriteW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsCredWriteW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent()")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardAudit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardAudit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardCancel(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardConnectA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardConnectA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardConnectW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardConnectW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardControl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardControl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardDisconnect(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError()")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardEndTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardEstablishContext(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardFreeMemory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetAttrib(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardIsValidContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListCardsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListCardsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListCardsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListCardsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReadersA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReadersW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardReadCacheA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardReadCacheW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardReconnect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardReconnect(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardReleaseContext(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardSetAttrib(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardState(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardStatusA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardStatusA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardStatusW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardStatusW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardTransmit(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardTransmit(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredDeleteA(targetname.rawAddress.toString(), type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredDeleteW(targetname.rawAddress.toString(), type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredEnumerateA(filter.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredEnumerateW(filter.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFree(buffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityCredentialsNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCredentialsCredFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(maximumpersistcount.toInt(), maximumpersist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationa>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(targetname.rawAddress.toString(), flags.toInt(), targetinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(targetname.rawAddress.toString(), flags.toInt(), targetinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(marshaledcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(marshaledcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr<CredProtectionType>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredIsProtectedA(pszprotectedcredentials.rawAddress.toString(), pprotectiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr<CredProtectionType>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredIsProtectedW(pszprotectedcredentials.rawAddress.toString(), pprotectiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pstr>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(credtype, credential.rawAddress.toString(), marshaledcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pwstr>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(credtype, credential.rawAddress.toString(), marshaledcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(dwflags.toInt(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), ppackedcredentials.rawAddress.toString(), pcbpackedcredentials.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(dwflags.toInt(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), ppackedcredentials.rawAddress.toString(), pcbpackedcredentials.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredProtectA(fasself, pszcredentials.rawAddress.toString(), cchcredentials.toInt(), pszprotectedcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString(), protectiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredProtectW(fasself, pszcredentials.rawAddress.toString(), cchcredentials.toInt(), pszprotectedcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString(), protectiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredReadA(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(targetinfo.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(targetinfo.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredReadW(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredRenameA(oldtargetname.rawAddress.toString(), newtargetname.rawAddress.toString(), type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredRenameW(oldtargetname.rawAddress.toString(), newtargetname.rawAddress.toString(), type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), username.rawAddress.toString(), uluserbuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), username.rawAddress.toString(), uluserbuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(psztargetname.rawAddress.toString(), bconfirm).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(psztargetname.rawAddress.toString(), bconfirm).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(username.rawAddress.toString(), user.rawAddress.toString(), userbuffersize.toInt(), domain.rawAddress.toString(), domainbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(username.rawAddress.toString(), user.rawAddress.toString(), userbuffersize.toInt(), domain.rawAddress.toString(), domainbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(puiinfo.rawAddress.toString(), psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), pszusername.rawAddress.toString(), ulusernamebuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), save.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsW(puiinfo: ConstPtr<CreduiInfow>, psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(puiinfo.rawAddress.toString(), psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), pszusername.rawAddress.toString(), ulusernamebuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), save.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(puiinfo.rawAddress.toString(), dwautherror.toInt(), pulauthpackage.rawAddress.toString(), pvinauthbuffer.rawAddress.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress.toString(), puloutauthbuffersize.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr<CreduiInfow>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(puiinfo.rawAddress.toString(), dwautherror.toInt(), pulauthpackage.rawAddress.toString(), pvinauthbuffer.rawAddress.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress.toString(), puloutauthbuffersize.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr<Pwstr>): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(pszrealm.rawAddress.toString(), ppszusername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(pszrealm.rawAddress.toString(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), bpersist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr<UInt>, pszdomainname: Pstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pstr, pcchmaxpassword: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(dwflags.toInt(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), pszusername.rawAddress.toString(), pcchlmaxusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pcchmaxdomainname.rawAddress.toString(), pszpassword.rawAddress.toString(), pcchmaxpassword.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr<UInt>, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pwstr, pcchmaxpassword: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(dwflags.toInt(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), pszusername.rawAddress.toString(), pcchmaxusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pcchmaxdomainname.rawAddress.toString(), pszpassword.rawAddress.toString(), pcchmaxpassword.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(marshaledcredential.rawAddress.toString(), credtype.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(marshaledcredential.rawAddress.toString(), credtype.rawAddress.toString(), credential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnprotectA(fasself, pszprotectedcredentials.rawAddress.toString(), cchprotectedcredentials.toInt(), pszcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredUnprotectW(fasself, pszprotectedcredentials.rawAddress.toString(), cchprotectedcredentials.toInt(), pszcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteA(credential: ConstPtr<Credentiala>, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredWriteA(credential.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, credential: ConstPtr<Credentiala>, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(targetinfo.rawAddress.toString(), credential.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, credential: ConstPtr<Credentialw>, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(targetinfo.rawAddress.toString(), credential.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteW(credential: ConstPtr<Credentialw>, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsCredWriteW(credential.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameA(param0: MutPtr<Opencardnamea>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameW(param0: MutPtr<Opencardnamew>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr<KeyCredentialManagerInfo>) {
    if (windowsWin32SecurityCredentialsNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(keycredentialmanagerinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr<MutPtr<KeyCredentialManagerInfo>>): Hresult =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(keycredentialmanagerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr<Bool>, keycredentialmanageroperationerrorstates: MutPtr<KeyCredentialManagerOperationErrorStates>): Hresult =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.rawAddress.toString(), keycredentialmanageroperationerrorstates.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(hwndowner.rawAddress.toString(), keycredentialmanageroperationtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAccessStartedEvent(): Handle =
    if (windowsWin32SecurityCredentialsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext.toString(), dwevent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardCancel(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardConnectA(hcontext.toString(), szreader.rawAddress.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress.toString(), pdwactiveprotocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardConnectW(hcontext.toString(), szreader.rawAddress.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress.toString(), pdwactiveprotocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardControl(hcard.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard.toString(), dwdisposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDlgExtendedError(): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard.toString(), dwdisposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr<CVoid>, pvreserved2: ConstPtr<CVoid>, phcontext: MutPtr<ULong>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardEstablishContext(dwscope.toInt(), pvreserved1.rawAddress.toString(), pvreserved2.rawAddress.toString(), phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(hcontext.toString(), szcardname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(hcontext.toString(), szcardname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(hcontext.toString(), szreadername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(hcontext.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(hcontext.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(hcontext.toString(), szreadername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr<CVoid>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardFreeMemory(hcontext.toString(), pvmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr<UByte>, pcbattrlen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.rawAddress.toString(), pcbattrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString(), pcchprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString(), pcchprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(hcontext.toString(), szreadername.rawAddress.toString(), pdwdevicetypeid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(hcontext.toString(), szreadername.rawAddress.toString(), pdwdevicetypeid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr<Guid>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(hcontext.toString(), szcard.rawAddress.toString(), pguidproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr<Guid>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(hcontext.toString(), szcard.rawAddress.toString(), pguidproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(hcontext.toString(), szreadername.rawAddress.toString(), szdeviceinstanceid.rawAddress.toString(), pcchdeviceinstanceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(hcontext.toString(), szreadername.rawAddress.toString(), szdeviceinstanceid.rawAddress.toString(), pcchdeviceinstanceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(hcontext.toString(), szreadername.rawAddress.toString(), pbicon.rawAddress.toString(), pcbicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(hcontext.toString(), szreadername.rawAddress.toString(), pbicon.rawAddress.toString(), pcbicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(hcard.toString(), pctransmitcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(hcontext.toString(), szcardname.rawAddress.toString(), pguidprimaryprovider.rawAddress.toString(), rgguidinterfaces.rawAddress.toString(), dwinterfacecount.toInt(), pbatr.rawAddress.toString(), pbatrmask.rawAddress.toString(), cbatrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(hcontext.toString(), szcardname.rawAddress.toString(), pguidprimaryprovider.rawAddress.toString(), rgguidinterfaces.rawAddress.toString(), dwinterfacecount.toInt(), pbatr.rawAddress.toString(), pbatrmask.rawAddress.toString(), cbatrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(hcontext.toString(), szreadername.rawAddress.toString(), szdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(hcontext.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(hcontext.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(hcontext.toString(), szreadername.rawAddress.toString(), szdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListCardsA(hcontext.toString(), pbatr.rawAddress.toString(), rgquidinterfaces.rawAddress.toString(), cguidinterfacecount.toInt(), mszcards.rawAddress.toString(), pcchcards.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListCardsW(hcontext.toString(), pbatr.rawAddress.toString(), rgquidinterfaces.rawAddress.toString(), cguidinterfacecount.toInt(), mszcards.rawAddress.toString(), pcchcards.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(hcontext.toString(), szcard.rawAddress.toString(), pguidinterfaces.rawAddress.toString(), pcguidinterfaces.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(hcontext.toString(), szcard.rawAddress.toString(), pguidinterfaces.rawAddress.toString(), pcguidinterfaces.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(hcontext.toString(), mszgroups.rawAddress.toString(), pcchgroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(hcontext.toString(), mszgroups.rawAddress.toString(), pcchgroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersA(hcontext.toString(), mszgroups.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersW(hcontext.toString(), mszgroups.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(hcontext.toString(), szdeviceinstanceid.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(hcontext.toString(), szdeviceinstanceid.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(hcontext.toString(), mszcards.rawAddress.toString(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(hcontext.toString(), rgatrmasks.rawAddress.toString(), catrs.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(hcontext.toString(), rgatrmasks.rawAddress.toString(), catrs.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(hcontext.toString(), mszcards.rawAddress.toString(), rgreaderstates.rawAddress.toString(), creaders.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardReadCacheA(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardReadCacheW(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardReconnect(hcard.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), pdwactiveprotocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseStartedEvent() {
    if (windowsWin32SecurityCredentialsNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr<UByte>, cbattrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardSetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.rawAddress.toString(), cbattrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardState(hcard: ULong, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardState(hcard.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardStatusA(hcard.toString(), mszreadernames.rawAddress.toString(), pcchreaderlen.rawAddress.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardStatusW(hcard.toString(), mszreadernames.rawAddress.toString(), pcchreaderlen.rawAddress.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr<ScardIoRequest>, pbsendbuffer: ConstPtr<UByte>, cbsendlength: UInt, piorecvpci: MutPtr<ScardIoRequest>, pbrecvbuffer: MutPtr<UByte>, pcbrecvlength: MutPtr<UInt>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardTransmit(hcard.toString(), piosendpci.rawAddress.toString(), pbsendbuffer.rawAddress.toString(), cbsendlength.toInt(), piorecvpci.rawAddress.toString(), pbrecvbuffer.rawAddress.toString(), pcbrecvlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardA(param0: MutPtr<OpencardnameExa>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardW(param0: MutPtr<OpencardnameExw>): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr<UByte>, datalen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr<UByte>, datalen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAvailable) wasmWindowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

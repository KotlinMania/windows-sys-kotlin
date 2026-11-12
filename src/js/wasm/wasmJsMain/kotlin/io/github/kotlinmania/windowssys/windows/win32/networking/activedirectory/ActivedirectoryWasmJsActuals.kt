@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

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
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.LsaForestTrustInformation
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingActivedirectoryNapiAddon(): Boolean

private val windowsWin32NetworkingActivedirectoryNapiAvailable: Boolean = initWindowsWin32NetworkingActivedirectoryNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsGetObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(p0: String, p1: String): Int

public actual fun aDsBuildEnumerator(padscontainer: MutPtr<CVoid>, ppenumvariant: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(padscontainer.rawAddress.toString(), ppenumvariant.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr<UInt>, dwobjecttypes: UInt, pvar: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(lpdwobjecttypes.rawAddress.toString(), dwobjecttypes.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayStr(lpppathnames: ConstPtr<Pcwstr>, dwpathnames: UInt, pvar: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(lpppathnames.rawAddress.toString(), dwpathnames.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr<MutPtr<UByte>>, pdwdestlen: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(szsrcdata.rawAddress.toString(), ppbdestdata.rawAddress.toString(), pdwdestlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEncodeBinaryData(pbsrcdata: MutPtr<UByte>, dwsrclen: UInt, ppszdestdata: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(pbsrcdata.rawAddress.toString(), dwsrclen.toInt(), ppszdestdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEnumerateNext(penumvariant: MutPtr<CVoid>, celements: UInt, pvar: MutPtr<Variant.Variant>, pcelementsfetched: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(penumvariant.rawAddress.toString(), celements.toInt(), pvar.rawAddress.toString(), pcelementsfetched.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsFreeEnumerator(penumvariant: MutPtr<CVoid>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(penumvariant.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetLastError(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), dwerrorbuflen.toInt(), lpnamebuf.rawAddress.toString(), dwnamebuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsGetObject(lpszpathname.rawAddress.toString(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(lpszpathname.rawAddress.toString(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwreserved.toInt(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr<AdsAttrInfo>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(pwzattr.rawAddress.toString(), pwritableattrs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr<CVoid>, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr<Hwnd>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(pappthddataobj.rawAddress.toString(), pwzadsobjname.rawAddress.toString(), phnotifyobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr<Adspropinitparams>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(hnotifyobj.rawAddress.toString(), pinitparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr<Adsproperror>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(hnotifyobj.rawAddress.toString(), perror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr<Byte>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString(), ptztitle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(dwerr.toInt(), pszerror.rawAddress.toString(), pszprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsFreeAdsValues(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(padsvalues.rawAddress.toString(), dwnumvalues.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsTypeToPropVariant(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt, pvariant: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(padsvalues.rawAddress.toString(), dwnumvalues.toInt(), pvariant.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsMem(cb: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(cb.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(pstr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr<Variant.Variant>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(psecuritydescriptor.rawAddress.toString(), pvarsec.rawAddress.toString(), pszservername.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(hds.rawAddress.toString(), flags.toInt(), srcdomain.rawAddress.toString(), srcprincipal.rawAddress.toString(), srcdomaincontroller.rawAddress.toString(), srcdomaincreds.rawAddress.toString(), dstdomain.rawAddress.toString(), dstprincipal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(hds.rawAddress.toString(), flags.toInt(), srcdomain.rawAddress.toString(), srcprincipal.rawAddress.toString(), srcdomaincontroller.rawAddress.toString(), srcdomaincreds.rawAddress.toString(), dstdomain.rawAddress.toString(), dstprincipal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>, subnetnames: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString(), subnetnames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>, subnetnames: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString(), subnetnames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(servername.rawAddress.toString(), annotation.rawAddress.toString(), instanceguid.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(servername.rawAddress.toString(), annotation.rawAddress.toString(), instanceguid.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(sitename.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(sitename.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, phds: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(hds.rawAddress.toString(), ctimeoutsecs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerA(pinfo: MutPtr<Dsbrowseinfoa>): Int =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(pinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerW(pinfo: MutPtr<Dsbrowseinfow>): Int =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(pinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcstr>, ppresult: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(hds.rawAddress.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress.toString(), ppresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcwstr>, ppresult: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(hds.rawAddress.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress.toString(), ppresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(pszspn.rawAddress.toString(), cspn.toInt(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(pszspn.rawAddress.toString(), cspn.toInt(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pportnumber: MutPtr<UShort>, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(pszspn.rawAddress.toString(), cspn.toInt(), pchostname.rawAddress.toString(), hostname.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pportnumber.rawAddress.toString(), pcdomainname.rawAddress.toString(), domainname.rawAddress.toString(), pcrealmname.rawAddress.toString(), realmname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pcportname: MutPtr<UInt>, portname: Pwstr, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(pszspn.rawAddress.toString(), cspn.toInt(), pchostname.rawAddress.toString(), hostname.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pcportname.rawAddress.toString(), portname.rawAddress.toString(), pcdomainname.rawAddress.toString(), domainname.rawAddress.toString(), pcrealmname.rawAddress.toString(), realmname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(pszspn.rawAddress.toString(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(pszspn.rawAddress.toString(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(pszrdn.rawAddress.toString(), cchrdn.toInt(), pguid.rawAddress.toString(), pedsmanglefor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(pszrdn.rawAddress.toString(), cchrdn.toInt(), pguid.rawAddress.toString(), pedsmanglefor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(servername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), domainguid.rawAddress.toString(), dsaguid.rawAddress.toString(), dnshostname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(servername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), domainguid.rawAddress.toString(), dsaguid.rawAddress.toString(), dnshostname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsa>>, domaincount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(servername.rawAddress.toString(), flags.toInt(), domains.rawAddress.toString(), domaincount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsw>>, domaincount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(servername.rawAddress.toString(), flags.toInt(), domains.rawAddress.toString(), domaincount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultA(presult: ConstPtr<DsNameResulta>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultW(presult: ConstPtr<DsNameResultw>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreePasswordCredentials(authidentity: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(authidentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr<DsSchemaGuidMapa>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(pguidmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr<DsSchemaGuidMapw>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(pguidmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr<Pstr>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(cspn.toInt(), rpszspn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr<Pwstr>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(cspn.toInt(), rpszspn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(getdccontexthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr<Guid>, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfoa>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(computername.rawAddress.toString(), domainname.rawAddress.toString(), domainguid.rawAddress.toString(), sitename.rawAddress.toString(), flags.toInt(), domaincontrollerinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr<Guid>, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfow>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(computername.rawAddress.toString(), domainname.rawAddress.toString(), domainguid.rawAddress.toString(), sitename.rawAddress.toString(), flags.toInt(), domaincontrollerinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(getdccontexthandle.rawAddress.toString(), sockaddresscount.rawAddress.toString(), sockaddresses.rawAddress.toString(), dnshostname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(getdccontexthandle.rawAddress.toString(), sockaddresscount.rawAddress.toString(), sockaddresses.rawAddress.toString(), dnshostname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(dnsname.rawAddress.toString(), optionflags.toInt(), sitename.rawAddress.toString(), domainguid.rawAddress.toString(), dnsforestname.rawAddress.toString(), dcflags.toInt(), retgetdccontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(dnsname.rawAddress.toString(), optionflags.toInt(), sitename.rawAddress.toString(), domainguid.rawAddress.toString(), dnsforestname.rawAddress.toString(), dcflags.toInt(), retgetdccontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(servername.rawAddress.toString(), entrycount.rawAddress.toString(), sitenames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(servername.rawAddress.toString(), entrycount.rawAddress.toString(), sitenames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(hds.rawAddress.toString(), domainname.rawAddress.toString(), infolevel.toInt(), pcout.rawAddress.toString(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(hds.rawAddress.toString(), domainname.rawAddress.toString(), infolevel.toInt(), pcout.rawAddress.toString(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(servername.rawAddress.toString(), trusteddomainname.rawAddress.toString(), flags.toInt(), foresttrustinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(pszobjectclass.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(dwflags.toInt(), pszobjectclass.rawAddress.toString(), cximage, cyimage).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetRdnW(ppdn: MutPtr<Pwstr>, pcdn: MutPtr<UInt>, ppkey: MutPtr<Pwstr>, pckey: MutPtr<UInt>, ppval: MutPtr<Pwstr>, pcval: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(ppdn.rawAddress.toString(), pcdn.rawAddress.toString(), ppkey.rawAddress.toString(), pckey.rawAddress.toString(), ppval.rawAddress.toString(), pcval.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(computername.rawAddress.toString(), sitename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(computername.rawAddress.toString(), sitename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(servicetype, serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.rawAddress.toString(), pinstanceports.rawAddress.toString(), pcspn.rawAddress.toString(), prpszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcwstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(servicetype, serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.rawAddress.toString(), pinstanceports.rawAddress.toString(), pcspn.rawAddress.toString(), prpszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(hds.rawAddress.toString(), flags.toInt(), srcprincipal.rawAddress.toString(), dstprincipal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(hds.rawAddress.toString(), flags.toInt(), srcprincipal.rawAddress.toString(), dstprincipal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(pszdn.rawAddress.toString(), edsmanglefor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(pszdn.rawAddress.toString(), edsmanglefor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(pszrdn.rawAddress.toString(), crdn.toInt(), edsmanglefordesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(pszrdn.rawAddress.toString(), crdn.toInt(), edsmanglefordesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(hds.rawAddress.toString(), site.rawAddress.toString(), ppdomains.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(hds.rawAddress.toString(), site.rawAddress.toString(), ppdomains.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(hds.rawAddress.toString(), server.rawAddress.toString(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(hds.rawAddress.toString(), server.rawAddress.toString(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesA(hds: Handle, pproles: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(hds.rawAddress.toString(), pproles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesW(hds: Handle, pproles: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(hds.rawAddress.toString(), pproles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(hds.rawAddress.toString(), domain.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(hds.rawAddress.toString(), domain.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(hds.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(hds.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesA(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResulta>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(hds.rawAddress.toString(), ppsites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesW(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResultw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(hds.rawAddress.toString(), ppsites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(user.rawAddress.toString(), domain.rawAddress.toString(), password.rawAddress.toString(), pauthidentity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(user.rawAddress.toString(), domain.rawAddress.toString(), password.rawAddress.toString(), pauthidentity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapa>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(hds.rawAddress.toString(), cguids.toInt(), rguids.rawAddress.toString(), ppguidmap.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapw>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(hds.rawAddress.toString(), cguids.toInt(), rguids.rawAddress.toString(), ppguidmap.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr<LsaForestTrustInformation>, oldforesttrustinfo: ConstPtr<LsaForestTrustInformation>, mergedforesttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(domainname.rawAddress.toString(), newforesttrustinfo.rawAddress.toString(), oldforesttrustinfo.rawAddress.toString(), mergedforesttrustinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr<Pcstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(hds.rawAddress.toString(), pszfromsite.rawAddress.toString(), rgsztosites.rawAddress.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr<Pcwstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(hds.rawAddress.toString(), pwszfromsite.rawAddress.toString(), rgwsztosites.rawAddress.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesFree(rgsiteinfo: ConstPtr<DsSiteCostInfo>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(rgsiteinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress.toString(), pcquotedrdnvaluelength.rawAddress.toString(), psquotedrdnvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress.toString(), pcquotedrdnvaluelength.rawAddress.toString(), psquotedrdnvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(hds.rawAddress.toString(), domaindn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(hds.rawAddress.toString(), domaindn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(hds.rawAddress.toString(), serverdn.rawAddress.toString(), domaindn.rawAddress.toString(), flastdcindomain.rawAddress.toString(), fcommit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(hds.rawAddress.toString(), serverdn.rawAddress.toString(), domaindn.rawAddress.toString(), flastdcindomain.rawAddress.toString(), fcommit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), sourcedsadn.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), sourcedsadn.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(hds.rawAddress.toString(), taskid, dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsasrc.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsasrc.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(infotype, pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(hds.rawAddress.toString(), infotype, pszobject.rawAddress.toString(), puuidforsourcedsaobjguid.rawAddress.toString(), pszattributename.rawAddress.toString(), pszvalue.rawAddress.toString(), dwflags.toInt(), dwenumerationcontext.toInt(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(hds.rawAddress.toString(), infotype, pszobject.rawAddress.toString(), puuidforsourcedsaobjguid.rawAddress.toString(), ppinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuidsourcedsa.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuidsourcedsa.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfoa>>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(hds.rawAddress.toString(), psznamecontext.rawAddress.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.rawAddress.toString(), perrors.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfow>>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(hds.rawAddress.toString(), psznamecontext.rawAddress.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.rawAddress.toString(), perrors.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsadest.rawAddress.toString(), puuiddsadest.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsadest.rawAddress.toString(), puuiddsadest.rawAddress.toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), uloptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), uloptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRoleFreeMemory(buffer: MutPtr<CVoid>) {
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(lpserver.rawAddress.toString(), infolevel, buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(operation, serviceclass.rawAddress.toString(), userobjectdn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(operation, serviceclass.rawAddress.toString(), userobjectdn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindA(phds: ConstPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindW(phds: ConstPtr<Handle>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(phds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress.toString(), pcunquotedrdnvaluelength.rawAddress.toString(), psunquotedrdnvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress.toString(), pcunquotedrdnvaluelength.rawAddress.toString(), psunquotedrdnvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(subnetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(subnetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr<Pcstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(hds.rawAddress.toString(), operation, pszaccount.rawAddress.toString(), cspn.toInt(), rpszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr<Pcwstr>): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(hds.rawAddress.toString(), operation, pszaccount.rawAddress.toString(), cspn.toInt(), rpszspn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsMem(pmem: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(pmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(pstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToAdsType(pvariant: MutPtr<Variant.Variant>, dwnumvariant: UInt, ppadsvalues: MutPtr<MutPtr<Adsvalue>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(pvariant.rawAddress.toString(), dwnumvariant.toInt(), ppadsvalues.rawAddress.toString(), pdwnumvalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsMem(poldmem: MutPtr<CVoid>, cbold: UInt, cbnew: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(poldmem.rawAddress.toString(), cbold.toInt(), cbnew.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsStr(ppstr: MutPtr<Pwstr>, pstr: Pcwstr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAvailable) wasmWindowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(ppstr.rawAddress.toString(), pstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant.Variant, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, pdwsdlength: MutPtr<UInt>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

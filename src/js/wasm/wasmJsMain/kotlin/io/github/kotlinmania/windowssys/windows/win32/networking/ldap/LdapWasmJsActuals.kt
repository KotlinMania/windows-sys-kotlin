@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingLdapNapiAddon(): Boolean

private val windowsWin32NetworkingLdapNapiAvailable: Boolean = initWindowsWin32NetworkingLdapNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetLastError()")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetLastError(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerAllocT(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerAllocT(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerBvdup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerBvdup(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerBvecfree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerBvecfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerBvfree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerBvfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerFirstElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerFirstElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerFlatten(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerFlatten(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerFree(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerInit(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerInit(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerNextElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerNextElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerPeekTag(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerPeekTag(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerPrintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerPrintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerScanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerScanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapBerSkipTag(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapBerSkipTag(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapCldapOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapCldapOpen(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapCldapOpenA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapCldapOpenA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapCldapOpenW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapCldapOpenW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAbandon(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAbandon(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExtA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExtW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExtS(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtS(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExtSA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtSA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddExtSW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtSW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddS(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddSA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddSA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapAddSW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapAddSW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBind(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBind(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBindA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBindA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBindW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBindW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBindS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBindS(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBindSA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBindSA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapBindSW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapBindSW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCheckFilterA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCheckFilterW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCleanup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCleanup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompare(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompare(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExtA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExtW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExtS(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtS(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtSA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtSW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareS(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareSA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareSA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCompareSW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCompareSW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapConnFromMsg(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlFreeA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlFreeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlFreeW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlFreeW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlsFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFreeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFreeW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountEntries(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountEntries(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountReferences(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountReferences(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountValues(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountValues(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountValuesA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountValuesW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesLen(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControl(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControl(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDelete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExt(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtS(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteS(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteS(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteSA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteSA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDeleteSW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteSW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDn2ufn(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufn(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufnA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufnW(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(p0: String, p1: String, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(p0: String, p1: String, p2: String, p3: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapErr2string(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapErr2string(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapErr2stringA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapErr2stringA(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapErr2stringW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapErr2stringW(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExplodeDn(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDn(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDnA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDnW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttribute(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFirstEntry(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFirstEntry(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFirstReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFirstReference(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFreeControls(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControls(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControlsA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControlsW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetDn(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetDn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetDnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetDnA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetDnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetDnW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetNextPage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetNextPage(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetNextPageS(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetOptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetOptionW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetPagedCount(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValues(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValues(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValuesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValuesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapInit(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapInit(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapInitA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapInitA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapInitW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapInitW(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapMemfree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapMemfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapMemfreeA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapMemfreeA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapMemfreeW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapMemfreeW(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModify(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModify(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExtA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExtW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExtS(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtS(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtSA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtSW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifyS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifyS(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifySA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifySA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModifySW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModifySW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2S(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2S(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2SA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2SW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdnA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdnW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdnS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnS(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdnSA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnSA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapModrdnSW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnSW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapMsgfree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapMsgfree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapNextAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttribute(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttributeA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttributeW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapNextEntry(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapNextEntry(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapNextReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapNextReference(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapOpen(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapOpenA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapOpenA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapOpenW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapOpenW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParsePageControl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControl(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControlA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControlW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseReference(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseReference(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseReferenceA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseReferenceW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseResult(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseResult(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseResultA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseResultA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseResultW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseResultW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseSortControl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControl(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControlA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControlW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapPerror(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapPerror(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExt(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExtA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExtW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExtS(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtS(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtSA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtSW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapResult(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapResult(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapResult2error(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapResult2error(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSaslBindA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSaslBindW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindSA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindSW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearch(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearch(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExtA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExtW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExtS(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtS(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtSA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtSW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPage(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchS(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchS(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchSA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchSW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchSt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchStA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchStA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSearchStW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSearchStW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSetOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSetOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSetOptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSetOptionW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBind(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBind(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindS(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSslinit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSslinit(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSslinitA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSslinitA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapSslinitW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapSslinitW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapStartTlsSA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapStartTlsSW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapStartup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapStartup(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapStopTlsS(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapStopTlsS(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUfn2dn(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dnA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dnW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUnbind(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUnbind(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapUnbindS(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapUnbindS(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapValueFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapValueFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapValueFreeA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapValueFreeW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeLen(p0: String): Int

public actual fun ldapGetLastError(): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetLastError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berAllocT(options: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapBerAllocT(options).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvdup(pberval: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapBerBvdup(pberval.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvecfree(pberval: MutPtr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapBerBvecfree(pberval.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berBvfree(bv: MutPtr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapBerBvfree(bv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berFirstElement(pberelement: MutPtr, plen: MutPtr, ppopaque: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), ppopaque.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFlatten(pberelement: MutPtr, pberval: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerFlatten(pberelement.rawAddress.toString(), pberval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFree(pberelement: MutPtr, fbuf: Int) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapBerFree(pberelement.rawAddress.toString(), fbuf)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berInit(pberval: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapBerInit(pberval.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berNextElement(pberelement: MutPtr, plen: MutPtr, opaque: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerNextElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), opaque.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPeekTag(pberelement: MutPtr, plen: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPrintf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerPrintf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berScanf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerScanf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berSkipTag(pberelement: MutPtr, plen: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapCldapOpen(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapCldapOpenA(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapCldapOpenW(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAbandon(ld: MutPtr, msgid: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAbandon(ld.rawAddress.toString(), msgid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAdd(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAdd(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExt(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtS(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddS(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapAddSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBind(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBind(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindS(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterA(ld: MutPtr, searchfilter: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld.rawAddress.toString(), searchfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterW(ld: MutPtr, searchfilter: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld.rawAddress.toString(), searchfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCloseExtendedOp(ld: MutPtr, messagenumber: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld.rawAddress.toString(), messagenumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompare(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompare(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExt(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCompareSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnFromMsg(primaryconn: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn.rawAddress.toString(), res.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnect(ld: MutPtr, timeout: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapConnect(ld.rawAddress.toString(), timeout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFree(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlFree(control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeW(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlFreeW(control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFree(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFree(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeW(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountEntries(ld: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountEntries(ld.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountReferences(ld: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountReferences(ld.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValues(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountValues(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesA(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesW(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesLen(vals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControl(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlA(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlW(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControl(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDelete(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDelete(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteA(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteA(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteW(ld: MutPtr, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteW(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExt(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtS(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteS(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteS(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSA(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSW(ld: MutPtr, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld.rawAddress.toString(), dn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), control.rawAddress.toString(), criticality).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), control.rawAddress.toString(), criticality).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2string(err: UInt): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapErr2string(err.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringA(err: UInt): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapErr2stringA(err.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapErr2stringW(err.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn.rawAddress.toString(), notypes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn.rawAddress.toString(), notypes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn.rawAddress.toString(), notypes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperation(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationA(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationW(ld: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstEntry(ld: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld.rawAddress.toString(), res.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstReference(ld: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapFirstReference(ld.rawAddress.toString(), res.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControls(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControls(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsW(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDn(ld: MutPtr, entry: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetDn(ld.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnA(ld: MutPtr, entry: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetDnA(ld.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnW(ld: MutPtr, entry: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetDnW(ld.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPage(externalhandle: MutPtr, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle.rawAddress.toString(), searchhandle.toString(), pagesize.toInt(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPageS(externalhandle: MutPtr, searchhandle: PLDAPSearch, timeout: MutPtr, pagesize: UInt, totalcount: MutPtr, results: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle.rawAddress.toString(), searchhandle.toString(), timeout.rawAddress.toString(), pagesize.toInt(), totalcount.rawAddress.toString(), results.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOption(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetOption(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOptionW(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetPagedCount(externalhandle: MutPtr, searchblock: PLDAPSearch, totalcount: MutPtr, results: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle.rawAddress.toString(), searchblock.toString(), totalcount.rawAddress.toString(), results.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValues(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValues(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesA(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesW(ld: MutPtr, entry: MutPtr, attr: Pcwstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLen(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenA(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenW(externalhandle: MutPtr, message: MutPtr, attr: Pcwstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapInit(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapInitA(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapInitW(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMemfree(block: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapLdapMemfree(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeA(block: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapLdapMemfreeA(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapLdapMemfreeW(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapModify(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModify(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExt(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExt(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtS(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyS(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifyS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifySA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModifySW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2A(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2W(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2S(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnS(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMsgfree(res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapMsgfree(res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextEntry(ld: MutPtr, entry: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapNextEntry(ld.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextReference(ld: MutPtr, entry: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapNextReference(ld.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapOpen(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapOpenA(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapOpenW(hostname.rawAddress.toString(), portnumber.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultA(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultW(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControl(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlA(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlW(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReference(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseReference(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceA(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceW(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResult(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseResult(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultA(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultW(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControl(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlA(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlW(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlA(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlW(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapPerror(ld: MutPtr, msg: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapLdapPerror(ld.rawAddress.toString(), msg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapRenameExt(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExt(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtS(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult(ld: MutPtr, msgid: UInt, all: UInt, timeout: ConstPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapResult(ld.rawAddress.toString(), msgid.toInt(), all.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult2error(ld: MutPtr, res: MutPtr, freeit: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapResult2error(ld.rawAddress.toString(), res.rawAddress.toString(), freeit.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearch(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearch(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr, searchblock: PLDAPSearch): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle.rawAddress.toString(), searchblock.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPage(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageA(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageW(externalhandle: MutPtr, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchSt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchStA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSearchStW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    if (windowsWin32NetworkingLdapNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapSetOption(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSetOption(ld.rawAddress.toString(), option, invalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetOptionW(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld.rawAddress.toString(), option, invalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBind(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindS(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapSslinit(hostname.rawAddress.toString(), portnumber.toInt(), secure).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname.rawAddress.toString(), portnumber.toInt(), secure).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname.rawAddress.toString(), portnumber.toInt(), secure).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSA(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSW(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartup(version: MutPtr, instance: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapStartup(version.rawAddress.toString(), instance.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStopTlsS(externalhandle: MutPtr): Boolean =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn.rawAddress.toString(), pdn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn.rawAddress.toString(), pdn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn.rawAddress.toString(), pdn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbind(ld: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUnbind(ld.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbindS(ld: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapUnbindS(ld.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFree(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapValueFree(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeA(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeW(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeLen(vals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAvailable) wasmWindowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

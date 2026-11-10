@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityCryptographyCatalogNapiAddon(): Boolean

private val _windowsWin32SecurityCryptographyCatalogNapiAvailable: Boolean = _initWindowsWin32SecurityCryptographyCatalogNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(p0: String, p1: String): Int

public actual fun cryptCATAdminAcquireContext(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext((phcatadmin?.value ?: 0L).toString(), (pgsubsystem?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, pwszhashalgorithm: Pcwstr, pstronghashpolicy: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2((phcatadmin?.value ?: 0L).toString(), (pgsubsystem?.value ?: 0L).toString(), (pwszhashalgorithm?.value ?: 0L).toString(), (pstronghashpolicy?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), (pwszselectbasename?.value ?: 0L).toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle((hfile?.value ?: 0L).toString(), (pcbhash?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(hcatadmin.toString(), (hfile?.value ?: 0L).toString(), (pcbhash?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: COpaquePointer?, cbhash: UInt, dwflags: UInt, phprevcatinfo: COpaquePointer?): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(hcatadmin.toString(), (pbhash?.value ?: 0L).toString(), cbhash.toInt(), dwflags.toInt(), (phprevcatinfo?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(hcatadmin.toString(), hcatinfo.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(hcatadmin.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), (pscatinfo?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFClose(pcdf: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose((pcdf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributes(pcdf: COpaquePointer?, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes((pcdf?.value ?: 0L).toString(), (pmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: COpaquePointer?, pwszmembertag: Pcwstr, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag((pcdf?.value ?: 0L).toString(), (pwszmembertag?.value ?: 0L).toString(), (pmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes((pcdf?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembers(pcdf: COpaquePointer?, pprevmember: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers((pcdf?.value ?: 0L).toString(), (pprevmember?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: COpaquePointer?, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: COpaquePointer?, fcontinueonerror: Bool, pvreserved: COpaquePointer?): Pwstr =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx((pcdf?.value ?: 0L).toString(), (pwszprevcdftag?.value ?: 0L).toString(), 0L.toString(), (ppmember?.value ?: 0L).toString(), fcontinueonerror, (pvreserved?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen((pwszfilepath?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(hcatinfo.toString(), (pscatinfo?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATClose((hcatalog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: COpaquePointer?, pprevattr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr((hcatalog?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember((hcatalog?.value ?: 0L).toString(), (pprevmember?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) {
        _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATHandleFromStore(pcatstore: COpaquePointer?): Handle =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore((pcatstore?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen((pwszfilename?.value ?: 0L).toString(), fdwopenflags.toInt(), hprov.toString(), dwpublicversion.toInt(), dwencodingtype.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore((hcatalog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: COpaquePointer?, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszfilename?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), (pgsubjecttype?.value ?: 0L).toString(), dwcertversion.toInt(), cbsipindirectdata.toInt(), (pbsipindirectdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle((hcatalog?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_catalog_isCatalogFile((hfile?.value ?: 0L).toString(), (pwszfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

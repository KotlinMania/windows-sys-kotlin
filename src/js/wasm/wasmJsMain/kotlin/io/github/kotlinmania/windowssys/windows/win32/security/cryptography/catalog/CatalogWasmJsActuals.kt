@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCryptographyCatalogNapiAddon(): Boolean

private val windowsWin32SecurityCryptographyCatalogNapiAvailable: Boolean = initWindowsWin32SecurityCryptographyCatalogNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(p0: String, p1: String): Int

public actual fun cryptCATAdminAcquireContext(phcatadmin: MutPtr, pgsubsystem: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(phcatadmin.rawAddress.toString(), pgsubsystem.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr, pgsubsystem: ConstPtr, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(phcatadmin.rawAddress.toString(), pgsubsystem.rawAddress.toString(), pwszhashalgorithm.rawAddress.toString(), pstronghashpolicy.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), pwszselectbasename.rawAddress.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(hfile.rawAddress.toString(), pcbhash.rawAddress.toString(), pbhash.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(hcatadmin.toString(), hfile.rawAddress.toString(), pcbhash.rawAddress.toString(), pbhash.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr): Long =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(hcatadmin.toString(), pbhash.rawAddress.toString(), cbhash.toInt(), dwflags.toInt(), phprevcatinfo.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin.toString(), hcatinfo.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), pscatinfo.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFClose(pcdf: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(pcdf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributes(pcdf: MutPtr, pmember: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(pcdf.rawAddress.toString(), pmember.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr, pwszmembertag: Pcwstr, pmember: ConstPtr, pprevattr: ConstPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(pcdf.rawAddress.toString(), pwszmembertag.rawAddress.toString(), pmember.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(pcdf.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembers(pcdf: MutPtr, pprevmember: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(pcdf.rawAddress.toString(), pprevmember.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr, fcontinueonerror: Bool, pvreserved: ConstPtr): Pwstr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(pcdf.rawAddress.toString(), pwszprevcdftag.rawAddress.toString(), 0L.toString(), ppmember.rawAddress.toString(), fcontinueonerror, pvreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(pwszfilepath.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(hcatinfo.toString(), pscatinfo.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(hcatalog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr, pprevattr: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pprevattr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(hcatalog.rawAddress.toString(), pprevattr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(hcatalog.rawAddress.toString(), pprevmember.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr) {
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pwszreferencetag.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATHandleFromStore(pcatstore: MutPtr): Handle =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(pcatstore.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(pwszfilename.rawAddress.toString(), fdwopenflags.toInt(), hprov.toString(), dwpublicversion.toInt(), dwencodingtype.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(hcatalog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(hcatalog.rawAddress.toString(), pwszfilename.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), pgsubjecttype.rawAddress.toString(), dwcertversion.toInt(), cbsipindirectdata.toInt(), pbsipindirectdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(hcatalog.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(hfile.rawAddress.toString(), pwszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

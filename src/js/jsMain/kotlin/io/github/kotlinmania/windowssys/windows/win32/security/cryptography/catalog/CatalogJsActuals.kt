@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SecurityCryptographyCatalogNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cryptCATAdminAcquireContext(phcatadmin: MutPtr, pgsubsystem: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(phcatadmin.rawAddress.toString(), pgsubsystem.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr, pgsubsystem: ConstPtr, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(phcatadmin.rawAddress.toString(), pgsubsystem.rawAddress.toString(), pwszhashalgorithm.rawAddress.toString(), pstronghashpolicy.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), pwszselectbasename.rawAddress.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(hfile.rawAddress.toString(), pcbhash.rawAddress.toString(), pbhash.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(hcatadmin.toString(), hfile.rawAddress.toString(), pcbhash.rawAddress.toString(), pbhash.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr): Long =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(hcatadmin.toString(), pbhash.rawAddress.toString(), cbhash.toInt(), dwflags.toInt(), phprevcatinfo.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin.toString(), hcatinfo.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(hcatadmin.toString(), pwszcatalogfile.rawAddress.toString(), pscatinfo.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFClose(pcdf: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(pcdf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributes(pcdf: MutPtr, pmember: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(pcdf.rawAddress.toString(), pmember.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr, pwszmembertag: Pcwstr, pmember: ConstPtr, pprevattr: ConstPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(pcdf.rawAddress.toString(), pwszmembertag.rawAddress.toString(), pmember.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(pcdf.rawAddress.toString(), pprevattr.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembers(pcdf: MutPtr, pprevmember: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(pcdf.rawAddress.toString(), pprevmember.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr, fcontinueonerror: Bool, pvreserved: ConstPtr): Pwstr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(pcdf.rawAddress.toString(), pwszprevcdftag.rawAddress.toString(), 0L.toString(), ppmember.rawAddress.toString(), fcontinueonerror, pvreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(pwszfilepath.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(hcatinfo.toString(), pscatinfo.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(hcatalog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr, pprevattr: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pprevattr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(hcatalog.rawAddress.toString(), pprevattr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(hcatalog.rawAddress.toString(), pprevmember.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr) {
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) {
        windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pwszreferencetag.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATHandleFromStore(pcatstore: MutPtr): Handle =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(pcatstore.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(pwszfilename.rawAddress.toString(), fdwopenflags.toInt(), hprov.toString(), dwpublicversion.toInt(), dwencodingtype.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(hcatalog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(hcatalog.rawAddress.toString(), pcatmember.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(hcatalog.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(hcatalog.rawAddress.toString(), pwszfilename.rawAddress.toString(), pwszreferencetag.rawAddress.toString(), pgsubjecttype.rawAddress.toString(), dwcertversion.toInt(), cbsipindirectdata.toInt(), pbsipindirectdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(hcatalog.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyCatalogNapiAddon != null) (windowsWin32SecurityCryptographyCatalogNapiAddon.windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(hfile.rawAddress.toString(), pwszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

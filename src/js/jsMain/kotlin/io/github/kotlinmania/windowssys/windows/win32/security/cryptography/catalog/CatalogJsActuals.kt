@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SecurityCryptographyCatalogNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cryptCATAdminAcquireContext(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext((phcatadmin?.value ?: 0L).toString(), (pgsubsystem?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, pwszhashalgorithm: Pcwstr, pstronghashpolicy: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2((phcatadmin?.value ?: 0L).toString(), (pgsubsystem?.value ?: 0L).toString(), (pwszhashalgorithm?.value ?: 0L).toString(), (pstronghashpolicy?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), (pwszselectbasename?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle((hfile?.value ?: 0L).toString(), (pcbhash?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(hcatadmin.toString(), (hfile?.value ?: 0L).toString(), (pcbhash?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: COpaquePointer?, cbhash: UInt, dwflags: UInt, phprevcatinfo: COpaquePointer?): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(hcatadmin.toString(), (pbhash?.value ?: 0L).toString(), cbhash.toInt(), dwflags.toInt(), (phprevcatinfo?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(hcatadmin.toString(), hcatinfo.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(hcatadmin.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(hcatadmin.toString(), (pwszcatalogfile?.value ?: 0L).toString(), (pscatinfo?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFClose(pcdf: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose((pcdf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributes(pcdf: COpaquePointer?, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes((pcdf?.value ?: 0L).toString(), (pmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: COpaquePointer?, pwszmembertag: Pcwstr, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag((pcdf?.value ?: 0L).toString(), (pwszmembertag?.value ?: 0L).toString(), (pmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes((pcdf?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembers(pcdf: COpaquePointer?, pprevmember: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers((pcdf?.value ?: 0L).toString(), (pprevmember?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: COpaquePointer?, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: COpaquePointer?, fcontinueonerror: Bool, pvreserved: COpaquePointer?): Pwstr =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx((pcdf?.value ?: 0L).toString(), (pwszprevcdftag?.value ?: 0L).toString(), 0L.toString(), (ppmember?.value ?: 0L).toString(), fcontinueonerror, (pvreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen((pwszfilepath?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(hcatinfo.toString(), (pscatinfo?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATClose((hcatalog?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: COpaquePointer?, pprevattr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr((hcatalog?.value ?: 0L).toString(), (pprevattr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember((hcatalog?.value ?: 0L).toString(), (pprevmember?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) {
        _windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATHandleFromStore(pcatstore: COpaquePointer?): Handle =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore((pcatstore?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen((pwszfilename?.value ?: 0L).toString(), fdwopenflags.toInt(), hprov.toString(), dwpublicversion.toInt(), dwencodingtype.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore((hcatalog?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo((hcatalog?.value ?: 0L).toString(), (pcatmember?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo((hcatalog?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: COpaquePointer?, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo((hcatalog?.value ?: 0L).toString(), (pwszfilename?.value ?: 0L).toString(), (pwszreferencetag?.value ?: 0L).toString(), (pgsubjecttype?.value ?: 0L).toString(), dwcertversion.toInt(), cbsipindirectdata.toInt(), (pbsipindirectdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle((hcatalog?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_isCatalogFile((hfile?.value ?: 0L).toString(), (pwszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

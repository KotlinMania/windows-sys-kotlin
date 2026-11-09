@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SecurityCryptographyCatalogNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext(phcatadmin.toString(), pgsubsystem.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: PCWSTR, pstronghashpolicy: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2(phcatadmin.toString(), pgsubsystem.toString(), pwszhashalgorithm.toString(), pstronghashpolicy.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, pwszselectbasename: PCWSTR, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog(hcatadmin.toString(), pwszcatalogfile.toString(), pwszselectbasename.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CryptCATAdminCalcHashFromFileHandle(hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle(hfile.toString(), pcbhash.toString(), pbhash.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2(hcatadmin.toString(), hfile.toString(), pcbhash.toString(), pbhash.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: UInt, dwflags: UInt, phprevcatinfo: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash(hcatadmin.toString(), pbhash.toString(), cbhash.toInt(), dwflags.toInt(), phprevcatinfo.toString()) as String).toLong() else 0L

public actual fun CryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: BOOL): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume) as Int) else 0

public actual fun CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext(hcatadmin.toString(), hcatinfo.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext(hcatadmin.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog(hcatadmin.toString(), pwszcatalogfile.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: PCWSTR, pscatinfo: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath(hcatadmin.toString(), pwszcatalogfile.toString(), pscatinfo.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATAllocSortedMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo(hcatalog.toString(), pwszreferencetag.toString()) as String).toLong() else 0L

public actual fun CryptCATCDFClose(pcdf: Long): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose(pcdf.toString()) as Int) else 0

public actual fun CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes(pcdf.toString(), pmember.toString(), pprevattr.toString(), pfnparseerror.toLong().toString()) as String).toLong() else 0L

public actual fun CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: PCWSTR, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag(pcdf.toString(), pwszmembertag.toString(), pmember.toString(), pprevattr.toString(), pfnparseerror.toLong().toString()) as String).toLong() else 0L

public actual fun CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes(pcdf.toString(), pprevattr.toString(), pfnparseerror.toLong().toString()) as String).toLong() else 0L

public actual fun CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers(pcdf.toString(), pprevmember.toString(), pfnparseerror.toLong().toString()) as String).toLong() else 0L

public actual fun CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: PWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK, ppmember: Long, fcontinueonerror: BOOL, pvreserved: Long): PWSTR =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx(pcdf.toString(), pwszprevcdftag.toString(), pfnparseerror.toLong().toString(), ppmember.toString(), fcontinueonerror, pvreserved.toString()) as String).toLong() else 0L

public actual fun CryptCATCDFOpen(pwszfilepath: PCWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen(pwszfilepath.toString(), pfnparseerror.toLong().toString()) as String).toLong() else 0L

public actual fun CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext(hcatinfo.toString(), pscatinfo.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCATClose(hcatalog: HANDLE): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATClose(hcatalog.toString()) as Int) else 0

public actual fun CryptCATEnumerateAttr(hcatalog: HANDLE, pcatmember: Long, pprevattr: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr(hcatalog.toString(), pcatmember.toString(), pprevattr.toString()) as String).toLong() else 0L

public actual fun CryptCATEnumerateCatAttr(hcatalog: HANDLE, pprevattr: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr(hcatalog.toString(), pprevattr.toString()) as String).toLong() else 0L

public actual fun CryptCATEnumerateMember(hcatalog: HANDLE, pprevmember: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember(hcatalog.toString(), pprevmember.toString()) as String).toLong() else 0L

public actual fun CryptCATFreeSortedMemberInfo(hcatalog: HANDLE, pcatmember: Long) {
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) {
        _windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo(hcatalog.toString(), pcatmember.toString())
    }
}

public actual fun CryptCATGetAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo(hcatalog.toString(), pcatmember.toString(), pwszreferencetag.toString()) as String).toLong() else 0L

public actual fun CryptCATGetCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo(hcatalog.toString(), pwszreferencetag.toString()) as String).toLong() else 0L

public actual fun CryptCATGetMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo(hcatalog.toString(), pwszreferencetag.toString()) as String).toLong() else 0L

public actual fun CryptCATHandleFromStore(pcatstore: Long): HANDLE =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore(pcatstore.toString()) as String).toLong() else 0L

public actual fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): HANDLE =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen(pwszfilename.toString(), fdwopenflags.toInt(), hprov.toString(), dwpublicversion.toInt(), dwencodingtype.toInt()) as String).toLong() else 0L

public actual fun CryptCATPersistStore(hcatalog: HANDLE): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore(hcatalog.toString()) as Int) else 0

public actual fun CryptCATPutAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo(hcatalog.toString(), pcatmember.toString(), pwszreferencetag.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.toString()) as String).toLong() else 0L

public actual fun CryptCATPutCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo(hcatalog.toString(), pwszreferencetag.toString(), dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.toString()) as String).toLong() else 0L

public actual fun CryptCATPutMemberInfo(hcatalog: HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo(hcatalog.toString(), pwszfilename.toString(), pwszreferencetag.toString(), pgsubjecttype.toString(), dwcertversion.toInt(), cbsipindirectdata.toInt(), pbsipindirectdata.toString()) as String).toLong() else 0L

public actual fun CryptCATStoreFromHandle(hcatalog: HANDLE): Long =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle(hcatalog.toString()) as String).toLong() else 0L

public actual fun IsCatalogFile(hfile: HANDLE, pwszfilename: PCWSTR): BOOL =
    if (_windowsWin32SecurityCryptographyCatalogNapiAddon != null) (_windowsWin32SecurityCryptographyCatalogNapiAddon.windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile(hfile.toString(), pwszfilename.toString()) as Int) else 0

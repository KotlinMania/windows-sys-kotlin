package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(dwerrorarea: UInt, dwlocalerror: UInt, pwszline: PCWSTR)
}

public fun CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminAcquireContext", longArrayOf(phcatadmin, pgsubsystem, dwflags.toLong())).toInt()
}

public fun CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: PCWSTR, pstronghashpolicy: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminAcquireContext2", longArrayOf(phcatadmin, pgsubsystem, pwszhashalgorithm, pstronghashpolicy, dwflags.toLong())).toInt()
}

public fun CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, pwszselectbasename: PCWSTR, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminAddCatalog", longArrayOf(hcatadmin, pwszcatalogfile, pwszselectbasename, dwflags.toLong()))
}

public fun CryptCATAdminCalcHashFromFileHandle(hfile: Foundation.HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminCalcHashFromFileHandle", longArrayOf(Win32DynamicFfi.objectSlot(hfile), pcbhash, pbhash, dwflags.toLong())).toInt()
}

public fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Foundation.HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminCalcHashFromFileHandle2", longArrayOf(hcatadmin, Win32DynamicFfi.objectSlot(hfile), pcbhash, pbhash, dwflags.toLong())).toInt()
}

public fun CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: UInt, dwflags: UInt, phprevcatinfo: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminEnumCatalogFromHash", longArrayOf(hcatadmin, pbhash, cbhash.toLong(), dwflags.toLong(), phprevcatinfo))
}

public fun CryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminPauseServiceForBackup", longArrayOf(dwflags.toLong(), fresume.toLong())).toInt()
}

public fun CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminReleaseCatalogContext", longArrayOf(hcatadmin, hcatinfo, dwflags.toLong())).toInt()
}

public fun CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminReleaseContext", longArrayOf(hcatadmin, dwflags.toLong())).toInt()
}

public fun CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminRemoveCatalog", longArrayOf(hcatadmin, pwszcatalogfile, dwflags.toLong())).toInt()
}

public fun CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: PCWSTR, pscatinfo: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminResolveCatalogPath", longArrayOf(hcatadmin, pwszcatalogfile, pscatinfo, dwflags.toLong())).toInt()
}

public fun CryptCATAllocSortedMemberInfo(hcatalog: Foundation.HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAllocSortedMemberInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pwszreferencetag))
}

public fun CryptCATCDFClose(pcdf: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFClose", longArrayOf(pcdf)).toInt()
}

public fun CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFEnumAttributes", longArrayOf(pcdf, pmember, pprevattr, Win32DynamicFfi.objectSlot(pfnparseerror)))
}

public fun CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: PCWSTR, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFEnumAttributesWithCDFTag", longArrayOf(pcdf, pwszmembertag, pmember, pprevattr, Win32DynamicFfi.objectSlot(pfnparseerror)))
}

public fun CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFEnumCatAttributes", longArrayOf(pcdf, pprevattr, Win32DynamicFfi.objectSlot(pfnparseerror)))
}

public fun CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFEnumMembers", longArrayOf(pcdf, pprevmember, Win32DynamicFfi.objectSlot(pfnparseerror)))
}

public fun CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: PWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK, ppmember: Long, fcontinueonerror: BOOL, pvreserved: Long): PWSTR {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFEnumMembersByCDFTagEx", longArrayOf(pcdf, pwszprevcdftag, Win32DynamicFfi.objectSlot(pfnparseerror), ppmember, fcontinueonerror.toLong(), pvreserved))
}

public fun CryptCATCDFOpen(pwszfilepath: PCWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCDFOpen", longArrayOf(pwszfilepath, Win32DynamicFfi.objectSlot(pfnparseerror)))
}

public fun CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATCatalogInfoFromContext", longArrayOf(hcatinfo, pscatinfo, dwflags.toLong())).toInt()
}

public fun CryptCATClose(hcatalog: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATClose", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog))).toInt()
}

public fun CryptCATEnumerateAttr(hcatalog: Foundation.HANDLE, pcatmember: Long, pprevattr: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateAttr", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pcatmember, pprevattr))
}

public fun CryptCATEnumerateCatAttr(hcatalog: Foundation.HANDLE, pprevattr: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateCatAttr", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pprevattr))
}

public fun CryptCATEnumerateMember(hcatalog: Foundation.HANDLE, pprevmember: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateMember", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pprevmember))
}

public fun CryptCATFreeSortedMemberInfo(hcatalog: Foundation.HANDLE, pcatmember: Long) {
    Win32DynamicFfi.invoke("wintrust.dll", "CryptCATFreeSortedMemberInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pcatmember))
}

public fun CryptCATGetAttrInfo(hcatalog: Foundation.HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetAttrInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pcatmember, pwszreferencetag))
}

public fun CryptCATGetCatAttrInfo(hcatalog: Foundation.HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetCatAttrInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pwszreferencetag))
}

public fun CryptCATGetMemberInfo(hcatalog: Foundation.HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetMemberInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pwszreferencetag))
}

public fun CryptCATHandleFromStore(pcatstore: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wintrust.dll", "CryptCATHandleFromStore", longArrayOf(pcatstore))
    return Foundation.HANDLE()
}

public fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wintrust.dll", "CryptCATOpen", longArrayOf(pwszfilename, fdwopenflags.toLong(), hprov.toLong(), dwpublicversion.toLong(), dwencodingtype.toLong()))
    return Foundation.HANDLE()
}

public fun CryptCATPersistStore(hcatalog: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPersistStore", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog))).toInt()
}

public fun CryptCATPutAttrInfo(hcatalog: Foundation.HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutAttrInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pcatmember, pwszreferencetag, dwattrtypeandaction.toLong(), cbdata.toLong(), pbdata))
}

public fun CryptCATPutCatAttrInfo(hcatalog: Foundation.HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutCatAttrInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pwszreferencetag, dwattrtypeandaction.toLong(), cbdata.toLong(), pbdata))
}

public fun CryptCATPutMemberInfo(hcatalog: Foundation.HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutMemberInfo", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog), pwszfilename, pwszreferencetag, pgsubjecttype, dwcertversion.toLong(), cbsipindirectdata.toLong(), pbsipindirectdata))
}

public fun CryptCATStoreFromHandle(hcatalog: Foundation.HANDLE): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATStoreFromHandle", longArrayOf(Win32DynamicFfi.objectSlot(hcatalog)))
}

public fun IsCatalogFile(hfile: Foundation.HANDLE, pwszfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "IsCatalogFile", longArrayOf(Win32DynamicFfi.objectSlot(hfile), pwszfilename)).toInt()
}

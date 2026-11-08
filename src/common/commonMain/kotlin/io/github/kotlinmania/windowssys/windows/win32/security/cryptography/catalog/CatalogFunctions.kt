package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

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

public fun CryptCATAdminCalcHashFromFileHandle(hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminCalcHashFromFileHandle", longArrayOf(hfile, pcbhash, pbhash, dwflags.toLong())).toInt()
}

public fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAdminCalcHashFromFileHandle2", longArrayOf(hcatadmin, hfile, pcbhash, pbhash, dwflags.toLong())).toInt()
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

public fun CryptCATAllocSortedMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATAllocSortedMemberInfo", longArrayOf(hcatalog, pwszreferencetag))
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

public fun CryptCATClose(hcatalog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATClose", longArrayOf(hcatalog)).toInt()
}

public fun CryptCATEnumerateAttr(hcatalog: HANDLE, pcatmember: Long, pprevattr: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateAttr", longArrayOf(hcatalog, pcatmember, pprevattr))
}

public fun CryptCATEnumerateCatAttr(hcatalog: HANDLE, pprevattr: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateCatAttr", longArrayOf(hcatalog, pprevattr))
}

public fun CryptCATEnumerateMember(hcatalog: HANDLE, pprevmember: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATEnumerateMember", longArrayOf(hcatalog, pprevmember))
}

public fun CryptCATFreeSortedMemberInfo(hcatalog: HANDLE, pcatmember: Long) {
    Win32DynamicFfi.invoke("wintrust.dll", "CryptCATFreeSortedMemberInfo", longArrayOf(hcatalog, pcatmember))
}

public fun CryptCATGetAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetAttrInfo", longArrayOf(hcatalog, pcatmember, pwszreferencetag))
}

public fun CryptCATGetCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetCatAttrInfo", longArrayOf(hcatalog, pwszreferencetag))
}

public fun CryptCATGetMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATGetMemberInfo", longArrayOf(hcatalog, pwszreferencetag))
}

public fun CryptCATHandleFromStore(pcatstore: Long): HANDLE {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATHandleFromStore", longArrayOf(pcatstore))
}

public fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATOpen", longArrayOf(pwszfilename, fdwopenflags.toLong(), hprov.toLong(), dwpublicversion.toLong(), dwencodingtype.toLong()))
}

public fun CryptCATPersistStore(hcatalog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPersistStore", longArrayOf(hcatalog)).toInt()
}

public fun CryptCATPutAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutAttrInfo", longArrayOf(hcatalog, pcatmember, pwszreferencetag, dwattrtypeandaction.toLong(), cbdata.toLong(), pbdata))
}

public fun CryptCATPutCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutCatAttrInfo", longArrayOf(hcatalog, pwszreferencetag, dwattrtypeandaction.toLong(), cbdata.toLong(), pbdata))
}

public fun CryptCATPutMemberInfo(hcatalog: HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATPutMemberInfo", longArrayOf(hcatalog, pwszfilename, pwszreferencetag, pgsubjecttype, dwcertversion.toLong(), cbsipindirectdata.toLong(), pbsipindirectdata))
}

public fun CryptCATStoreFromHandle(hcatalog: HANDLE): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptCATStoreFromHandle", longArrayOf(hcatalog))
}

public fun IsCatalogFile(hfile: HANDLE, pwszfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "IsCatalogFile", longArrayOf(hfile, pwszfilename)).toInt()
}

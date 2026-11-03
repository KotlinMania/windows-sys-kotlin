package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: DRM_STATUS_MSG, param1: HRESULT, param2: Long, param3: Long): HRESULT
}

public fun DRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAcquireAdvisories", longArrayOf(hlicensestorage.toLong(), wszlicense, wszurl, pvcontext)).toInt()
}

public fun DRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: Long, ctemplates: UInt, pwsztemplateids: Long, wszurl: PCWSTR, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAcquireIssuanceLicenseTemplate", longArrayOf(hclient.toLong(), uflags.toLong(), pvreserved, ctemplates.toLong(), pwsztemplateids, wszurl, pvcontext)).toInt()
}

public fun DRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: PCWSTR, wszrequestedrights: PCWSTR, wszcustomdata: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAcquireLicense", longArrayOf(hsession.toLong(), uflags.toLong(), wszgroupidentitycredential, wszrequestedrights, wszcustomdata, wszurl, pvcontext)).toInt()
}

public fun DRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: Long, pvcontext: Long, hparentwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMActivate", longArrayOf(hclient.toLong(), uflags.toLong(), ulangid.toLong(), pactservinfo, pvcontext, Win32DynamicFfi.objectSlot(hparentwnd))).toInt()
}

public fun DRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAddLicense", longArrayOf(hlicensestorage.toLong(), uflags.toLong(), wszlicense)).toInt()
}

public fun DRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAddRightWithUser", longArrayOf(hissuancelicense.toLong(), hright.toLong(), huser.toLong())).toInt()
}

public fun DRMAttest(henablingprincipal: UInt, wszdata: PCWSTR, etype: DRMATTESTTYPE, pcattestedblob: Long, wszattestedblob: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMAttest", longArrayOf(henablingprincipal.toLong(), wszdata, etype.toLong(), pcattestedblob, wszattestedblob)).toInt()
}

public fun DRMCheckSecurity(henv: UInt, clevel: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCheckSecurity", longArrayOf(henv.toLong(), clevel.toLong())).toInt()
}

public fun DRMClearAllRights(hissuancelicense: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMClearAllRights", longArrayOf(hissuancelicense.toLong())).toInt()
}

public fun DRMCloseEnvironmentHandle(henv: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCloseEnvironmentHandle", longArrayOf(henv.toLong())).toInt()
}

public fun DRMCloseHandle(handle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCloseHandle", longArrayOf(handle.toLong())).toInt()
}

public fun DRMClosePubHandle(hpub: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMClosePubHandle", longArrayOf(hpub.toLong())).toInt()
}

public fun DRMCloseQueryHandle(hquery: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCloseQueryHandle", longArrayOf(hquery.toLong())).toInt()
}

public fun DRMCloseSession(hsession: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCloseSession", longArrayOf(hsession.toLong())).toInt()
}

public fun DRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: Long, pcchain: Long, wszchain: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMConstructCertificateChain", longArrayOf(ccertificates.toLong(), rgwszcertificates, pcchain, wszchain)).toInt()
}

public fun DRMCreateBoundLicense(henv: UInt, pparams: Long, wszlicensechain: PCWSTR, phboundlicense: Long, pherrorlog: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateBoundLicense", longArrayOf(henv.toLong(), pparams, wszlicensechain, phboundlicense, pherrorlog)).toInt()
}

public fun DRMCreateClientSession(pfncallback: DRMCALLBACK, ucallbackversion: UInt, wszgroupidprovidertype: PCWSTR, wszgroupid: PCWSTR, phclient: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateClientSession", longArrayOf(Win32DynamicFfi.objectSlot(pfncallback), ucallbackversion.toLong(), wszgroupidprovidertype, wszgroupid, phclient)).toInt()
}

public fun DRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phdecryptor: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateEnablingBitsDecryptor", longArrayOf(hboundlicense.toLong(), wszright, hauxlib.toLong(), wszauxplug, phdecryptor)).toInt()
}

public fun DRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phencryptor: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateEnablingBitsEncryptor", longArrayOf(hboundlicense.toLong(), wszright, hauxlib.toLong(), wszauxplug, phencryptor)).toInt()
}

public fun DRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: PCWSTR, pidprincipal: Long, wszcredentials: PCWSTR, phenablingprincipal: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateEnablingPrincipal", longArrayOf(henv.toLong(), hlibrary.toLong(), wszobject, pidprincipal, wszcredentials, phenablingprincipal)).toInt()
}

public fun DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: PCWSTR, wszreferralinfourl: PCWSTR, howner: UInt, wszissuancelicense: PCWSTR, hboundlicense: UInt, phissuancelicense: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateIssuanceLicense", longArrayOf(psttimefrom, psttimeuntil, wszreferralinfoname, wszreferralinfourl, howner.toLong(), wszissuancelicense, hboundlicense.toLong(), phissuancelicense)).toInt()
}

public fun DRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: PCWSTR, phlicensestorage: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateLicenseStorageSession", longArrayOf(henv.toLong(), hdefaultlibrary.toLong(), hclient.toLong(), uflags.toLong(), wszissuancelicense, phlicensestorage)).toInt()
}

public fun DRMCreateRight(wszrightname: PCWSTR, pstfrom: Long, pstuntil: Long, cextendedinfo: UInt, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateRight", longArrayOf(wszrightname, pstfrom, pstuntil, cextendedinfo.toLong(), pwszextendedinfoname, pwszextendedinfovalue, phright)).toInt()
}

public fun DRMCreateUser(wszusername: PCWSTR, wszuserid: PCWSTR, wszuseridtype: PCWSTR, phuser: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMCreateUser", longArrayOf(wszusername, wszuserid, wszuseridtype, phuser)).toInt()
}

public fun DRMDecode(wszalgid: PCWSTR, wszencodedstring: PCWSTR, pudecodeddatalen: Long, pbdecodeddata: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDecode", longArrayOf(wszalgid, wszencodedstring, pudecodeddatalen, pbdecodeddata)).toInt()
}

public fun DRMDeconstructCertificateChain(wszchain: PCWSTR, iwhich: UInt, pccert: Long, wszcert: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDeconstructCertificateChain", longArrayOf(wszchain, iwhich.toLong(), pccert, wszcert)).toInt()
}

public fun DRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDecrypt", longArrayOf(hcryptoprovider.toLong(), iposition.toLong(), cnuminbytes.toLong(), pbindata, pcnumoutbytes, pboutdata)).toInt()
}

public fun DRMDeleteLicense(hsession: UInt, wszlicenseid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDeleteLicense", longArrayOf(hsession.toLong(), wszlicenseid)).toInt()
}

public fun DRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDuplicateEnvironmentHandle", longArrayOf(htocopy.toLong(), phcopy)).toInt()
}

public fun DRMDuplicateHandle(htocopy: UInt, phcopy: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDuplicateHandle", longArrayOf(htocopy.toLong(), phcopy)).toInt()
}

public fun DRMDuplicatePubHandle(hpubin: UInt, phpubout: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDuplicatePubHandle", longArrayOf(hpubin.toLong(), phpubout)).toInt()
}

public fun DRMDuplicateSession(hsessionin: UInt, phsessionout: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMDuplicateSession", longArrayOf(hsessionin.toLong(), phsessionout)).toInt()
}

public fun DRMEncode(wszalgid: PCWSTR, udatalen: UInt, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMEncode", longArrayOf(wszalgid, udatalen.toLong(), pbdecodeddata, puencodedstringlen, wszencodedstring)).toInt()
}

public fun DRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMEncrypt", longArrayOf(hcryptoprovider.toLong(), iposition.toLong(), cnuminbytes.toLong(), pbindata, pcnumoutbytes, pboutdata)).toInt()
}

public fun DRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMEnumerateLicense", longArrayOf(hsession.toLong(), uflags.toLong(), uindex.toLong(), pfsharedflag, pucertificatedatalen, wszcertificatedata)).toInt()
}

public fun DRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: Long, wszname: PWSTR, puvaluelength: Long, wszvalue: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetApplicationSpecificData", longArrayOf(hissuancelicense.toLong(), uindex.toLong(), punamelength, wszname, puvaluelength, wszvalue)).toInt()
}

public fun DRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetBoundLicenseAttribute", longArrayOf(hqueryroot.toLong(), wszattribute, iwhich.toLong(), peencoding, pcbuffer, pbbuffer)).toInt()
}

public fun DRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: PCWSTR, pcattributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetBoundLicenseAttributeCount", longArrayOf(hqueryroot.toLong(), wszattribute, pcattributes)).toInt()
}

public fun DRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iwhich: UInt, phsubobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetBoundLicenseObject", longArrayOf(hqueryroot.toLong(), wszsubobjecttype, iwhich.toLong(), phsubobject)).toInt()
}

public fun DRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetBoundLicenseObjectCount", longArrayOf(hqueryroot.toLong(), wszsubobjecttype, pcsubobjects)).toInt()
}

public fun DRMGetCertificateChainCount(wszchain: PCWSTR, pccertcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetCertificateChainCount", longArrayOf(wszchain, pccertcount)).toInt()
}

public fun DRMGetClientVersion(pdrmclientversioninfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetClientVersion", longArrayOf(pdrmclientversioninfo)).toInt()
}

public fun DRMGetEnvironmentInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetEnvironmentInfo", longArrayOf(handle.toLong(), wszattribute, peencoding, pcbuffer, pbbuffer)).toInt()
}

public fun DRMGetInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetInfo", longArrayOf(handle.toLong(), wszattribute, peencoding, pcbuffer, pbbuffer)).toInt()
}

public fun DRMGetIntervalTime(hissuancelicense: UInt, pcdays: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetIntervalTime", longArrayOf(hissuancelicense.toLong(), pcdays)).toInt()
}

public fun DRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: Long, psttimeuntil: Long, uflags: UInt, pudistributionpointnamelength: Long, wszdistributionpointname: PWSTR, pudistributionpointurllength: Long, wszdistributionpointurl: PWSTR, phowner: Long, pfofficial: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetIssuanceLicenseInfo", longArrayOf(hissuancelicense.toLong(), psttimefrom, psttimeuntil, uflags.toLong(), pudistributionpointnamelength, wszdistributionpointname, pudistributionpointurllength, wszdistributionpointurl, phowner, pfofficial)).toInt()
}

public fun DRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetIssuanceLicenseTemplate", longArrayOf(hissuancelicense.toLong(), puissuancelicensetemplatelength, wszissuancelicensetemplate)).toInt()
}

public fun DRMGetMetaData(hissuancelicense: UInt, pucontentidlength: Long, wszcontentid: PWSTR, pucontentidtypelength: Long, wszcontentidtype: PWSTR, puskuidlength: Long, wszskuid: PWSTR, puskuidtypelength: Long, wszskuidtype: PWSTR, pucontenttypelength: Long, wszcontenttype: PWSTR, pucontentnamelength: Long, wszcontentname: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetMetaData", longArrayOf(hissuancelicense.toLong(), pucontentidlength, wszcontentid, pucontentidtypelength, wszcontentidtype, puskuidlength, wszskuid, puskuidtypelength, wszskuidtype, pucontenttypelength, wszcontenttype, pucontentnamelength, wszcontentname)).toInt()
}

public fun DRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: Long, punamelength: Long, wszname: PWSTR, pudescriptionlength: Long, wszdescription: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetNameAndDescription", longArrayOf(hissuancelicense.toLong(), uindex.toLong(), pulcid, punamelength, wszname, pudescriptionlength, wszdescription)).toInt()
}

public fun DRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: Long, wszownerlicense: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetOwnerLicense", longArrayOf(hissuancelicense.toLong(), puownerlicenselength, wszownerlicense)).toInt()
}

public fun DRMGetProcAddress(hlibrary: UInt, wszprocname: PCWSTR, ppfnprocaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetProcAddress", longArrayOf(hlibrary.toLong(), wszprocname, ppfnprocaddress)).toInt()
}

public fun DRMGetRevocationPoint(hissuancelicense: UInt, puidlength: Long, wszid: PWSTR, puidtypelength: Long, wszidtype: PWSTR, puurllength: Long, wszrl: PWSTR, pstfrequency: Long, punamelength: Long, wszname: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetRevocationPoint", longArrayOf(hissuancelicense.toLong(), puidlength, wszid, puidtypelength, wszidtype, puurllength, wszrl, pstfrequency, punamelength, wszname, pupublickeylength, wszpublickey)).toInt()
}

public fun DRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: Long, wszextendedinfoname: PWSTR, puextendedinfovaluelength: Long, wszextendedinfovalue: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetRightExtendedInfo", longArrayOf(hright.toLong(), uindex.toLong(), puextendedinfonamelength, wszextendedinfoname, puextendedinfovaluelength, wszextendedinfovalue)).toInt()
}

public fun DRMGetRightInfo(hright: UInt, purightnamelength: Long, wszrightname: PWSTR, pstfrom: Long, pstuntil: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetRightInfo", longArrayOf(hright.toLong(), purightnamelength, wszrightname, pstfrom, pstuntil)).toInt()
}

public fun DRMGetSecurityProvider(uflags: UInt, putypelen: Long, wsztype: PWSTR, pupathlen: Long, wszpath: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetSecurityProvider", longArrayOf(uflags.toLong(), putypelen, wsztype, pupathlen, wszpath)).toInt()
}

public fun DRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: PCWSTR, puserviceurllength: Long, wszserviceurl: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetServiceLocation", longArrayOf(hclient.toLong(), uservicetype.toLong(), uservicelocation.toLong(), wszissuancelicense, puserviceurllength, wszserviceurl)).toInt()
}

public fun DRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, wszclientlicensorcertificate: PCWSTR, pfncallback: DRMCALLBACK, wszurl: PCWSTR, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetSignedIssuanceLicense", longArrayOf(henv.toLong(), hissuancelicense.toLong(), uflags.toLong(), pbsymkey, cbsymkey.toLong(), wszsymkeytype, wszclientlicensorcertificate, Win32DynamicFfi.objectSlot(pfncallback), wszurl, pvcontext)).toInt()
}

public fun DRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, pvreserved: Long, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: DRMCALLBACK, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetSignedIssuanceLicenseEx", longArrayOf(henv.toLong(), hissuancelicense.toLong(), uflags.toLong(), pbsymkey, cbsymkey.toLong(), wszsymkeytype, pvreserved, henablingprincipal.toLong(), hboundlicenseclc.toLong(), Win32DynamicFfi.objectSlot(pfncallback), pvcontext)).toInt()
}

public fun DRMGetTime(henv: UInt, etimeridtype: DRMTIMETYPE, potimeobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetTime", longArrayOf(henv.toLong(), etimeridtype.toLong(), potimeobject)).toInt()
}

public fun DRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUnboundLicenseAttribute", longArrayOf(hqueryroot.toLong(), wszattributetype, iwhich.toLong(), peencoding, pcbuffer, pbbuffer)).toInt()
}

public fun DRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: PCWSTR, pcattributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUnboundLicenseAttributeCount", longArrayOf(hqueryroot.toLong(), wszattributetype, pcattributes)).toInt()
}

public fun DRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iindex: UInt, phsubquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUnboundLicenseObject", longArrayOf(hqueryroot.toLong(), wszsubobjecttype, iindex.toLong(), phsubquery)).toInt()
}

public fun DRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUnboundLicenseObjectCount", longArrayOf(hqueryroot.toLong(), wszsubobjecttype, pcsubobjects)).toInt()
}

public fun DRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: PWSTR, puminversionlength: Long, wszminversion: PWSTR, pumaxversionlength: Long, wszmaxversion: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR, pudigestalgorithmlength: Long, wszdigestalgorithm: PWSTR, pcbdigest: Long, pbdigest: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUsagePolicy", longArrayOf(hissuancelicense.toLong(), uindex.toLong(), peusagepolicytype, pfexclusion, punamelength, wszname, puminversionlength, wszminversion, pumaxversionlength, wszmaxversion, pupublickeylength, wszpublickey, pudigestalgorithmlength, wszdigestalgorithm, pcbdigest, pbdigest)).toInt()
}

public fun DRMGetUserInfo(huser: UInt, puusernamelength: Long, wszusername: PWSTR, puuseridlength: Long, wszuserid: PWSTR, puuseridtypelength: Long, wszuseridtype: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUserInfo", longArrayOf(huser.toLong(), puusernamelength, wszusername, puuseridlength, wszuserid, puuseridtypelength, wszuseridtype)).toInt()
}

public fun DRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUserRights", longArrayOf(hissuancelicense.toLong(), huser.toLong(), uindex.toLong(), phright)).toInt()
}

public fun DRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMGetUsers", longArrayOf(hissuancelicense.toLong(), uindex.toLong(), phuser)).toInt()
}

public fun DRMInitEnvironment(esecurityprovidertype: DRMSECURITYPROVIDERTYPE, especification: DRMSPECTYPE, wszsecurityprovider: PCWSTR, wszmanifestcredentials: PCWSTR, wszmachinecredentials: PCWSTR, phenv: Long, phdefaultlibrary: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMInitEnvironment", longArrayOf(esecurityprovidertype.toLong(), especification.toLong(), wszsecurityprovider, wszmanifestcredentials, wszmachinecredentials, phenv, phdefaultlibrary)).toInt()
}

public fun DRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMIsActivated", longArrayOf(hclient.toLong(), uflags.toLong(), pactservinfo)).toInt()
}

public fun DRMIsWindowProtected(hwnd: Foundation.HWND, pfprotected: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMIsWindowProtected", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pfprotected)).toInt()
}

public fun DRMLoadLibrary(henv: UInt, especification: DRMSPECTYPE, wszlibraryprovider: PCWSTR, wszcredentials: PCWSTR, phlibrary: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMLoadLibrary", longArrayOf(henv.toLong(), especification.toLong(), wszlibraryprovider, wszcredentials, phlibrary)).toInt()
}

public fun DRMParseUnboundLicense(wszcertificate: PCWSTR, phqueryroot: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMParseUnboundLicense", longArrayOf(wszcertificate, phqueryroot)).toInt()
}

public fun DRMRegisterContent(fregister: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMRegisterContent", longArrayOf(fregister.toLong())).toInt()
}

public fun DRMRegisterProtectedWindow(henv: UInt, hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMRegisterProtectedWindow", longArrayOf(henv.toLong(), Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DRMRegisterRevocationList(henv: UInt, wszrevocationlist: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMRegisterRevocationList", longArrayOf(henv.toLong(), wszrevocationlist)).toInt()
}

public fun DRMRepair(): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMRepair", longArrayOf()).toInt()
}

public fun DRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: BOOL, wszname: PCWSTR, wszvalue: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetApplicationSpecificData", longArrayOf(hissuancelicense.toLong(), fdelete.toLong(), wszname, wszvalue)).toInt()
}

public fun DRMSetGlobalOptions(eglobaloptions: DRMGLOBALOPTIONS, pvdata: Long, dwlen: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetGlobalOptions", longArrayOf(eglobaloptions.toLong(), pvdata, dwlen.toLong())).toInt()
}

public fun DRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetIntervalTime", longArrayOf(hissuancelicense.toLong(), cdays.toLong())).toInt()
}

public fun DRMSetMetaData(hissuancelicense: UInt, wszcontentid: PCWSTR, wszcontentidtype: PCWSTR, wszskuid: PCWSTR, wszskuidtype: PCWSTR, wszcontenttype: PCWSTR, wszcontentname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetMetaData", longArrayOf(hissuancelicense.toLong(), wszcontentid, wszcontentidtype, wszskuid, wszskuidtype, wszcontenttype, wszcontentname)).toInt()
}

public fun DRMSetNameAndDescription(hissuancelicense: UInt, fdelete: BOOL, lcid: UInt, wszname: PCWSTR, wszdescription: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetNameAndDescription", longArrayOf(hissuancelicense.toLong(), fdelete.toLong(), lcid.toLong(), wszname, wszdescription)).toInt()
}

public fun DRMSetRevocationPoint(hissuancelicense: UInt, fdelete: BOOL, wszid: PCWSTR, wszidtype: PCWSTR, wszurl: PCWSTR, pstfrequency: Long, wszname: PCWSTR, wszpublickey: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetRevocationPoint", longArrayOf(hissuancelicense.toLong(), fdelete.toLong(), wszid, wszidtype, wszurl, pstfrequency, wszname, wszpublickey)).toInt()
}

public fun DRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DRM_USAGEPOLICY_TYPE, fdelete: BOOL, fexclusion: BOOL, wszname: PCWSTR, wszminversion: PCWSTR, wszmaxversion: PCWSTR, wszpublickey: PCWSTR, wszdigestalgorithm: PCWSTR, pbdigest: Long, cbdigest: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMSetUsagePolicy", longArrayOf(hissuancelicense.toLong(), eusagepolicytype.toLong(), fdelete.toLong(), fexclusion.toLong(), wszname, wszminversion, wszmaxversion, wszpublickey, wszdigestalgorithm, pbdigest, cbdigest.toLong())).toInt()
}

public fun DRMVerify(wszdata: PCWSTR, pcattesteddata: Long, wszattesteddata: PWSTR, petype: Long, pcprincipal: Long, wszprincipal: PWSTR, pcmanifest: Long, wszmanifest: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdrm.dll", "DRMVerify", longArrayOf(wszdata, pcattesteddata, wszattesteddata, petype, pcprincipal, wszprincipal, pcmanifest, wszmanifest)).toInt()
}

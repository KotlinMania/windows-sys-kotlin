@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAcquireAdvisories(hlicensestorage, wszlicense.toCPointer<ByteVar>(), wszurl.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun DRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: Long, ctemplates: UInt, pwsztemplateids: Long, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAcquireIssuanceLicenseTemplate(hclient, uflags, pvreserved.toCPointer<ByteVar>(), ctemplates, pwsztemplateids.toCPointer<ByteVar>(), wszurl.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun DRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: PCWSTR, wszrequestedrights: PCWSTR, wszcustomdata: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAcquireLicense(hsession, uflags, wszgroupidentitycredential.toCPointer<ByteVar>(), wszrequestedrights.toCPointer<ByteVar>(), wszcustomdata.toCPointer<ByteVar>(), wszurl.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun DRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: Long, pvcontext: Long, hparentwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMActivate(hclient, uflags, ulangid, pactservinfo.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), hparentwnd.toCPointer<ByteVar>())

public actual fun DRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAddLicense(hlicensestorage, uflags, wszlicense.toCPointer<ByteVar>())

public actual fun DRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAddRightWithUser(hissuancelicense, hright, huser)

public actual fun DRMAttest(henablingprincipal: UInt, wszdata: PCWSTR, etype: DRMATTESTTYPE, pcattestedblob: Long, wszattestedblob: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMAttest(henablingprincipal, wszdata.toCPointer<ByteVar>(), etype, pcattestedblob.toCPointer<ByteVar>(), wszattestedblob.toCPointer<ByteVar>())

public actual fun DRMCheckSecurity(henv: UInt, clevel: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCheckSecurity(henv, clevel)

public actual fun DRMClearAllRights(hissuancelicense: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMClearAllRights(hissuancelicense)

public actual fun DRMCloseEnvironmentHandle(henv: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCloseEnvironmentHandle(henv)

public actual fun DRMCloseHandle(handle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCloseHandle(handle)

public actual fun DRMClosePubHandle(hpub: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMClosePubHandle(hpub)

public actual fun DRMCloseQueryHandle(hquery: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCloseQueryHandle(hquery)

public actual fun DRMCloseSession(hsession: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCloseSession(hsession)

public actual fun DRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: Long, pcchain: Long, wszchain: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMConstructCertificateChain(ccertificates, rgwszcertificates.toCPointer<ByteVar>(), pcchain.toCPointer<ByteVar>(), wszchain.toCPointer<ByteVar>())

public actual fun DRMCreateBoundLicense(henv: UInt, pparams: Long, wszlicensechain: PCWSTR, phboundlicense: Long, pherrorlog: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateBoundLicense(henv, pparams.toCPointer<ByteVar>(), wszlicensechain.toCPointer<ByteVar>(), phboundlicense.toCPointer<ByteVar>(), pherrorlog.toCPointer<ByteVar>())

public actual fun DRMCreateClientSession(pfncallback: DRMCALLBACK, ucallbackversion: UInt, wszgroupidprovidertype: PCWSTR, wszgroupid: PCWSTR, phclient: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateClientSession(pfncallback.toLong().toCPointer<ByteVar>(), ucallbackversion, wszgroupidprovidertype.toCPointer<ByteVar>(), wszgroupid.toCPointer<ByteVar>(), phclient.toCPointer<ByteVar>())

public actual fun DRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phdecryptor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsDecryptor(hboundlicense, wszright.toCPointer<ByteVar>(), hauxlib, wszauxplug.toCPointer<ByteVar>(), phdecryptor.toCPointer<ByteVar>())

public actual fun DRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phencryptor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsEncryptor(hboundlicense, wszright.toCPointer<ByteVar>(), hauxlib, wszauxplug.toCPointer<ByteVar>(), phencryptor.toCPointer<ByteVar>())

public actual fun DRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: PCWSTR, pidprincipal: Long, wszcredentials: PCWSTR, phenablingprincipal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingPrincipal(henv, hlibrary, wszobject.toCPointer<ByteVar>(), pidprincipal.toCPointer<ByteVar>(), wszcredentials.toCPointer<ByteVar>(), phenablingprincipal.toCPointer<ByteVar>())

public actual fun DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: PCWSTR, wszreferralinfourl: PCWSTR, howner: UInt, wszissuancelicense: PCWSTR, hboundlicense: UInt, phissuancelicense: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateIssuanceLicense(psttimefrom.toCPointer<ByteVar>(), psttimeuntil.toCPointer<ByteVar>(), wszreferralinfoname.toCPointer<ByteVar>(), wszreferralinfourl.toCPointer<ByteVar>(), howner, wszissuancelicense.toCPointer<ByteVar>(), hboundlicense, phissuancelicense.toCPointer<ByteVar>())

public actual fun DRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: PCWSTR, phlicensestorage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateLicenseStorageSession(henv, hdefaultlibrary, hclient, uflags, wszissuancelicense.toCPointer<ByteVar>(), phlicensestorage.toCPointer<ByteVar>())

public actual fun DRMCreateRight(wszrightname: PCWSTR, pstfrom: Long, pstuntil: Long, cextendedinfo: UInt, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateRight(wszrightname.toCPointer<ByteVar>(), pstfrom.toCPointer<ByteVar>(), pstuntil.toCPointer<ByteVar>(), cextendedinfo, pwszextendedinfoname.toCPointer<ByteVar>(), pwszextendedinfovalue.toCPointer<ByteVar>(), phright.toCPointer<ByteVar>())

public actual fun DRMCreateUser(wszusername: PCWSTR, wszuserid: PCWSTR, wszuseridtype: PCWSTR, phuser: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMCreateUser(wszusername.toCPointer<ByteVar>(), wszuserid.toCPointer<ByteVar>(), wszuseridtype.toCPointer<ByteVar>(), phuser.toCPointer<ByteVar>())

public actual fun DRMDecode(wszalgid: PCWSTR, wszencodedstring: PCWSTR, pudecodeddatalen: Long, pbdecodeddata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDecode(wszalgid.toCPointer<ByteVar>(), wszencodedstring.toCPointer<ByteVar>(), pudecodeddatalen.toCPointer<ByteVar>(), pbdecodeddata.toCPointer<ByteVar>())

public actual fun DRMDeconstructCertificateChain(wszchain: PCWSTR, iwhich: UInt, pccert: Long, wszcert: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDeconstructCertificateChain(wszchain.toCPointer<ByteVar>(), iwhich, pccert.toCPointer<ByteVar>(), wszcert.toCPointer<ByteVar>())

public actual fun DRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDecrypt(hcryptoprovider, iposition, cnuminbytes, pbindata.toCPointer<ByteVar>(), pcnumoutbytes.toCPointer<ByteVar>(), pboutdata.toCPointer<ByteVar>())

public actual fun DRMDeleteLicense(hsession: UInt, wszlicenseid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDeleteLicense(hsession, wszlicenseid.toCPointer<ByteVar>())

public actual fun DRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateEnvironmentHandle(htocopy, phcopy.toCPointer<ByteVar>())

public actual fun DRMDuplicateHandle(htocopy: UInt, phcopy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateHandle(htocopy, phcopy.toCPointer<ByteVar>())

public actual fun DRMDuplicatePubHandle(hpubin: UInt, phpubout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDuplicatePubHandle(hpubin, phpubout.toCPointer<ByteVar>())

public actual fun DRMDuplicateSession(hsessionin: UInt, phsessionout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateSession(hsessionin, phsessionout.toCPointer<ByteVar>())

public actual fun DRMEncode(wszalgid: PCWSTR, udatalen: UInt, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMEncode(wszalgid.toCPointer<ByteVar>(), udatalen, pbdecodeddata.toCPointer<ByteVar>(), puencodedstringlen.toCPointer<ByteVar>(), wszencodedstring.toCPointer<ByteVar>())

public actual fun DRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMEncrypt(hcryptoprovider, iposition, cnuminbytes, pbindata.toCPointer<ByteVar>(), pcnumoutbytes.toCPointer<ByteVar>(), pboutdata.toCPointer<ByteVar>())

public actual fun DRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMEnumerateLicense(hsession, uflags, uindex, pfsharedflag.toCPointer<ByteVar>(), pucertificatedatalen.toCPointer<ByteVar>(), wszcertificatedata.toCPointer<ByteVar>())

public actual fun DRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: Long, wszname: PWSTR, puvaluelength: Long, wszvalue: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetApplicationSpecificData(hissuancelicense, uindex, punamelength.toCPointer<ByteVar>(), wszname.toCPointer<ByteVar>(), puvaluelength.toCPointer<ByteVar>(), wszvalue.toCPointer<ByteVar>())

public actual fun DRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttribute(hqueryroot, wszattribute.toCPointer<ByteVar>(), iwhich, peencoding.toCPointer<ByteVar>(), pcbuffer.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>())

public actual fun DRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: PCWSTR, pcattributes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttributeCount(hqueryroot, wszattribute.toCPointer<ByteVar>(), pcattributes.toCPointer<ByteVar>())

public actual fun DRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iwhich: UInt, phsubobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObject(hqueryroot, wszsubobjecttype.toCPointer<ByteVar>(), iwhich, phsubobject.toCPointer<ByteVar>())

public actual fun DRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObjectCount(hqueryroot, wszsubobjecttype.toCPointer<ByteVar>(), pcsubobjects.toCPointer<ByteVar>())

public actual fun DRMGetCertificateChainCount(wszchain: PCWSTR, pccertcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetCertificateChainCount(wszchain.toCPointer<ByteVar>(), pccertcount.toCPointer<ByteVar>())

public actual fun DRMGetClientVersion(pdrmclientversioninfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetClientVersion(pdrmclientversioninfo.toCPointer<ByteVar>())

public actual fun DRMGetEnvironmentInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetEnvironmentInfo(handle, wszattribute.toCPointer<ByteVar>(), peencoding.toCPointer<ByteVar>(), pcbuffer.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>())

public actual fun DRMGetInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetInfo(handle, wszattribute.toCPointer<ByteVar>(), peencoding.toCPointer<ByteVar>(), pcbuffer.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>())

public actual fun DRMGetIntervalTime(hissuancelicense: UInt, pcdays: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetIntervalTime(hissuancelicense, pcdays.toCPointer<ByteVar>())

public actual fun DRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: Long, psttimeuntil: Long, uflags: UInt, pudistributionpointnamelength: Long, wszdistributionpointname: PWSTR, pudistributionpointurllength: Long, wszdistributionpointurl: PWSTR, phowner: Long, pfofficial: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseInfo(hissuancelicense, psttimefrom.toCPointer<ByteVar>(), psttimeuntil.toCPointer<ByteVar>(), uflags, pudistributionpointnamelength.toCPointer<ByteVar>(), wszdistributionpointname.toCPointer<ByteVar>(), pudistributionpointurllength.toCPointer<ByteVar>(), wszdistributionpointurl.toCPointer<ByteVar>(), phowner.toCPointer<ByteVar>(), pfofficial.toCPointer<ByteVar>())

public actual fun DRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseTemplate(hissuancelicense, puissuancelicensetemplatelength.toCPointer<ByteVar>(), wszissuancelicensetemplate.toCPointer<ByteVar>())

public actual fun DRMGetMetaData(hissuancelicense: UInt, pucontentidlength: Long, wszcontentid: PWSTR, pucontentidtypelength: Long, wszcontentidtype: PWSTR, puskuidlength: Long, wszskuid: PWSTR, puskuidtypelength: Long, wszskuidtype: PWSTR, pucontenttypelength: Long, wszcontenttype: PWSTR, pucontentnamelength: Long, wszcontentname: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetMetaData(hissuancelicense, pucontentidlength.toCPointer<ByteVar>(), wszcontentid.toCPointer<ByteVar>(), pucontentidtypelength.toCPointer<ByteVar>(), wszcontentidtype.toCPointer<ByteVar>(), puskuidlength.toCPointer<ByteVar>(), wszskuid.toCPointer<ByteVar>(), puskuidtypelength.toCPointer<ByteVar>(), wszskuidtype.toCPointer<ByteVar>(), pucontenttypelength.toCPointer<ByteVar>(), wszcontenttype.toCPointer<ByteVar>(), pucontentnamelength.toCPointer<ByteVar>(), wszcontentname.toCPointer<ByteVar>())

public actual fun DRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: Long, punamelength: Long, wszname: PWSTR, pudescriptionlength: Long, wszdescription: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetNameAndDescription(hissuancelicense, uindex, pulcid.toCPointer<ByteVar>(), punamelength.toCPointer<ByteVar>(), wszname.toCPointer<ByteVar>(), pudescriptionlength.toCPointer<ByteVar>(), wszdescription.toCPointer<ByteVar>())

public actual fun DRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: Long, wszownerlicense: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetOwnerLicense(hissuancelicense, puownerlicenselength.toCPointer<ByteVar>(), wszownerlicense.toCPointer<ByteVar>())

public actual fun DRMGetProcAddress(hlibrary: UInt, wszprocname: PCWSTR, ppfnprocaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetProcAddress(hlibrary, wszprocname.toCPointer<ByteVar>(), ppfnprocaddress.toCPointer<ByteVar>())

public actual fun DRMGetRevocationPoint(hissuancelicense: UInt, puidlength: Long, wszid: PWSTR, puidtypelength: Long, wszidtype: PWSTR, puurllength: Long, wszrl: PWSTR, pstfrequency: Long, punamelength: Long, wszname: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetRevocationPoint(hissuancelicense, puidlength.toCPointer<ByteVar>(), wszid.toCPointer<ByteVar>(), puidtypelength.toCPointer<ByteVar>(), wszidtype.toCPointer<ByteVar>(), puurllength.toCPointer<ByteVar>(), wszrl.toCPointer<ByteVar>(), pstfrequency.toCPointer<ByteVar>(), punamelength.toCPointer<ByteVar>(), wszname.toCPointer<ByteVar>(), pupublickeylength.toCPointer<ByteVar>(), wszpublickey.toCPointer<ByteVar>())

public actual fun DRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: Long, wszextendedinfoname: PWSTR, puextendedinfovaluelength: Long, wszextendedinfovalue: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetRightExtendedInfo(hright, uindex, puextendedinfonamelength.toCPointer<ByteVar>(), wszextendedinfoname.toCPointer<ByteVar>(), puextendedinfovaluelength.toCPointer<ByteVar>(), wszextendedinfovalue.toCPointer<ByteVar>())

public actual fun DRMGetRightInfo(hright: UInt, purightnamelength: Long, wszrightname: PWSTR, pstfrom: Long, pstuntil: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetRightInfo(hright, purightnamelength.toCPointer<ByteVar>(), wszrightname.toCPointer<ByteVar>(), pstfrom.toCPointer<ByteVar>(), pstuntil.toCPointer<ByteVar>())

public actual fun DRMGetSecurityProvider(uflags: UInt, putypelen: Long, wsztype: PWSTR, pupathlen: Long, wszpath: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetSecurityProvider(uflags, putypelen.toCPointer<ByteVar>(), wsztype.toCPointer<ByteVar>(), pupathlen.toCPointer<ByteVar>(), wszpath.toCPointer<ByteVar>())

public actual fun DRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: PCWSTR, puserviceurllength: Long, wszserviceurl: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetServiceLocation(hclient, uservicetype, uservicelocation, wszissuancelicense.toCPointer<ByteVar>(), puserviceurllength.toCPointer<ByteVar>(), wszserviceurl.toCPointer<ByteVar>())

public actual fun DRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, wszclientlicensorcertificate: PCWSTR, pfncallback: DRMCALLBACK, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicense(henv, hissuancelicense, uflags, pbsymkey.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype.toCPointer<ByteVar>(), wszclientlicensorcertificate.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), wszurl.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun DRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, pvreserved: Long, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: DRMCALLBACK, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicenseEx(henv, hissuancelicense, uflags, pbsymkey.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), henablingprincipal, hboundlicenseclc, pfncallback.toLong().toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun DRMGetTime(henv: UInt, etimeridtype: DRMTIMETYPE, potimeobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetTime(henv, etimeridtype, potimeobject.toCPointer<ByteVar>())

public actual fun DRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttribute(hqueryroot, wszattributetype.toCPointer<ByteVar>(), iwhich, peencoding.toCPointer<ByteVar>(), pcbuffer.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>())

public actual fun DRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: PCWSTR, pcattributes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttributeCount(hqueryroot, wszattributetype.toCPointer<ByteVar>(), pcattributes.toCPointer<ByteVar>())

public actual fun DRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iindex: UInt, phsubquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObject(hqueryroot, wszsubobjecttype.toCPointer<ByteVar>(), iindex, phsubquery.toCPointer<ByteVar>())

public actual fun DRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObjectCount(hqueryroot, wszsubobjecttype.toCPointer<ByteVar>(), pcsubobjects.toCPointer<ByteVar>())

public actual fun DRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: PWSTR, puminversionlength: Long, wszminversion: PWSTR, pumaxversionlength: Long, wszmaxversion: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR, pudigestalgorithmlength: Long, wszdigestalgorithm: PWSTR, pcbdigest: Long, pbdigest: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUsagePolicy(hissuancelicense, uindex, peusagepolicytype.toCPointer<ByteVar>(), pfexclusion.toCPointer<ByteVar>(), punamelength.toCPointer<ByteVar>(), wszname.toCPointer<ByteVar>(), puminversionlength.toCPointer<ByteVar>(), wszminversion.toCPointer<ByteVar>(), pumaxversionlength.toCPointer<ByteVar>(), wszmaxversion.toCPointer<ByteVar>(), pupublickeylength.toCPointer<ByteVar>(), wszpublickey.toCPointer<ByteVar>(), pudigestalgorithmlength.toCPointer<ByteVar>(), wszdigestalgorithm.toCPointer<ByteVar>(), pcbdigest.toCPointer<ByteVar>(), pbdigest.toCPointer<ByteVar>())

public actual fun DRMGetUserInfo(huser: UInt, puusernamelength: Long, wszusername: PWSTR, puuseridlength: Long, wszuserid: PWSTR, puuseridtypelength: Long, wszuseridtype: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUserInfo(huser, puusernamelength.toCPointer<ByteVar>(), wszusername.toCPointer<ByteVar>(), puuseridlength.toCPointer<ByteVar>(), wszuserid.toCPointer<ByteVar>(), puuseridtypelength.toCPointer<ByteVar>(), wszuseridtype.toCPointer<ByteVar>())

public actual fun DRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUserRights(hissuancelicense, huser, uindex, phright.toCPointer<ByteVar>())

public actual fun DRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMGetUsers(hissuancelicense, uindex, phuser.toCPointer<ByteVar>())

public actual fun DRMInitEnvironment(esecurityprovidertype: DRMSECURITYPROVIDERTYPE, especification: DRMSPECTYPE, wszsecurityprovider: PCWSTR, wszmanifestcredentials: PCWSTR, wszmachinecredentials: PCWSTR, phenv: Long, phdefaultlibrary: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.toCPointer<ByteVar>(), wszmanifestcredentials.toCPointer<ByteVar>(), wszmachinecredentials.toCPointer<ByteVar>(), phenv.toCPointer<ByteVar>(), phdefaultlibrary.toCPointer<ByteVar>())

public actual fun DRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMIsActivated(hclient, uflags, pactservinfo.toCPointer<ByteVar>())

public actual fun DRMIsWindowProtected(hwnd: HWND, pfprotected: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMIsWindowProtected(hwnd.toCPointer<ByteVar>(), pfprotected.toCPointer<ByteVar>())

public actual fun DRMLoadLibrary(henv: UInt, especification: DRMSPECTYPE, wszlibraryprovider: PCWSTR, wszcredentials: PCWSTR, phlibrary: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMLoadLibrary(henv, especification, wszlibraryprovider.toCPointer<ByteVar>(), wszcredentials.toCPointer<ByteVar>(), phlibrary.toCPointer<ByteVar>())

public actual fun DRMParseUnboundLicense(wszcertificate: PCWSTR, phqueryroot: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMParseUnboundLicense(wszcertificate.toCPointer<ByteVar>(), phqueryroot.toCPointer<ByteVar>())

public actual fun DRMRegisterContent(fregister: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMRegisterContent(fregister)

public actual fun DRMRegisterProtectedWindow(henv: UInt, hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMRegisterProtectedWindow(henv, hwnd.toCPointer<ByteVar>())

public actual fun DRMRegisterRevocationList(henv: UInt, wszrevocationlist: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMRegisterRevocationList(henv, wszrevocationlist.toCPointer<ByteVar>())

public actual fun DRMRepair(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMRepair()

public actual fun DRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: BOOL, wszname: PCWSTR, wszvalue: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetApplicationSpecificData(hissuancelicense, fdelete, wszname.toCPointer<ByteVar>(), wszvalue.toCPointer<ByteVar>())

public actual fun DRMSetGlobalOptions(eglobaloptions: DRMGLOBALOPTIONS, pvdata: Long, dwlen: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetGlobalOptions(eglobaloptions, pvdata.toCPointer<ByteVar>(), dwlen)

public actual fun DRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetIntervalTime(hissuancelicense, cdays)

public actual fun DRMSetMetaData(hissuancelicense: UInt, wszcontentid: PCWSTR, wszcontentidtype: PCWSTR, wszskuid: PCWSTR, wszskuidtype: PCWSTR, wszcontenttype: PCWSTR, wszcontentname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetMetaData(hissuancelicense, wszcontentid.toCPointer<ByteVar>(), wszcontentidtype.toCPointer<ByteVar>(), wszskuid.toCPointer<ByteVar>(), wszskuidtype.toCPointer<ByteVar>(), wszcontenttype.toCPointer<ByteVar>(), wszcontentname.toCPointer<ByteVar>())

public actual fun DRMSetNameAndDescription(hissuancelicense: UInt, fdelete: BOOL, lcid: UInt, wszname: PCWSTR, wszdescription: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetNameAndDescription(hissuancelicense, fdelete, lcid, wszname.toCPointer<ByteVar>(), wszdescription.toCPointer<ByteVar>())

public actual fun DRMSetRevocationPoint(hissuancelicense: UInt, fdelete: BOOL, wszid: PCWSTR, wszidtype: PCWSTR, wszurl: PCWSTR, pstfrequency: Long, wszname: PCWSTR, wszpublickey: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetRevocationPoint(hissuancelicense, fdelete, wszid.toCPointer<ByteVar>(), wszidtype.toCPointer<ByteVar>(), wszurl.toCPointer<ByteVar>(), pstfrequency.toCPointer<ByteVar>(), wszname.toCPointer<ByteVar>(), wszpublickey.toCPointer<ByteVar>())

public actual fun DRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DRM_USAGEPOLICY_TYPE, fdelete: BOOL, fexclusion: BOOL, wszname: PCWSTR, wszminversion: PCWSTR, wszmaxversion: PCWSTR, wszpublickey: PCWSTR, wszdigestalgorithm: PCWSTR, pbdigest: Long, cbdigest: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMSetUsagePolicy(hissuancelicense, eusagepolicytype, fdelete, fexclusion, wszname.toCPointer<ByteVar>(), wszminversion.toCPointer<ByteVar>(), wszmaxversion.toCPointer<ByteVar>(), wszpublickey.toCPointer<ByteVar>(), wszdigestalgorithm.toCPointer<ByteVar>(), pbdigest.toCPointer<ByteVar>(), cbdigest)

public actual fun DRMVerify(wszdata: PCWSTR, pcattesteddata: Long, wszattesteddata: PWSTR, petype: Long, pcprincipal: Long, wszprincipal: PWSTR, pcmanifest: Long, wszmanifest: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_DRMVerify(wszdata.toCPointer<ByteVar>(), pcattesteddata.toCPointer<ByteVar>(), wszattesteddata.toCPointer<ByteVar>(), petype.toCPointer<ByteVar>(), pcprincipal.toCPointer<ByteVar>(), wszprincipal.toCPointer<ByteVar>(), pcmanifest.toCPointer<ByteVar>(), wszmanifest.toCPointer<ByteVar>())
